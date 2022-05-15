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
	
	public static Font robotoMono20 = createFont(20);
	public static Font robotoMono24 = createFont(24);
	public static Font robotoMono14 = createFont(14);
	public static Font robotoMono12 = createFont(12);
	public static Font robotoMono8 = createFont(8);
	
<<<<<<< HEAD
	public static ImageIcon danceVirus = scale("Final/src/UI/Images/Virus1.png", 35, 35);
	public static ImageIcon oblivionVirus = scale("Final/src/UI/Images/Virus2.png", 35, 35);
	public static ImageIcon vaccine = scale("Final/src/UI/Images/Vaccine.png", 35, 35);
	public static ImageIcon paralyseVirus = scale("Final/src/UI/Images/Virus3.png", 35, 35);
	
	public static ImageIcon danceGC = scale("Final/src/UI/Images/Genetic Code1.png", 35, 35);
	public static ImageIcon paralysesGC = scale("Final/src/UI/Images/Genetic Code1-1.png", 35, 35);
	public static ImageIcon oblivionGC = scale("Final/src/UI/Images/Genetic Code1-2.png", 35, 35);
	public static ImageIcon vaccineGC = scale("Final/src/UI/Images/Genetic Code1-3.png", 35, 35);
=======
	public static ImageIcon crown = new ImageIcon("src/UI/Images/Crown.png");
	
	public static ImageIcon danceVirus = new ImageIcon("src/UI/Images/Virus1.png");
	public static ImageIcon oblivionVirus = new ImageIcon("src/UI/Images/Virus2.png");
	public static ImageIcon vaccine = new ImageIcon("src/UI/Images/Vaccine.png");
	public static ImageIcon paralyseVirus = new ImageIcon("src/UI/Images/Virus3.png");
	
	public static ImageIcon danceVirusGC = new ImageIcon("src/UI/Images/DanceVirusGC.png");
	public static ImageIcon paralysesVirusGC = new ImageIcon("src/UI/Images/paralysesVirusGC.png");
	public static ImageIcon oblivionVirusGC = new ImageIcon("src/UI/Images/oblivionVirusGC.png");
	public static ImageIcon vaccineGC = new ImageIcon("src/UI/Images/VaccineGC.png");
>>>>>>> a0be8b482b1769e6937ced3e0436a9379500d122
	

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
		
		 
		
		
		
		public static ImageIcon load(String location) {
			BufferedImage imageToScale = null;
			try {
				imageToScale = ImageIO.read(new File(location));
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}

	        
	        return new ImageIcon(imageToScale);
	        
	        
	    }
		
		
}
