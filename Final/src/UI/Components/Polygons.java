package UI.Components;

import java.awt.*;

public class Polygons {
   public int id;
   public int[] xValues;
   public int[] yValues;
  public String color;
   public int middle;
   public int[] neighbours;

    public Polygons(int id, int[] xValues, int[] yValues, String color, int middle, int[] neighbours) {
        this.id = id;
        this.xValues = xValues;
        this.yValues = yValues;
        this.color = color;
        this.middle = middle;
        this.neighbours = neighbours;
    }
}
