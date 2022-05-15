package EventHandlers;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import UI.Components.Panel;
import UI.Collectable;
import UI.Frames.Game;
import UI.Levels.*;
import UI.Player;


public class Listener extends JFrame implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {
        e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        switch(i){
            case KeyEvent.VK_A:
                //P1 selectagens
                //Panel.selectfirstAgent(Player.PLAYER1);
                ;
            case KeyEvent.VK_B:
                //P1 scout
                ;
            case KeyEvent.VK_C:
                //P1 mező kiválaszt
                ;
            case KeyEvent.VK_D:
                //P1 drop
                ;
            case KeyEvent.VK_Q:
                //P1 selecteq
                ;
            case KeyEvent.VK_V:
                //P1 move
                ;
            case KeyEvent.VK_X:
                //P1 attacks
                ;
            case KeyEvent.VK_COMMA:
                //P2 scouts
                ;
            case KeyEvent.VK_PERIOD:
                //P2 selecteq
                ;
            case KeyEvent.VK_MINUS:
                //P2 drop
                ;
            case KeyEvent.VK_LEFT:
                //P2 select mező
                ;
            case KeyEvent.VK_UP:
                //P2 lep
                ;
            case KeyEvent.VK_RIGHT:
                //P2 select agens
                ;
            case KeyEvent.VK_DOWN:
                //P2 attacks
            	System.out.println("yeeeee");
                ;
            default:
                e.consume();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
