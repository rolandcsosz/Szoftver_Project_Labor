public class Bear extends Virologist implements Steppable{
    @Override
    public void step() {
        move();
    }

    public  void destroy(){
        Field f = super.getCurrentfield();

       for(Collectable c: f.getCollectables()){
           if(c instanceof Material){

           }
       }
    }

    public void attack(Virologist v){
        //virust ken kifogyhatatlan keszlettel
        if(this.getCurrentfield().IsNeighbour(v.getCurrentfield())){
            BearVirus bv = new BearVirus();
            bv.effect(v);
        }
    }
}
