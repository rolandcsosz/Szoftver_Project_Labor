import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Syntax terror - Szkeleton");
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
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		Scanner scanner = new Scanner(System.in);

	        String number = null;
	        boolean isRunning = true;
	        
	        while(isRunning) {
	        	
	        System.out.println("----------------------------------------------------------------\nTest cases:\n1. movesToEmptyField\n2. movesToLaboratory\n3. movesToWarehouse\n4. movesToShelter\n5. virologistPicksUpaBag\n6. virologistPicksUpaCloak\n"
	    				+ "7. virologistPicksUpaGlove\n8. virologistPicksUpMaterial\n9. virologistMakesVaccine\n10. virologistMakesOblivionVirus\n11. virologistMakesVirusDance\n"
	    				+ "12. virologistMakesParalysesVirus\n13. useVaccine\n14. VirologistSteal\n15. VirologistAttacksWithVirusDance\n16. VirologistAttacksWithOblivion\n17. VirologistAttacksWithParalyses\n"
	    				+ "18. virologistLearnsGeneticCode\n\nThe number of the choosen menu (type one number and press ENTER):");
	        number = scanner.next();
	        
			//try {
			//	number = reader.readLine();
			//} catch (IOException e) {
			//	System.out.println("Error");
			//}
	        
	        switch(number) {
	        case "1": {
	        	System.out.println("1");
	        	movesToEmptyField();
	        	break;
	        }
	        case "2": {
	        	System.out.println("2");
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
	        case "19":{
	        	isRunning = false;
	        	 System.out.println("----------------------------------------------------------------\nExit. Bye :))");
	        	break;
	        }
	        default:
	        	break;
	        }
	        
	        }
		
	}


	//kijav�tva
	private static void movesToEmptyField(){
		Virologist v = new Virologist();
		Field f = new Field();

		/*Szekvenciák alapján*/

		v.move(f);

	}

	//kijav�tva
	private static void movesToLaboratory(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();

		/*Szekvenciák alapján*/

		v.move(l);

	}

	//kijav�tva
	private static void movesToWarehouse(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();

		/*Szekvenciák alapján*/

		v.move(w);
	}

	//kijavitva
	private static void movesToShelter(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();

		/*Szekvenciák alapján*/
		
		v.move(s);

	}
	
	//kijav�tva
	private static void virologistLearnsGeneticCode(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();
		GeneticCode g = new GeneticCode();
		v.move(l);

		/*Szekvenciak alapjan*/
		
		v.scout(l);

	}
	
	//kijavitva
	private static void virologistPicksUpaBag(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Bag b = new Bag();
		v.move(s);
		s.addEquipment(b);

		/*Szekvenciák alapján*/

		
		v.scout(s);

	}

	//kijavitva
	private static void virologistPicksUpaCloak(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Cloak c = new Cloak();
		v.move(s);
		s.addEquipment(c);

		/*Szekvenciák alapján*/

		v.scout(s);

	}

	//kijavitva
	private static void virologistPicksUpaGlove(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Glove g = new Glove();
		v.move(s);
		s.addEquipment(g);

		/*Szekvenciák alapján*/

		v.scout(s);
	}

	//kijavitva
	private static void virologistPicksUpMaterial(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		
		w.produceMaterial(1);
		v.move(w);
		
		
		v.scout(w);

	}

	static void virologistMakesVaccine()
	{

		//Inicializalas kommunikacios diagram alapjan
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
	
		v.createAgens(vc);
		
	}

	static void virologistMakesOblivionVirus() {
		//Inicializálás és beállítások
		Virologist v = new Virologist();
		Oblivion ov = new Oblivion();
		GeneticCode gc = new GeneticCode();
		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();

		v.pickUp(gc);
		v.pickUp(m1);
		v.pickUp(m2);
		v.pickUp(m3);
		
		// szekvenciák alapján a logika
		
		v.createAgens(ov);
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
		
		v.createAgens(vd);
		
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

		v.createAgens(vp);
		
	}

	static void useVaccine(){
		Vaccine vc = new Vaccine();
		Virologist v = new Virologist();
		v.addAgent(vc);
		
		v.attack(v,vc);

	}

	static void VirologistAttacksWithVirusDance(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		v1.move(f1);
		v2.move(f2);
		Virusdance vd = new Virusdance();
		v1.addAgent(vd);

		v1.attack(v2,vd);
		
	}

	static void VirologistAttacksWithParalyses(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		v1.move(f1);
		v2.move(f2);
		Paralyses p = new Paralyses();
		v1.addAgent(p);

		v1.attack(v2,p);

	}

	static void VirologistAttacksWithOblivion(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		v1.move(f1);
		v2.move(f2);
		Oblivion o = new Oblivion();
		v1.addAgent(o);

		v1.attack(v2,o);

	}
	
	static void VirologistSteal(){
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		Field f1 = new Field();
		Field f2 = new Field();
		v1.move(f1);
		v2.move(f2);
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

		v1.steal(v2);

	}
}
