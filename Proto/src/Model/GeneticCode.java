package Model;

public class GeneticCode implements Collectable {
	public Type type;
	private Virologist Virologist;
	public Type getType() {
		return type;
	}
	
	public void StolenBy(Virologist v) {
	}

	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
		
	}
}
