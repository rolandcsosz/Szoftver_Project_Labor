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
		virologistMakesOblivionVirus();
		virologistMakesVirusDance();
		virologistMakesParalysesVirus();
		useVaccine();
		VirologistSteal();
	}

	private static void virologistLearnsGeneticCode(){
		Virologist v = new Virologist();
		Laboratory laboratory = new Laboratory();
		GeneticCode g = new GeneticCode();
		laboratory.generateCeneticCodes(g);

		/*Szekvenciák alapján*/

		if(v.getParalysedStatus() == false){
			for(int i = 0; i < v.getGeneticCodes().size(); i++) {
				if (v.getGeneticCodes().get(i).getType() != g.getType()) {
					v.getGeneticCodes().add(g);
					g.PickUpBy(v);
				}
			}
		}
	}

	private static void movesToEmptyField(){
		Virologist v = new Virologist();
		Field f = new Field();
		Field actual = v.getCurrentField();

		/*Szekvenciák alapján*/

		if(v.getParalysedStatus()==false && actual.IsNeighbour(f)){
			v.move(f);
			f.acceptVirologists(v);
			actual.removeVirologist(v);
		}

	}

	private static void movesToLaboratory(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();
		Field actual = v.getCurrentField();

		/*Szekvenciák alapján*/

		if(v.getParalysedStatus()==false && actual.IsNeighbour(l)){
			v.move(l);
			l.acceptVirologists(v);
			actual.removeVirologist(v);
		}

	}

	private static void movesToWarehouse(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		Field actual = v.getCurrentField();

		/*Szekvenciák alapján*/

		if(v.getParalysedStatus()==false && actual.IsNeighbour(w)){
			v.move(w);
			w.acceptVirologists(v);
			actual.removeVirologist(v);
		}

	}

	private static void movesToShelter(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Field actual = v.getCurrentField();

		/*Szekvenciák alapján*/

		if(v.getParalysedStatus()==false && actual.IsNeighbour(s)){
			v.move(s);
			s.acceptVirologists(v);
			actual.removeVirologist(v);
		}

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

	static void virologistMakesOblivionVirus() {
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
		GeneticCode gc_ov = ov.getGeneticCode();

		//if(cost.size() < v1.getMaterialCount());
		//	if(gc == ov.getGeneticCode()) -> új felejto virus és hozzáad
		v1.setMaterialCount(v1.getMaterialCount()-cost.size());

		Oblivion new_ov = new Oblivion();

		v1.addAgent(new_ov);
	}

	static void virologistMakesVirusDance()
	{

		//Inicializálás és beállítás
		Virologist v = new Virologist();
		Virusdance vd = new Virusdance();
		GeneticCode gc = new GeneticCode();

		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();


		v.pickUp(gc);
		v.pickUp(m1);
		v.pickUp(m2);
		v.pickUp(m3);

		//Szekvenciák alapján logika
		List<Material> cost = vd.getCost();
		GeneticCode gc_cost = vd.getGeneticCode();

		//if(cost.size()<v.getMaterialCount())
		//	if(gc == vc.getGeneticCode()) -> új vaccine és hozzáad

		v.setMaterialCount(v.getMaterialCount()-cost.size());

		Virusdance new_vd = new Virusdance();

		v.addAgent(new_vd);
	}

	static void virologistMakesParalysesVirus()
	{

		//Inicializálás és beállítás
		Virologist v = new Virologist();
		Paralyses vp = new Paralyses();
		GeneticCode gc = new GeneticCode();

		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();


		v.pickUp(gc);
		v.pickUp(m1);
		v.pickUp(m2);
		v.pickUp(m3);

		//Szekvenciák alapján logika
		List<Material> cost = vp.getCost();
		GeneticCode gc_cost = vp.getGeneticCode();

		//if(cost.size()<v.getMaterialCount())
		//	if(gc == vp.getGeneticCode())

		v.setMaterialCount(v.getMaterialCount()-cost.size());

		Paralyses new_vp = new Paralyses();

		v.addAgent(new_vp);
	}

	static void useVaccine(){
		Vaccine v = new Vaccine();
		Virologist virologist = new Virologist();
		virologist.addAgent(v);
		//virologist.attack(virologist, v);

	}

	static void VirologistSteal(){
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		Glove g = new Glove();
		Cloak c = new Cloak();
		Bag b = new Bag();
		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();
		v2.pickUp(m1);
		v2.pickUp(m2);
		v2.pickUp(m3);
		v2.pickUp(g);
		v2.pickUp(c);
		v2.pickUp(b);

		//v1.steal(v2);
		List<Collectable> collectables = v2.getCollectables();
		for (Collectable coll: collectables)
		{
			// Ez nem jó így mert csak a védőfelszerelésre vonatkozik a materialt, így nem lehet felvenni.
			if(v1.getCollectables().size()<3){
				coll.PickUpBy(v1);
				v2.remove(coll);
			}
		}


	}
}
