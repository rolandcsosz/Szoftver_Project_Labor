package Model;

/**
 * Az Agens osztály egyik leszármazott osztálya, hatására a virológus medvévé változik
 * és véletlenszerű mezőkre fog lépni. Ha az egyik ilyen mező raktár, akkor elpusztítja
 * az ott lévő összes anyagot. Ha találkozik egy virológussal, akkor az adott virológus
 * elkapja tőle a vírust, kivéve ha van nála bármilyen védőfelszerelés vagy védőágens
 * hatása alatt áll. Ez a vírus nem telik le bizonyos idő eltelte után, hatását csak baltával
 * lehet megszüntetni: ekkor a virológus meghal, de nem fertőz tovább.
 */
public class BearVirus extends Agent{

    /**
     * Ennek hatására a virológus megfertőződik medve
     * vírussal. Ilyenkor a játékos elveszíti felette az irányítást.
     * @param v
     */
    @Override
    public void effect(Virologist v) {
        v.die();
    }
}
