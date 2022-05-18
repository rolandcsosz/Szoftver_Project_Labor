package Model;

/**
 * Az Agens osztály egyik leszármazott osztálya, hatására a virológus véletlenszerű
 * mezőkre fog lépni, amíg le nem jár a vírus hatása. Védőfelszereléssel és -ágenssel
 * lehet védekezni ellene.
 */
public class Virusdance extends Agent {

	/**
	 * Ennek a hatására a virológus koordinálatlanul mozog. A
	 * controller irányítja, és a hatás lejártáig a játékos elveszti az irányítást.
	 * A program random szomszédos mezőkre hívja meg a move függvényt.
	 * @param v
	 */
	@Override
	public void effect(Virologist v) {
		v.move();
	}

}
