package Model;
public class Paralyses extends Agent {
	
	public void effect(Virologist v) {
		v.addEffect(this);
	}
}
