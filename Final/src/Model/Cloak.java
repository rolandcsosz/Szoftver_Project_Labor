package Model;

/**
 * Védőköpeny létrehozásáért/kezeléséért felelős osztály. Egy védőfelszerelés példány,
 * amit óvóhelyen lehet találni. Ha egy ilyen tárgyal rendelkezik a virológus, bizonyos
 * fokig védett a támadásokkal szemben. Ebben az osztályban ennek a hatását
 * kezeljük.
 */
public class  Cloak extends Equipment {

	private double hatasfok = 82.3;
	public void effect(Virologist v) {

	}

	/**
	 * Hozzáadja a virológus által felvett köppenyt a listához
	 * @param v
	 */
	@Override
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
		
	}

	public double getHatasfok(){
		return hatasfok;
	}
}
