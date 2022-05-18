package Model;

/**
 * Az Agens osztály egyik leszármazott osztálya, hatására más virológusok nem
 * tudnak rá ágenst kenni addig, amíg tart a hatása.
 */
public class Vaccine extends Agent {

	/**
	 * Ennek hatására a virológus sebezhetetlen lesz a hatás
	 * lejártáig.
	 * @param v
	 */
	public void effect(Virologist v) {
		v.setProtected(true);
	}
}
