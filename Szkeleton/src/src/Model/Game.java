package Model;

import java.util.Random;

/**
 * A játék indításáért és leállításáért felel. Ebben az osztályban van a játék irányításáért
 * felel?s két f? függvény, az egyik ami elindítja a játékot, a másik pedig leállítja.
 * Ezekben szervez?dnek meg a játék logikai részei.
 */
public class Game {
	private GameMap gameMap;
	public void Start() {
		//egy virológus létrehozása és elhelyezése a pályán
		Virologist v1 = new Virologist();
		Field f;
		Random r = new Random();
		int i = r.ints(0, gameMap.getFields().size()).findFirst().getAsInt();
		f = gameMap.getFields().get(i);
		f.acceptVirologists(v1);
		v1.setCurrentfield(f);
		
		//egy másik virológus létrehozása és elhelyezése a pályán az elõzõvel nem azonos mezõre
		Virologist v2 = new Virologist();
		int j = r.ints(0, gameMap.getFields().size()).findFirst().getAsInt();
		
		//ha azonos indexû mezõre akarná tenni
		while(j == i) {
			j = r.ints(0, gameMap.getFields().size()).findFirst().getAsInt();
		}
		f = gameMap.getFields().get(j);
		f.acceptVirologists(v2);
		v2.setCurrentfield(f);
	}
	
	public void End() {
	}
}
