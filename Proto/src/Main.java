import java.util.ArrayList;
import java.util.List;

import Model.Agent;
import Model.Equipment;
import Model.Field;
import Model.GeneticCode;
import Model.Material;
import Model.Virologist;

public class Main {

	
    static boolean isRunning = true;
    
  	static List<Field> fields = new ArrayList<Field>();
  	static List<Virologist> virologists = new ArrayList<Virologist>();
  	static List<Equipment> equipments = new ArrayList<Equipment>();
  	static List<Agent> agents = new ArrayList<Agent>();
  	static List<Material> materials = new ArrayList<Material>();
  	static List<GeneticCode> geneticCodes = new ArrayList<GeneticCode>();
  	
  	
    public static void main(String[] args) {


    }
    

    static void attack(String actor, String target, String thing){

    }


    static void make(Virologist v, Agent a){

    	if(v.getMaterialCount() < a.getCost().size()) {
    		throw new Error("Virologist has not enough material");
    	}
    	
		boolean hasGeneticCode = false;
    	for(GeneticCode gc : v.getGeneticCodes()) {

    		if(gc.equals(a.getGeneticCode())) {
    			hasGeneticCode = true;
    		}
    	}
    	
    	if(!hasGeneticCode) {
    		throw new Error("Virologist doesn't have the required genetic code");
    	}
    	
    	v.createAgens(a);
    	
    	
    }
    
    
    static void add(String actor, String thing)
    {

    }

    static void create(String type, int quantity)
    {
    	if(!Handler.isTypeCorrect(type)) {
    		throw new Error("The given type name is not recognisable");
    		
    	}
    	
    	for(int i = 0; i <= quantity; i++) {
    		
    		Field field = Handler.createField(type);
    		Equipment equipment = Handler.createEquipment(type);
    		Agent agent = Handler.createAgent(type);
    		Material material = Handler.createMaterial(type);
    		Virologist virologist = Handler.createVirologist(type);
    		GeneticCode geneticCode = Handler.createGeneticCode(type);
    		
    		if(field != null) {
    			fields.add(field);
    			continue;
    		}
    		
    		if(equipment != null) {
    			equipments.add(equipment);
    			continue;
    		}
    		
    		if(agent != null) {
    			agents.add(agent);
    			continue;
    		}
    		
    		if(material != null) {
    			materials.add(material);
    			continue;
    		}
    		
    		if(geneticCode != null) {
    			geneticCodes.add(geneticCode);
    			continue;
    		}
    		
    		if(virologist != null) {
    			virologists.add(virologist);
    			continue;
    		}
    		
    	}
    }

    static void setNeighbour(String  field1, String field2){
       
    }

    static void move(String virologist, String field){
      
    }
    
    static void restart() {
    		virologists.clear();
    		fields.clear();
    		equipments.clear();
    		agents.clear();
    		geneticCodes.clear();
    		materials.clear();
    }
    
    static void load(String file) {
    
    }
    
    static void save(String file) {
    	
    }
    
    static void kill(String virologist, String bear) {
    
    }
    
}
