public class Axe extends Equipment{
    //egy hasznalat utan hasznalhatatlan
	boolean isUsed = false;
    @Override
    public void effect(Virologist v) {
        v.die();
    }
    
    boolean getUsedStatus()
    {
    	return isUsed;
    }
    
    void setUsedStatus()
    {
    	isUsed = true;
    }
}
