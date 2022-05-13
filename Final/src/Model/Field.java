package Model;
import java.util.ArrayList;
import java.util.List;

public class Field {
	private Virologist virologist;
	private List<Field> neighbours = new ArrayList<Field>();

	//Ide kell valami ami összekapcsola
	public void setNeighbour(Field f){
		neighbours.add(f);
	}

	public void acceptVirologists(Virologist v) {
		virologist = v;
	}
	
	public void removeVirologist(Virologist v) {
		virologist = null;
	}
	
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		return cl;
	}
	
	public Field getRandomNeighbour() {
		return null;
	}
	
	public void removeCollectable(Collectable c) {
	}
	
	
	
	public boolean IsNeighbour(Field m) {
		if(this.equals(m)) {
			return true;
		}
		
		return neighbours.contains(m);
	}

	public Virologist getVirologist() {
		return virologist;
	}


}


