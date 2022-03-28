public class Virusdance extends Agent {

	@Override
	public void effect(Virologist on) {
		Logger.log(Logger.getParameter() + ".addEffect(" + Logger.getsecondParameter() + ")", 2);
		on.addEffect(this);
		
	}


}
