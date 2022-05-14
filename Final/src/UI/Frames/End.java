package UI.Frames;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import UI.DesignPatterns;

public class End {

	private JFrame frame;

	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					End window = new End();
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
	public End() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setForeground(Color.WHITE);
		frame.setBounds(100, 100, 684, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(null);

		
		JLabel lblNewLabel = new JLabel("Player 1 won!");
		lblNewLabel.setBounds(251, 135, 211, 54);
		lblNewLabel.setFont(DesignPatterns.robotoMono24);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(305, 58, 88, 66);
		lblNewLabel_1.setIcon(DesignPatterns.crown);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("New game");
		btnNewButton.setFont(DesignPatterns.robotoMono20);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(DesignPatterns.blue);
		btnNewButton.setBounds(173, 248, 344, 54);
		btnNewButton.setBorder(null);

		frame.getContentPane().add(btnNewButton);
	}

}
