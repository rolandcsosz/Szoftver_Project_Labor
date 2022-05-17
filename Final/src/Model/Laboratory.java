package Model;
import java.util.ArrayList;
import java.util.List;

public class Laboratory extends Field {
	private GeneticCode geneticCode;
	private BearVirus bearVirus;
	public void addGeneticCode(GeneticCode gc) {
		geneticCode = gc;
	}
	public void addBear(BearVirus b){bearVirus = b;}
	
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		cl.add(geneticCode);
		return cl;
	}
}
