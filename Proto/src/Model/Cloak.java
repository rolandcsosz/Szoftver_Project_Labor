package Model;


public class  Cloak extends Equipment {

	private double hatasfok = 82.3;
	public void effect(Virologist v) {

	}
	
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
		
	}

	public double getHatasfok(){
		return hatasfok;
	}
}
