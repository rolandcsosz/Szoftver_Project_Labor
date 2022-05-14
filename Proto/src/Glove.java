public class Glove extends Equipment {

	private int lifeCounter = 3;

	public void effect(Virologist v) {
		reduceLife();
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		Logger.log(Logger.getParameter() + ".pickUp(g)", 2);
		v.pickUp(this);
	}

	public void reduceLife(){
		lifeCounter--;
		if(lifeCounter == 0){
			super.getVirologist().remove(this);
		}
	}
}
