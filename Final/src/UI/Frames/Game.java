package UI.Frames;
import java.awt.EventQueue;
import javax.swing.JFrame;

import UI.DesignPatterns;
import UI.Components.GameField;
import UI.Components.Panel;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

import Handlers.Listener;


public class Game {

	private JFrame frame;
	public static Panel panel;
	public static GameField gameField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1200, 650);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.addKeyListener(new Listener());
		
		panel = new Panel();
		gameField = new GameField();
		

		frame.getContentPane().add(panel);
		frame.getContentPane().add(gameField);

		frame.setVisible(true);
		
		/*
		 * Panel.setAgentNumber(UI.Collectable.DANCE,UI.Player.PLAYER1,1);
		 * Panel.setAgentNumber(UI.Collectable.PARALYSES,UI.Player.PLAYER2,2);
		 * Panel.addGeneticCode(UI.Collectable.DANCE_GC,UI.Player.PLAYER1);
		 * Panel.addGeneticCode(UI.Collectable.PARALYSES_GC,UI.Player.PLAYER2);
		 * Panel.addEquipment(UI.Collectable.BAG,UI.Player.PLAYER1);
		 * Panel.addEquipment(UI.Collectable.AXE,UI.Player.PLAYER1);
		 * 
		 * Panel.addEquipment(UI.Collectable.GLOVE,UI.Player.PLAYER2);
		 * Panel.decreaseGlove(UI.Player.PLAYER2);
		 * Panel.decreaseGlove(UI.Player.PLAYER2);
		 * Panel.decreaseGlove(UI.Player.PLAYER2); Panel.useAxe(UI.Player.PLAYER1);
		 */
		
		//teszt
		//panel.enableVaccine();
	}
}
