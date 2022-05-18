package Model;

/**
 * A zsák létrehozásáért/kezeléséért felelős osztály. Egy felszerelés példány, ha egy
 * virológus megszerzi, több anyagot tud egyszerre magán tartani. Ebben az osztályban
 * a hatását kezeljük.
 */
public class Bag extends Equipment {

	/**
	 * Megnöveli a virológus által maximálisan felszedhető anyagmennyiséget
	 * @param v
	 */
	@Override
	public void effect(Virologist v) {
		int new_max = v.getMaxMaterial()*2;
		v.setMaterialCount(new_max);
	}

	/**
	 * Hozzáadja a bag-et a virológus listájához
	 * @param v
	 */
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
		
	}

}
