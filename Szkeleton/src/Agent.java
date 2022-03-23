import java.util.List;

public class Agent implements Effectable, Collectable, Steppable{

    int timeCounter;
    List<Material> cost;
    boolean isActivated;

    public void effect(Virologist v){
        //todo
    }

    public List<Material> getCost(){
        //todo
        return null;
    }

    public GeneticCode getGeneticCode(){
        //todo
        return null;
    }

    public void PickUpBy(Virologist v){
        //todo
    }

    public boolean getActivated(){
        //todo
        return true;
    }

    @Override
    public void step() {

    }
}
