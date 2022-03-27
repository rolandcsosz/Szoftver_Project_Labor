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
		
		
		if(!this.getParalysedStatus() && field.IsNeighbour(f)){
			f.acceptVirologists(this);
			//field.removeVirologist(this);
			field = f;
		}
	}

	public void step() {
	}


	public Field getField() {
		return field;
	}

	public void attack(Virologist v, Agent a) {

		if(field.IsNeighbour(v.getField()))
		{
			a.effect(v);
			v.addEffect(a);
		}
	}

	public void steal(Virologist v) {
		
		for (Collectable c: v.getCollectables())
		{
			c.PickUpBy(this);
			this.pickUp(c);
			v.remove(c);
		
		}
	
	}

	public void createAgens(Agent a) {

		List<Material> cost = a.getCost();

		if(cost.size() < this.getMaterialCount())
		{
		
			this.setMaterialCount(this.getMaterialCount()-cost.size());
	
			Agent new_a = a;
	
			this.addAgent(new_a);
		
		}
	}

	public void learnGeneticCode(GeneticCode g) {
	}

	public void forgetGeneticCode(GeneticCode g) {
	}

	
	
	public void scout(Laboratory l) {
		
		for(Collectable cb:l.getCollectables())
		{
				cb.PickUpBy(this);
				this.pickUp(cb);
				l.removeCollectable(cb);

		}
		
		
	}
	
	public void scout(Shelter s) {
		
		for(Collectable cb:s.getCollectables())
		{
				cb.PickUpBy(this);
				this.pickUp(cb);
				s.removeCollectable(cb);
				
				((Equipment)cb).effect(this);

		}
		
		
	}
	
	public void scout(Warehouse wh) {
		
		for(Collectable cb:wh.getCollectables())
		{
				cb.PickUpBy(this);
				this.pickUp(cb);
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

	public Boolean getParalysedStatus() {
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

		return 0;
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
