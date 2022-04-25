public class Material implements Collectable {
	private Virologist Virologist;
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log("v.pickUp(m)", 2);
		v.pickUp(this);
		
	}
}
