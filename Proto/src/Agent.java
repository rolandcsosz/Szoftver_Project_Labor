import java.util.ArrayList;
import java.util.List;

public abstract class Agent implements Cloneable, Collectable, Effectable, Steppable {
	private int timeCounter;
	private Virologist virologist; 			// szükség lehet rá, hogy tudjuk, hogy kinél van az ágens
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
		v.addAgent(this);
		virologist = v;
	}
	
	public void step() {
		if(isActivated) {
			timeCounter--;
		}
	}

	public int getTime(){
		return timeCounter;
	}
	
	public Boolean getActivated() {
		return true;
	}

	public void setActivated(){
		isActivated = true;
	}


	public Virologist getVirologist() {
		return virologist;
	}
	
	@Override
	public Agent clone() {

	        try {
				return (Agent)super.clone();
			} catch (CloneNotSupportedException e) {
				return null;
			}


	}
}
