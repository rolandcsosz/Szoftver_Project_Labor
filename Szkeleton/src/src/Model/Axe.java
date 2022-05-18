package Model;

/**
 * A balta létrehozásáért/kezeléséért felelős osztály. Ez a tárgy, ha megvan, a virológus
 * képes a medvét megölni, így megfékezve azt. A hatását kezeljük ebben az
 * osztályban.
 */
public class Axe extends Equipment{
	boolean isUsed = false;

    /**
     * Megöli a virológust
     * @param v
     */
    @Override
    public void effect(Virologist v) {
        v.die();
    }

    /**
     * Visszaadja tudjuk-e még használni a baltát
     * @return
     */
    boolean getUsedStatus()
    {
    	return isUsed;
    }

    /**
     * Ha a balta használva volt, többet nem lehet használni
     */
    void setUsedStatus()
    {
    	isUsed = true;
    }
}
