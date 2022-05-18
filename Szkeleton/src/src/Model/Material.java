package Model;

public class Material implements Collectable {
	private Virologist Virologist;
	
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
	}

}
