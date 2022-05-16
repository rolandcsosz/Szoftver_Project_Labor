package UI.Components;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.*;
import java.util.*;
import java.util.List;
import java.util.Map.Entry;

import javax.imageio.ImageIO;
import javax.swing.*;

import Model.Field;
import Model.Laboratory;
import Model.Shelter;
import Model.Warehouse;
import UI.DesignPatterns;
import UI.Player;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameField extends JPanel {

	HashMap<Polygons, Field> fields = new HashMap<Polygons, Field>();
	public boolean isRunning = false;
	boolean isFirstTime = true;
	int t = 0;
	private Random s = new Random();
	
	static int fieldindex1 = -1;
	static int fieldindex2 = -1;
	static int fieldselected1 = -1;
	static int fieldselected2 = -1;
	

	static List<Polygons> polygons;
	static JLabel Virologist1_label;
	static JLabel Virologist2_label;
	
	JLabel l;
	private JLabel lblNewLabel;

	/**
	 * Create the panel.
	 */
	
	
	
	public GameField() {

		this.setBackground(Color.WHITE);
		this.setBounds(0, 0, 1186, 491);
		polygons = deserialize();
		
		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(549, 223, 49, 14);
		lblNewLabel.setIcon(DesignPatterns.virologist1Faded);
		add(lblNewLabel);
		 
		
		Virologist1_label = new JLabel();
		Virologist1_label.setIcon(DesignPatterns.virologist1);
		add(Virologist1_label);
		
		Virologist2_label = new JLabel();
		Virologist2_label.setIcon(DesignPatterns.virologist2);
		add(Virologist2_label);
		
		generateRandomLocationToVirologists();
		

	}
	
	private void generateRandomLocationToVirologists() {
		Polygons p1 = getRandomPolygons();
		Polygons p2 = getRandomPolygons();
		
		Virologist1_label.setBounds(p1.middleX, p1.middleY,150,150);
		
		Virologist1_label.setBounds(p2.middleX, p2.middleY, 150, 150);
		
		fieldindex1 = p1.id;
		fieldindex2 = p2.id;
		
	}
	
	private Polygons getRandomPolygons() {
		Random rd = new Random();
		return polygons.get(rd.nextInt(25));
	}


	@Override
	public void paintComponent(Graphics g) {



		for(Polygons p: polygons){
			Polygon polygon = new Polygon(p.xValues,p.yValues,p.xValues.length);
			if(p.color.equals("RED")){
			g.setColor(DesignPatterns.lightRed);

			} else if(p.color.equals("BLUE")){
				g.setColor(DesignPatterns.lightBlue);

			} else if(p.color.equals("GREEN")){
				g.setColor(DesignPatterns.pastelGreen);

			} else if(p.color.equals("ORANGE")){
				g.setColor(DesignPatterns.pastelOrange);

			}
			
			else{
				g.drawPolygon(polygon);

			}
			
			g.fillPolygon(polygon);
			g.setColor(DesignPatterns.grey);
			g.drawPolygon(polygon);
			
			if(p.isSelected) {
				g.setColor(DesignPatterns.blue);
				g.drawPolygon(polygon);	
			}
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


public void setVirologsitsToRandomFields() {
		
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
	
	private Polygons getPolygonsById(int id) {
		for(Polygons p:polygons) {
			if(p.id == id)
				return p;
		}
		
		return null;
	}
	
	
	public Field getSelectedField(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			return fields.get(getPolygonsById(fieldindex1));
		}
		if(player == UI.Player.PLAYER2) {
			return fields.get(getPolygonsById(fieldindex2));
		}
		System.out.println("nulll");
		return null;
	}
	
	public void transformToBear(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			Virologist1_label.setIcon(DesignPatterns.bear);
		}
		
		if(player == UI.Player.PLAYER2) {
			Virologist2_label.setIcon(DesignPatterns.bear);
		}
	}
	
	
	public void selectNextField(UI.Player player) {
	Polygons selected, actual;
		if(player == UI.Player.PLAYER1) {
			
			if(fieldselected1 != -1) {
				selected = getPolygonsById(fieldselected1);
				selected.isSelected = false;
				actual = getPolygonsById(fieldindex1);
				int num = 0;
				
				for(int i = 0; i < actual.neighbours.length; i++) {
					if(actual.neighbours[i] == selected.id) {
						num = i;
						break;
					}
				}
				
				if(num == actual.neighbours.length-1) {
					fieldselected1 = actual.neighbours[0];
				}
				else{
					fieldselected1 = actual.neighbours[num+1];
				}
				
				selected = getPolygonsById(fieldselected1);
				selected.isSelected = true;
			}
			else {
				actual = getPolygonsById(fieldindex1);
				selected = getPolygonsById(actual.neighbours[0]);
				selected.isSelected = true;
			}
			
	
		}
		
		
		
		if(player == UI.Player.PLAYER2) {
			if(fieldselected2 != -1) {
			
				selected = getPolygonsById(fieldselected2);
				selected.isSelected = false;
				actual = getPolygonsById(fieldindex2);
				int num = 0;
				
				for(int i = 0; i < actual.neighbours.length; i++) {
					if(actual.neighbours[i] == selected.id) {
						num = i;
						break;
					}
				}
				
				if(num == actual.neighbours.length-1) {
					fieldselected2 = actual.neighbours[0];
				}
				else{
					fieldselected2 = actual.neighbours[num+1];
				}
			
				selected = getPolygonsById(fieldselected2);
				selected.isSelected = true;
	
			}
		else {
			actual = getPolygonsById(fieldindex2);
			selected = getPolygonsById(actual.neighbours[0]);
			selected.isSelected = true;
			}
		}
		
	}
	
	public void moveVirologist(UI.Player player,Field f) {
		
		
		Polygons poly = null;
		 for (Entry<Polygons, Field> entry : fields.entrySet()) {
			 if(entry.getValue().equals(f))
				 poly=entry.getKey();
		 }
		 
		 System.out.println(fieldselected1);
		 
		 if(poly == null) {
			 return;
		 }
		
		if(player == UI.Player.PLAYER1) {
			Virologist1_label.setBounds(poly.middleX-158, poly.middleY-75, 158, 150);
			getPolygonsById(fieldselected1).isSelected = false;
			fieldselected1 = fieldindex1;
			getPolygonsById(fieldselected1).isSelected = true;
			fieldindex1 = poly.id;
			
			
		}
		if(player == UI.Player.PLAYER2) {
			Virologist2_label.setBounds(poly.middleX-158, poly.middleY-75, 158, 150);
			getPolygonsById(fieldselected2).isSelected = false;
			fieldselected2 = fieldindex2;
			getPolygonsById(fieldselected2).isSelected = true;
			fieldindex2 = poly.id;
		}
		
		
	}
}



