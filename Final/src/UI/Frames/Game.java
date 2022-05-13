package UI.Frames;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import UI.DesignPatterns;

import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JProgressBar;

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
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 490, 1200, 130);
		panel.setBackground(DesignPatterns.grey);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 20, 37, 37);
		panel_1.setBackground(DesignPatterns.lightGrey);
		panel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(220, 220, 220));
		panel_1_1.setBounds(57, 20, 37, 37);
		panel.add(panel_1_1);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBackground(new Color(220, 220, 220));
		panel_1_1_1.setBounds(10, 75, 37, 37);
		panel.add(panel_1_1_1);
		
		JPanel panel_1_1_1_1 = new JPanel();
		panel_1_1_1_1.setBackground(new Color(220, 220, 220));
		panel_1_1_1_1.setBounds(57, 75, 37, 37);
		panel.add(panel_1_1_1_1);
		
		JPanel panel_1_1_1_2 = new JPanel();
		panel_1_1_1_2.setBackground(new Color(220, 220, 220));
		panel_1_1_1_2.setBounds(104, 75, 37, 37);
		panel.add(panel_1_1_1_2);
		
		JPanel panel_1_1_1_3 = new JPanel();
		panel_1_1_1_3.setBackground(new Color(220, 220, 220));
		panel_1_1_1_3.setBounds(151, 75, 37, 37);
		panel.add(panel_1_1_1_3);
		
		JLabel lblNewLabel = new JLabel("Agents");
		lblNewLabel.setBounds(10, 57, 49, 17);
		lblNewLabel.setFont(DesignPatterns.robotoMono12);
		panel.add(lblNewLabel);
		
		JLabel lblGeneticCodes = new JLabel("Genetic codes");
		lblGeneticCodes.setFont(null);
		lblGeneticCodes.setBounds(10, 3, 116, 17);
		lblGeneticCodes.setFont(DesignPatterns.robotoMono12);
		panel.add(lblGeneticCodes);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(new Color(220, 220, 220));
		panel_1_1_2.setBounds(104, 20, 37, 37);
		panel.add(panel_1_1_2);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBackground(new Color(220, 220, 220));
		panel_1_1_3.setBounds(151, 20, 37, 37);
		panel.add(panel_1_1_3);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setBackground(new Color(220, 220, 220));
		panel_1_1_4.setBounds(212, 20, 37, 37);
		panel.add(panel_1_1_4);
		
		JPanel panel_1_1_5 = new JPanel();
		panel_1_1_5.setBackground(new Color(220, 220, 220));
		panel_1_1_5.setBounds(259, 20, 37, 37);
		panel.add(panel_1_1_5);
		
		JPanel panel_1_1_6 = new JPanel();
		panel_1_1_6.setBackground(new Color(220, 220, 220));
		panel_1_1_6.setBounds(306, 20, 37, 37);
		panel.add(panel_1_1_6);
		
		JLabel lblEquipments = new JLabel("Equipments");
		lblEquipments.setFont(null);
		lblEquipments.setBounds(212, 3, 116, 17);
		lblEquipments.setFont(DesignPatterns.robotoMono12);
		panel.add(lblEquipments);
		
		JLabel lblActualEffect = new JLabel("Actual effect");
		lblActualEffect.setFont(null);
		lblActualEffect.setBounds(212, 57, 116, 17);
		lblActualEffect.setFont(DesignPatterns.robotoMono12);
		panel.add(lblActualEffect);
		
		JPanel panel_1_1_6_1 = new JPanel();
		panel_1_1_6_1.setBackground(new Color(220, 220, 220));
		panel_1_1_6_1.setBounds(306, 75, 37, 37);
		panel.add(panel_1_1_6_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(212, 92, 84, 5);
		progressBar.setBorder(null);
		progressBar.setBackground(DesignPatterns.lightGrey);
		progressBar.setForeground(DesignPatterns.blue);
		progressBar.setMaximum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(40);
		panel.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("Player 1");
		lblNewLabel_1.setBounds(362, 11, 149, 36);
		lblNewLabel_1.setFont(DesignPatterns.robotoMono20);
		panel.add(lblNewLabel_1);
		
		JLabel lblMaterialLevel = new JLabel("Material level");
		lblMaterialLevel.setFont(null);
		lblMaterialLevel.setBounds(365, 58, 116, 17);
		lblMaterialLevel.setFont(DesignPatterns.robotoMono12);
		panel.add(lblMaterialLevel);
		
		JLabel lblMaterialLevel_1 = new JLabel("200/500");
		lblMaterialLevel_1.setFont(null);
		lblMaterialLevel_1.setBounds(365, 80, 116, 17);
		lblMaterialLevel_1.setFont(DesignPatterns.robotoMono14);
		panel.add(lblMaterialLevel_1);
		//frame.setUndecorated(true);
		frame.setVisible(true);
	}
}
