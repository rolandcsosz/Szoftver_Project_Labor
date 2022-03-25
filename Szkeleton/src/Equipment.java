public abstract class Equipment implements Effectable, Collectable {
	private Virologist Virologist;
	public void step() {
	}
	
	public abstract void effect(Virologist on);
	
	public void PickUpBy(Virologist by) {
	}
}
