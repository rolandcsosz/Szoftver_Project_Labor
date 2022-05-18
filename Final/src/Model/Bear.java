package Model;

/**
 * A medve létrehozásáért felelős osztály. A virológus osztályból származik, azon az
 * elven, hogy minden medve volt valaha virológus, ezért pár metódust örököl tőle, mint
 * például a támadást, csak a virológussal ellentétben neki végtelen erőforrás áll a
 * rendelkezésére.
 */
public class Bear extends Virologist implements Steppable{
    @Override
    public void step() {
        move();
    }

    /**
     * Amikor a Medve belép egy raktárba, az ott található összes
     * anyagot elpusztítja.
     */
    public  void destroy(){
        Field f = super.getCurrentfield();
       for(Collectable c: f.getCollectables()){
           if(c instanceof Material){

           }
       }
    }

    /**
     * megtámadja a virológust és medve vírussal fertőzi a
     * v virológust.
     * @param v
     */
    public void attack(Virologist v){
        //virust ken kifogyhatatlan keszlettel
        if(this.getCurrentfield().IsNeighbour(v.getCurrentfield())){
            BearVirus bv = new BearVirus();
            bv.effect(v);
        }
    }
}
