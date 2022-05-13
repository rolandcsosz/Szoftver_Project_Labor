package UI;

import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

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
}
