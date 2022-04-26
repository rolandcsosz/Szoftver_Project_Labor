import java.util.ArrayList;
import java.util.List;

public class Warehouse extends Field implements Steppable {
	private int materialLevel;
	private List<Material> materials = new ArrayList<Material>();
	public void removeMaterial() {
	}
	
	public void produceMaterial(int count) {
		for(int i = 0; i<count;i++)
		{
			Material m = new Material();
			materials.add(m);
		}
	}
	
	public void step() {
		produceMaterial(1);
	}

	public int getMaterialLevel() {
		return materials.size();
	}

	public void setMaterialLevel(int materialLevel) {
		while(materials.size() > materialLevel)
		{
			materials.remove(0);
		}
	}

	public void removeMaterial(Material material){
		materials.remove(material);
	}
	
	public List<Collectable> getCollectables() {
		List<Collectable> cl = new ArrayList<Collectable>();
		cl.addAll(materials);
		return cl;
	}
}
