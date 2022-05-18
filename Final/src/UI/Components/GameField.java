package UI.Components;

import UI.Frames.Menu;
import Main.Main;
import Model.*;
import UI.DesignPatterns;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.*;
import java.util.Map.Entry;

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
	
	static JLabel l;
	private JLabel Virologist1Faded_label;
	private JLabel lblNewLabel;
	private JLabel Virologist2Faded_label;

	/**
	 * Create the panel.
	 */
	public GameField() {

		this.setBackground(Color.WHITE);
		this.setBounds(0, 0, 1186, 491);
		polygons = deserialize();
		setLayout(null);
		 
		
		Virologist1_label = new JLabel();
		Virologist1_label.setIcon(DesignPatterns.virologist1);
		add(Virologist1_label);
		
		Virologist2_label = new JLabel();
		Virologist2_label.setIcon(DesignPatterns.virologist2);
		add(Virologist2_label);
		
		Virologist1Faded_label = new JLabel();
		Virologist1Faded_label.setVisible(false);
		Virologist1Faded_label.setIcon(DesignPatterns.virologist1Faded);
		add(Virologist1Faded_label);

		lblNewLabel = new JLabel();
		lblNewLabel.setBounds(180, 437, 49, 14);
		add(lblNewLabel);
		
		Virologist2Faded_label = new JLabel();
		Virologist2Faded_label.setVisible(true);
		Virologist2Faded_label.setIcon(DesignPatterns.virologist2Faded);
		add(Virologist2Faded_label);
		
		generateRandomLocationToVirologists();

	}

	/**
	 * Feltölti a védőfelszereléseket tartalmazó listát védőfelszerelésekkel a paraméterként kapott
	 * szint alapján
	 * @param lvl - játék nehézségi szintje
	 */
	public void setEquipments(int lvl){
		if(lvl == 3){
			Main.equipments.add(new Axe());
			Main.equipments.add(new Axe());
		}
			Main.equipments.add(new Bag());
			Main.equipments.add(new Cloak());
			Main.equipments.add(new Glove());
			Main.equipments.add(new Bag());
			Main.equipments.add(new Cloak());
			Main.equipments.add(new Glove());
	}

	/**
	 * Feltölti az egyes mezőket a virológus által begyűjthető dolgokkal (védőfelszerelésekkel, genetikai kódokkal,
	 * anyagmennyiséggel a paraméterként megadott nehézségi szint alapján
	 * @param lvl - játék nehézségi szintje
	 */
	public void addCollectablesToFields(int lvl){
		boolean hasBear = false;
		System.out.println("IM ALIVE!");
		setEquipments(lvl);
		int eqNr = 0;
			for(int i = 0; i < fields.size(); i++){
				if(Main.fields.get(i) instanceof Laboratory){
					((Laboratory) Main.fields.get(i)).addGeneticCode(new GeneticCode());
					if(!hasBear){
						((Laboratory)Main.fields.get(i)).addBear(new BearVirus());
						hasBear = true;
					}
				}
				if(Main.fields.get(i) instanceof Warehouse) {
					((Warehouse)Main.fields.get(i)).setMaterialLevel(30);
				}
				if(Main.fields.get(i) instanceof Shelter) {
					if(eqNr < Main.equipments.size()) {
						((Shelter) Main.fields.get(i)).addEquipment(Main.equipments.get(eqNr));
						eqNr++;
					}

				}
			}
	}

	/**
	 * Elhelyezi a virológust a pályán random módon a játék kezdetekor
	 */
	private void generateRandomLocationToVirologists() {
		Polygons p1 = getRandomPolygons();
		Polygons p2 = getRandomPolygons();
		
		Virologist1_label.setBounds(p1.middleX-75, p1.middleY-150,150,150);
		
		Virologist2_label.setBounds(p2.middleX-75, p2.middleY-150,150, 150);
		
		fieldindex1 = p1.id;
		fieldindex2 = p2.id;
		
	}

	/**
	 * Kiválaszt egy random poligont (mezőt) amelyiken a virológust elhelyezi majd és visszaadja azt
	 * @return egy random poligonnal tér vissza, amin majd a virológust helyezi el a játék kezdetekor
	 */
	private Polygons getRandomPolygons() {
		Random rd = new Random();
		return polygons.get(rd.nextInt(25));
	}

	/**
	 * Kirajzolja a poligonokat és beállítja a színeiket
	 * @param g
	 */
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
			} else{
				g.drawPolygon(polygon);
			}
			
			g.fillPolygon(polygon);
			g.setColor(DesignPatterns.grey);
			g.drawPolygon(polygon);
		}
		if(t < 1) {
			fillMap(g, 2, 8, 5);
			setNeighboursByPolygons();
			addCollectablesToFields(Menu.level);
			t++;
		}else{
			loadMap(g);
		}
	}

	/**
	 * Random módon kiválaszt egy poligont a poligonok listájából majd azt megfelelti egy bizonyos mező típussal egy
	 * hashmapben
	 * @param g
	 * @param w raktárak darabszáma
	 * @param s óvóhelyek darabszáma
	 * @param l laboratoriumok darbszáma
	 */
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
		for (Entry<Polygons, Field> entry : fields.entrySet()) {
			Main.fields.add(entry.getValue());
		}
	}

	/**
	 * Elhelyezi az óvóhely, raktár és laboratórium képeket a mezőn
	 * @param g
	 */
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

	/**
	 * Json file deszerializálása
	 * @return poligon listával tér vissza
	 */
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

	/**
	 * Visszaadja az adott poligont az ID alapján
	 * @param id poligon azonosítója
	 * @return
	 */
	private Polygons getPolygonsById(int id) {
		for(Polygons p:polygons) {
			if(p.id == id)
				return p;
		}
		return null;
	}

	/**
	 * A játékos által kiválasztott Field-et adja vissza
	 * @param player
	 * @return
	 */
	public Field getSelectedField(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			if(fieldselected1 == -1) {
				return null;
			}
			return fields.get(getPolygonsById(fieldselected1));
		}
		if(player == UI.Player.PLAYER2) {
			if(fieldselected2 == -1) {
				return null;
			}
			return fields.get(getPolygonsById(fieldselected2));
		}
		return null;
	}

	/**
	 * A játékos aktuális mezőjét adja vissza
	 * @param player
	 * @return
	 */
	public Field getActualField(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			return fields.get(getPolygonsById(fieldindex1));
		}
		if(player == UI.Player.PLAYER2) {
			return fields.get(getPolygonsById(fieldindex2));
		}
		return null;
	}

	/**
	 * Ha a virológus medvévé változik lecsereli a virológus ikonját a medve ikonjára
	 * @param player játékos akinek az ikonját le kell cserélni
	 */
	public void transformToBear(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			Virologist1_label.setIcon(DesignPatterns.bear);
		}
		
		if(player == UI.Player.PLAYER2) {
			Virologist2_label.setIcon(DesignPatterns.bear);
		}
	}

	/**
	 *
	 * @param player
	 */
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
				Virologist1Faded_label.setVisible(true);
				Virologist1Faded_label.setBounds(selected.middleX-75, selected.middleY-150,150,150);
				selected.isSelected = true;
			}
			else {
				actual = getPolygonsById(fieldindex1);
				selected = getPolygonsById(actual.neighbours[0]);
				Virologist1Faded_label.setVisible(true);
				Virologist1Faded_label.setBounds(selected.middleX-75,selected.middleX-150,150,150);
				fieldselected1 = selected.id;
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
				Virologist2Faded_label.setBounds(selected.middleX-75, selected.middleY-150,150,150);
				Virologist2Faded_label.setVisible(true);
				selected.isSelected = true;
			}
			else {
				actual = getPolygonsById(fieldindex2);
				selected = getPolygonsById(actual.neighbours[0]);
				Virologist2Faded_label.setBounds(selected.middleX-75,selected.middleX-150,150,150);
				Virologist2Faded_label.setVisible(true);
				fieldselected2 = selected.id;
				selected.isSelected = true;
			}
		}
	}

	/**
	 * Beállítja a mezők szomszédajait a poligonok szomszédjai alapján
	 */
	public void setNeighboursByPolygons() {
		Iterator<Map.Entry<Polygons, Field>> itr1 = fields.entrySet().iterator();
		Iterator<Map.Entry<Polygons, Field>> itr2 = fields.entrySet().iterator();
		while (itr1.hasNext()) {
			Map.Entry<Polygons, Field> entry = itr1.next();
			int[] a = entry.getKey().neighbours;
			for(int j = 0; j < a.length; j++){
				boolean megvan = false;
				while(itr2.hasNext() && !megvan){
					Map.Entry<Polygons, Field> perm = itr2.next();
					if(a[j] == perm.getKey().id){
						entry.getValue().setNeighbour(perm.getValue());
						megvan = true;
						itr2 = fields.entrySet().iterator();
					}
				}
			}
		}
	}

	/**
	 * Áthelyezi a virológus ikonját a paraméterként kapott mezőre. Paraméterként várja, hogy melyik játékost, melyik
	 * mezőre kell áthelyezni.
	 * @param player
	 * @param f
	 */
	public void moveVirologist(UI.Player player,Field f) {

		Polygons poly = null;
		 for (Entry<Polygons, Field> entry : fields.entrySet()) {
			 if(entry.getValue().equals(f))
				 poly=entry.getKey();
		 }
		 
		 if(poly == null) {
			 return;
		 }
		
		if(player == UI.Player.PLAYER1) {
			if(fieldselected1 == -1) {
				return;
			}
			Virologist1_label.setBounds(poly.middleX-75, poly.middleY-150, 150, 150);
			Virologist1Faded_label.setVisible(false);
			getPolygonsById(fieldselected1).isSelected = false;
			fieldselected1 = -1;
			fieldindex1 = poly.id;
		}

		if(player == UI.Player.PLAYER2) {
			if(fieldselected2 == -1) {
				return;
			}
			Virologist2_label.setBounds(poly.middleX-75, poly.middleY-150, 150, 150);
			Virologist2Faded_label.setVisible(false);
			getPolygonsById(fieldselected2).isSelected = false;
			fieldselected2 = -1;
			fieldindex2 = poly.id;
		}
	}

	public void drawVirologist(Virologist v, Graphics graphics) throws IOException {
		BufferedImage virologistImage = ImageIO.read(new File("Final/src/UI/Images/Virologist.png"));
		JLabel virologistLabel = new JLabel();
		virologistLabel.setIcon(new ImageIcon(virologistImage));
		Iterator<Map.Entry<Polygons, Field>> itr1 = fields.entrySet().iterator();
		boolean set = false;
		while (itr1.hasNext() && !set){
			Map.Entry<Polygons, Field> entry = itr1.next();
			if(v.getCurrentfield() == entry.getValue()){
				virologistLabel.setBounds(entry.getKey().middleX,entry.getKey().middleY, size().width, size().height);
				set = true;
			}
		}
		this.add(virologistLabel);
		this.setVisible(true);
	}

	public void moveRandomVirologist(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			Virologist1Faded_label.setVisible(false);
			Polygons poly = getPolygonsById(fieldindex1);
		}
	}

}



