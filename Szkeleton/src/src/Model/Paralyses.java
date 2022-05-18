package Model;

/**
 * Az Agens osztály egyik leszármazott osztálya, hatására lebénul a virológus, amíg
 * le nem jár a vírus hatása. Védőfelszereléssel és -ágenssel lehet védekezni
 * ellene.
 */
public class Paralyses extends Agent {
	/**
	 * Ennek hatására a virológus lebénul a hatás lejártáig.
	 * @param v
	 */
	public void effect(Virologist v) {
		v.setParalysed(true);
	}
}
