import java.util.List;

public class Virologist implements Steppable {
	private int maxMaterial;
	private boolean IsParalysed;
	private int stunDuration;
	private Field currentField;
	private Field field;
	private Equipment Equipments;
	private Agent agents;
	private GeneticCode geneticcodes;
	private Material materials;
	public void move(Field to) {
	}
	
	public void step() {
	}
	
	public void attack(Virologist v, Agent a) {
	}
	
	public void steal(Virologist v) {
	}
	
	public void createAgens(Agent a) {
	}
	
	public void learnGeneticCode(GeneticCode g) {
	}
	
	public void forgetGeneticCode(GeneticCode g) {
	}
	
	public void scout() {
	}
	
	public Field getCurrentField() {
		return null;
	}
	
	public void pickUp(Collectable c) {
	}
	
	public List<Collectable> getCollectables() {
		return null;
	}
	
	public void addAgent(Agent a) {
	}
	
	public void move() {
	}
	
	public void removeAgent(Agent a) {
	}
	
	public Boolean getParalysedStatus() {
		return true;
	}
	
	public void addEffect(Agent a) {
	}
	
	public void removeEffect(Agent a) {
	}
	
	public void pickUp(GeneticCode gc) {
	}
	
	public void pickUp(Equipment eq) {
	}
	
	public void pickUp(Material m) {
	}
}