package UI;

import java.awt.Polygon;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import Model.Field;

public class Serializer {



	private class Polynom {
	 private float id;
	 private float num;
	 List<Integer> x = new ArrayList <Integer>();
	 List<Integer> y = new ArrayList <Integer>();
	 private String color;
	 List<Integer> neighbours = new ArrayList <Integer>();
	}
	
	public List<Polynom> loadFile(String file){
		String content;
		try {
			content = new Scanner(new File(file)).useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			throw new Error("Couldn't load the file");
		}
		GsonBuilder builder = new GsonBuilder(); 
	    builder.setPrettyPrinting(); 
	      
	    Gson gson = builder.create();
	    List<Polynom> pm = gson.fromJson(content, new ArrayList<Polynom>().getClass());
	    
	    for(Polynom p:pm) {
	    	System.out.print(p.color);
	    }
 
		return pm;
	}
	
	public HashMap<Polynom,Field> setFields(List<Polynom> polynoms){
		return null;
	}
	
}

	
	