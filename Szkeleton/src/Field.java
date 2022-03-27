import java.util.List;

public class Field {
	private Virologist virologists;
	private List<Field> neighbours; // Ez nem volt benne pedig kell

	public Field() {
	}

	//Ide kell valami ami összekapcsola
	public void setNeighbour(Field field){
	}

	public void acceptVirologists(Virologist v) {
	}
	
	public void removeVirologist(Virologist v) {
	}
	
	public void getCollectables() {
	}
	
	public Field getRandomNeighbour() {
		return null;
	}
	
	public void removeCollectable(Collectable c) {
	}
	
	public boolean IsNeighbour(Field m) {
		return true;
	}
}
