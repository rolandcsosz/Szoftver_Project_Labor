import java.util.Arrays;
import java.util.HashSet;

public class Handler {
	
	static HashSet<String> types = new HashSet<String>(Arrays.asList(
			"SIMPLEFIELD",
			"SHELTER",
			"WAREHOUSE",
			"LABORATORY",
			"AXE",
			"GLOVE",
			"BAG",
			"CLOAK",
			"BEARVIRUS",
			"OBLIVION",
			"PARALYSES",
			"VACCINE",
			"VIRUSDANCE",
			"BEAR",
			"VIROLOGIST"
			));
	
	
	public static boolean isTypeCorrect(String type) {
		return types.contains(type);
	}

	public static Field createField(String type){
		switch(type) {
		case "SIMPLEFIELD":
			return new Field();
		case "SHELTER":
			return new Shelter();
		case "WAREHOUSE":
			return new Warehouse();
		case "LABORATORY":
			return new Laboratory();
		}
		return null;
	}
	
	public static Equipment createEquipment(String type){
		switch(type) {
		case "AXE":
			return new Axe();
		case "GLOVE":
			return new Glove();
		case "BAG":
			return new Bag();
		case "CLOAK":
			return new Cloak();
		}
		return null;
	}
	
	public static Agent createAgent(String type){
		switch(type) {
		case "BEARVIRUS":
			return new BearVirus();
		case "OBLIVION":
			return new Oblivion();
		case "PARALYSES":
			return new Paralyses();
		case "VACCINE":
			return new Vaccine();
		case "VIRUSDANCE":
			return new Virusdance();
		}
		return null;
	}
	
	public static Material createMaterial(String type) {
		switch(type) {
		case "MATERIAL":
			return new Material();
		}
		return null;
	}
	
	public static GeneticCode createGeneticCode(String type) {
		switch(type) {
		case "GENETICCODE":
			return new GeneticCode();
		}
		return null;
	}
	
	public static Virologist createVirologist(String type){
		switch(type) {
		case "BEAR":
			return new Bear();
		case "VIROLOGIST":
			return new Virologist();
		}
		return null;
	}
}
