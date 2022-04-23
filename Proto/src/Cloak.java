


public class  Cloak extends Equipment {
	
	public void effect(Virologist on) {
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log(Logger.getParameter() + ".pickUp(c)", 2);
		v.pickUp(this);
		
	}
}
