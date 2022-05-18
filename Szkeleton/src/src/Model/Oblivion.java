package Model;

/**
 * Az Agens osztály egyik leszármazott osztálya, hatására a virológus elfelejti a már
 * megtanult összes genetikai kódot. Védőfelszereléssel és -ágenssel lehet
 * védekezni ellene.
 */
public class Oblivion extends Agent {
	/**
	 * Ennek hatására a virológus által tárolt összes genetikai kód
	 * törlődik, az az elfelejti őket. A hatás nem visszavonható, ha nem sikerült kivédeni,
	 * akkor a genetikai kódokat újból meg kell tanulni.
	 * @param v
	 */
	public void effect(Virologist v) {
		v.forgetGeneticCodes();
	}
	
}
