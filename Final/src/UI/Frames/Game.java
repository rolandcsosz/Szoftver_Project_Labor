package UI.Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import UI.DesignPatterns;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.ImageIcon;

public class Game {

	private JFrame frame;

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
		
		Panel panel = new Panel();
		frame.getContentPane().add(panel);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.WHITE);
		panel_2.setBounds(0, 0, 1186, 491);
		frame.getContentPane().add(panel_2);
		//frame.setUndecorated(true);
		frame.setVisible(true);
		panel.enableVaccine();
	}
}
