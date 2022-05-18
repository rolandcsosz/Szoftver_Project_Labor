package Model;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * A virológusok létrehozásáért és kezeléséért felelős osztály. Ez az osztály kezeli a
 * virológus minden játékbeli mozzanatát és viselkedését. Itt tudjuk a léptetési
 * folyamatot elindítani, amivel a virológus egyik mezőről a másikra lép. Ugyanitt
 * kezeljük azt is, hogy miképp lép interakcióba más virológussal, illetve miket tud
 * csinálni egy adott mezőn. Továbbá itt történik a támadások kezelése is, valamint a
 * fertőzéseké, ebben az osztályban kezeljük a genetikai kódok megtanulását,
 * használatát, más virológus kifosztását valamint a virológus esetleges halálát is.
 * Miközben mezőket látogat meg, tárgyakra bukkanhat az ágenseken kívül, ezek
 * hatását a virológusra is itt kezeljük.
 */
public class Virologist implements Steppable {
	private int maxMaterial;
    private boolean IsParalysed;
    private boolean IsProtected;
    private Field currentfield;
    private List<Equipment> equipments;
    private List<Agent> agents;
    private List<GeneticCode> geneticcodes;
    private int materials;

    /**
     * This is a method which set the attributes after initializing the object.
     *
     * @param args Unused.
     * @return Nothing.
     */
    public Virologist() {
    	maxMaterial = 100;
        IsParalysed = false;
        currentfield = new Field();
        equipments = new ArrayList<Equipment>(3);
        agents = new ArrayList<Agent>();
        geneticcodes = new ArrayList<GeneticCode>();
        materials = 0;

    }

    /**
     * This is a method moves the virologist to another field.
     *
     * @param the field the virologist will move
     * @return Nothing.
     */
    public void move(Field f) {
        if (!this.getParalysedStatus() && currentfield.IsNeighbour(f)) {
            f.acceptVirologists(this);
            currentfield.removeVirologist(this);
            currentfield = f;
        }
    }

    public void step() {
        for(Agent a: agents){
            if(a.getActivated()) {
                a.effect(this);
            }
        }
    }

    public Field getCurrentfield() {
        return currentfield;
    }

    public void setCurrentfield(Field currentfield) {
        this.currentfield = currentfield;
    }

    /**
     * This is a method makes the virologist attack an other virologist (or itself) with an agent
     *
     * @param the other virologist the virologist will attack
     * @param the agent the virologist will attack with
     * @return Nothing.
     */
    public void attack(Virologist v, Agent a) {
        if (!this.getParalysedStatus() && currentfield.IsNeighbour(v.getCurrentfield())) {
            v.attackedBy(this, a);
        }
    }

    public void attackedBy(Virologist virologist, Agent a){
        if(this.getParalysedStatus() || this.IsProtected) return;
        for(Equipment equipment: this.getEquipments()){
            if(equipment instanceof Cloak){
                int r = new Random().nextInt(100);
                if(r>82){
                    a.effect(this);
                } else return;
            }
            if(equipment instanceof Glove){
                equipment.effect(virologist);
                attack(virologist, a);
            }
        }

        a.effect(this);
    }


    /**
     * This is a method makes the virologist steal everything which is pickable for the virologist
     * from an other virologist
     *
     * @param the other virologist the virologist will steal from
     * @return Nothing.
     */
    public void steal(Virologist v) {
        if (!this.getParalysedStatus() && (currentfield.IsNeighbour(v.getCurrentfield()) || currentfield == v.getCurrentfield())) {
            v.robbedBy(this);
        }
    }


    public void robbedBy(Virologist virologist) {
        if (!IsParalysed) return;
        for (Equipment equipment : equipments) {
            if (!virologist.isOwnedAlrerady(equipment)) {
                virologist.pickUp(equipment);
            }
        }
         virologist.setMaterialCount(materials + virologist.getMaterialCount());
    }

    /**
     * This is a method makes the virologist make an agent
     *
     * @param the "blueprint" of the agent which the virologist will create
     * @return Nothing.
     */
    public void createAgens(Agent a) {

        List<Material> cost = a.getCost();

        if (cost.size() < this.getMaterialCount()) {
            this.setMaterialCount(this.getMaterialCount() - cost.size());

            Agent new_a = a.clone();

            this.addAgent(new_a);

        }
    }

    public void learnGeneticCode(GeneticCode g) {
        geneticcodes.add(g);
    }

    public void forgetGeneticCode(GeneticCode g) {
        geneticcodes.remove(g);
    }


    /**
     * This is a method makes the virologist pick up everything which possible in a laboratory
     *
     * @param the field where the virologist will scout
     * @return Nothing.
     */
    public void scout(Laboratory l) {


        if (!this.getParalysedStatus()) {
  
            for (Collectable cb : l.getCollectables()) {
                cb.PickUpBy(this);

            }

        }


    }

    public void setParalysed(boolean b){
        IsParalysed = b;
    }

    /**
     * This is a method makes the virologist pick up everything which possible in a shelter
     *
     * @param the field where the virologist will scout
     * @return Nothing.
     */
    public void scout(Shelter s) {
        System.out.println("eddig jo");
        if (!this.getParalysedStatus()) {

            for (Collectable cb : s.getCollectables()) {
                cb.PickUpBy(this);

                ((Equipment) cb).effect(this);

                s.removeCollectable(cb);
            }
        }
    }

    /**
     * This is a method makes the virologist pick up everything which possible in a warehouse
     *
     * @param the field where the virologist will scout
     * @return Nothing.
     */
    public void scout(Warehouse wh) {

        for (Collectable cb : wh.getCollectables()) {
            cb.PickUpBy(this);

            wh.removeCollectable(cb);
        }
    }
    
    public void scout(Field f) {


    }


    public void pickUp(Collectable c) {
    }

    /**
     * This is a method makes the virologist return every collectable item what it posesses
     *
     * @param Unused.
     * @return list of every collectable item what the virologist posesses
     */
    public List<Collectable> getCollectables() {
        List<Collectable> perm = new ArrayList<Collectable>();
        perm.addAll(agents);
        perm.addAll(geneticcodes);
        perm.addAll(equipments);
        return perm;

    }

    public void addAgent(Agent a) {
        agents.add(a);
    }

    public void move() {
        Field randomField = currentfield.getRandomNeighbour();
        move(randomField);
    }

    public void removeAgent(Agent a) {
        agents.remove(a);
    }

    public boolean getParalysedStatus() {
        return IsParalysed;
    }
    
    public int getMaxMaterial() {
    	return maxMaterial;
    }

    public void removeEffect(Agent a) {

    }

    public void pickUp(GeneticCode gc) {
        geneticcodes.add(gc);
    }

    public void pickUp(Equipment eq) {
    	
    		equipments.add(eq);
    }

    public void pickUp(int m) {
        materials +=m;
    }

    public void remove(Collectable c) {
    }

    public void remove(GeneticCode gc) {
        geneticcodes.remove(gc);
    }

    public void remove(Equipment eq) {
        equipments.remove(eq);
    }

    public void remove(int m) {
        materials -=m;
    }

    public void setMaterialCount(int new_size) {
        materials +=new_size;
    }

    public int getMaterialCount() {

        return materials;
    }

    public boolean IsEnoughSpace(Collectable c) {
        return true;
    }
    public boolean getProtected() {
        return IsProtected;
    }

    public void setProtected(boolean b){
        IsProtected = b;
    }


    public List<GeneticCode> getGeneticCodes() {
        return geneticcodes;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    boolean isOwnedAlrerady(Equipment eq) {
        for(Equipment equipment: equipments){
            if(equipment.getClass().equals(eq.getClass()))
                return true;
        }
        return false;
    }
    public void forgetGeneticCodes() {
        geneticcodes.clear();
    }


    public void die(){
        Bear b = new Bear();
        currentfield.removeVirologist(this);
        currentfield.acceptVirologists(b);
    }

    /**
     * Ennek hatására eldobja a felszerelést.
     * @param eq
     */
    public void drop(Equipment eq){
        if(equipments.contains(eq))
            remove(eq);
    }


}
