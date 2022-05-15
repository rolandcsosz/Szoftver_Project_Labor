package Handlers;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import UI.Components.Panel;
import UI.Collectable;
import UI.Frames.Game;
import UI.Player;
import Main.Main;
import Model.Agent;
import Model.Oblivion;
import Model.Paralyses;
import Model.Vaccine;
import Model.Virusdance;

public class Listener implements KeyListener {
	
	boolean isAgentSelected1 = false;
	boolean isAgentSelected2 = false;
	boolean isEquipmentSelected1 = false;
	boolean isEquipmentSelected2 = false;
	

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
            	if(!isAgentSelected1) {
            		Panel.selectfirstAgent(Player.PLAYER1);
            		isAgentSelected1 = true;
            	}
            	else {
            		Panel.selectNextAgent(Player.PLAYER1);
            	}
            	
            	selectedAgent1 = Panel.getSelectedAgent(Player.PLAYER1);
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
            	
            	Panel.dropEquipment(Player.PLAYER1, selectedEquipment1);
            	
            	break;
            	
            }
            case KeyEvent.VK_Q:
                //P1 selecteq
            {
            	
                	if(!isEquipmentSelected1) {
                 		Panel.selectfirstEquipment(Player.PLAYER1);
                 		isEquipmentSelected1 = true;
                 	}
                 	else {
                 		Panel.selectNextEquipment(Player.PLAYER1);
                 	}
                	
                	selectedEquipment1 = Panel.getSelectedEquipment(Player.PLAYER1);
                
            	break;
            	
            }
            case KeyEvent.VK_V:
                //P1 move
            {
            	
            	break;
            	
            }
            case KeyEvent.VK_X:
                //P1 attacks
            {
            	Agent a = null;
            	
            	
            	
            	switch(selectedAgent1) {
	            	case DANCE:{
	            		a = new Virusdance();
	            		break;
	            	}
	            	
	            	case OBLIVION:{
	            		a = new Oblivion();
	            		break;
	            	}
	            	
	            	case PARALYSES:{
	            		a = new Paralyses();
	            		break;
	            	}
	            	
	            	case VACCINE:{
	            		a = new Vaccine();
	            		break;
	            	}
            	}
            	
            	Main.virologist1.attack(Main.virologist2,a);
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
            	if(!isEquipmentSelected2) {
             		Panel.selectfirstEquipment(Player.PLAYER2);
             		isEquipmentSelected2 = true;
             	}
             	else {
             		Panel.selectNextEquipment(Player.PLAYER2);
             	}
            	
            	selectedEquipment2 = Panel.getSelectedEquipment(Player.PLAYER2);
            	break;
            	
            }
            case KeyEvent.VK_MINUS:
                //P2 drop
            {

            	Panel.dropEquipment(Player.PLAYER2, selectedEquipment2);
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
            	//P2 select agens
                
            {
                 	if(!isAgentSelected2) {
                 		Panel.selectfirstAgent(Player.PLAYER2);
                 		isAgentSelected2 = true;
                 	}
                 	else {
                 		Panel.selectNextAgent(Player.PLAYER2);
                 	}
                 	
                 	selectedAgent2 = Panel.getSelectedAgent(Player.PLAYER2);
                 	
                 	break;
            	
            }
            case KeyEvent.VK_LEFT:
            {	//P2 lep
           
            	
            }
            case KeyEvent.VK_DOWN:
                //P2 attacks
            {
            	Agent a = null;
            	
            	switch(selectedAgent2) {
	            	case DANCE:{
	            		a = new Virusdance();
	            		break;
	            	}
	            	
	            	case OBLIVION:{
	            		a = new Oblivion();
	            		break;
	            	}
	            	
	            	case PARALYSES:{
	            		a = new Paralyses();
	            		break;
	            	}
	            	
	            	case VACCINE:{
	            		a = new Vaccine();
	            		break;
	            	}
            	}
            	
            	Main.virologist2.attack(Main.virologist1,a);
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
