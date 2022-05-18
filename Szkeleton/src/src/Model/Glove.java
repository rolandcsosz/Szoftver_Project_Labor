package Model;

/**
 * A kesztyű létrehozásáért/kezeléséért felelős osztály. Egy védőfelszerelés példány,
 * amit óvóhelyen lehet találni. Ha egy ilyen tárgyal rendelkezik a virológus, képes a
 * vírust visszadobni a támadóra. Ebben az osztályban ennek a hatását kezeljük.
 * Minden kesztyűnek 3 élete van, utána lehámlik, többé nem véd minket.
 */
public class Glove extends Equipment {

	private int lifeCounter;

	public void effect(Virologist v) {
		reduceLife();
	}

	/**
	 * Hozzáadja a virológus listájához a kesztyűt
	 * @param v
	 */
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
	}

	/**
	 * Ha a virológus használta a kesztyűt akkor csökkenti a használhatóság mennyiségét
	 */
	public void reduceLife(){
		lifeCounter--;
		if(lifeCounter == 0){
			super.getVirologist().remove(this);
		}
	}
}
