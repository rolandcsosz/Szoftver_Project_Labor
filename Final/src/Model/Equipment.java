package Model;

public abstract class Equipment implements Effectable, Collectable {
	private Virologist virologist;
	public void step() {
	}

	/**
	 * Absztrakt függvény, ami az egyes leszármazottaknál különböző hatást vált ki
	 * @param on
	 */
	public abstract void effect(Virologist on);

	/**
	 * Hozzáadja a felszerelést a virológus listájához
	 * @param v
	 */
	public void PickUpBy(Virologist v) {
		v.pickUp(this);
	}

	/**
	 * Visszaadja az adott védőfelszerelést birtokló virológust
	 * @return
	 */
	public Virologist getVirologist() {
		return virologist;
	}
}
