import java.util.ArrayList;
import java.util.List;

public class Virologist implements Steppable {
	private int maxMaterial;
    private boolean IsParalysed;
    private Field field;
    private List<Equipment> equipments;
    private List<Agent> agents;
    private List<GeneticCode> geneticcodes;
    private List<Material> materials;

    /**
     * This is a method which set the attributes after initializing the object.
     *
     * @param args Unused.
     * @return Nothing.
     */
    public Virologist() {
    	maxMaterial = 3;
        IsParalysed = false;
        field = new Field();
        equipments = new ArrayList<Equipment>(3);
        agents = new ArrayList<Agent>();
        geneticcodes = new ArrayList<GeneticCode>();
        materials = new ArrayList<Material>();

    }

    /**
     * This is a method moves the virologist to another field.
     *
     * @param the field the virologist will move
     * @return Nothing.
     */
    public void move(Field f) {

        Logger.log(Logger.getParameter() + ".getParalysedStatus()", 1);
        Logger.log("f1.IsNeighbour(" + Logger.getParameter() + ")", 1);
        if (!this.getParalysedStatus() && field.IsNeighbour(f)) {
            Logger.log("f2.acceptVirologists(v)", 1);
            f.acceptVirologists(this);
            Logger.log("f1.removeVirologist(v)", 1);
            field.removeVirologist(this);
            field = f;
        }
    }

    public void step() {
    }


    public Field getField() {
        return field;
    }

    /**
     * This is a method makes the virologist attack an other virologist (or itself) with an agent
     *
     * @param the other virologist the virologist will attack
     * @param the agent the virologist will attack with
     * @return Nothing.
     */
    public void attack(Virologist v, Agent a) {

        /*Logger.log(Logger.getParameter() + ".getParalysedStatus()", 1);
        Logger.log("f1.IsNeighbour(" + Logger.getParameter() + ".getField())", 1);

        if (!this.getParalysedStatus() && field.IsNeighbour(v.getField())) {
            Logger.log(Logger.getsecondParameter() + ".effect(" + Logger.getParameter() + ")", 1);
            a.effect(v);
        }
        */
        if(!this.getParalysedStatus() && field.IsNeighbour(v.getField())){
            a.effect(v);
        }
    }

    /**
     * This is a method makes the virologist steal everything which is pickable for the virologist
     * from an other virologist
     *
     * @param the other virologist the virologist will steal from
     * @return Nothing.
     */
    public void steal(Virologist v) {

        Logger.log(Logger.getParameter() + ".getParalysedStatus()", 1);
        Logger.log("f1.IsNeighbour(v2.getCurrentField())", 1);
        if (!this.getParalysedStatus() && field.IsNeighbour(v.getField())) {

            Logger.log("v2.getCollectables()", 1);
            for (Collectable c : v.getCollectables()) {
                //Log miatti parameter beallitasok
                if (c instanceof Bag) {
                    Logger.setsecondParameter("b");
                }

                if (c instanceof Cloak) {
                    Logger.setsecondParameter("c");
                }

                if (c instanceof Material) {
                    Logger.setsecondParameter("m");
                }

                if (c instanceof Glove) {
                    Logger.setsecondParameter("g");
                }

                Logger.log(Logger.getsecondParameter() + ".pickUpBy(" + Logger.getParameter() + ")", 1);
                c.PickUpBy(this);

                Logger.log("v2.remove(" + Logger.getsecondParameter() + ")", 1);
                v.remove(c);

            }
        }
    }

    /**
     * This is a method makes the virologist make an agent
     *
     * @param the "blueprint" of the agent which the virologist will create
     * @return Nothing.
     */
    public void createAgens(Agent a) {

        Logger.log(Logger.getsecondParameter() + ".getCost()", 1);
        List<Material> cost = a.getCost();

        Logger.log("v.getMaterialCount()", 1);
        if (cost.size() < this.getMaterialCount()) {
            Logger.log("v.setMaterialCount(v.getMaterialCount()-cost.size())", 1);
            this.setMaterialCount(this.getMaterialCount() - cost.size());

            Logger.log("<<create>> new_" + Logger.getsecondParameter(), 1);
            Agent new_a = a;

            Logger.log("v.addAgent(new_" + Logger.getsecondParameter() + ")", 1);
            this.addAgent(new_a);

        }
    }

    public void learnGeneticCode(GeneticCode g) {
    }

    public void forgetGeneticCode(GeneticCode g) {
    }


    /**
     * This is a method makes the virologist pick up everything which possible in a laboratory
     *
     * @param the field where the virologist will scout
     * @return Nothing.
     */
    public void scout(Laboratory l) {

        Logger.log("v.getParalysedStatus()", 1);
        if (!this.getParalysedStatus()) {
            Logger.log("l.getCollectables()", 1);
            for (Collectable cb : l.getCollectables()) {
                Logger.log("gc.pickUpBy(v)", 1);
                cb.PickUpBy(this);

            }

        }


    }

    /**
     * This is a method makes the virologist pick up everything which possible in a shelter
     *
     * @param the field where the virologist will scout
     * @return Nothing.
     */
    public void scout(Shelter s) {

        Logger.log("v.getParalysedStatus()", 1);
        if (!this.getParalysedStatus()) {

            Logger.log("l.getCollectables()", 1);
            for (Collectable cb : s.getCollectables()) {
                Logger.log(Logger.getParameter() + ".pickUpBy(v)", 1);
                cb.PickUpBy(this);

                Logger.log(Logger.getParameter() + ".effect(v)", 1);
                ((Equipment) cb).effect(this);

                Logger.log("s.removeCollectable(" + Logger.getParameter() + ")", 1);
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
            Logger.log(Logger.getParameter() + ".pickUpBy(v)", 1);
            cb.PickUpBy(this);

            Logger.log("wh.removeCollectable(" + Logger.getParameter() + ")", 1);
            wh.removeCollectable(cb);


        }


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
        perm.addAll(materials);

        return perm;

    }

    public void addAgent(Agent a) {
        agents.add(a);
    }

    public void move() {
    }

    public void removeAgent(Agent a) {
    }

    public boolean getParalysedStatus() {
        return IsParalysed;
    }

    public void addEffect(Agent a) {
        if (a instanceof Vaccine) {
            a.setActivated();
        } else if (a instanceof Paralyses) {
            IsParalysed = true;
            a.setActivated();
        } else if (a instanceof Oblivion) {
            for (int i = 0; i < geneticcodes.size(); i++)
                geneticcodes.set(i, null);
            a.setActivated();
        } else if (a instanceof Virusdance) {
			Field random = field.getRandomNeighbour();
            move(random);
            a.setActivated();
        } else if (a instanceof BearVirus){
            this.die();
        }
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

    public void pickUp(Material m) {
        materials.add(m);
    }

    public void remove(Collectable c) {
    }

    public void remove(GeneticCode gc) {

    }

    public void remove(Equipment eq) {
        //todo kesztyu lehamlasa

    }

    public void remove(Material m) {

    }

    public void setMaterialCount(int new_size) {

    }

    public int getMaterialCount() {

        return materials.size();
    }

    public boolean IsEnoughSpace(Collectable c) {
        return true;
    }


    public List<GeneticCode> getGeneticCodes() {
        return geneticcodes;
    }

    public List<Equipment> getEquipments() {
        return equipments;
    }

    boolean isOwnedAlrerady(Equipment eq) {
        return false;
    }

    //todo eldobas fuggveny

    public void die(){
        Bear b = new Bear();
        field.removeVirologist(this);
        field.acceptVirologists(b);
    }
}
