import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
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
	            	{
						attack(line[1], line[2], line[3]);
					}
	            		
	                break;
	            }
            
            	//2 parametert var
                case "create": {
	            	if(isParametesAreOk(line,2))
	            	{
	            		create(line[1],line[2]);
	            	}
	            	
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
	            	{
						make(line[1], line[2]);
					}
                    break;
                }
                
                //2 parametert var
                case "steal": {
	            	if(isParametesAreOk(line,2))
	            	{

					}
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
                
                case "kill": {
	            	if(isParametesAreOk(line,2))
	            	{
                        kill(line[1], line[2]);
                    }
                    break;
                }
                //1 parametert var
                case "save": {
	            	if(isParametesAreOk(line,1))
	            	{
	            		save(line[1]);
	            	}
                    break;
                }
                
                //1 parametert var
                case "load": {
	            	if(isParametesAreOk(line,1))
	            	{
	            		load(line[1]);
	            	}
                    break;
                }
                
                //0 parametert var
                case "restart": {
	            	if(isParametesAreOk(line,0))
	            	{
	            		restart();
	            	}
                    break;
                }
                
                //0 parametert var
                case "exit": {
	            	if(isParametesAreOk(line,0))
	                	isRunning = false;
	            	System.out.println("Exit, bye!");
                    break;
                }
                

                
                //0 parametert var
                case "help": {
                	if(isParametesAreOk(line,0))
                		help();
                	
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

        if(((Virologist)actor_obj).getCurrentfield().IsNeighbour(((Virologist)target_obj).getCurrentfield())) {
            ((Virologist)actor_obj).attack((Virologist)target_obj, (Agent)thing_obj);
            System.out.println("'" + actor + "' is attacking'" + target + "' with '" + thing +"'.");
        }
        else {
        	System.out.println("'" + actor + "' is not attacking'" + target + "' with '" + thing +"' because they are not neighbours.");
        }

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
		System.out.println("'" + actor + "' is created a '" + thing + "'");

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
    	
    	if(!(thing_obj instanceof Agent || thing_obj instanceof Material || thing_obj instanceof GeneticCode || thing_obj instanceof Bag || thing_obj instanceof Glove || thing_obj instanceof Cloak || thing_obj instanceof Axe || thing_obj instanceof Virologist))
    	{
    		
    		System.out.println(thing_obj.getClass().toString() +  "'" + thing + "' is not recognized as a virologist or equipment or agent or material. See 'help'.");
    		return;
    	}
    	
    	
    	//Ha virologushoz rendelunk dolgokat
    	if(actor_obj instanceof Virologist) {
    		
    		
    		if(thing_obj instanceof Agent) {
    			if(thing_obj instanceof BearVirus) {
    				actor_obj = new Bear();
    				System.out.println("'" + thing + "' is added to '" + actor + "' and become a bear. ");
    				return;
    			}
    			((Virologist)actor_obj).pickUp((Agent)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    			return;
    		}
    		
    		if(thing_obj instanceof GeneticCode) {
    			((Virologist)actor_obj).pickUp((GeneticCode)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    			return;
    		}
    		
    		if(thing_obj instanceof Material) {
    			if(((Virologist)actor_obj).getMaterialCount() == ((Virologist)actor_obj).getMaxMaterial()) {
    				System.out.println("'" + thing + "' is not added to '" + actor + "' because '" + actor + "' has maximum level of material.");
    				return;
    			}
    			((Virologist)actor_obj).pickUp((Material)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    			return;
    		}
    		
    		if(thing_obj instanceof Equipment) {
    			if(((Virologist)actor_obj).getEquipments().size() == 3) {
    				System.out.println("'" + thing + "' is not added to '" + actor + "' because '" + actor + "' has already 3 equipments.");
    				return;
    			}
    			
    			((Virologist)actor_obj).pickUp((Equipment)thing_obj);
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    			return;
    		}

    		
    	}
    	
    	//ha mezohoz rendelunk dolgokat
    	if(actor_obj instanceof Field) {
    		
    		if(actor_obj instanceof Laboratory) {
    			if(thing_obj instanceof GeneticCode) {
    				((Laboratory) actor_obj).addGeneticCode((GeneticCode)thing_obj);
    				System.out.println("'" + thing + "' is added to '" + actor + "'.");
        			return;
        		}
    			
    			if(thing_obj instanceof Virologist) {
        			((Laboratory)actor_obj).acceptVirologists((Virologist)thing_obj);
                    ((Virologist)thing_obj).setCurrentfield(((Laboratory)actor_obj));
        			System.out.println("'" + thing + "' is added to '" + actor + "'.");
        			return;
        		}
    			
    		}
    		
    		if(actor_obj instanceof Shelter) {
    			if(thing_obj instanceof Equipment) {
    				((Shelter)actor_obj).addEquipment((Equipment)thing_obj);
    				System.out.println("'" + thing + "' is added to '" + actor + "'.");
        			return;
        		}
    			
    			if(thing_obj instanceof Virologist) {
        			((Shelter)actor_obj).acceptVirologists((Virologist)thing_obj);
                    ((Virologist)thing_obj).setCurrentfield(((Shelter)actor_obj));
        			System.out.println("'" + thing + "' is added to '" + actor + "'.");
        			return;
        		}
    			
    			
    		}
    		
    		if(actor_obj instanceof Warehouse) {
    			if(thing_obj instanceof Material) {
    				int level = ((Warehouse)actor_obj).getMaterialLevel();
    				((Warehouse)actor_obj).setMaterialLevel(level+1);
    				System.out.println("'" + thing + "' is added to '" + actor + "'.");
        			return;
        		}
    			
    			if(thing_obj instanceof Virologist) {
        			((Warehouse)actor_obj).acceptVirologists((Virologist)thing_obj);
                    ((Virologist)thing_obj).setCurrentfield(((Warehouse)actor_obj));
        			System.out.println("'" + thing + "' is added to '" + actor + "'.");
        			return;
        		}
    			
    			
    		}
    		
			
			if(thing_obj instanceof Virologist) {
    			((Field)actor_obj).acceptVirologists((Virologist)thing_obj);
                ((Virologist)thing_obj).setCurrentfield(((Field)actor_obj));
    			System.out.println("'" + thing + "' is added to '" + actor + "'.");
    			return;
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
    	
    	if(obj instanceof Virologist && !(obj instanceof Bear)) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		virologists.put("V" + counter, (Virologist)obj);
        	return "V" + counter;
    	}
    	
    	if(obj instanceof Bear) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		virologists.put("BR" + counter, (Bear)obj);
        	return "BR" + counter;
    	
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
    		fields.put("W" + counter, (Warehouse)obj);
        	return "W" + counter;
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
    	
    	if(obj instanceof Vaccine) 
    	{
    		if(counters.get(obj.getClass().toString()) == null) {
    			counters.put(obj.getClass().toString(), 0);
    		}
    		
    		counter = counters.get(obj.getClass().toString())+1;
    		counters.replace(obj.getClass().toString(), counter);
    		agents.put("VC" + counter, (Vaccine)obj);
        	return "VC" + counter;
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
        if(field2_obj instanceof Shelter)
        {
        	if(((Field)field1_obj).IsNeighbour((Shelter)field2_obj))
            {
                System.out.println("'" + field1 + "' and '" + field2 + "' are already neighbours. See 'help'.");
                return;
            }
        	
        	//Minden oké, ha eddig eljutunk -> beállítjuk a szomszédokat
            ((Field)field1_obj).setNeighbour((Shelter)field2_obj);
            System.out.println("'" + field2 + "' is set as neighbour to '" + field1 + "'.");
            return;
        }
        
        if(field2_obj instanceof Laboratory)
        {
        	if(((Field)field1_obj).IsNeighbour((Laboratory)field2_obj))
            {
                System.out.println("'" + field1 + "' and '" + field2 + "' are already neighbours. See 'help'.");
                return;
            }
        	
        	//Minden oké, ha eddig eljutunk -> beállítjuk a szomszédokat
            ((Field)field1_obj).setNeighbour((Laboratory)field2_obj);
            System.out.println("'" + field2 + "' is set as neighbour to '" + field1 + "'.");
            return;
        }
        
        if(field2_obj instanceof Warehouse)
        {
        	if(((Field)field1_obj).IsNeighbour((Warehouse)field2_obj))
            {
                System.out.println("'" + field1 + "' and '" + field2 + "' are already neighbours. See 'help'.");
                return;
            }
        	
        	//Minden oké, ha eddig eljutunk -> beállítjuk a szomszédokat
            ((Field)field1_obj).setNeighbour((Warehouse)field2_obj);
            System.out.println("'" + field2 + "' is set as neighbour to '" + field1 + "'.");
            return;
        }
        
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
    
    static void restart() {
    		virologists.clear();
    		fields.clear();
    		equipments.clear();
    		agents.clear();
    		geneticcodes.clear();
    		materials.clear();
    		counters.clear();
    }
    
    static void load(String file) {
    	try {
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);
			while(true) {
				String l = br.readLine();
				if(l == null)
					return;
				String[] lines = l.split(" ");
				switch (lines[0]) {
	            case "attack": {
	            	if(isParametesAreOk(lines,3))
	            	{}
	            		
	                break;
	            }
                case "create": {
	            	if(isParametesAreOk(lines,2))
	            	{
	            		create(lines[1],lines[2]);
	            	}
                    break;
                }
                case "add": {
	            	if(isParametesAreOk(lines,2))
	            	{
	            		add(lines[1],lines[2]);
	            	}
                    break;
                }
                case "make": {
	            	if(isParametesAreOk(lines,2))
	            	{}
                    break;
                }
                case "steal": {
	            	if(isParametesAreOk(lines,2))
	            	{
	            		//steal(lines[1],lines[2]);
	            	}
                    break;
                }
                case "setneighbour": {
	            	if(isParametesAreOk(lines,2))
	            	{
                        setNeighbour(lines[1],lines[2]);
                    }
                    break;
                }
                case "move": {
	            	if(isParametesAreOk(lines,2))
	            	{
                        move(lines[1], lines[2]);
                    }
                    break;
                }
                

                
			}
			}
		} catch(IOException ex) {
			System.out.println("Invalid filename");
			return;
		}
    }
    
    static void save(String file) {
    	try {
			FileWriter fw = new FileWriter(file);
			PrintWriter pw = new PrintWriter(fw);
			//for(String[] l : commands) {
			//	pw.println(l);
			//}
		} catch(IOException ex) {
			System.out.println("Invalid filename");
			return;
			}
    	
    }
    
    static void kill(String virologist, String bear) {
    	if(!checkVariable(virologist))
    	{
    		System.out.println("'" + virologist + "' is not recognized as a variable. See 'help'.");
    		return;
    	}
    	
    	if(!checkVariable(bear))
    	{
    		System.out.println("'" + bear + "' is not recognized as a variable. See 'help'.");
    		return;
    	}
    	
    	Object actor_obj = getVariableByName(virologist);
    	

    	if(!(actor_obj instanceof Virologist))
    	{
    		System.out.println("'" + virologist + "' is not recognized as a virologist. See 'help'.");
    		return;
    	}
    	
    	Object thing_obj = getVariableByName(bear);
    	
    	if(!(thing_obj instanceof Bear))
    	{
    		
    		System.out.println("'" + bear + "' is not recognized as a bear. See 'help'.");
    		return;
    	}
    	
    	for (Collectable a : ((Virologist)actor_obj).getCollectables()) {
    		if(a instanceof Axe) {
    			if(!((Axe)a).isUsed) {
    				((Bear)thing_obj).die();
    				((Axe)a).setUsedStatus();
    				System.out.println("'" + bear + "' is killed successfully.");
    				return;
    			}
    		}
    	}
    	
    	System.out.println("'" + bear + "' is not killed.");
    }
    
    static void help() {
    	System.out.println("attack: requires two virologists' name and an agent's name, for example: attack V1 V2 DV1\n"
    			+ "create: requires an object (warehouse, laboratory, shelter, cloak, glove, bag, axe, geneticcode, vaccine, oblivion, paralyses, virusdance, bearvirus, virologist, bear, material) and a whole number, for example: create virologist 3\n"
    			+ "add: requires two objects name, for example: add S1 C1\n"
    			+ "make: requires a virologist's name and an agent (oblivion, paralyses, virusdance, bearvirus, vaccine), for example: make V1 oblivion\n"
    			+ "steal: requires two virologists' name, for example: steal V1 V2\n"
    			+ "setneighbour: requires two fields' name, for example: setneighbour W1 L1\n"
    			+ "move: requires a virologist's name and a field's name, for example: move V1 W1\n"
    			+ "save: requires a file, in which to save the game\n"
    			+ "load: requires a file, from where to load the game\n"
    			+ "restart: no parameters required\n"
    			+ "exit: no parameters required");
    }
}
