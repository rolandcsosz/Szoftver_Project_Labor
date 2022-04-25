public class Bear extends Virologist implements Steppable{
    @Override
    public void step() {
        //random movement
    }

    public  void destroy(){
        //todo ami utjaba esik lerombol
    }

    public void attack(Virologist v){
        //virust ken kifogyhatatlan keszlettel
        if(this.getField().IsNeighbour(v.getField())){
            BearVirus bv = new BearVirus();
            bv.effect(v);
        }
    }
}
