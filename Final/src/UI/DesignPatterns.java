package UI;

import java.awt.AlphaComposite;
import java.awt.Composite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.Raster;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;




import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;

public class DesignPatterns {

	public static Color grey = new Color(181,181,181);
	public static Color lightGrey = new Color(220,220,220);
	public static Color blue = new Color(69,105,144);
	public static Color lightBlue = new Color(192,222,255);
	public static Color red = new Color(239,118,122);
	public static Color lightRed = new Color(249,188,190);
	public static Color pastelGreen = new Color(163, 235, 223);
	public static Color pastelOrange = new Color(251, 223, 181);
	
	public static Font robotoMono20 = createFont(20);
	public static Font robotoMono24 = createFont(24);
	public static Font robotoMono14 = createFont(14);
	public static Font robotoMono12 = createFont(12);
	public static Font robotoMono8 = createFont(8);
	

	public static ImageIcon crown = new ImageIcon("Final/src/UI/Images/Crown.png");


	public static ImageIcon axe = new ImageIcon("Final/src/UI/Images/Axe.png");
	public static ImageIcon brokenAxe = new ImageIcon("Final/src/UI/Images/Broken Axe.png");
	public static ImageIcon cloack = new ImageIcon("Final/src/UI/Images/Cloack.png");
	public static ImageIcon bag = new ImageIcon("Final/src/UI/Images/Bag.png");
	public static ImageIcon glove = new ImageIcon("Final/src/UI/Images/Glove.png");
	
	public static ImageIcon laboratory = new ImageIcon("Final/src/UI/Images/Laboratory.png");
	public static ImageIcon shelter = new ImageIcon("Final/src/UI/Images/Shelter.png");
	public static ImageIcon warehouse = new ImageIcon("Final/src/UI/Images/Warehouse.png");
	
	public static ImageIcon virologist1 = new ImageIcon("Final/src/UI/Images/Virologist1.png");
	public static ImageIcon virologist2 = new ImageIcon("Final/src/UI/Images/Virologist2.png");
	public static ImageIcon bear = new ImageIcon("Final/src/UI/Images/Bear.png");
	public static ImageIcon bearVirus = new ImageIcon("Final/src/UI/Images/Bear.png");

	
	public static ImageIcon danceVirus = new ImageIcon("Final/src/UI/Images/Virus1.png");
	public static ImageIcon oblivionVirus = new ImageIcon("Final/src/UI/Images/Virus2.png");
	public static ImageIcon vaccine = new ImageIcon("Final/src/UI/Images/Vaccine.png");
	public static ImageIcon paralyseVirus = new ImageIcon("Final/src/UI/Images/Virus3.png");
	
	public static ImageIcon danceVirusGC = new ImageIcon("Final/src/UI/Images/DanceVirusGC.png");
	public static ImageIcon paralysesVirusGC = new ImageIcon("Final/src/UI/Images/paralysesVirusGC.png");
	public static ImageIcon oblivionVirusGC = new ImageIcon("Final/src/UI/Images/oblivionVirusGC.png");
	public static ImageIcon vaccineGC = new ImageIcon("Final/src/UI/Images/VaccineGC.png");

	
	
	

		public static Font createFont(int size) {
			 
			 Font ttfBase = null;
			 Font telegraficoFont = null;
			 InputStream myStream = null;
			 
	         try {
	         	//myStream3 = new BufferedInputStream();
	             myStream = new BufferedInputStream(new FileInputStream("Final/src/UI/Fonts/RobotoMono-Regular.ttf"));
	             ttfBase = Font.createFont(Font.TRUETYPE_FONT, myStream);
	             telegraficoFont = ttfBase.deriveFont(Font.PLAIN, size);               
	         } catch (Exception ex) {
	             ex.printStackTrace();
	             System.err.println("Font not loaded.");
	         }
	         
	         return telegraficoFont;
	 }

		public static ImageIcon scale(String location, int w, int h) {
			
			ImageIcon imageIcon = new ImageIcon(location); // load the image to a imageIcon
			Image image = imageIcon.getImage(); // transform it 
			Image newimg = image.getScaledInstance(w, h,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
			imageIcon = new ImageIcon(newimg);  // transform it back
			return imageIcon;
			
			}
		
		
}
