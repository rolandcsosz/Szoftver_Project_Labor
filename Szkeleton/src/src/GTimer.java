import java.util.List;

import javax.swing.Timer;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import Model.Steppable;

public class GTimer {
	private List<Steppable> steppables;
	Timer t;
	
	public GTimer() {
		t = new Timer(1000, updateTimer);
	}
	
	public void tick() {
		for(Steppable s : steppables){
			s.step();
		}
	}
	
	ActionListener updateTimer = new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			tick();
		}
	};

}
