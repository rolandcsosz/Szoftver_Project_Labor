import java.util.List;

public class Virologist implements Steppable {
	private int maxMaterial;
	private boolean IsParalysed;
	private int stunDuration;
	private Field currentField;
	private Field field;
	private Equipment Equipments;
	private Agent agents;
	private List<GeneticCode> geneticCodes;
	private Material materials;
	public void move(Field to) {
	}

	public void step() {
	}

	public void attack(Virologist v, Agent a) {
		System.out.println("Tamadlak ");
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

	public void remove(Collectable c) {

	}

	public void remove(GeneticCode gc) {

	}

	public void remove(Equipment eq) {

	}

	public void remove(Material m) {

	}

	public void setMaterialCount(int new_size)
	{

	}

	public int getMaterialCount()
	{

		return 0;
	}

	public List<GeneticCode> getGeneticCodes(){
		return geneticCodes;
	}
}
