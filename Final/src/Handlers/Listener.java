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

			//P1 selectagens
			case KeyEvent.VK_A: {
				if (!isAgentSelected1) {
					Panel.selectfirstAgent(Player.PLAYER1);
					isAgentSelected1 = true;
				} else {
					Panel.selectNextAgent(Player.PLAYER1);
				}

				selectedAgent1 = Panel.getSelectedAgent(Player.PLAYER1);
				break;
			}

			//P1 createagens
			case KeyEvent.VK_S: {
				switch(selectedAgent1){
					case VACCINE:
						Panel.createAgens(Collectable.VACCINE, Player.PLAYER1);
						break;
					case OBLIVION:
						Panel.createAgens(Collectable.OBLIVION, Player.PLAYER1);
						break;
					case DANCE:
						Panel.createAgens(Collectable.DANCE, Player.PLAYER1);
						break;
					case PARALYSES:
						Panel.createAgens(Collectable.PARALYSES, Player.PLAYER1);
						break;

				}
				break;
			}

			//P1 scout
			case KeyEvent.VK_B: {

				System.out.println(actualField1.getClass().getName());
				switch(actualField1.getClass().getName()){
					case "Model.Shelter":
						int r1 = new Random().nextInt(4);
						//Equipment r = ((Model.Shelter)actualField1).getEquipment();
						//r.getClass().getName();
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
						int r2 = new Random().nextInt(50);
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

			//P1 select mező
			case KeyEvent.VK_C: {
				Game.gameField.selectNextField(Player.PLAYER1);
				Game.gameField.repaint();
				selectedField1 = Game.gameField.getSelectedField(Player.PLAYER1);
				//SwingUtilities.windowForComponent(Game.gameField).repaint();
				//GameField.getSelectedField(Player.PLAYER1);
				break;
			}

			//P1 drop
			case KeyEvent.VK_D: {

				Panel.dropEquipment(Player.PLAYER1, selectedEquipment1);

				break;

			}

			//P1 selecteq
			case KeyEvent.VK_Q: {

				if (!isEquipmentSelected1) {
					Panel.selectfirstEquipment(Player.PLAYER1);
					isEquipmentSelected1 = true;
				} else {
					Panel.selectNextEquipment(Player.PLAYER1);
				}

				selectedEquipment1 = Panel.getSelectedEquipment(Player.PLAYER1);

				break;

			}

			//P1 move
			case KeyEvent.VK_V: {
				Game.gameField.moveVirologist(Player.PLAYER1, selectedField1);
				Game.gameField.repaint();
				actualField1 = Game.gameField.getActualField(Player.PLAYER1);
				break;

			}

			//P1 attacks
			case KeyEvent.VK_X:{
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

//-------------------------------------------------------


			//P2 select agens
			case KeyEvent.VK_RIGHT: {
				if (!isAgentSelected2) {
					Panel.selectfirstAgent(Player.PLAYER2);
					isAgentSelected2 = true;
				} else {
					Panel.selectNextAgent(Player.PLAYER2);
				}

				selectedAgent2 = Panel.getSelectedAgent(Player.PLAYER2);

				break;

			}

			//P1 createagens
			case KeyEvent.VK_M: {
				switch(selectedAgent2){
					case VACCINE:
						Panel.createAgens(Collectable.VACCINE, Player.PLAYER2);
						break;
					case OBLIVION:
						Panel.createAgens(Collectable.OBLIVION, Player.PLAYER2);
						break;
					case DANCE:
						Panel.createAgens(Collectable.DANCE, Player.PLAYER2);
						break;
					case PARALYSES:
						Panel.createAgens(Collectable.PARALYSES, Player.PLAYER2);
						break;

				}
				break;
			}


			//P2 scouts
			case KeyEvent.VK_COMMA:
			{


				System.out.println(actualField2.getClass().getName());
				switch (actualField2.getClass().getName()) {
					case "Model.Shelter":
						int r1 = new Random().nextInt(4);
						//Equipment r = ((Model.Shelter)actualField1).getEquipment();
						//r.getClass().getName();
						switch (r1) {
							case 1:
								Panel.addEquipment(UI.Collectable.AXE, Player.PLAYER2);
								break;
							case 2:
								Panel.addEquipment(Collectable.BAG, Player.PLAYER2);
								break;
							case 3:
								Panel.addEquipment(Collectable.GLOVE, Player.PLAYER2);
								break;
							case 4:
								Panel.addEquipment(Collectable.CLOAK, Player.PLAYER2);
								break;
						}
						break;
					case "Model.Warehouse":
						//Panel.setMaterialLevel();
						int r2 = new Random().nextInt(50);
						Panel.setMaterialLevel(Player.PLAYER2, r2);
						break;
					case "Model.Laboratory":
						int r4 = new Random().nextInt(10);
						switch (r4) {
							case 1:
							case 2:
								Panel.addGeneticCode(Collectable.VACCINE_GC, Player.PLAYER2);
								break;
							case 3:
							case 4:
								Panel.addGeneticCode(Collectable.OBLIVION_GC, Player.PLAYER2);
								break;
							case 5:
							case 6:
								Panel.addGeneticCode(Collectable.PARALYSES_GC, Player.PLAYER2);
								break;
							case 7:
							case 8:
								Panel.addGeneticCode(Collectable.DANCE_GC, Player.PLAYER2);
								break;
							case 9:
								Panel.transformToBear(Player.PLAYER2);
								break;
						}
						break;
					default:
						break;
				}
				break;
			}

			//P2 drop
			case KeyEvent.VK_MINUS:{
				Panel.dropEquipment(Player.PLAYER2, selectedEquipment2);
				break;
			}

			//P2 select mező
			case KeyEvent.VK_UP: {
				Game.gameField.selectNextField(Player.PLAYER2);
				Game.gameField.repaint();
				selectedField2 = Game.gameField.getSelectedField(Player.PLAYER2);
				break;

			}

			//P2 selecteq
			case KeyEvent.VK_PERIOD: {
				if (!isEquipmentSelected2) {
					Panel.selectfirstEquipment(Player.PLAYER2);
					isEquipmentSelected2 = true;
				} else {
					Panel.selectNextEquipment(Player.PLAYER2);
				}

				selectedEquipment2 = Panel.getSelectedEquipment(Player.PLAYER2);
				break;

			}

			//P2 moves
			case KeyEvent.VK_LEFT: {

				Game.gameField.moveVirologist(Player.PLAYER2, selectedField2);
				Game.gameField.repaint();
				actualField1 = Game.gameField.getActualField(Player.PLAYER2);

				//Main.virologist1.move(selectedField1);
				break;
			}

			//P2 attacks
			case KeyEvent.VK_DOWN: {
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
