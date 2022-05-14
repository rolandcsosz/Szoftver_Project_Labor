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
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;

public class GameField extends JPanel {

	HashMap<Polygon, Field> fields = new HashMap<Polygon, Field>();

	/**
	 * Create the panel.
	 */
	public GameField() {

		this.setBackground(Color.WHITE);
		this.setBounds(0, 0, 1186, 491);

	}

	public static void readFileByLine(String fileName) {
		try {
			File file = new File(fileName);
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext()) {
				System.out.println(scanner.next());
			}
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}


	@Override
	public void paint(Graphics g) {

		List<Polygons> polygons = deserialize();
		List<Polygon> awtPolygon = new ArrayList<Polygon>();

		for(int i = 0; i < polygons.size(); i++){
			Polygon polygon = new Polygon(polygons.get(i).xValues,polygons.get(i).yValues,polygons.get(i).xValues.length);
			awtPolygon.add(polygon);
			System.out.println(Arrays.toString(polygons.get(i).xValues));

			if(polygons.get(i).color.equals("RED")){
			g.setColor(Color.RED);

			} else if(polygons.get(i).color.equals("BLUE")){
				g.setColor(Color.BLUE);

			}
			else if(polygons.get(i).color.equals("BLACK")){
				g.setColor(Color.BLACK);

			} else if(polygons.get(i).color.equals("ORANGE")){
				g.setColor(Color.ORANGE);

			} else if(polygons.get(i).color.equals("GREEN")){
				g.setColor(Color.GREEN);

			} else if(polygons.get(i).color.equals("CYAN")){
				g.setColor(Color.CYAN);

			} else if(polygons.get(i).color.equals("YELLOW")){
				g.setColor(Color.YELLOW);

			}else{
				g.fillPolygon(polygon);
			}
			g.fillPolygon(polygon);
		}

		ImageIcon warehouse = new ImageIcon("C:\\Users\\Gergő\\Desktop\\EGYETEM\\4. FÉLÉV\\Projlab\\Szoftver_Project_Labor_uj\\Final\\src\\UI\\Images\\Warehouse.png");
		JLabel warehouseLabel = new JLabel();
		warehouseLabel.setIcon(warehouse);
		this.add(warehouseLabel);
		BufferedImage image = null;
		try {
			image = ImageIO.read(new File("C:\\Users\\Gergő\\Desktop\\EGYETEM\\4. FÉLÉV\\Projlab\\Szoftver_Project_Labor_uj\\Final\\src\\UI\\Images\\Warehouse.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		g.drawImage(image, polygons.get(0).middleX-image.getWidth()/2, polygons.get(0).middleY - image.getHeight()/2, null);

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



