import java.util.List;

public class Virologist implements Steppable {

    int maxMaterial;
    boolean isParalysed;
    int stunDuration;
    Field currentField;

    public void move(Field field){
        //todo
    }

    @Override
    public void step() {

    }

    public void attack(Virologist virologist, Agent agent){
        //todo
    }

    public void createAgent(Agent agent){
        //todo
    }

    public void learnGeneticCode(GeneticCode geneticCode){
        //todo
    }

    public void forgetGeneticCode(GeneticCode geneticCode){
        //todo
    }

    public boolean isNeighbour(Field field){
        //todo
        return true;
    }

    public void scout(){
        //todo
    }

    public Field getCurrentField(){
        //todo
        return null;
    }

    public void pickUpCollectable(Collectable collectable){
        //todo
    }

    public List<Collectable> getCollectables(){
        //todo
        return null;
    }

    public void addAgent(Agent agent){
        //todo
    }

    public void move(){
        //todo
    }

    public void removeAgent(Agent agent){
        //todo
    }

    public boolean getParalysedStatus(){
        //todo
        return true;
    }

    public void addEffect(Agent agent){
        //todo
    }

    public void removeEffect(Agent agent){
        //todo
    }

}
