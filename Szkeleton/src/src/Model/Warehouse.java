package Model;
import java.util.ArrayList;
import java.util.List;

/**
 * A raktárak létrehozásáért és kezeléséért felelős osztály, amely a Field osztály
 * leszármazottja. Ezen a mezőn lehet anyagokat felvenni. Az anyagok idővel újratermelődnek.
 * Ez az osztály végzi inicializáláskor az anyagokat a raktárakhoz való rendelést.
 */
public class Warehouse extends Field implements Steppable {
	private int materialLevel;
	private int counter = 0;
	private int materials = 0;
	public void removeMaterial() {
		materials = 0;
	}

	/**
	 * Létrehoz a mezőn egy új anyagot, majd a listához adja.
	 * @param count
	 */
	public void produceMaterial(int count) {
		for(int i = 0; i<count;i++)
		{
			materials += 1;
		}
	}

	/**
	 * az anyag időre termelődik,
	 */
	public void step() {
		if(counter == 5) {
			if(materials < materialLevel) {
				produceMaterial(1);
			}
			counter = 0;
		} else counter++;
	}

	/**
	 * visszaadja az aktuális anyagszintet, azaz hogy
	 * mennyi anyag van jelenleg a raktárban
	 * @return
	 */
	public int getMaterialLevel() {
		return materials;
	}

	public void setMaterialLevel(int materialLevel) {
		materials = materialLevel;
	}

}
