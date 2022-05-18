package Model;
import java.util.ArrayList;
import java.util.List;

/**
 * A vírusok és vakcinák ősosztálya, ezeknek a létrehozásáért és kezeléséért felelős
 * osztály. Elkészítéséhez megfelelő mennyiségű és fajtájú anyagokra van szükség,
 * továbbá szükséges a hozzá tartozó genetikai kód ismerete is. Hatása bizonyos időn
 * belül megszűnik.
 */
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

	/**
	 * Virológus listájához hozzáadja az adott ágenst, majd beállítja a saját virológus attribútumát a paraméterként
	 * kapott virológusra (aki az ágenst elkészítette)
	 * @param v
	 */
	public void PickUpBy(Virologist v) {
		v.addAgent(this);
		virologist = v;
	}

	/**
	 * Ágens hatásának csükkentése
	 */
	public void step() {
		if(isActivated) {
			timeCounter--;
			if(timeCounter == 0)
				isActivated = false;
			if(geneticCode.getType() == Type.Virusdance)
				virologist.move();
		}
	}
	
	@Override
	public Agent clone() {
		try {
			return (Agent)super.clone();
		} catch (CloneNotSupportedException e) {
			return null;
		}
	}

	public Boolean getActivated() {
		return true;
	}

	public Virologist getVirologist() {
		return virologist;
	}

	public GeneticCode getGeneticCode() {
		return null;
	}

	public int getTime(){
		return timeCounter;
	}

	public void setActivated(){
		isActivated = true;
	}
}
