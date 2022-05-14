package UI.Components;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.awt.Color;

import javax.swing.JPanel;
import javax.swing.text.Position;

import Model.Field;

public class GameField extends JPanel {
	
	HashMap<Polygon,Field> fields = new HashMap<Polygon,Field>();

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
	   public void paint( Graphics g )
	     {

	    int xValues[] = { 70, 90, 100, 80, 70, 65, 60 };
	      int yValues[] = { 100, 100, 110, 110, 130, 110, 90 };
	      Polygon polygon1 = new Polygon( xValues, yValues, 7 );

			 int x2Values[] = { 80, 100, 110, 110, 170, 165, 160 };
			 int y2Values[] = { 100, 50, 110, 110, 130, 110, 90 };
			 Polygon polygon2 = new Polygon( x2Values, y2Values, 7 );
 
	        g.fillPolygon( polygon1 );
			 g.fillPolygon( polygon2 );
	    } 

}
