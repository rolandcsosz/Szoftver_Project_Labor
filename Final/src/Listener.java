import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import UI.Components.Panel;
import UI.Collectable;
import UI.Frames.Game;
import UI.Levels.*;
import UI.Player;


public class Listener implements KeyListener {


    @Override
    public void keyTyped(KeyEvent e) {
        e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        switch(i){
            case 65:
                //P1 selectagens
                Panel.selectfirstAgent(Player.PLAYER1);
                ;
            case 66:
                //P1 scout
                ;
            case 67:
                //P1 mező kiválaszt
                ;
            case 68:
                //P1 drop

                ;
            case 81:
                //P1 selecteq
                ;
            case 86:
                //P1 move
                ;
            case 88:
                //P1 attacks
                ;
            case 44:
                //P2 scouts
                ;
            case 46:
                //P2 selecteq
                ;
            case 45:
                //P2 drop
                ;
            case 37:
                //P2 select mező
                ;
            case 38:
                //P2 lep
                ;
            case 39:
                //P2 select agens
                ;
            case 40:
                //P2 attacks
                ;
            default:
                e.consume();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
