public class Glove extends Equipment {
	
	public void effect(Virologist on) {
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log(Logger.getParameter() + ".pickUp(g)", 2);
		v.pickUp(this);
		
	}
}
