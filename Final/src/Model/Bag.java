package Model;


public class Bag extends Equipment {


	@Override
	public void effect(Virologist v) {
		int new_max = v.getMaxMaterial()*2;
		v.setMaterialCount(new_max);
	}
	
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
		
	}

}
