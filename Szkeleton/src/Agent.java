import java.util.ArrayList;
import java.util.List;

public abstract class Agent implements Collectable, Effectable, Steppable {
	private int timeCounter;
	private List<Material> cost;
	public boolean isActivated = false;   	//defaultban false legyen és csak akkor lehet true ha átállítjuk a setterel
	private GeneticCode geneticCode;
	public abstract void effect(Virologist on);
	public List<Material> getCost() {
		List<Material> materials = new ArrayList<Material>();
		return materials;
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

	public void setActivated(){
		isActivated = true;
	}
	

}
