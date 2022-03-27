public class Warehouse extends Field implements Steppable {
	private int materialLevel;
	private Material materials;
	public void removeMaterial() {
	}
	
	public void produceMaterial(Material material) {
	}
	
	public void step() {
	}

	public int getMaterialLevel() {
		return materialLevel;
	}

	public void setMaterialLevel(int materialLevel) {
		this.materialLevel = materialLevel;
	}
}
