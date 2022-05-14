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

	public static Color lightGrey = new Color(220,220,220);
	public static Color grey = new Color(181,181,181);
	public static Color blue = new Color(69,105,144);
	
	public static Font robotoMono20 = createFont(20);
	public static Font robotoMono24 = createFont(24);
	public static Font robotoMono14 = createFont(14);
	public static Font robotoMono12 = createFont(12);
	public static Font robotoMono8 = createFont(8);
	
	public static ImageIcon danceVirus = scale("src/UI/Images/Virus1.png", 35, 35);
	public static ImageIcon oblivionVirus = scale("src/UI/Images/Virus2.png", 35, 35);
	public static ImageIcon vaccine = scale("src/UI/Images/Vaccine.png", 35, 35);
	public static ImageIcon paralyseVirus = scale("src/UI/Images/Virus3.png", 35, 35);
	
	public static ImageIcon danceGC = scale("src/UI/Images/Genetic Code1.png", 35, 35);
	public static ImageIcon paralysesGC = scale("src/UI/Images/Genetic Code1-1.png", 35, 35);
	public static ImageIcon oblivionGC = scale("src/UI/Images/Genetic Code1-2.png", 35, 35);
	public static ImageIcon vaccineGC = scale("src/UI/Images/Genetic Code1-3.png", 35, 35);
	

		public static Font createFont(int size) {
			 
			 Font ttfBase = null;
			 Font telegraficoFont = null;
			 InputStream myStream = null;
			 
	         try {
	         	//myStream3 = new BufferedInputStream();
	             myStream = new BufferedInputStream(new FileInputStream("src/UI/Fonts/RobotoMono-Regular.ttf"));
	             ttfBase = Font.createFont(Font.TRUETYPE_FONT, myStream);
	             telegraficoFont = ttfBase.deriveFont(Font.PLAIN, size);               
	         } catch (Exception ex) {
	             ex.printStackTrace();
	             System.err.println("Font not loaded.");
	         }
	         
	         return telegraficoFont;
	 }
		
		/*
		 * public static ImageIcon scale(String location, int w, int h) {
		 * 
		 * ImageIcon imageIcon = new ImageIcon(location); // load the image to a
		 * imageIcon Image image = imageIcon.getImage(); // transform it Image newimg =
		 * smooth way imageIcon = new ImageIcon(image); // transform it back return
		 * imageIcon;
		 * 
		 * }
		 */
		
		public static ImageIcon scale(String location, int dWidth, int dHeight) {
			BufferedImage imageToScale = null;
			try {
				imageToScale = ImageIO.read(new File(location));
			} catch (IOException e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			}
	        BufferedImage scaledImage = null;
	        if (imageToScale != null) {
	            scaledImage = new BufferedImage(dWidth, dHeight, imageToScale.getType());
	            Graphics2D graphics2D = scaledImage.createGraphics();
	            graphics2D.drawImage(imageToScale, 0, 0, dWidth, dHeight, null);
	            graphics2D.dispose();
	        }
	        
	        return new ImageIcon(scaledImage);
	        
	        
	    }
		
		
}
