package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A Field osztály felelős a mezők létrehozásáért és kezeléséért. Itt történik több
 * esemény kezelése, mint például a virológus léptetése egyik mezőről a másikra. A
 * mezők sokfélék lehetnek, ez az ősosztály.
 */
public class Field {
	private Virologist virologist;
	private List<Field> neighbours = new ArrayList<Field>();

	/**
	 * Beállítja a mező szomszédjait
	 * @param f
	 */
	public void setNeighbour(Field f){
		neighbours.add(f);
	}

	/**
	 * A virológus move függvényének hatására, a mező
	 * elfogadja a virológust és átlépteti magára
	 * @param v
	 */
	public void acceptVirologists(Virologist v) {
		virologist = v;
	}

	/**
	 * Amikor a move függvény hatására a virológus
	 * elhagyta a mezőt ez a függvény eltávolítja a virológust a régi mezőről, publikus
	 * @param v
	 */
	public void removeVirologist(Virologist v) {
		virologist = null;
	}

	/**
	 * Az adott mezőn lévő gyűjthető tárgyakat adja meg, publikus
	 * @return
	 */
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		return cl;
	}

	/**
	 * Kiválaszt egy random szomszédot a listából, ez a táncot okozó vírushoz szükséges
	 * @return
	 */
	public Field getRandomNeighbour() {
		//return null;
		Random r = new Random();
		int i = r.ints(0, neighbours.size()).findFirst().getAsInt();
		return neighbours.get(i);
	}

	/**
	 * eltávolítja a tárgyat a mezőről, publikus
	 * @param c
	 */
	public void removeCollectable(Collectable c) {
	}

	/**
	 * Visszaadja, hogy szomszédos-e a paraméterként kapott mezővel
	 * @param m
	 * @return
	 */
	public boolean IsNeighbour(Field m) {
		if(this.equals(m)) {
			return true;
		}
		return neighbours.contains(m);
	}

	/**
	 * Visszaadja a mezőn álló virológust
	 * @return
	 */
	public Virologist getVirologist() {
		return virologist;
	}

}


