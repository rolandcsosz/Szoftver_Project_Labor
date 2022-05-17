package Handlers;

import Main.Main;
import Model.*;
import UI.Collectable;
import UI.Components.Panel;
import UI.Frames.Game;
import UI.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class Listener implements KeyListener {
	
	boolean isAgentSelected1 = false;
	boolean isAgentSelected2 = false;
	boolean isEquipmentSelected1 = false;
	boolean isEquipmentSelected2 = false;
	

	UI.Collectable selectedEquipment1;
	UI.Collectable selectedEquipment2;
	UI.Collectable selectedAgent1;
	UI.Collectable selectedAgent2;
	
	Field selectedField1;
	Field selectedField2;
	Field actualField1;
	Field actualField2;
	
    @Override
    public void keyTyped(KeyEvent e) {
        e.consume();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int i = e.getKeyCode();
        switch(i) {
			case KeyEvent.VK_A: {

				//P1 selectagens
				if (!isAgentSelected1) {
					Panel.selectfirstAgent(Player.PLAYER1);
					isAgentSelected1 = true;
				} else {
					Panel.selectNextAgent(Player.PLAYER1);
				}

				selectedAgent1 = Panel.getSelectedAgent(Player.PLAYER1);
				break;


			}
			case KeyEvent.VK_B:
				//P1 scout
			{

				System.out.println(actualField1.getClass().getName());
				switch(actualField1.getClass().getName()){
					case "Model.Shelter":
						int r1 = new Random().nextInt(4);
							switch(r1){
								case 1:
									Panel.addEquipment(UI.Collectable.AXE,Player.PLAYER1);
									break;
								case 2:
									Panel.addEquipment(Collectable.BAG,Player.PLAYER1);
									break;
								case 3:
									Panel.addEquipment(Collectable.GLOVE,Player.PLAYER1);
									break;
								case 4:
									Panel.addEquipment(Collectable.CLOAK,Player.PLAYER1);
									break;
							}
						break;
					case "Model.Warehouse":
						//Panel.setMaterialLevel();
						int r2 = new Random().nextInt(30);
						Panel.setMaterialLevel(Player.PLAYER1,r2);
						break;
					case "Model.Laboratory":
						int r4 = new Random().nextInt(10);
						switch(r4){
							case 1:
							case 2:
								Panel.addGeneticCode(Collectable.VACCINE_GC, Player.PLAYER1);
								break;
							case 3:
							case 4:
								Panel.addGeneticCode(Collectable.OBLIVION_GC, Player.PLAYER1);
								break;
							case 5:
							case 6:
								Panel.addGeneticCode(Collectable.PARALYSES_GC, Player.PLAYER1);
								break;
							case 7:
							case 8:
								Panel.addGeneticCode(Collectable.DANCE_GC, Player.PLAYER1);
								break;
							case 9:
								Panel.transformToBear(Player.PLAYER1);
								break;
						}
						//Panel.addGeneticCode();
						break;
					default:
						break;
				}
				break;
			}


			case KeyEvent.VK_C:
				//P1 mező kiválaszt
			{
				Game.gameField.selectNextField(Player.PLAYER1);
				Game.gameField.repaint();
				selectedField1 = Game.gameField.getSelectedField(Player.PLAYER1);
				//SwingUtilities.windowForComponent(Game.gameField).repaint();
				//GameField.getSelectedField(Player.PLAYER1);
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

				if (!isEquipmentSelected1) {
					Panel.selectfirstEquipment(Player.PLAYER1);
					isEquipmentSelected1 = true;
				} else {
					Panel.selectNextEquipment(Player.PLAYER1);
				}

				selectedEquipment1 = Panel.getSelectedEquipment(Player.PLAYER1);

				break;

			}

			case KeyEvent.VK_V:
				//P1 move
			{
				Game.gameField.moveVirologist(Player.PLAYER1, selectedField1);
				Game.gameField.repaint();
				actualField1 = Game.gameField.getActualField(Player.PLAYER1);
				break;

			}

			case KeyEvent.VK_X:
				//P1 attacks
			{
				Agent a = null;


				switch (selectedAgent1) {
					case DANCE: {
						a = new Virusdance();
						break;
					}

					case OBLIVION: {
						a = new Oblivion();
						break;
					}

					case PARALYSES: {
						a = new Paralyses();
						break;
					}

					case VACCINE: {
						a = new Vaccine();
						break;
					}
				}

				Main.virologist1.attack(Main.virologist2, a);
				break;

			}

			case KeyEvent.VK_COMMA:
				//P2 scouts
			{
				System.out.println("Yeeey");
				Field f = actualField2;

				break;

			}

			case KeyEvent.VK_PERIOD:
				//P2 selecteq
			{
				if (!isEquipmentSelected2) {
					Panel.selectfirstEquipment(Player.PLAYER2);
					isEquipmentSelected2 = true;
				} else {
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
				Game.gameField.selectNextField(Player.PLAYER2);
				Game.gameField.repaint();
				selectedField2 = Game.gameField.getSelectedField(Player.PLAYER2);
				break;

			}

			case KeyEvent.VK_RIGHT: {
				if (!isAgentSelected2) {
					Panel.selectfirstAgent(Player.PLAYER2);
					isAgentSelected2 = true;
				} else {
					Panel.selectNextAgent(Player.PLAYER2);
				}

				selectedAgent2 = Panel.getSelectedAgent(Player.PLAYER2);

				break;

			}//P2 select agens

			case KeyEvent.VK_LEFT: {    //P2 lep

				Game.gameField.moveVirologist(Player.PLAYER2, selectedField2);
				Game.gameField.repaint();
				actualField1 = Game.gameField.getActualField(Player.PLAYER2);

				//Main.virologist1.move(selectedField1);
				break;
			}

			case KeyEvent.VK_DOWN: //P2 attacks
			{
				Agent a = null;

				switch (selectedAgent2) {
					case DANCE: {
						a = new Virusdance();
						break;
					}

					case OBLIVION: {
						a = new Oblivion();
						break;
					}

					case PARALYSES: {
						a = new Paralyses();
						break;
					}

					case VACCINE: {
						a = new Vaccine();
						break;
					}
				}

				Main.virologist2.attack(Main.virologist1, a);
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
