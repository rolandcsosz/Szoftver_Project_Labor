package Model;
import java.util.ArrayList;
import java.util.List;

public class Shelter extends Field {
	private Equipment equipment;
	public void addEquipment(Equipment eq) {
		equipment = eq;
	}
	
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		cl.add(equipment);
		return cl;
	}

	public Equipment getEquipment(){
		return equipment;
	}
}
