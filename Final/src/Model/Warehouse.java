package Model;
import java.util.ArrayList;
import java.util.List;

public class Warehouse extends Field implements Steppable {
	private int materialLevel;
	private int counter = 0;
	private int materials = 0;
	public void removeMaterial() {
		materials = 0;
	}
	
	public void produceMaterial(int count) {
		for(int i = 0; i<count;i++)
		{
			materials += 1;
		}
	}
	
	public void step() {
		if(counter == 5) {
			if(materials < materialLevel) {
				produceMaterial(1);
			}
			counter = 0;
		} else counter++;
	}

	public int getMaterialLevel() {
		return materials;
	}

	public void setMaterialLevel(int materialLevel) {
		materials = materialLevel;
	}

}
