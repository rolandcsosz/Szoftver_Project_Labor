package Model;
import java.io.Console;
import java.util.ArrayList;
import java.util.List;


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

    public void setGameField() {
        fields = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            fields.add(new Shelter());
        }
        //todo rendesen randomizalt feltoltes, itt csak feltoltottem mert kellett az addhoz <3 ZG
    }



    public List<Field> getFields() {
        //return null;
    	return fields;
    }
}
