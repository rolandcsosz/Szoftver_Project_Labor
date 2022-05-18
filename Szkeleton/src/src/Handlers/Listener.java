package Handlers;

import Main.Main;
import Model.*;
import UI.Collectable;
import UI.Components.Panel;
import UI.Frames.End;
import UI.Frames.Game;
import UI.Player;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

public class Listener implements KeyListener {
	
	boolean isAgentSelected1 = false;
	boolean isAgentSelected2 = false;
	boolean isEquipmentSelected1 = false;
	boolean isEquipmentSelected2 = false;

	int geneticCodeCounter1 = 0;
	int geneticCodeCounter2 = 0;

	UI.Collectable selectedEquipment1;
	UI.Collectable selectedEquipment2;
	UI.Collectable selectedAgent1;
	UI.Collectable selectedAgent2;
	
	Field selectedField1;
	Field selectedField2;
	Field actualField1;
	Field actualField2;
	
	List<Field> virologistLabs1 = new ArrayList<Field>(4);
	List<Field> virologistLabs2 = new ArrayList<Field>(4);
	List<Field> virologistGCs1 = new ArrayList<Field>(4);
	List<Field> virologistGCs2 = new ArrayList<Field>(4);
	
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

				break;
			}

			//P1 scout
			case KeyEvent.VK_B: {
				if(actualField1 instanceof Shelter){
					if(((Shelter) actualField1).getEquipment() instanceof Axe){
						Panel.addEquipment(UI.Collectable.AXE, Player.PLAYER1);
						actualField1.removeCollectable(((Shelter) actualField1).getEquipment());
					}else if(((Shelter) actualField1).getEquipment() instanceof Glove){
						Panel.addEquipment(Collectable.GLOVE, Player.PLAYER1);
						actualField1.removeCollectable(((Shelter) actualField1).getEquipment());
					}else if(((Shelter) actualField1).getEquipment() instanceof Cloak){
						Panel.addEquipment(Collectable.CLOAK, Player.PLAYER1);
						actualField1.removeCollectable(((Shelter) actualField1).getEquipment());
					}
					else if(((Shelter) actualField1).getEquipment() instanceof Bag){
						Panel.addEquipment(Collectable.BAG, Player.PLAYER1);
						actualField1.removeCollectable(((Shelter) actualField1).getEquipment());
					}

				}else if(actualField1 instanceof Warehouse){
					Main.virologist1.setMaterialCount(((Warehouse) actualField1).getMaterialLevel());
					Panel.setMaterialLevel(Player.PLAYER1,((Warehouse) actualField1).getMaterialLevel());
					((Warehouse) actualField1).removeMaterial();
				}else if(actualField1 instanceof Laboratory){
					for(Model.Collectable c : ((Laboratory) actualField1).getCollectables()){
						
					if(!virologistLabs1.contains(actualField1)) {
						if(c instanceof GeneticCode){
							switch (geneticCodeCounter1){
								case 0: Panel.addGeneticCode(Collectable.VACCINE_GC, Player.PLAYER1);
										geneticCodeCounter1++;
										break;
								case 1:Panel.addGeneticCode(Collectable.DANCE_GC, Player.PLAYER1);
									geneticCodeCounter1++;
										break;
								case 2:Panel.addGeneticCode(Collectable.OBLIVION_GC, Player.PLAYER1);
									geneticCodeCounter1++;
										break;
								case 3:Panel.addGeneticCode(Collectable.PARALYSES_GC, Player.PLAYER1);
									geneticCodeCounter1++;
									Main.winnerName = Main.Player1Name;
									new End().main(null);
										break;
								case 4: 
								
							}
							
							virologistLabs1.add(actualField1);
						}
					}
				}

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
			case KeyEvent.VK_Y:
			{
				System.out.println(actualField2);
				if(actualField2 instanceof Shelter){
					if(((Shelter) actualField2).getEquipment() instanceof Axe){
						Panel.addEquipment(UI.Collectable.AXE, Player.PLAYER2);
						actualField2.removeCollectable(((Shelter) actualField2).getEquipment());
					}else if(((Shelter) actualField2).getEquipment() instanceof Glove){
						Panel.addEquipment(Collectable.GLOVE, Player.PLAYER2);
						actualField2.removeCollectable(((Shelter) actualField2).getEquipment());
					}else if(((Shelter) actualField2).getEquipment() instanceof Cloak){
						Panel.addEquipment(Collectable.CLOAK, Player.PLAYER2);
						actualField2.removeCollectable(((Shelter) actualField2).getEquipment());
					}
					else if(((Shelter) actualField2).getEquipment() instanceof Bag){
						Panel.addEquipment(Collectable.BAG, Player.PLAYER2);
						actualField2.removeCollectable(((Shelter) actualField2).getEquipment());
					}

				}else if(actualField2 instanceof Warehouse){
					Main.virologist2.setMaterialCount(((Warehouse) actualField2).getMaterialLevel());
					Panel.setMaterialLevel(Player.PLAYER2,((Warehouse) actualField2).getMaterialLevel());
					((Warehouse) actualField2).removeMaterial();
					}
				else if(actualField2 instanceof Laboratory){
					for(Model.Collectable c : ((Laboratory) actualField2).getCollectables()){
						
					if(!virologistLabs2.contains(actualField2)) {
						if(c instanceof GeneticCode){
							switch (geneticCodeCounter2){
								case 0: Panel.addGeneticCode(Collectable.VACCINE_GC, Player.PLAYER2);
										geneticCodeCounter2++;
										break;
								case 1:Panel.addGeneticCode(Collectable.DANCE_GC, Player.PLAYER2);
									geneticCodeCounter2++;
										break;
								case 2:Panel.addGeneticCode(Collectable.OBLIVION_GC, Player.PLAYER2);
									geneticCodeCounter2++;
										break;
								case 3:Panel.addGeneticCode(Collectable.PARALYSES_GC, Player.PLAYER2);
									geneticCodeCounter2++;
									Main.winnerName = Main.Player2Name;
									new End().main(null);
										break;
								case 4: 
								
							}
							
							virologistLabs2.add(actualField2);
						}
					}
				}
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
				actualField2 = Game.gameField.getActualField(Player.PLAYER2);
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
