import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Syntax terror");
		virologistLearnsGeneticCode();
		movesToEmptyField();
		movesToLaboratory();
		movesToWarehouse();
		movesToShelter();
		virologistPicksUpaBag();
		virologistPicksUpaCloak();
		virologistPicksUpaGlove();
		virologistPicksUpMaterial();
		virologistMakesVaccine();
		virologistMakesDanceVirus();
	}

	private static void virologistLearnsGeneticCode(){
		Virologist v = new Virologist();
		Laboratory laboratory = new Laboratory();
		GeneticCode g = new GeneticCode();
		laboratory.generateCeneticCodes(g);
		v.move(laboratory);
		g.PickUpBy(v);
	}

	private static void movesToEmptyField(){
		Virologist v = new Virologist();
		Field f = new Field();
		Field actual = v.getCurrentField();
		v.move(f);
		//actual.removeVirologists(v);
	}

	private static void movesToLaboratory(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();
		Field actual = v.getCurrentField();
		v.move(l);
		//actual.removeVirologists(v);
	}

	private static void movesToWarehouse(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		Field actual = v.getCurrentField();
		v.move(w);
		//actual.removeVirologists(v);
	}

	private static void movesToShelter(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Field actual = v.getCurrentField();
		v.move(s);
		//actual.removeVirologists(v);
	}

	private static void virologistPicksUpaBag(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Bag b = new Bag();
		s.generateEquipments(b);
		v.pickUp(b);
	}

	private static void virologistPicksUpaCloak(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Cloak c = new Cloak();
		s.generateEquipments(c);
		v.pickUp(c);
	}

	private static void virologistPicksUpaGlove(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Glove g = new Glove();
		s.generateEquipments(g);
		v.pickUp(g);
	}

	private static void virologistPicksUpMaterial(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		Material m = new Material();
		v.pickUp(m);
	}

	static void virologistMakesVaccine()
	{

		//Inicializálás és beállítás
		Virologist v = new Virologist();
		Vaccine vc = new Vaccine();
		GeneticCode gc = new GeneticCode();

		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();


		v.pickUp(gc);
		v.pickUp(m1);
		v.pickUp(m2);
		v.pickUp(m3);

		//Szekvenciák alapján logika
		List<Material> cost = vc.getCost();
		GeneticCode gc_cost = vc.getGeneticCode();

		//if(cost.size()<v1.getMaterialVCount())
		//	if(gc == vc.getGeneticCode()) -> új vaccine és hozzáad

		v.setMaterialCount(v.getMaterialCount()-cost.size());

		Vaccine new_vc = new Vaccine();

		v.addAgent(new_vc);
	}

	static void virologistMakesDanceVirus() {
		//Inicializálás és beállítások
		Virologist v1 = new Virologist();
		Oblivion ov = new Oblivion();
		GeneticCode gc = new GeneticCode();
		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();

		v1.pickUp(gc);
		v1.pickUp(m1);
		v1.pickUp(m2);
		v1.pickUp(m3);
		// szekvenciák alapján a logika
		List<Material> cost = ov.getCost();
		GeneticCode gc_vd = ov.getGeneticCode();

		//if(cost.size() < v1.getMaterialCount());
		//	if(gc == vc.getGeneticCode()) -> új vaccine és hozzáad
		v1.setMaterialCount(v1.getMaterialCount()-cost.size());

		Oblivion new_ov = new Oblivion();

		v1.addAgent(new_ov);
	}
}
