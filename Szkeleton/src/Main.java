import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		System.out.println("Syntax terror");
		/*virologistLearnsGeneticCode();
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
		VirologistAttacksWithVirusDance();
		VirologistAttacksWithOblivion();
		VirologistAttacksWithParalyses();*/
		
		System.out.println("\nChoose a test case:\n1. movesToEmptyField\n2. movesToLaboratory\n3. movesToWarehouse\n4. movesToShelter\n5. virologistPicksUpaBag\n6. virologistPicksUpaCloak\n"
				+ "7. virologistPicksUpaGlove\n8. virologistPicksUpMaterial\n9. virologistMakesVaccine\n10. virologistMakesOblivionVirus\n11. virologistMakesVirusDance\n"
				+ "12. virologistMakesParalysesVirus\n13. useVaccine\n14. VirologistSteal\n15. VirologistAttacksWithVirusDance\n16. VirologistAttacksWithOblivion\n17. VirologistAttacksWithParalyses\n"
				+ "18. virologistLearnsGeneticCode");
		
		BufferedReader reader = new BufferedReader(
	            new InputStreamReader(System.in));

	        String number = null;
			try {
				number = reader.readLine();
			} catch (IOException e) {
				System.out.println("Error");
			}
	        
	        switch(number) {
	        case "1": {
	        	movesToEmptyField();
	        	break;
	        }
	        case "2": {
	        	movesToLaboratory();
	        	break;
	        }
	        case "3": {
	        	movesToWarehouse();
	        	break;
	        }
	        case "4": {
	        	movesToShelter();
	        	break;
	        }
	        case "5": {
	        	virologistPicksUpaBag();
	        	break;
	        }
	        case "6": {
	        	virologistPicksUpaCloak();
	        	break;
	        }
	        case "7": {
	        	virologistPicksUpaGlove();
	        	break;
	        }
	        case "8": {
	        	virologistPicksUpMaterial();
	        	break;
	        }
	        case "9": {
	        	virologistMakesVaccine();
	        	break;
	        }
	        case "10": {
	        	virologistMakesOblivionVirus();
	        	break;
	        }
	        case "11": {
	        	virologistMakesVirusDance();
	        	break;
	        }
	        case "12":{
	        	virologistMakesParalysesVirus();
	        	break;
	        }
	        case "13":{
	        	useVaccine();
	        	break;
	        }
	        case "14":{
	        	VirologistSteal();
	        	break;
	        }
	        case "15":{
	        	VirologistAttacksWithVirusDance();
	        	break;
	        }
	        case "16":{
	        	VirologistAttacksWithOblivion();
	        	break;
	        }
	        case "17":{
	        	VirologistAttacksWithParalyses();
	        	break;
	        }
	        case "18":{
	        	virologistLearnsGeneticCode();
	        	break;
	        }
	        default:
	        	break;
	        }
		
	}

	private static void virologistLearnsGeneticCode(){
		Virologist v = new Virologist();
		Laboratory laboratory = new Laboratory();
		GeneticCode g = new GeneticCode();
		laboratory.generateCeneticCodes(g);

		/*Szekvenciák alapján*/

		if(!v.getParalysedStatus()){
			for(int i = 0; i < v.getCollectables().size(); i++) {
				//if (v.getCollectables().get(i) -> rászűrni a Genetikai kódokra
				//	v.getCollectables().add(g);
				//	g.PickUpBy(v);
			}
		}
	}

	private static void movesToEmptyField(){
		Virologist v = new Virologist();
		Field f = new Field();
		Field actual = v.getCurrentField();

		/*Szekvenciák alapján*/

		if(!v.getParalysedStatus() && actual.IsNeighbour(f)){
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

		if(!v.getParalysedStatus() && actual.IsNeighbour(l)){
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

		if(!v.getParalysedStatus() && actual.IsNeighbour(w)){
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

		if(!v.getParalysedStatus() && actual.IsNeighbour(s)){
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

		/*Szekvenciák alapján*/

		boolean has = false;
		/*for(int i = 0; i < v.getCollectables().size(); i++){
			if(v.getCollectables().get(i) == b)
				has = true;
		}*/
		if(!has){
			//v.getCollectables().add(b);
			v.pickUp(b);
			b.effect(v);
			s.removeCollectable(b);
		}
	}

	private static void virologistPicksUpaCloak(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Cloak c = new Cloak();
		s.generateEquipments(c);

		/*Szekvenciák alapján*/

		boolean has = false;
		/*for(int i = 0; i < v.getCollectables().size(); i++){
			if(v.getCollectables().get(i) == c)
				has = true;
		}*/
		if(!has){
			//v.getCollectables().add(c);
			v.pickUp(c);
			c.effect(v);
			s.removeCollectable(c);
		}

	}

	private static void virologistPicksUpaGlove(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Glove g = new Glove();
		s.generateEquipments(g);

		/*Szekvenciák alapján*/

		boolean has = false;
		/*for(int i = 0; i < v.getCollectables().size(); i++){
			if(v.getCollectables().get(i) == g)
				has = true;
		}*/
		if(!has){
			//v.getCollectables().add(g);
			v.pickUp(g);
			g.effect(v);
			s.removeCollectable(g);
		}
	}

	private static void virologistPicksUpMaterial(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		Material m = new Material();
		w.produceMaterial(m);

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

		//v.setMaterialCount(v.getMaterialCount()-cost.size());

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
		//v1.setMaterialCount(v1.getMaterialCount()-cost.size());

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

		//v.setMaterialCount(v.getMaterialCount()-cost.size());

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

		//v.setMaterialCount(v.getMaterialCount()-cost.size());

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
		//List<Collectable> collectables = v2.getCollectables();
		//for (Collectable coll: collectables)
		//{
		//	if(v1.IsEnoughSpace(coll)){
		//		coll.PickUpBy(v1);
		//		v2.remove(coll);
		//	}
		//}
	}

	static void VirologistAttacksWithVirusDance(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		f1.acceptVirologists(v1);
		f2.acceptVirologists(v2);
		Virusdance vd = new Virusdance();
		v1.addAgent(vd);

		//v1.attack(v2,vd);
		Field f = v2.getField();
		if(f1.IsNeighbour(f)){
			vd.effect(v2);			//Valahol meg kell majd vizsgálni a virologuus felszereléseit
			vd.setActivated();		// Vagy ezt az effecten belül nézzük majd meg?
		}
	}

	static void VirologistAttacksWithParalyses(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		f1.acceptVirologists(v1);
		f2.acceptVirologists(v2);
		Paralyses p = new Paralyses();
		v1.addAgent(p);

		//v1.attack(v2,vd);
		Field f = v2.getField();
		if(f1.IsNeighbour(f)){
			p.effect(v2);
			p.setActivated();
		}
	}

	static void VirologistAttacksWithOblivion(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		f1.acceptVirologists(v1);
		f2.acceptVirologists(v2);
		Oblivion o = new Oblivion();
		v1.addAgent(o);

		//v1.attack(v2,vd);
		Field f = v2.getField();
		if(f1.IsNeighbour(f)){
			o.effect(v2);
			o.setActivated();
		}
	}
}
