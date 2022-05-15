package UI.Components;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.*;
import java.util.*;
import java.util.List;

import javax.imageio.ImageIO;
import javax.swing.*;

import Model.Field;
import Model.Laboratory;
import Model.Shelter;
import Model.Warehouse;
import UI.DesignPatterns;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class GameField extends JPanel {

	HashMap<Polygons, Field> fields = new HashMap<Polygons, Field>();
	public boolean isRunning = false;
	int t = 0;






	/**
	 * Create the panel.
	 */
	public GameField() {

		this.setBackground(Color.WHITE);
		this.setBounds(0, 0, 1186, 491);

	}


	List<Polygons> polygons;
	@Override
	public void paint(Graphics g) {

		 polygons = deserialize();
		List<Polygon> awtPolygon = new ArrayList<Polygon>();

		for(int i = 0; i < polygons.size(); i++){
			Polygon polygon = new Polygon(polygons.get(i).xValues,polygons.get(i).yValues,polygons.get(i).xValues.length);
			awtPolygon.add(polygon);

			if(polygons.get(i).color.equals("RED")){
			g.setColor(DesignPatterns.lightRed);

			} else if(polygons.get(i).color.equals("BLUE")){
				g.setColor(DesignPatterns.lightBlue);

			} else if(polygons.get(i).color.equals("GREEN")){
				g.setColor(DesignPatterns.pastelGreen);

			} else if(polygons.get(i).color.equals("ORANGE")){
				g.setColor(DesignPatterns.pastelOrange);

			}
			else{
				g.fillPolygon(polygon);
			}
			g.fillPolygon(polygon);
		}
		if(t < 1) {
			fillMap(g, 2, 5, 5);
			t++;
		}else{
			loadMap(g);
		}

	}



	public void fillMap(Graphics g, int w, int s, int l){

		Random random = new Random();
		List<Integer> was = new ArrayList<Integer>();
		BufferedImage WarehouseImage = null;
		try {
			WarehouseImage = ImageIO.read(new File("src/UI/Images/Warehouse.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedImage LaboratoryImage = null;
		try {
			LaboratoryImage = ImageIO.read(new File("src/UI/Images/Laboratory.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedImage ShelterImage = null;
		try {
			ShelterImage = ImageIO.read(new File("src/UI/Images/Shelter.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		 for(int warehouses = 0; warehouses < w; warehouses ++){
			 if(!isRunning) {
				 int rand25 = random.nextInt(1, 25);
				 while (was.contains(rand25))
					 rand25 = random.nextInt(1, 25);
				 was.add(rand25);
				 fields.put(polygons.get(rand25), new Warehouse());
				 g.drawImage(WarehouseImage, polygons.get(rand25).middleX - 25, polygons.get(rand25).middleY  -25, 50,50, null);
			 }
		}

		for(int laboratory = 0; laboratory < l; laboratory ++){
			if(!isRunning) {
				int rand25 = random.nextInt(1, 25);
				while (was.contains(rand25))
					rand25 = random.nextInt(1, 25);
				was.add(rand25);
				g.drawImage(LaboratoryImage, polygons.get(rand25).middleX - 25, polygons.get(rand25).middleY - 25, 50, 50, null);
				fields.put(polygons.get(rand25), new Laboratory());
			}
		}

		for(int shelter = 0; shelter < s; shelter ++){
			if(!isRunning) {
				int rand25 = random.nextInt(1, 25);
				while (was.contains(rand25))
					rand25 = random.nextInt(1, 25);
				was.add(rand25);
				g.drawImage(ShelterImage, polygons.get(rand25).middleX - 25, polygons.get(rand25).middleY - 25, 75, 75, null);
				fields.put(polygons.get(rand25), new Shelter());
			}
		}

		for(int i = 0; i < 25; i++){
			if(!fields.containsKey(polygons.get(i))){
				fields.put(polygons.get(i), new Field());
			}
		}

	}

	public void loadMap(Graphics g){
		BufferedImage WarehouseImage = null;
		try {
			WarehouseImage = ImageIO.read(new File("Final/src/UI/Images/Warehouse.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedImage LaboratoryImage = null;
		try {
			LaboratoryImage = ImageIO.read(new File("Final/src/UI/Images/Laboratory.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		BufferedImage ShelterImage = null;
		try {
			ShelterImage = ImageIO.read(new File("Final/src/UI/Images/Shelter.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Iterator<Map.Entry<Polygons, Field>> itr = fields.entrySet().iterator();
		while(itr.hasNext()){
			Map.Entry<Polygons,Field> entry = itr.next();
			if(entry.getValue() instanceof Warehouse){
				g.drawImage(WarehouseImage, entry.getKey().middleX - 25, entry.getKey().middleY  -25, 50,50, null);
			}else if(entry.getValue() instanceof Laboratory){
				g.drawImage(LaboratoryImage, entry.getKey().middleX - 25, entry.getKey().middleY  -25, 50,50, null);
			}else if(entry.getValue() instanceof Shelter){
				g.drawImage(ShelterImage, entry.getKey().middleX - 25, entry.getKey().middleY  -25, 50,50, null);
			}
		}
	}





	public List<Polygons> deserialize() {
		List<Polygons> polygonlist = new ArrayList<Polygons>();
		Gson gson = new Gson();
		try {
			JsonReader reader = new JsonReader(new FileReader("src/UI/Levels/level1.json"));
			UI.Components.Polygons[] polygons = gson.fromJson(reader, UI.Components.Polygons[].class);
			polygonlist = Arrays.asList(polygons);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return  polygonlist;
	}
}



