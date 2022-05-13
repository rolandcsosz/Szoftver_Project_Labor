package Model;
public class Vaccine extends Agent {
	public void effect(Virologist v) {
		v.addEffect(this);
	}

}
