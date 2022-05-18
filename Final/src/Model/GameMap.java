package Model;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;

/**
 * A pálya megalkotásáért felel. Ebben történik a mezők összeillesztése és
 * inicializálása. A pálya amit létrehoz, mezőkből áll, innen is a kompozíciós
 * összefüggés a két osztály között. Itt történik a mezők inicializálása és a játékpálya
 * megalkotása. A pálya mezői lekérhetőek, egy listában megkapható ezek
 * összessége.
 */
public class GameMap {
    private List<Field> fields;
    private Game game;

    /**
     * Creating and adding the Virologists to the gamemap
     */
    public void addVirologists() {
        Virologist v1 = new Virologist();
        Virologist v2 = new Virologist();


        setGameField();

        int random = (int) (Math.random() * fields.size()) + 1;
        fields.get(random).acceptVirologists(v1);


        random = (int) (Math.random() * fields.size()) + 1;
        fields.get(random).acceptVirologists(v2);
    }

    /**
     * publikus metódus, inicializálja a mezőket
     */
    public void setGameField() {
        fields = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            fields.add(new Shelter());
        }
    }

    /**
     * publikus metódus, ami egy listával tér vissza a mezőkről
     * @return
     */
    public List<Field> getFields() {
        //return null;
    	return fields;
    }
}
