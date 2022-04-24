


public class  Cloak extends Equipment {

	private double hatasfok = 82.3;
	public void effect(Virologist on) {
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log(Logger.getParameter() + ".pickUp(c)", 2);
		v.pickUp(this);
		
	}

	public double getHatasfok(){
		return hatasfok;
	}
}
