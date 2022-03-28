import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	
	public static Logger logger = new Logger();

	public static void main(String[] args) {
		System.out.println("Syntax terror - Szkeleton");
		
		
		
		Scanner scanner = new Scanner(System.in);

	        String number = null;
	        boolean isRunning = true;
	        
	        while(isRunning) {
	        	
	        	 System.out.println("----------------------------------------------------------------\nTest cases:\n1. Virologist moves to empty field\n2. Virologist moves to laboratory\n3. Virologist moves to warehouse\n4. Virologist moves to shelter\n5. Virologist picks up a bag\n6. Virologist picks up a cloak\n"
		    				+ "7. Virologist picks up a glove\n8. Virologist picks up a material\n9. Virologist learns genetic code \n10.Virologist makes vaccine\n11. Virologist makes oblivion virus\n12. Virologist makes virus dance\n"
		    				+ "13. Virologist makes paralyses virus\n14. Virologist uses vaccine\n15. Virologist steals\n15. Virologist attacks with virus dance\n17. Virologist attacks with oblivion virus\n18. Virologist attacks with paralyses virus\n"
		    				+ "\n\nThe number of the choosen menu (type one number and press ENTER):");
		       
	        	 number = scanner.next();
	        
	        switch(number) {
	        case "1": {
	        	System.out.println("1. Virologist moves to empty field");
	        	movesToEmptyField();
	        	break;
	        }
	        case "2": {
	        	System.out.println("2. Virologist moves to laboratory");
	        	movesToLaboratory();
	        	break;
	        }
	        case "3": {
	        	System.out.println("3. Virologist moves to warehouse");
	        	movesToWarehouse();
	        	break;
	        }
	        case "4": {
	        	System.out.println("4. Virologist moves to shelter");
	        	movesToShelter();
	        	break;
	        }
	        case "5": {
	        	System.out.println("5. Virologist picks up a bag");
	        	virologistPicksUpaBag();
	        	break;
	        }
	        case "6": {
	        	System.out.println("6. Virologist picks up a cloak");
	        	virologistPicksUpaCloak();
	        	break;
	        }
	        case "7": {
	        	System.out.println("7. Virologist picks up a glove");
	        	virologistPicksUpaGlove();
	        	break;
	        }
	        case "8": {
	        	System.out.println("8. Virologist picks up a material");
	        	virologistPicksUpMaterial();
	        	break;
	        }
	        case "9": {
	        	System.out.println("9. Virologist learns genetic code ");
	        	virologistMakesVaccine();
	        	break;
	        }
	        case "10": {
	        	System.out.println("10.Virologist makes vaccine");
	        	virologistMakesOblivionVirus();
	        	break;
	        }
	        case "11": {
	        	System.out.println("11. Virologist makes oblivion virus");
	        	virologistMakesVirusDance();
	        	break;
	        }
	        case "12":{
	        	System.out.println("12. Virologist makes virus dance");
	        	virologistMakesParalysesVirus();
	        	break;
	        }
	        case "13":{
	        	System.out.println("13. Virologist makes paralyses virus");
	        	useVaccine();
	        	break;
	        }
	        case "14":{
	        	System.out.println("14. Virologist uses vaccine");
	        	VirologistSteal();
	        	break;
	        }
	        case "15":{
	        	System.out.println("15. Virologist steals");
	        	VirologistAttacksWithVirusDance();
	        	break;
	        }
	        case "16":{
	        	System.out.println("16. Virologist attacks with virus dance");
	        	VirologistAttacksWithOblivion();
	        	break;
	        }
	        case "17":{
	        	System.out.println("17. Virologist attacks with oblivion virus");
	        	VirologistAttacksWithParalyses();
	        	break;
	        }
	        case "18":{
	        	System.out.println("18. Virologist attacks with paralyses virus");
	        	virologistLearnsGeneticCode();
	        	break;
	        }
	        case "19":{
	        	isRunning = false;
	        	 System.out.println("----------------------------------------------------------------\nExit. Bye! :D");
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

		Logger.setParameter("f2");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(f);
    	

	}

	//kijav�tva
	private static void movesToLaboratory(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();

		/*Szekvenciák alapján*/
		
		Logger.setParameter("l");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(l);

	}

	//kijav�tva
	private static void movesToWarehouse(){
		Virologist v = new Virologist();
		Warehouse wh = new Warehouse();

		/*Szekvenciák alapján*/
		
		Logger.setParameter("wh");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(wh);
	}

	//kijavitva
	private static void movesToShelter(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();

		/*Szekvenciák alapján*/
		
		Logger.setParameter("wh");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);

	}
	
	//kijav�tva
	private static void virologistLearnsGeneticCode(){
		Virologist v = new Virologist();
		Laboratory l = new Laboratory();
		GeneticCode g = new GeneticCode();
		l.addGeneticCode(g);
		System.out.println("Initialization before the action:");
		Logger.setParameter("l");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(l);

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		v.scout(l);

	}
	
	//kijavitva
	private static void virologistPicksUpaBag(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Bag b = new Bag();
		s.addEquipment(b);
		System.out.println("Initialization before the action:");
		Logger.setParameter("s");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);
		
		s.addEquipment(b);
		

		/*Szekvenciák alapján*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("b");
		v.scout(s);

	}

	//kijavitva
	private static void virologistPicksUpaCloak(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Cloak c = new Cloak();

		s.addEquipment(c);
		
		System.out.println("Initialization before the action:");
		Logger.setParameter("s");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);

		/*Szekvenciák alapján*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("c");
		v.scout(s);

	}

	//kijavitva
	private static void virologistPicksUpaGlove(){
		Virologist v = new Virologist();
		Shelter s = new Shelter();
		Glove g = new Glove();
		System.out.println("Initialization before the action:");
		Logger.setParameter("s");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);
		s.addEquipment(g);

		/*Szekvenciák alapján*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("g");
		v.scout(s);
	}

	//kijavitva
	private static void virologistPicksUpMaterial(){
		Virologist v = new Virologist();
		Warehouse w = new Warehouse();
		System.out.println("Initialization before the action:");
		Logger.log("w.produceMaterial(1)", 0);
		w.produceMaterial(1);
		
		
		Logger.setParameter("w");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(w);
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("g");
		v.scout(w);

	}

	static void virologistMakesVaccine()
	{

		//Inicializalas kommunikacios diagram alapjan
		Virologist v = new Virologist();
		Vaccine vc = new Vaccine();
		GeneticCode gc = new GeneticCode();

		Material m = new Material();


		v.pickUp(gc);
		v.pickUp(m);

		//Szekvenciák alapján logika
	
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(vc)", 0);
		Logger.setsecondParameter("vc");
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
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(o)", 0);
		Logger.setsecondParameter("o");
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
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(vd)", 0);
		Logger.setsecondParameter("vd");
		v.createAgens(vd);
		
	}

	static void virologistMakesParalysesVirus()
	{

		//Inicializálás és beállítás
		Virologist v = new Virologist();
		Paralyses p = new Paralyses();
		GeneticCode gc = new GeneticCode();

		Material m1 = new Material();
		Material m2 = new Material();
		Material m3 = new Material();


		v.pickUp(gc);
		v.pickUp(m1);
		v.pickUp(m2);
		v.pickUp(m3);

		//Szekvenciák alapján logika
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(p)", 0);
		Logger.setsecondParameter("p");
		v.createAgens(p);
		
	}

	static void useVaccine(){
		Vaccine vc = new Vaccine();
		Virologist v = new Virologist();
		v.addAgent(vc);
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.attack(v,vc)", 0);
		Logger.setParameter("v");
		Logger.setsecondParameter("vc");
		v.attack(v,vc);

	}

	static void VirologistAttacksWithVirusDance(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		System.out.println("Initialization before the action:");
		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		Virusdance vd = new Virusdance();
		v1.addAgent(vd);
		
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v1.attack(v2,vd)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("vd");
		v1.attack(v2,vd);
		
	}

	static void VirologistAttacksWithParalyses(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		System.out.println("Initialization before the action:");
		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		
		Paralyses p = new Paralyses();
		v1.addAgent(p);
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v1.attack(v2,p)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("p");
		v1.attack(v2,p);

	}

	static void VirologistAttacksWithOblivion(){
		Field f1 = new Field();
		Field f2 = new Field();
		f1.setNeighbour(f2);
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		System.out.println("Initialization before the action:");
		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		Oblivion o = new Oblivion();
		v1.addAgent(o);
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v1.attack(v2,o)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("o");
		v1.attack(v2,o);

	}
	
	static void VirologistSteal(){
	
		Field f1 = new Field();
		Field f2 = new Field();
		Virologist v1 = new Virologist();
		Virologist v2 = new Virologist();
		System.out.println("Initialization before the action:");
		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		Glove g = new Glove();
		Cloak c = new Cloak();
		Bag b = new Bag();
		Material m = new Material();
		v2.pickUp(m);
		v2.pickUp(g);
		v2.pickUp(c);
		v2.pickUp(b);


		System.out.println("\nAfter initialization: ");
		Logger.log("v1.steal(v2)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("p");
		v1.steal(v2);

	}
}
