import java.util.List;

public abstract class Agent implements Collectable, Effectable, Steppable {
	private int timeCounter;
	private List<Material> cost;
	public boolean isActivated;
	private GeneticCode geneticCode;
	public abstract void effect(Virologist on);
	public List<Material> getCost() {
		return null;
	}
	
	public GeneticCode getGeneticCode() {
		return null;
	}
	
	public void PickUpBy(Virologist v) {
	}
	
	public void step() {
	}
	
	public Boolean getActivated() {
		return true;
	}
}
