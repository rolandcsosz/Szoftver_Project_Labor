package Model;

public abstract class Equipment implements Effectable, Collectable {
	private Virologist virologist;
	public void step() {
	}
	
	public abstract void effect(Virologist on);
	
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
	}

	public Virologist getVirologist() {
		return virologist;
	}
}
