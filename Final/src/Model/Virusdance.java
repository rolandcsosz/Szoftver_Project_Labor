package Model;
public class Virusdance extends Agent {

	@Override
	public void effect(Virologist v) {
		v.addEffect(this);
		
	}


}
