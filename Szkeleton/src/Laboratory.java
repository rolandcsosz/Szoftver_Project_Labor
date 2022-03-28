import java.util.ArrayList;
import java.util.List;

public class Laboratory extends Field {
	private GeneticCode geneticCode;
	public void addGeneticCode(GeneticCode gc) {
		geneticCode = gc;
	}
	
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		cl.add(geneticCode);
		return cl;
	}
}
