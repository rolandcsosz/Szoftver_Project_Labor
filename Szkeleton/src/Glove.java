public class Glove extends Equipment {

	//todo lehamlast kezelo adattag

	public void effect(Virologist on) {
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log(Logger.getParameter() + ".pickUp(g)", 2);
		v.pickUp(this);
		
	}
}
