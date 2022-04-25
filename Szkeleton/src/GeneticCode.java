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
		Logger.log(Logger.getParameter() + ".pickUp(gc)", 2);
		v.pickUp(this);
		
	}
}
