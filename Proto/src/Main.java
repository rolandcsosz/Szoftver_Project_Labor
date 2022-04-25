import javax.security.auth.login.LoginException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Main {

    public static Logger logger = new Logger();
    static Scanner scanner;
    static String[] line;
    static String wholeLine;
    static boolean isRunning = true;
    
  //A beolvas�shoz kellenek. Az�rt tettem ide �ket, hogy a parseMap f�ggv�ny is l�ssa �ket.
  	private static InputStreamReader isr =	new InputStreamReader(System.in);
  	private static BufferedReader br = new BufferedReader(isr);

    
    //a program futasa kozben hasznalt valtozok tarolva, a kreaslas utani nev a kulcs
    static HashMap<String, Virologist> virologists = new HashMap<String, Virologist>();
    static HashMap<String, Field> fields = new HashMap<String, Field>();
    static HashMap<String, Equipment> equipments = new HashMap<String, Equipment>();
    static HashMap<String, Agent> agents = new HashMap<String, Agent>();
    static HashMap<String, GeneticCode> geneticcodes = new HashMap<String, GeneticCode>();
    static HashMap<String, Material> materials = new HashMap<String, Material>();
    
    //krealasnal a ez felelos a nevek szamozasaert
    static HashMap<String,Integer> counters = new HashMap<String,Integer>();
    

    /**
     * This is the main method
     */
    public static void main(String[] args) {
    	

    	
        while (isRunning) {

    		try {
				wholeLine = br.readLine();
			} catch (IOException e) {

			}

    		if (wholeLine == null) break;
        	
        	line = wholeLine.split(" ");


            switch (line[0]) {
            
	            //3 parametert var
	            case "attack": {
	            	if(isParametesAreOk(line,3))
	            	{}
	            		
	                break;
	            }
            
            	//2 parametert var
                case "create": {
	            	if(isParametesAreOk(line,2))
	            	{
	            		create(line[1],line[2]);
	            	}
	            	
	            	//teszt cellal
	            	/*for (Entry<String, Virologist> entry : virologists.entrySet())
	                    System.out.println("Key = " + entry.getKey() +
	                                     ", Value = " + entry.getValue());
	            	//teszt cellal
	            	for (Entry<String, Equipment> entry : equipments.entrySet())
	                    System.out.println("Key = " + entry.getKey() +
	                                     ", Value = " + entry.getValue());*/
                    break;
                }
                
               //2 parametert var
                case "add": {
	            	if(isParametesAreOk(line,2))
	            	{
	            		add(line[1],line[2]);
	            	}
                    break;
                }
                
                
                //2 parametert var
                case "make": {
	            	if(isParametesAreOk(line,2))
	            	{}
                    break;
                }
                
                //2 parametert var
                case "steal": {
	            	if(isParametesAreOk(line,2))
	            	{}
                    break;
                }

                /**
                 * Mindkét paraméter egy mező
                 */
                case "setneighbour": {
	            	if(isParametesAreOk(line,2))
	            	{
                        setNeighbour(line[1],line[2]);
                    }
                    break;
                }

                /**
                 * Az első paraméter a virológus
                 * A második paraméter a mező
                 */
                case "move": {
	            	if(isParametesAreOk(line,2))
	            	{
                        move(line[1], line[2]);
                    }
                    break;
                }
                
                //1 parametert var
                case "save": {
	            	if(isParametesAreOk(line,3))
	            	{}
                    break;
                }
                
                //1 parametert var
                case "load": {
	            	if(isParametesAreOk(line,0))
	            	{}
                    break;
                }
                
                //0 parametert var
                case "restart": {
	            	if(isParametesAreOk(line,0))
	            	{}
                    break;
                }
                
                //0 parametert var
                case "exit": {
	            	if(isParametesAreOk(line,0))
	                	isRunning = false;

                    break;
                }
                
                //0 parametert var
                case "help": {

                    break;
                }

                default:
                	System.out.println("'" + line[0] + "' is not recognized as command. See 'help'.");
            }

        }

    }
    
    static boolean isParametesAreOk(String[] line, int req)
    {
    	if(line.length - 1 == req)
    		return true;
    	else {
    		
    		String msg = line.length > req  ? "Too many arguments. See 'help'."
    				  						: "Too few arguments. See 'help'.";
    		System.out.println(msg);
    		
    		return false;

    	}
    }


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist moves to empty field" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void movesToEmptyField() {

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


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist moves to laboratory" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void movesToLaboratory() {

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


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist moves to warehouse" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void movesToWarehouse() {

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


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist moves to shelter" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void movesToShelter() {

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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist learns genetic code" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void virologistLearnsGeneticCode() {

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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist picks up a bag" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void virologistPicksUpaBag() {

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


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist picks up a cloak" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void virologistPicksUpaCloak() {

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


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist picks up a glove" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void virologistPicksUpaGlove() {

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


    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist picks up material" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    private static void virologistPicksUpMaterial() {

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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist makes vaccine" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void virologistMakesVaccine() {
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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist makes oblivion virus" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist makes virus dance" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void virologistMakesVirusDance() {
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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist makes paralyses virus" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void virologistMakesParalysesVirus() {
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

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist uses vaccine" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void useVaccine() {

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
        v.attack(v, vc);

    }

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist attacks with virus dance" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void VirologistAttacksWithVirusDance() {

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
        v1.attack(v2, vd);

    }

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist attacks with paralyses virus" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void VirologistAttacksWithParalyses() {

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
        v1.attack(v2, p);

    }

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist attacks with oblivion virus" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void VirologistAttacksWithOblivion() {

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
        v1.attack(v2, o);

    }

    /**
     * This is a method which generates the required objects and set them to the required states for the
     * "Virologist steals" and simulate that.
     *
     * @param args Unused.
     * @return Nothing.
     */
    static void VirologistSteal() {


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
/**
 * A gamemap addVirologists fuggvenyet teszteli. Letrehoz egy palyat, ahol a ket virologust random mezokre helyezi
 *
 * */
    static void VirologistAdded() {
        GameMap gm = new GameMap();
        gm.addVirologists();
    }

    /**
     * 7.teszteset doksi alapjan
     * Letrehoz kulonbozo mezoket, majd beallitja a szomszedaikat
     */
    static void CreteFields() {
        List<Field> fields = new ArrayList<>();
        fields.add(new Laboratory());
        fields.add(new Field());
        fields.add(new Shelter());
        Logger.log("1db laboratory letrehozva", 0);
        Logger.log("1db emptyfield letrehozva", 0);
        Logger.log("1db shelter letrehozva", 0);

        fields.get(0).setNeighbour(fields.get(1));
        fields.get(1).setNeighbour(fields.get(2));

        if (fields.get(0).IsNeighbour(fields.get(1))) {
            Logger.log("E1 beallitva L1 szomszedjakent", 0);
        }
        if (fields.get(1).IsNeighbour(fields.get(2))) {
            Logger.log("S1 beallitva E1 szomszedjakent", 0);
        }
    }

    /**
     * 8.teszteset doksi alapjan
     * Letrehozza a felszereleseket majd elhelyezi ezeket az ovohelyeken
     */
    static void CreateEquipments() {
        List<Field> fields = new ArrayList<>();
        fields.add(new Shelter());
        fields.add(new Shelter());
        fields.add(new Shelter());
        fields.add(new Shelter());
        Logger.log("4 db shelter letrehozva", 0);

        Cloak cloak = new Cloak();
        Logger.log("1db cloak letrehozva", 0);
        Axe axe = new Axe();
        Logger.log("1db axe letrehozva", 0);
        Bag bag = new Bag();
        Logger.log("1db bag letrehozva", 0);
        Glove glove = new Glove();
        Logger.log("1db glove letrehozva", 0);
        if (fields.get(0) instanceof Shelter) {
            ((Shelter) fields.get(0)).addEquipment(cloak);
            Logger.log("S1->EC1 vegrehajtva", 0);
        }
        if (fields.get(1) instanceof Shelter) {
            ((Shelter) fields.get(1)).addEquipment(cloak);
            Logger.log("S2->EA1 vegrehajtva", 0);
        }
        if (fields.get(2) instanceof Shelter) {
            ((Shelter) fields.get(2)).addEquipment(cloak);
            Logger.log("S3->EB1 vegrehajtva", 0);
        }
        if (fields.get(3) instanceof Shelter) {
            ((Shelter) fields.get(3)).addEquipment(cloak);
            Logger.log("S4->EG1 vegrehajtva", 0);
        }
    }

    /**
     * Javitva lett, Laboratory van Warehouse helyett (9.teszteset)
     * Genetikai kodokat keszit, amiket elhelyez laboratoriumokban
     */
    static void CreateGeneticCodes() {
        List<Field> fields = new ArrayList<>();
        fields.add(new Laboratory());
        fields.add(new Laboratory());
        Logger.log("2 db laboratory letrehozva", 0);

        GeneticCode geneticCode1 = new GeneticCode();
        GeneticCode geneticCode2 = new GeneticCode();
        Logger.log("2 db geneticcode letrehozva", 0);
        if (fields.get(0) instanceof Laboratory) {
            ((Laboratory) fields.get(0)).addGeneticCode(geneticCode1);
            if (fields.get(0).getCollectables().get(0) == geneticCode1) {
                Logger.log("L1->GC1 vegrehajtva", 0);
            }
        }
        if (fields.get(1) instanceof Laboratory) {
            ((Laboratory) fields.get(1)).addGeneticCode(geneticCode2);
            if (fields.get(1).getCollectables().get(0) == geneticCode2) {
                Logger.log("L2->GC2 vegrehajtva", 0);
            }
        }
    }

    /**
     * 10.teszteset doksi alapjan
     * Virologusokat keszit, az egyiket egy ures mezore, a masikat pedig egy ovohelyre helyezi
     */
    static void CreateVirologists() {
        GameMap gameMap = new GameMap();
        Virologist virologist1 = new Virologist();
        Virologist virologist2 = new Virologist();
        Logger.log("2db virologist letrehozva",0);
        Field emptyField = new Field();
        Shelter shelter = new Shelter();
        Logger.log("1db emptyfield letrehozva",0);
        Logger.log("1db shelter letrehozva",0);
        virologist1.move(emptyField);
        if(emptyField.getVirologist() == virologist1){
            Logger.log("V1 virologus az E1 mezore lepett",0);
        }
        virologist2.move(shelter);
        if(shelter.getVirologist() == virologist2){
            Logger.log("V2 virologus az S1 mezore lepett",0);
        }
    }

    static void attack(String actor, String target, String thing){
        if(!checkVariable(actor))
        {
            System.out.println("'" + actor + "' is not recognized as a variable. See 'help'.");
            return;
        }

        if(!checkVariable(target))
        {
            System.out.println("'" + target + "' is not recognized as a target. See 'help'.");
            return;
        }

        if(!checkVariable(thing))
        {
            System.out.println("'" + thing + "' is not recognized as a variable. See 'help'.");
            return;
        }
        //----------------------------------------------

        Object actor_obj = getVariableByName(actor);
        if(!(actor_obj instanceof Virologist))
        {
            System.out.println("'" + actor + "' is not recognized as a virologist. See 'help'.");
            return;
        }

        Object target_obj = getVariableByName(target);
        if(!(actor_obj instanceof Virologist))
        {
            System.out.println("'" + target + "' is not recognized as a virologist. See 'help'.");
            return;
        }

        Object thing_obj = getVariableByName(thing);
        if(!(thing_obj instanceof Agent))
        {
            System.out.println(thing_obj.getClass().toString() +  "'" + thing + "' is not recognized as agent. See 'help'.");
            return;
        }
        //--------------------------------------------------

        ((Virologist)actor_obj).attack((Virologist)target_obj, (Agent)thing_obj);
        System.out.println("'" + actor + "' is attacking'" + target + "' with" + thing +"'");

    }


    static void make(String actor, String thing){
        if(!checkVariable(actor))
        {
            System.out.println("'" + actor + "' is not recognized as a variable. See 'help'.");
            return;
        }

        if(!checkVariable(thing))
        {
            System.out.println("'" + thing + "' is not recognized as a thing. See 'help'.");
            return;
        }

        Object actor_obj = getVariableByName(actor);
        Object thing_obj = getVariableByName(thing);

        if(!(actor_obj instanceof Virologist))
        {
            System.out.println("'" + actor + "' is not recognized as a virologist. See 'help'.");
            return;
        }
        if(!(thing_obj instanceof Agent))
        {
            System.out.println(thing_obj.getClass().toString() +  "'" + thing + "' is not recognized as a agent. See 'help'.");
            return;
        }

         (((Virologist) actor_obj)).createAgens((Agent)thing_obj);
    }
    
    //Javitott
    //Hozzaad egy virologushoz vagy egy mezohoz egy targyat
    //hiba szintek nem "letezik a valtozo" -> "nem olyan tipusu a valtozo" -> "nem lehet hozzaadni mert fullon van"
    //(agens on field?)
    static void add(String actor, String thing)
    {
    	if(!checkVariable(actor))
    	{
    		System.out.println("'" + actor + "' is not recognized as a variable. See 'help'.");
    		return;
    	}
    	
    	if(!checkVariable(thing))
    	{
    		System.out.println("'" + thing + "' is not recognized as a variable. See 'help'.");
    		return;
    	}
    	
    	Object actor_obj = getVariableByName(actor);
    	

    	if(!(actor_obj instanceof Virologist || actor_obj instanceof Field))
    	{
    		System.out.println("'" + actor + "' is not recognized as a virologist or any kind of field. See 'help'.");
    		return;
    	}
    	
    	Object thing_obj = getVariableByName(thing);
    	
    	if(!(thing_obj instanceof Agent || thing_obj instanceof Material || thing_obj instanceof Bag || thing_obj instanceof Glove || thing_obj instanceof Cloak || thing_obj instanceof Axe || thing_obj instanceof Virologist))
    	{
    		
    		System.out.println(thing_obj.getClass().toString() +  "'" + thing + "' is not recognized as a virologist or equipment or agent or material. See 'help'.");
    		return;
    	}
    	
    	
    	//Ha virologushoz rendelunk dolgokat
    	if(actor_obj instanceof Virologist) {
    		
    		
    		if(thing_obj instanceof Agent) {
    			((Virologist)actor_obj).pickUp((Agent)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    		if(thing_obj instanceof Material) {
    			if(((Virologist)actor_obj).getMaterialCount() == ((Virologist)actor_obj).getMaxMaterial()) {
    				System.out.println("'" + thing + "' is not added to '" + actor + "' because '" + actor + "' has maximum level of material.");
    				return;
    			}
    			((Virologist)actor_obj).pickUp((Material)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    		if(thing_obj instanceof Equipment) {
    			if(((Virologist)actor_obj).getEquipments().size() == 3) {
    				System.out.println("'" + thing + "' is not added to '" + actor + "' because '" + actor + "' has already 3 equipments.");
    				return;
    			}
    			
    			((Virologist)actor_obj).pickUp((Equipment)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    	}
    	
    	//ha mezohoz rendelunk dolgokat
    	if(actor_obj instanceof Field) {
    		
    		Field f = (Field)actor_obj;
    		
    		if(actor_obj instanceof Laboratory) {
    			if(thing_obj instanceof GeneticCode) {
    				((Laboratory) actor_obj).addGeneticCode((GeneticCode)thing_obj);
        		}
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    		if(actor_obj instanceof Shelter) {
    			if(thing_obj instanceof GeneticCode) {
    				((Shelter)thing_obj).addEquipment((Equipment)actor_obj);
        		}
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    		if(actor_obj instanceof Warehouse) {
    			if(thing_obj instanceof GeneticCode) {
    				int level = ((Warehouse)thing_obj).getMaterialLevel();
    				((Warehouse)thing_obj).setMaterialLevel(level+1);
        		}
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    		
    		if(thing_obj instanceof Virologist) {
    			f.acceptVirologists((Virologist)thing_obj);
                ((Virologist)thing_obj).setCurrentfield(f);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    		}
    		
    	}	
    		

    }
    
    //Javitott
    //Visszaadja a nevhez tartozo objektumot object tipusban 
    static Object getVariableByName(String name)
    {
    	if(virologists.containsKey(name))
    		return virologists.get(name);
    	
    	if(materials.containsKey(name))
    		return materials.get(name);
    	
    	if(agents.containsKey(name))
    		return agents.get(name);
    	
    	if(fields.containsKey(name))
    		return fields.get(name);
    	
    	if(geneticcodes.containsKey(name))
    		return geneticcodes.get(name);
    	
    	if(equipments.containsKey(name))
    		return equipments.get(name);
    	
    	return null;
    }
    
    //Javitott
    //Megnezi hogy a nevhez tartozo variable letezik e
    static boolean checkVariable(String name)
    {
    	if(fields.containsKey(name)||virologists.containsKey(name)||materials.containsKey(name)||equipments.containsKey(name)||agents.containsKey(name)||geneticcodes.containsKey(name))
    		return true;
    	
    	return false;
    }
    
    //Javitott
    //hozzaadja a parameterkent megadott objectet a megfelelo HashMap-hez es letrehoz neki egy megfelelo nevet
    static String addObjectAndGetKey(Object obj)
    {
    	int counter;
    	
    	if(obj instanceof Virologist) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		virologists.put("V" + counter, (Virologist)obj);
        	return "V" + counter;
    	}
    	
    	if(obj instanceof Field && !(obj instanceof Laboratory||obj instanceof Shelter||obj instanceof Warehouse)) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		fields.put("F" + counter, (Field)obj);
        	return "F" + counter;
    	}
    	
    	if(obj instanceof Laboratory) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		fields.put("L" + counter, (Laboratory)obj);
        	return "L" + counter;
    	}
    	
    	if(obj instanceof Shelter) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		fields.put("S" + counter, (Shelter)obj);
        	return "S" + counter;
    	}
    	
    	if(obj instanceof Warehouse) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		fields.put("Wh" + counter, (Warehouse)obj);
        	return "Wh" + counter;
    	}
    	
    	if(obj instanceof Material) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		materials.put("M" + counter, (Material)obj);
        	return "M" + counter;
    	}
    	
    	if(obj instanceof Axe) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		equipments.put("A" + counter, (Axe)obj);
        	return "A" + counter;
    	}
    	
    	if(obj instanceof Glove) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		equipments.put("G" + counter, (Glove)obj);
        	return "G" + counter;
    	}
    	
    	if(obj instanceof Cloak) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		equipments.put("C" + counter, (Cloak)obj);
        	return "C" + counter;
    	}
    	
    	if(obj instanceof Bag) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		equipments.put("B" + counter, (Bag)obj);
        	return "B" + counter;
    	}
    	
    	if(obj instanceof GeneticCode) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		geneticcodes.put("GC" + counter, (GeneticCode)obj);
        	return "GC" + counter;
    	}
    	
    	if(obj instanceof BearVirus) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		agents.put("BV" + counter, (BearVirus)obj);
        	return "BV" + counter;
    	}
    	
    	if(obj instanceof Virusdance) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		agents.put("VD" + counter, (Virusdance)obj);
        	return "VD" + counter;
    	}
    	
    	if(obj instanceof Vaccine) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		agents.put("V" + counter, (Vaccine)obj);
        	return "V" + counter;
    	}
    	
    	if(obj instanceof Oblivion) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		agents.put("O" + counter, (Oblivion)obj);
        	return "O" + counter;
    	}
    	
    	if(obj instanceof Paralyses) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		agents.put("P" + counter, (Paralyses)obj);
        	return "P" + counter;
    	}
    		
    	return "";
    		


    }
    
    //Javitott
    //letrehozza a megadott objectet a megfelelo szamban
    //hiba:geneticcode-> GeneticCode
    static void create(String type, String quantity)
    {
    	String variables = null;
    	String actualVar = null;
    	Class<?> entity = null;
    	int quant;
    	
		try {
			entity = Class.forName(type.substring(0, 1).toUpperCase() + type.substring(1)); // virologist -> Virologist
		} catch (ClassNotFoundException e) {
			System.out.println("'" + type + "' is not recognized as a type. See 'help'.");
    		return;
		}

    	
    	try {
    		quant = Integer.valueOf(quantity);
    	} catch (NumberFormatException e) {
    	    System.out.println("'" + quantity + "' is not recognized as a number. See 'help'.");
    	    return;
    	}

    	
    	for(int i = 0;i < quant;i++)
    	{
    		
    		Constructor<?> constructor = entity.getConstructors()[0];
    		Object obj = null;
    		
    		try {
				obj = constructor.newInstance();
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
			}
    		
    		if(obj != null) {
    			actualVar = addObjectAndGetKey(obj);
    			
    			if(variables == null) {
        			variables = "[" + actualVar;
        		}
    			
    			else {
    				variables += "," + actualVar;
    			}
    		}
    		
    	}
    	
    	variables += "]";
    	
    	System.out.println(quantity + " " + type + "s created.\n" + variables);
    }

    /**
     * Mezők szomszédainak beállítása
     * @param field1 - neki állítjuk be field2-t szomszédként
     * @param field2 - őt állítjuk be szomszédként field1-nek (de végülis tök mindegy melyiket adjuk meg)
     */
    static void setNeighbour(String  field1, String field2){
        //Ellenőrizzük, hogy van-e ilyen mező
        if(!checkVariable(field1))
        {
            System.out.println("'" + field1 + "' is not recognized as a variable. See 'help'.");
            return;
        }

        //Ellenőrizzük, hogy van-e ilyen mező
        if(!checkVariable(field2))
        {
            System.out.println("'" + field2 + "' is not recognized as a variable. See 'help'.");
            return;
        }

        //Visszaadja a mezőkhöz tartozó objektumokat
        Object field1_obj = getVariableByName(field1);
        Object field2_obj = getVariableByName(field2);

        //Ellenőrzés: mindkét objektum Field típusu-e
        if(!(field1_obj instanceof Field || field2_obj instanceof Field))
        {
            System.out.println("'" + field1 + "' or '" + field2 + "' is not recognized as a field. See 'help'.");
            return;
        }

        //Ha a két mező már szomszédos nem csinálunk semmit
        if(((Field)field1_obj).IsNeighbour((Field)field2_obj))
        {
            System.out.println("'" + field1 + "' and '" + field2 + "' are already neighbours. See 'help'.");
            return;
        }

        //Minden oké, ha eddig eljutunk -> beállítjuk a szomszédokat
        ((Field)field1_obj).setNeighbour((Field)field2_obj);
        System.out.println("'" + field2 + "' is set as neighbour to '" + field1 + "'.");
        return;

    }

    /**
     * Virológust mozgatása
     * @param virologist - a felhasználó által megadott virológust akit mozgatni szeretnénk
     * @param field - a felhasználó által megadott mező, ahova a virológust akarjuk mozgatni
     */
    static void move(String virologist, String field){
        //Ellenőrizzük, hogy van-e ilyen virológus
        if(!checkVariable(virologist))
        {
            System.out.println("'" + virologist + "' is not recognized as a variable. See 'help'.");
            return;
        }

        //Ellenőrizzük, hogy van-e ilyen mező
        if(!checkVariable(field))
        {
            System.out.println("'" + field + "' is not recognized as a variable. See 'help'.");
            return;
        }

        //Visszaadja a virológushoz tartozó objektumot
        Object virologist_obj = getVariableByName(virologist);

        if(!(virologist_obj instanceof Virologist))
        {
            System.out.println("'" + virologist + " is not recognized as a virologist. See 'help'.");
            return;
        }

        //Visszaadja a mezőhöz tartozó objektumot
        Object field_obj = getVariableByName(field);

        if(!(field_obj instanceof Field))
        {
            System.out.println("'" + field + " is not recognized as a field. See 'help'.");
            return;
        }

        //Ha a virológus aktuális mezője nem szomszédos a megadott mezővel
        if(!(((Virologist)virologist_obj).getCurrentfield().IsNeighbour((Field) field_obj)))
        {
            System.out.println("'" + virologist + "'s field and '" + field + "' are not neighbours. See 'help'.");
            return;
        }

        //Ha a virológus bénult állapotban van
        if((((Virologist)virologist_obj).getParalysedStatus()))
        {
            System.out.println("'" + virologist + "' is paralyzed. See 'help'.");
            return;
        }

        //Egyébként minden oké és léptetünk
        ((Virologist)virologist_obj).move(((Field)field_obj));
        System.out.println("'" + virologist + "'" + " moved to " + "'" + field + "'" + ".");
        return;
    }
}
