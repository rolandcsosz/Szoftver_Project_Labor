public class BearVirus extends Agent{

    @Override
    public void effect(Virologist v) {
        v.addEffect(this);
    }
}
