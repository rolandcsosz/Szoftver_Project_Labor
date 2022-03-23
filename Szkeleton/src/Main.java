
public class Main {
	
	public static void main(String[] args) {
		    System.out.println("Hello Java");
	}

	private static void virologistLearnsGeneticCode(){
		Virologist v = new Virologist();
		Laboratory laboratory = new Laboratory();
		GeneticCode g = new GeneticCode();
		laboratory.generateGeneticCodes(g);
		v.move(laboratory);
		g.PickUpBy(v);
	}

	private static void movesToEmptyField(){
		Virologist v = new Virologist();
		Field f = new Field();
		Field actual = v.getCurrentField();
		v.move(f);
		actual.removeVirologists(v);
	}

	private static void movesToLaboratory(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();
		Field actual = v.getCurrentField();
		v.move(l);
		actual.removeVirologists(v);
	}

	private static void movesToWarehouse(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		Field actual = v.getCurrentField();
		v.move(w);
		actual.removeVirologists(v);
	}

	private static void movesToShelter(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Field actual = v.getCurrentField();
		v.move(s);
		actual.removeVirologists(v);
	}

	private static void virologistPicksUpaBag(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Bag b = new Bag();
		s.generateEquipments(b);
		v.pickUpCollectable(b);
	}

	private static void virologistPicksUpaCloak(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Cloak c = new Cloak();
		s.generateEquipments(c);
		v.pickUpCollectable(c);
	}

	private static void virologistPicksUpaGlove(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Glove g = new Glove();
		s.generateEquipments(g);
		v.pickUpCollectable(g);
	}

	private static void virologistPicksUpMaterial(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		Material m = new Material();
		v.pickUpCollectable(m);
	}
		
}
