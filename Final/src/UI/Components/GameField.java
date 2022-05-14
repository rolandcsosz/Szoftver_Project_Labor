package UI.Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.io.*;
import java.util.*;

import javax.swing.JPanel;

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

	}

	public List<Polygons> deserialize() {
		List<Polygons> polygonlist = new ArrayList<Polygons>();
		Gson gson = new Gson();
		try {
			JsonReader reader = new JsonReader(new FileReader("Final/src/UI/Levels/level1.json"));
			UI.Components.Polygons[] polygons = gson.fromJson(reader, UI.Components.Polygons[].class);
			polygonlist = Arrays.asList(polygons);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return  polygonlist;
	}
}



