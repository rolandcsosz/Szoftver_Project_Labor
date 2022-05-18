package Model;
import java.util.ArrayList;
import java.util.List;

/**
 * A laboratóriumok létrehozásáért és kezeléséért felelős osztály, amely a Field
 * osztályból származik le. A genetikai kódokat ezeken a mezőkön lehet megtanulni.
 * Vannak olyan laborok, amelyekbe belépve a virológus automatikusan megfertőződik
 * medvevírussal, ha nincsen rajta semmilyen védőágens vagy -felszerelés.
 */
public class Laboratory extends Field {
	private GeneticCode geneticCode;
	private BearVirus bearVirus;

	/**
	 * a játék inicializálásánál az adott laboratóriumokhoz hozzáadja a genetikai kódokat,
	 * amelyeket a játék során le lehet olvasni a falról
	 * @param gc
	 */
	public void addGeneticCode(GeneticCode gc) {
		geneticCode = gc;
	}
	public void addBear(BearVirus b){bearVirus = b;}
	
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		cl.add(geneticCode);
		return cl;
	}
}
