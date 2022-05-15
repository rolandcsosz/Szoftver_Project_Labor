package Handlers;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import UI.Components.Panel;
import UI.Collectable;
import UI.Frames.Game;
import UI.Player;


public class Listener implements KeyListener {

	UI.Collectable selectedEquipment1;
	UI.Collectable selectedEquipment2;
	UI.Collectable selectedAgent1;
	UI.Collectable selectedAgent2;
	
    @Override
    public void keyTyped(KeyEvent e) {
        e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        switch(i){
            case KeyEvent.VK_A:{
            	//P1 selectagens
            	Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("A");
            	break;
            	
            }
            case KeyEvent.VK_B:
                //P1 scout
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("B");
            	break;
            	
            }
            case KeyEvent.VK_C:
                //P1 mező kiválaszt
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_D:
                //P1 drop

            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_Q:
                //P1 selecteq
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_V:
                //P1 move
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_X:
                //P1 attacks
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_COMMA:
                //P2 scouts
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_PERIOD:
                //P2 selecteq
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_MINUS:
                //P2 drop
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_UP:
                //P2 select mező
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_RIGHT:
                //P2 lep
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_LEFT:
                //P2 select agens
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            case KeyEvent.VK_DOWN:
                //P2 attacks
            {
            	//P1 selectagens
            	//Panel.selectfirstAgent(Player.PLAYER1);
            	System.out.println("Yeeey");
            	break;
            	
            }
            default:
                e.consume();

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
