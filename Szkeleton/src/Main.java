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
		    				+ "13. Virologist makes paralyses virus\n14. Virologist uses vaccine\n15. Virologist steals\n16. Virologist attacks with virus dance\n17. Virologist attacks with oblivion virus\n18. Virologist attacks with paralyses virus\n19. Exit program\n"
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
	        	virologistLearnsGeneticCode();
	        	break;
	        }
	        case "10": {
	        	System.out.println("10.Virologist makes vaccine");
	        	virologistMakesVaccine();
	        	break;
	        }
	        case "11": {
	        	System.out.println("11. Virologist makes oblivion virus");
	        	virologistMakesOblivionVirus();
	        	break;
	        }
	        case "12":{
	        	System.out.println("12. Virologist makes virus dance");
	        	virologistMakesVirusDance();
	        	break;
	        }
	        case "13":{
	        	System.out.println("13. Virologist makes paralyses virus");
	        	virologistMakesParalysesVirus();
	        	break;
	        }
	        case "14":{
	        	System.out.println("14. Virologist uses vaccine");
	        	useVaccine();
	        	break;
	        }
	        case "15":{
	        	System.out.println("15. Virologist steals");
	        	VirologistSteal();
	        	break;
	        }
	        case "16":{
	        	System.out.println("16. Virologist attacks with virus dance");
	        	VirologistAttacksWithVirusDance();
	        	break;
	        }
	        case "17":{
	        	System.out.println("17. Virologist attacks with oblivion virus");
	        	VirologistAttacksWithOblivion();
	        	break;
	        }
	        case "18":{
	        	System.out.println("18. Virologist attacks with paralyses virus");
	        	VirologistAttacksWithParalyses();
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


	private static void movesToEmptyField(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Field:f", 0);
		Field f = new Field();

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.setParameter("f2");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(f);
    	

	}


	private static void movesToLaboratory(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Laboratory:l", 0);
		Laboratory l = new Laboratory();

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.setParameter("l");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(l);

	}


	private static void movesToWarehouse(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Warehouse:wh", 0);
		Warehouse wh = new Warehouse();

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.setParameter("wh");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(wh);
	}


	private static void movesToShelter(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Shelter:s", 0);
		Shelter s = new Shelter();

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.setParameter("s");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);

	}
	
	
	private static void virologistLearnsGeneticCode(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Laboratory:l", 0);
		Laboratory l = new Laboratory();
		Logger.log("<<create>> GeneticCode:g", 0);
		GeneticCode g = new GeneticCode();
		Logger.log("l.generateGeneticCode(g)", 0);
		l.addGeneticCode(g);
		Logger.setParameter("l");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(l);

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		v.scout(l);

	}
	
	private static void virologistPicksUpaBag(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Shelter:s", 0);
		Shelter s = new Shelter();
		Logger.log("<<create>> Bag:b", 0);
		Bag b = new Bag();
		Logger.log("s.addEquipment(b)", 0);
		s.addEquipment(b);
		Logger.setParameter("s");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);
		
		s.addEquipment(b);
		

		/*Szekvenciak alapjan*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("b");
		v.scout(s);

	}

	
	private static void virologistPicksUpaCloak(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Shelter:s", 0);
		Shelter s = new Shelter();
		Logger.log("<<create>> Cloak:c", 0);
		Cloak c = new Cloak();

		Logger.log("s.addEquipment(c)", 0);
		s.addEquipment(c);
		
		Logger.setParameter("s");
		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);

		/*Szekvenciak alapjan*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("c");
		v.scout(s);

	}


	private static void virologistPicksUpaGlove(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Shelter:s", 0);
		Shelter s = new Shelter();
		Logger.log("<<create>> Glove:g", 0);
		Glove g = new Glove();
		
		Logger.log("s.addEquipment(g)", 0);
		s.addEquipment(g);
		Logger.setParameter("s");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(s);
		

		/*Szekvenciak alapjan*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("g");
		v.scout(s);
	}


	private static void virologistPicksUpMaterial(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Warehouse:w", 0);
		Warehouse w = new Warehouse();
		Logger.log("w.produceMaterial(1)", 0);
		w.produceMaterial(1);
		
		
		Logger.setParameter("w");

		Logger.log("v.move(" + Logger.getParameter() + ")", 0);
		v.move(w);
		
		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.scout(" + Logger.getParameter() + ")", 0);
		Logger.setParameter("g");
		v.scout(w);

	}

	static void virologistMakesVaccine()
	{
		/*Kommunikacios diagramok alapjan*/

		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Vaccine:vc", 0);
		Vaccine vc = new Vaccine();
		Logger.log("<<create>> GeneticCode:gc", 0);
		GeneticCode gc = new GeneticCode();
		Logger.log("<<create>> Material:m", 0);
		Material m = new Material();


		Logger.log("v.pickUp(gc)", 0);
		v.pickUp(gc);
		Logger.log("v.pickUp(m)", 0);
		v.pickUp(m);

		/*Szekvenciak alapjan*/
	
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(vc)", 0);
		Logger.setsecondParameter("vc");
		v.createAgens(vc);
		
	}

	static void virologistMakesOblivionVirus() {
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Oblivion:o", 0);
		Oblivion ov = new Oblivion();
		Logger.log("<<create>> GeneticCode:gc", 0);
		GeneticCode gc = new GeneticCode();
		Logger.log("<<create>> Material:m", 0);
		Material m = new Material();

		Logger.log("v.pickUp(gc)", 0);
		v.pickUp(gc);
		Logger.log("v.pickUp(m)", 0);
		v.pickUp(m);
		
		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(o)", 0);
		Logger.setsecondParameter("o");
		v.createAgens(ov);
	}

	static void virologistMakesVirusDance()
	{
		/*Kommunikacios diagramok alapjan*/

		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Virusdance:vd", 0);
		Virusdance vd = new Virusdance();
		Logger.log("<<create>> GeneticCode:gc", 0);
		GeneticCode gc = new GeneticCode();
		Logger.log("<<create>> Material:m", 0);
		Material m = new Material();



		Logger.log("v.pickUp(gc)", 0);
		v.pickUp(gc);
		Logger.log("v.pickUp(m)", 0);
		v.pickUp(m);


		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(vd)", 0);
		Logger.setsecondParameter("vd");
		v.createAgens(vd);
		
	}

	static void virologistMakesParalysesVirus()
	{
		/*Kommunikacios diagramok alapjan*/

		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Paralyses:p", 0);
		Paralyses p = new Paralyses();
		Logger.log("<<create>> GeneticCode:gc", 0);
		GeneticCode gc = new GeneticCode();
		Logger.log("<<create>> Material:m", 0);
		Material m = new Material();

		Logger.log("v.pickUp(gc)", 0);
		v.pickUp(gc);
		Logger.log("v.pickUp(m)", 0);
		v.pickUp(m);

		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.createAgens(p)", 0);
		Logger.setsecondParameter("p");
		v.createAgens(p);
		
	}

	static void useVaccine(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v", 0);
		Virologist v = new Virologist();
		Logger.log("<<create>> Vaccine:vc", 0);
		Vaccine vc = new Vaccine();
		Logger.log("v.pickUp(vc)", 0);
		v.addAgent(vc);
		
		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v.attack(v,vc)", 0);
		Logger.setParameter("v");
		Logger.setsecondParameter("vc");
		v.attack(v,vc);

	}

	static void VirologistAttacksWithVirusDance(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v1", 0);
		Virologist v1 = new Virologist();
		Logger.log("<<create>> Virologist:v2", 0);
		Virologist v2 = new Virologist();
		Logger.log("<<create>> Field:f1", 0);
		Field f1 = new Field();
		Logger.log("<<create>> Field:f2", 0);
		Field f2 = new Field();
	
		f1.setNeighbour(f2);

		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);

		Logger.log("<<create>> Virusdance:vd", 0);
		Virusdance vd = new Virusdance();
		Logger.log("v.pickUp(vd)", 0);
		v1.addAgent(vd);
		
		
		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v1.attack(v2,vd)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("vd");
		v1.attack(v2,vd);
		
	}

	static void VirologistAttacksWithParalyses(){
		
		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v1", 0);
		Virologist v1 = new Virologist();
		Logger.log("<<create>> Virologist:v2", 0);
		Virologist v2 = new Virologist();
		Logger.log("<<create>> Field:f1", 0);
		Field f1 = new Field();
		Logger.log("<<create>> Field:f2", 0);
		Field f2 = new Field();
	
		f1.setNeighbour(f2);

		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		
		Logger.log("<<create>> Paralyses:p", 0);
		Paralyses p = new Paralyses();
		Logger.log("v1.pickUp(p)", 0);
		v1.addAgent(p);
		
		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v1.attack(v2,p)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("p");
		v1.attack(v2,p);

	}

	static void VirologistAttacksWithOblivion(){

		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v1", 0);
		Virologist v1 = new Virologist();
		Logger.log("<<create>> Virologist:v2", 0);
		Virologist v2 = new Virologist();
		Logger.log("<<create>> Field:f1", 0);
		Field f1 = new Field();
		Logger.log("<<create>> Field:f2", 0);
		Field f2 = new Field();
	
		f1.setNeighbour(f2);

		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		
		Logger.log("<<create>> Oblivion:o", 0);
		Oblivion o = new Oblivion();
		Logger.log("v1.pickUp(o)", 0);
		v1.addAgent(o);
		
		/*Szekvenciak alapjan*/
		
		System.out.println("\nAfter initialization: ");
		Logger.log("v1.attack(v2,o)", 0);
		Logger.setParameter("v2");
		Logger.setsecondParameter("o");
		v1.attack(v2,o);

	}
	
	static void VirologistSteal(){
	

		/*Kommunikacios diagramok alapjan*/
		
		System.out.println("\nInitialization before the action:");
		Logger.log("<<create>> Virologist:v1", 0);
		Virologist v1 = new Virologist();
		Logger.log("<<create>> Virologist:v2", 0);
		Virologist v2 = new Virologist();
		Logger.log("<<create>> Field:f1", 0);
		Field f1 = new Field();
		Logger.log("<<create>> Field:f2", 0);
		Field f2 = new Field();
	
		f1.setNeighbour(f2);

		Logger.log("v1.move(f1)", 0);
		v1.move(f1);
		Logger.log("v2.move(f2)", 0);
		v2.move(f2);
		Logger.log("<<create>> Material:m", 0);
		Material m = new Material();
		Logger.log("<<create>> Cloak:c", 0);
		Cloak c = new Cloak();
		Logger.log("<<create>> Glove:g", 0);
		Glove g = new Glove();
		Logger.log("<<create>> Bag:b", 0);
		Bag b = new Bag();

		Logger.log("v1.pickUp(m)", 0);
		v2.pickUp(m);
		Logger.log("v1.pickUp(c)", 0);
		v2.pickUp(c);
		Logger.log("v1.pickUp(g)", 0);
		v2.pickUp(g);
		Logger.log("v1.pickUp(b)", 0);
		v2.pickUp(b);

		/*Szekvenciak alapjan*/

		System.out.println("\nAfter initialization: ");
		Logger.log("v1.steal(v2)", 0);
		Logger.setParameter("v1");
		Logger.setsecondParameter("p");
		v1.steal(v2);

	}
}
