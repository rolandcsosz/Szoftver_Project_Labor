public class Bag extends Equipment {


	@Override
	public void effect(Virologist on) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log(Logger.getParameter() + ".pickUp(b)", 2);
		v.pickUp(this);
		
	}

}
