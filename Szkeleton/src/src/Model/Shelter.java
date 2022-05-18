package Model;
import java.util.ArrayList;
import java.util.List;

/**
 * A védőhelyek létrehozásáért és kezeléséért felelős osztály. A mező leszármazottja.
 * Felszerelések találhatóak rajta, de lehet üres is. Itt kezeljük ennek a mezőnek az
 * inicializálását, azaz a védőhely típusú mezőhöz való védőfelszerelés-hozzárendelést.
 */
public class Shelter extends Field {
	private Equipment equipment;

	/**
	 * felszerelést ad a mezőhöz
	 * @param eq
	 */
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
