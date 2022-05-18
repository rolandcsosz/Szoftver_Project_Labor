import java.util.Arrays;
import java.util.HashSet;

import Model.Agent;
import Model.Axe;
import Model.Bag;
import Model.Bear;
import Model.BearVirus;
import Model.Cloak;
import Model.Equipment;
import Model.Field;
import Model.GeneticCode;
import Model.Glove;
import Model.Laboratory;
import Model.Material;
import Model.Oblivion;
import Model.Paralyses;
import Model.Shelter;
import Model.Vaccine;
import Model.Virologist;
import Model.Virusdance;
import Model.Warehouse;

/**
 * Proto-hoz használtuk.
 */
public class Handler
{
	static HashSet<String> types = new HashSet<String>(Arrays.asList(
			"SIMPLEFIELD",
			"SHELTER",
			"WAREHOUSE",
			"LABORATORY",
			"AXE",
			"GLOVE",
			"BAG",
			"CLOAK",
			"BEARVIRUS",
			"OBLIVION",
			"PARALYSES",
			"VACCINE",
			"VIRUSDANCE",
			"BEAR",
			"VIROLOGIST"
			));
	
	
	public static boolean isTypeCorrect(String type) {
		return types.contains(type);
	}

	public static Field createField(String type){
		switch(type) {
		case "SIMPLEFIELD":
			return new Field();
		case "SHELTER":
			return new Shelter();
		case "WAREHOUSE":
			return new Warehouse();
		case "LABORATORY":
			return new Laboratory();
		}
		return null;
	}
	
	public static Equipment createEquipment(String type){
		switch(type) {
		case "AXE":
			return new Axe();
		case "GLOVE":
			return new Glove();
		case "BAG":
			return new Bag();
		case "CLOAK":
			return new Cloak();
		}
		return null;
	}
	
	public static Agent createAgent(String type){
		switch(type) {
		case "BEARVIRUS":
			return new BearVirus();
		case "OBLIVION":
			return new Oblivion();
		case "PARALYSES":
			return new Paralyses();
		case "VACCINE":
			return new Vaccine();
		case "VIRUSDANCE":
			return new Virusdance();
		}
		return null;
	}
	
	public static Material createMaterial(String type) {
		switch(type) {
		case "MATERIAL":
			return new Material();
		}
		return null;
	}
	
	public static GeneticCode createGeneticCode(String type) {
		switch(type) {
		case "GENETICCODE":
			return new GeneticCode();
		}
		return null;
	}
	
	public static Virologist createVirologist(String type){
		switch(type) {
		case "BEAR":
			return new Bear();
		case "VIROLOGIST":
			return new Virologist();
		}
		return null;
	}
	
	public static void move(Virologist v, Field f) {
		if(!v.getCurrentfield().IsNeighbour(f)) {
			throw new Error("The selected field is not neighbour");
		}
		
		if(v.getParalysedStatus()) {
			throw new Error("The virologist is paralysed");
		}
		
		v.move(f);
		f.acceptVirologists(v);
	
	}
	
    static void setNeighbours(Field f1, Field f2){
    	
    	if(f1.IsNeighbour(f2) || f2.IsNeighbour(f1)) {
    		throw new Error("The two fields are already neaighbours");
    	}
    	
        f1.setNeighbour(f2);
        f2.setNeighbour(f1);
    }

	static void attack(Virologist v, Agent a) {

		if (v.getParalysedStatus() && v.getCurrentfield().IsNeighbour(v.getCurrentfield())) {
			a.effect(v);
		}

	}
}
