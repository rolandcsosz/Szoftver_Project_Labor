public class Bear extends Virologist implements Steppable{
    @Override
    public void step() {
        move();
    }

    public  void destroy(){
        //todo ami utjaba esik lerombol
    }

    public void attack(Virologist v){
        //virust ken kifogyhatatlan keszlettel
        if(this.getCurrentfield().IsNeighbour(v.getCurrentfield())){
            BearVirus bv = new BearVirus();
            bv.effect(v);
        }
    }
}
