package UI.Components;

import java.awt.*;

/**
 * Poligonok kezeléséért felelős osztály
 */
public class Polygons {
   public int id;
   public int[] xValues;
   public int[] yValues;
  public String color;
   public int middleX;
    public int middleY;
   public int[] neighbours;
   public boolean isSelected;

    public Polygons(int id, int[] xValues, int[] yValues, String color, int middleX,int middleY, int[] neighbours) {
        this.id = id;
        this.xValues = xValues;
        this.yValues = yValues;
        this.color = color;
        this.middleX = middleX;
        this.middleY = middleY;
        this.neighbours = neighbours;
    }
}
