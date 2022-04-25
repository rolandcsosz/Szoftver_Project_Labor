public class Axe extends Equipment{
    //egy hasznalat utan hasznalhatatlan
	boolean isUsed = false;
    @Override
    public void effect(Virologist on) {
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
