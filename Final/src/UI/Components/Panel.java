package UI.Components;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import UI.DesignPatterns;

public class Panel extends JPanel {
	
	JLabel lblNewLabel_vaccine;

	/**
	 * Create the panel.
	 */
	public Panel() {

		this.setBounds(0, 490, 1200, 130);
		this.setBackground(DesignPatterns.grey);
		this.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(10, 20, 37, 37);
		panel_1.setBackground(DesignPatterns.lightGrey);
		this.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBackground(new Color(220, 220, 220));
		panel_1_1.setBounds(57, 20, 37, 37);
		this.add(panel_1_1);
		
		lblNewLabel_vaccine = new JLabel();
		lblNewLabel_vaccine.setBounds(1, 1, 35, 35);
		lblNewLabel_vaccine.setIcon(DesignPatterns.vaccine);
		
		JPanel panel_vaccine = new JPanel();
		panel_vaccine.setBackground(new Color(220, 220, 220));
		panel_vaccine.setBounds(10, 75, 37, 37);
		panel_vaccine.setLayout(null);
		panel_vaccine.add(lblNewLabel_vaccine);
		this.add(panel_vaccine);
		
		
		JLabel lblNewLabel_2 = new JLabel();
		lblNewLabel_2.setBounds(1, 1, 35, 35);
		lblNewLabel_2.setIcon(DesignPatterns.danceVirus); 
		
		JPanel panel_dancevirus = new JPanel();
		panel_dancevirus.setBackground(new Color(220, 220, 220));
		panel_dancevirus.setBounds(57, 75, 37, 37);
		panel_dancevirus.setLayout(null);
		panel_dancevirus.add(lblNewLabel_2);
		this.add(panel_dancevirus);
		
		JLabel lblNewLabel_obli = new JLabel();
		lblNewLabel_obli.setBounds(1, 1, 35, 35);
		lblNewLabel_obli.setIcon(DesignPatterns.oblivionVirus); 
		
		JPanel panel_oblivion = new JPanel();
		panel_oblivion.setBackground(new Color(220, 220, 220));
		panel_oblivion.setBounds(104, 75, 37, 37);
		panel_oblivion.setLayout(null);
		panel_oblivion.add(lblNewLabel_obli);
		this.add(panel_oblivion);
		
		JLabel lblNewLabel_para = new JLabel();
		lblNewLabel_para.setBounds(1, 1, 35, 35);
		lblNewLabel_para.setIcon(DesignPatterns.paralyseVirus); 
		
		JPanel panel_paralyses = new JPanel();
		panel_paralyses.setBackground(new Color(220, 220, 220));
		panel_paralyses.setBounds(151, 75, 37, 37);
		panel_paralyses.setLayout(null);
		panel_paralyses.add(lblNewLabel_para);
		this.add(panel_paralyses);
		
		JLabel lblNewLabel = new JLabel("Agents");
		lblNewLabel.setBounds(10, 57, 49, 17);
		lblNewLabel.setFont(DesignPatterns.robotoMono12);
		this.add(lblNewLabel);
		
		JLabel lblGeneticCodes = new JLabel("Genetic codes");
		lblGeneticCodes.setFont(null);
		lblGeneticCodes.setBounds(10, 3, 116, 17);
		lblGeneticCodes.setFont(DesignPatterns.robotoMono12);
		this.add(lblGeneticCodes);
		
		JPanel panel_1_1_2 = new JPanel();
		panel_1_1_2.setBackground(new Color(220, 220, 220));
		panel_1_1_2.setBounds(104, 20, 37, 37);
		this.add(panel_1_1_2);
		
		JPanel panel_1_1_3 = new JPanel();
		panel_1_1_3.setBackground(new Color(220, 220, 220));
		panel_1_1_3.setBounds(151, 20, 37, 37);
		this.add(panel_1_1_3);
		
		JPanel panel_1_1_4 = new JPanel();
		panel_1_1_4.setBackground(new Color(220, 220, 220));
		panel_1_1_4.setBounds(212, 20, 37, 37);
		this.add(panel_1_1_4);
		
		JPanel panel_1_1_5 = new JPanel();
		panel_1_1_5.setBackground(new Color(220, 220, 220));
		panel_1_1_5.setBounds(259, 20, 37, 37);
		this.add(panel_1_1_5);
		
		JPanel panel_1_1_6 = new JPanel();
		panel_1_1_6.setBackground(new Color(220, 220, 220));
		panel_1_1_6.setBounds(306, 20, 37, 37);
		this.add(panel_1_1_6);
		
		JLabel lblEquipments = new JLabel("Equipments");
		lblEquipments.setFont(null);
		lblEquipments.setBounds(212, 3, 116, 17);
		lblEquipments.setFont(DesignPatterns.robotoMono12);
		this.add(lblEquipments);
		
		JLabel lblActualEffect = new JLabel("Actual effect");
		lblActualEffect.setFont(null);
		lblActualEffect.setBounds(212, 57, 116, 17);
		lblActualEffect.setFont(DesignPatterns.robotoMono12);
		this.add(lblActualEffect);
		
		JPanel panel_1_1_6_1 = new JPanel();
		panel_1_1_6_1.setBackground(new Color(220, 220, 220));
		panel_1_1_6_1.setBounds(306, 75, 37, 37);
		this.add(panel_1_1_6_1);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(212, 92, 84, 5);
		progressBar.setBorder(null);
		progressBar.setBackground(DesignPatterns.lightGrey);
		progressBar.setForeground(DesignPatterns.blue);
		progressBar.setMaximum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(40);
		this.add(progressBar);
		
		JLabel lblNewLabel_1 = new JLabel("Player 1");
		lblNewLabel_1.setBounds(362, 11, 149, 36);
		lblNewLabel_1.setFont(DesignPatterns.robotoMono20);
		this.add(lblNewLabel_1);
		
		JLabel lblMaterialLevel = new JLabel("Material level");
		lblMaterialLevel.setFont(null);
		lblMaterialLevel.setBounds(365, 58, 116, 17);
		lblMaterialLevel.setFont(DesignPatterns.robotoMono12);
		this.add(lblMaterialLevel);
		
		JLabel lblMaterialLevel_1 = new JLabel("200/500");
		lblMaterialLevel_1.setFont(null);
		lblMaterialLevel_1.setBounds(365, 80, 116, 17);
		lblMaterialLevel_1.setFont(DesignPatterns.robotoMono14);
		this.add(lblMaterialLevel_1);

	}
	
	public void enableVaccine() {
		lblNewLabel_vaccine.disable();
	}

}
