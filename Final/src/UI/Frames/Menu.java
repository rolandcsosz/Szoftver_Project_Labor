package UI.Frames;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JFrame;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import UI.DesignPatterns;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;

public class Menu {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblNewLabel_1;
	private JComboBox comboBox;
	private JLabel lblNewLabel_2;
	private String level = "1";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu window = new Menu();
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
	public Menu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.WHITE);
		frame.setForeground(Color.WHITE);
		frame.setBounds(100, 100, 684, 393);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setIconImage(null);
		
		textField_2 = new JTextField();
		textField_2.setFocusAccelerator('a');
		textField_2.requestFocusInWindow();
		textField_2.setBackground(DesignPatterns.grey);
		textField_2.setBounds(66, 90, 220, 26);
		textField_2.setColumns(10);
		textField_2.setBorder(null);
		textField_2.setFont(DesignPatterns.robotoMono14);
		
		

		
		textField_3 = new JTextField();
		textField_3.requestFocusInWindow();
		textField_3.setColumns(10);
		textField_3.setBorder(null);
		textField_3.setBackground(DesignPatterns.grey);
		textField_3.setBounds(391, 90, 220, 26);
		textField_3.setFont(DesignPatterns.robotoMono14);

		
		JLabel lblNewLabel = new JLabel("Player 1");
		lblNewLabel.setBounds(66, 63, 70, 18);
		lblNewLabel.setFont(DesignPatterns.robotoMono14);
		
		
		frame.getContentPane().add(textField_2);
		frame.getContentPane().add(textField_3);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Player 2");
		lblNewLabel_1.setFont(null);
		lblNewLabel_1.setBounds(391, 63, 70, 18);
		lblNewLabel_1.setFont(DesignPatterns.robotoMono14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Start");
		btnNewButton.setFont(DesignPatterns.robotoMono20);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(DesignPatterns.blue);
		btnNewButton.setBounds(173, 248, 344, 54);
		btnNewButton.setBorder(null);

		frame.getContentPane().add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setToolTipText("fhgh");
		comboBox.setBounds(261, 191, 183, 26);
		comboBox.setBackground(DesignPatterns.grey);
		comboBox.setFont(DesignPatterns.robotoMono14);
		comboBox.setBorder(null);
		comboBox.addItem("Level 1");
		comboBox.addItem("Level 2");
		comboBox.addItem("Level 3");
		frame.getContentPane().add(comboBox);
		
		lblNewLabel_2 = new JLabel("Level");
		lblNewLabel_2.setFont(null);
		lblNewLabel_2.setBounds(261, 166, 70, 18);
		lblNewLabel_2.setFont(DesignPatterns.robotoMono14);
		frame.getContentPane().add(lblNewLabel_2);
		

		level = comboBox.getSelectedItem().toString();


		/*
		 * textField_2.addFocusListener(new FocusListener() {
		 * 
		 * @Override public void focusGained(FocusEvent e) { if
		 * (textField_2.getText().equals("Name of Player 1")) { textField_2.setText("");
		 * textField_2.setForeground(Color.BLACK); } }
		 * 
		 * @Override public void focusLost(FocusEvent e) { if
		 * (textField_2.getText().isEmpty()) { textField_2.setForeground(Color.GRAY);
		 * textField_2.setText("Name of Player 1"); } }
		 * 
		 * });
		 * 
		 * textField_3.addFocusListener(new FocusListener() {
		 * 
		 * @Override public void focusGained(FocusEvent e) { if
		 * (textField_3.getText().equals("Name of Player 2")) { textField_3.setText("");
		 * textField_3.setForeground(Color.BLACK); } }
		 * 
		 * @Override public void focusLost(FocusEvent e) { if
		 * (textField_3.getText().isEmpty()) { textField_3.setForeground(Color.GRAY);
		 * textField_3.setText("Name of Player 2"); } }
		 * 
		 * });
		 */

		ActionListener cbActionListener = new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				String lvl = (String) comboBox.getSelectedItem();
			}
		};

		comboBox.addActionListener(cbActionListener);
		btnNewButton.grabFocus();

	}
	public String getLevel(){
		return level;
	}


}
