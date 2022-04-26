public class Paralyses extends Agent {
	
	public void effect(Virologist v) {
		Logger.log(Logger.getParameter() + ".addEffect(" + Logger.getsecondParameter() + ")", 2);
		v.addEffect(this);
	}
}
