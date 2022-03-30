import java.util.ArrayList;
import java.util.List;

public class Virologist implements Steppable {
	private int maxMaterial;
	private boolean IsParalysed;
	private int stunDuration;
	private Field field;
	private List<Equipment> equipments;   // Ezt és az allatta lévőket átírtam List-ek re
	private List<Agent> agents;
	private List<GeneticCode> geneticcodes;
	private List<Material> materials; //ez miért van átírva listre?
	
	public Virologist()
	{
		IsParalysed = false;
		field = new Field();
		equipments = new ArrayList<Equipment>();
		agents = new ArrayList<Agent>();
		geneticcodes = new ArrayList<GeneticCode>();
		materials = new ArrayList<Material>();
		
	}

	public void move(Field f) {
		
		Logger.log(Logger.getParameter() + ".getParalysedStatus()", 1);
		Logger.log("f1.IsNeighbour(" + Logger.getParameter() + ")", 1);
		if(!this.getParalysedStatus() && field.IsNeighbour(f)){
			Logger.log("f2.acceptVirologists(v)", 1);
			f.acceptVirologists(this);
			Logger.log("f1.removeVirologist(v)", 1);
			field.removeVirologist(this);
			field = f;
		}
	}

	public void step() {
	}


	public Field getField() {
		return field;
	}

	public void attack(Virologist v, Agent a) {

		Logger.log(Logger.getParameter() + ".getParalysedStatus()", 1);
		Logger.log("f1.IsNeighbour(" + Logger.getParameter() + ".getField())", 1);
	
		if(!this.getParalysedStatus() && field.IsNeighbour(v.getField()))
		{
			Logger.log(Logger.getsecondParameter() +".effect(" + Logger.getParameter() + ")", 1);
			a.effect(v);

		}
	}

	public void steal(Virologist v) {
		
		Logger.log(Logger.getParameter() + ".getParalysedStatus()", 1);
		Logger.log("f1.IsNeighbour(v2.getCurrentField())", 1);
		if(!this.getParalysedStatus() && field.IsNeighbour(v.getField()))
		{
		
		Logger.log("v2.getCollectables()", 1);
		for (Collectable c: v.getCollectables())
		{
			//Log miatti parameter beallitasok
			if(c instanceof Bag) {
				Logger.setsecondParameter("b");
			}
			
			if(c instanceof Cloak) {
				Logger.setsecondParameter("c");
			}
			
			if(c instanceof Material) {
				Logger.setsecondParameter("m");
			}
			
			if(c instanceof Glove) {
				Logger.setsecondParameter("g");
			}
				
			Logger.log(Logger.getsecondParameter() + ".pickUpBy(" + Logger.getParameter() + ")", 1);
			c.PickUpBy(this);
			
			Logger.log("v2.remove(" + Logger.getsecondParameter() + ")" , 1);
			v.remove(c);
		
		}
		}
	}

	public void createAgens(Agent a) {

		Logger.log(Logger.getsecondParameter() + ".getCost()", 1);
		List<Material> cost = a.getCost();

		Logger.log("v.getMaterialCount()", 1);
		if(cost.size() < this.getMaterialCount())
		{
			Logger.log("v.setMaterialCount(v.getMaterialCount()-cost.size())", 1);
			this.setMaterialCount(this.getMaterialCount()-cost.size());
	
			Logger.log("<<create>> new_" + Logger.getsecondParameter(), 1);
			Agent new_a = a;
	
			Logger.log("v.addAgent(new_" + Logger.getsecondParameter() + ")", 1);
			this.addAgent(new_a);
		
		}
	}

	public void learnGeneticCode(GeneticCode g) {
	}

	public void forgetGeneticCode(GeneticCode g) {
	}

	
	
	public void scout(Laboratory l) {
		
		Logger.log("v.getParalysedStatus()", 1);
		if(!this.getParalysedStatus())
		{
			Logger.log("l.getCollectables()", 1);
			for(Collectable cb:l.getCollectables())
			{
					Logger.log("gc.pickUpBy(v)", 1);
					cb.PickUpBy(this);
	
			}
			
		}
		
		
	}
	
	public void scout(Shelter s) {
		
		Logger.log("v.getParalysedStatus()", 1);
		if(!this.getParalysedStatus())
		{
			
			Logger.log("l.getCollectables()", 1);
			for(Collectable cb:s.getCollectables())
			{
					Logger.log(Logger.getParameter() + ".pickUpBy(v)", 1);
					cb.PickUpBy(this);
					
					Logger.log(Logger.getParameter() + ".effect(v)", 1);
					((Equipment)cb).effect(this);
					
					Logger.log("s.removeCollectable(" + Logger.getParameter() + ")", 1);
					s.removeCollectable(cb);
	
			}
		
		}
		
		
	}
	
	public void scout(Warehouse wh) {
		
		for(Collectable cb:wh.getCollectables())
		{
				Logger.log(Logger.getParameter() + ".pickUpBy(v)", 1);
				cb.PickUpBy(this);
				
				Logger.log("wh.removeCollectable(" + Logger.getParameter() + ")", 1);
				wh.removeCollectable(cb);


		}
		
		
	}


	public void pickUp(Collectable c) {
	}

	public List<Collectable> getCollectables() {
		List<Collectable> perm = new ArrayList<Collectable>();
		perm.addAll(agents);
		perm.addAll(geneticcodes);
		perm.addAll(equipments);
		perm.addAll(materials);
		
		return perm;

	}

	public void addAgent(Agent a) {
	}

	public void move() {
	}

	public void removeAgent(Agent a) {
	}

	public boolean getParalysedStatus() {
		return IsParalysed;
	}

	public void addEffect(Agent a) {
	}

	public void removeEffect(Agent a) {
	}

	public void pickUp(GeneticCode gc) {
		geneticcodes.add(gc);
	}

	public void pickUp(Equipment eq) {
		equipments.add(eq);
	}

	public void pickUp(Material m) {
		materials.add(m);
	}

	public void remove(Collectable c) {

	}

	public void remove(GeneticCode gc) {

	}

	public void remove(Equipment eq) {

	}

	public void remove(Material m) {

	}

	public void setMaterialCount(int new_size) {

	}

	public int getMaterialCount() {

		return materials.size();
	}

	public boolean IsEnoughSpace(Collectable c) {
		return true;
	}

	public boolean IsEnoughSpace(Material m) {
		return true;
	}

	public List<GeneticCode> getGeneticCodes(){
			return geneticcodes;
	}

	public  List<Equipment> getEquipments() {
		return equipments;
	}
	
	boolean isOwnedAlrerady(Equipment eq) 
	{
		return false;
	}
}
