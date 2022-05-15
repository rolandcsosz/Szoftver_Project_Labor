package UI.Components;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import UI.Collectable;
import UI.DesignPatterns;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class Panel extends JPanel {
	
	static int selectedAgent1 = -1;
	static int selectedAgent2 = -1;
	static int selectedEquipment1 = -1;
	static int selectedEquipment2 = -1;
	
	
	static int maxMaterial1 = 100;
	static int maxMaterial2 = 100;
	static int actualMaterial1 = 0;
	static int actualMaterial2 = 0;
	
	static List<UI.Collectable> equipments1 = new ArrayList<UI.Collectable>(3);
	static List<UI.Collectable> equipments2 = new ArrayList<UI.Collectable>(3);
	
	static int glove1Counter;
	static int glove2Counter;
	
	static JLabel MaterialCount_label;
	static JLabel MaterialCount_label_1;
	
	static JLabel Selected_label;
	
	
	static JProgressBar progressBar;
	static JProgressBar progressBar_1;
	
	static JLabel GloveNumber_label;
	
	static JPanel Vaccine_panel;
	static JPanel DanceVirus_panel;
	static JPanel OblivionVirus_panel;
	static JPanel ParalysesVirus_panel;
	static JPanel Vaccine_panel_1;
	static JPanel DanceVirus_panel_1;
	static JPanel OblivionVirus_panel_1;
	static JPanel ParalysesVirus_panel_1;
	
	static JLabel Equipment1Number_label;
	static JLabel Equipment2Number_label;
	static JLabel Equipment3Number_label;
	static JLabel Equipment1Number_label_1;
	static JLabel Equipment2Number_label_1;
	static JLabel Equipment3Number_label_1;
	static JLabel VaccineNumber_label;
	static JLabel DanceVirusNumber_label;
	static JLabel ParalysesVirusNumber_label_1;
	static JLabel OblivionVirusNumber_label_1;
	static JLabel PlayerName_label;
	static JLabel PlayerName_label_1;
	static JLabel DanceVirusNumber_label_1;
	static JLabel Vaccine_label;
	static JLabel VaccineNumber_label_1;
	static JLabel DanceVirus_label;
	static JLabel OblivionVirus_label;
	static JLabel ParalysesVirus_label;
	static JLabel DanceVirus_label_1;
	static JLabel OblivionVirus_label_1;
	static JLabel ParalysesVirus_label_1;
	static JLabel Vaccine_label_1 ;
	
	static JLabel VaccineGC_label;
	static JLabel DanceVirusGC_label;
	static JLabel OblivionVirusGC_label;
	static JLabel ParalysesVirusGC_label;
	static JLabel VaccineGC_label_1;
	static JLabel DanceVirusGC_label_1;
	static JLabel OblivionVirusGC_label_1;
	static JLabel ParalysesVirusGC_label_1;
	
	static JLabel Equipment1_label;
	static JLabel Equipment2_label;
	static JLabel Equipment3_label;
	static JLabel Equipment1_label_1;
	static JLabel Equipment2_label_1;
	static JLabel Equipment3_label_1;
	
	static JLabel ActualEffect_label;
	static JLabel ActualEffect_label_1;
	
	static JPanel Equipment1_panel;
	static JPanel Equipment2_panel;
	static JPanel Equipment3_panel;
	static JPanel Equipment1_panel_1;
	static JPanel Equipment2_panel_1;
	static JPanel Equipment3_panel_1;
	

	
	private static JLabel OblivionVirusNumber_label;
	private static JLabel ParalysesVirusNumber_label;

	/**
	 * Create the panel.
	 */
	public Panel() {

		this.setBounds(0, 490, 1200, 130);
		this.setBackground(DesignPatterns.grey);
		this.setLayout(null);
		
		Equipment3Number_label = new JLabel("0");
		Equipment3Number_label.setVisible(false);
		Equipment3Number_label.setFont(DesignPatterns.robotoMono12);
		Equipment3Number_label.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment3Number_label.setOpaque(true);
		Equipment3Number_label.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment3Number_label.setForeground(Color.WHITE);
		Equipment3Number_label.setBackground(new Color(69, 105, 144));
		Equipment3Number_label.setBounds(336, 43, 14, 14);
		add(Equipment3Number_label);
		
		Equipment2Number_label = new JLabel("0");
		Equipment2Number_label.setVisible(false);
		Equipment2Number_label.setFont(DesignPatterns.robotoMono12);
		Equipment2Number_label.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment2Number_label.setOpaque(true);
		Equipment2Number_label.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment2Number_label.setForeground(Color.WHITE);
		Equipment2Number_label.setBackground(new Color(69, 105, 144));
		Equipment2Number_label.setBounds(289, 43, 14, 14);
		add(Equipment2Number_label);
		
		Equipment1Number_label = new JLabel("0");
		Equipment1Number_label.setVisible(false);
		Equipment1Number_label.setFont(DesignPatterns.robotoMono12);
		Equipment1Number_label.setOpaque(true);
		Equipment1Number_label.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment1Number_label.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment1Number_label.setForeground(Color.WHITE);
		Equipment1Number_label.setBackground(new Color(69, 105, 144));
		Equipment1Number_label.setBounds(242, 43, 14, 14);
		add(Equipment1Number_label);
		
		Equipment1_panel = new JPanel();
		Equipment1_panel.setBackground(new Color(220, 220, 220));
		Equipment1_panel.setBounds(212, 20, 37, 37);
		this.add(Equipment1_panel);
		Equipment1_panel.setLayout(null);
		
		Equipment1_label = new JLabel();
		Equipment1_label.setBounds(1, 1, 35, 35);
		Equipment1_panel.add(Equipment1_label);
		
		VaccineNumber_label = new JLabel("0");
		VaccineNumber_label.setVisible(false);
		VaccineNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		VaccineNumber_label.setVerticalAlignment(SwingConstants.BOTTOM);
		VaccineNumber_label.setFont(DesignPatterns.robotoMono12);
		VaccineNumber_label.setBounds(40, 105, 14, 14);
		add(VaccineNumber_label);
		VaccineNumber_label.setOpaque(true);
		VaccineNumber_label.setBackground(DesignPatterns.blue);
		VaccineNumber_label.setForeground(Color.WHITE);
		
		DanceVirusNumber_label = new JLabel("0");
		DanceVirusNumber_label.setVisible(false);
		DanceVirusNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		DanceVirusNumber_label.setVerticalAlignment(SwingConstants.BOTTOM);
		DanceVirusNumber_label.setFont(DesignPatterns.robotoMono12);
		DanceVirusNumber_label.setOpaque(true);
		DanceVirusNumber_label.setForeground(Color.WHITE);
		DanceVirusNumber_label.setBackground(new Color(69, 105, 144));
		DanceVirusNumber_label.setBounds(87, 105, 14, 14);
		add(DanceVirusNumber_label);
		
		JLabel lblNewLabel_3_1_1;
		OblivionVirusNumber_label = new JLabel("0");
		OblivionVirusNumber_label.setVisible(false);
		OblivionVirusNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		OblivionVirusNumber_label.setVerticalAlignment(SwingConstants.BOTTOM);
		OblivionVirusNumber_label.setFont(DesignPatterns.robotoMono12);
		OblivionVirusNumber_label.setOpaque(true);
		OblivionVirusNumber_label.setForeground(Color.WHITE);
		OblivionVirusNumber_label.setBackground(new Color(69, 105, 144));
		OblivionVirusNumber_label.setBounds(135, 105, 14, 14);
		add(OblivionVirusNumber_label);
		
		JLabel lblNewLabel_3_1_1_1;
		ParalysesVirusNumber_label = new JLabel("0");
		ParalysesVirusNumber_label.setVisible(false);
		ParalysesVirusNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		ParalysesVirusNumber_label.setVerticalAlignment(SwingConstants.BOTTOM);
		ParalysesVirusNumber_label.setFont(DesignPatterns.robotoMono12);
		ParalysesVirusNumber_label.setOpaque(true);
		ParalysesVirusNumber_label.setForeground(Color.WHITE);
		ParalysesVirusNumber_label.setBackground(new Color(69, 105, 144));
		ParalysesVirusNumber_label.setBounds(183, 105, 14, 14);
		add(ParalysesVirusNumber_label);
		
		
		
		JPanel VaccineGC_panel = new JPanel();
		VaccineGC_panel.setBorder(null);
		VaccineGC_panel.setBounds(10, 20, 37, 37);
		VaccineGC_panel.setBackground(DesignPatterns.lightGrey);
		this.add(VaccineGC_panel);
		VaccineGC_panel.setLayout(null);
		
		VaccineGC_label = new JLabel();
		VaccineGC_label.setEnabled(false);
		VaccineGC_label.setIcon(DesignPatterns.vaccineGC);
		VaccineGC_label.setBounds(1, 1, 35, 35);
		VaccineGC_panel.add(VaccineGC_label);
		
		JPanel DanceVirusGC_panel = new JPanel();
		DanceVirusGC_panel.setBackground(new Color(220, 220, 220));
		DanceVirusGC_panel.setBounds(57, 20, 37, 37);
		this.add(DanceVirusGC_panel);
		DanceVirusGC_panel.setLayout(null);
		
		DanceVirusGC_label = new JLabel();
		DanceVirusGC_label.setEnabled(false);
		DanceVirusGC_label.setBounds(1, 1, 35, 35);
		DanceVirusGC_label.setIcon(DesignPatterns.danceVirusGC);
		DanceVirusGC_panel.add(DanceVirusGC_label);
		
		Vaccine_label = new JLabel();
		Vaccine_label.setEnabled(false);
		Vaccine_label.setBounds(0, 0, 35, 35);
		Vaccine_label.setIcon(DesignPatterns.vaccine);
		
		Vaccine_panel = new JPanel();
		Vaccine_panel.setBackground(new Color(220, 220, 220));
		Vaccine_panel.setBounds(10, 75, 37, 37);
		Vaccine_panel.setLayout(null);
		Vaccine_panel.setBorder(null);
		Vaccine_panel.add(Vaccine_label);
		this.add(Vaccine_panel);
		
		
		DanceVirus_label = new JLabel();
		DanceVirus_label.setEnabled(false);
		DanceVirus_label.setBounds(1, 1, 35, 35);
		DanceVirus_label.setIcon(DesignPatterns.danceVirus); 
		
		DanceVirus_panel = new JPanel();
		DanceVirus_panel.setBackground(new Color(220, 220, 220));
		DanceVirus_panel.setBounds(57, 75, 37, 37);
		DanceVirus_panel.setLayout(null);
		DanceVirus_panel.add(DanceVirus_label);
		this.add(DanceVirus_panel);
		
		OblivionVirus_label = new JLabel();
		OblivionVirus_label.setEnabled(false);
		OblivionVirus_label.setBounds(1, 1, 35, 35);
		OblivionVirus_label.setIcon(DesignPatterns.oblivionVirus); 
		
		OblivionVirus_panel = new JPanel();
		OblivionVirus_panel.setBackground(new Color(220, 220, 220));
		OblivionVirus_panel.setBounds(104, 75, 37, 37);
		OblivionVirus_panel.setLayout(null);
		OblivionVirus_panel.add(OblivionVirus_label);
		this.add(OblivionVirus_panel);
		
		ParalysesVirus_label = new JLabel();
		ParalysesVirus_label.setEnabled(false);
		ParalysesVirus_label.setBounds(1, 1, 35, 35);
		ParalysesVirus_label.setIcon(DesignPatterns.paralyseVirus); 
		
		ParalysesVirus_panel = new JPanel();
		ParalysesVirus_panel.setBackground(new Color(220, 220, 220));
		ParalysesVirus_panel.setBounds(151, 75, 37, 37);
		ParalysesVirus_panel.setLayout(null);
		ParalysesVirus_panel.add(ParalysesVirus_label);
		this.add(ParalysesVirus_panel);
		
		JLabel Agents_label = new JLabel("Agents");
		Agents_label.setBounds(10, 57, 49, 17);
		Agents_label.setFont(DesignPatterns.robotoMono12);
		this.add(Agents_label);
		
		JLabel GeneticCodes_label = new JLabel("Genetic codes");
		GeneticCodes_label.setFont(null);
		GeneticCodes_label.setBounds(10, 3, 116, 17);
		GeneticCodes_label.setFont(DesignPatterns.robotoMono12);
		this.add(GeneticCodes_label);
		
		JPanel OblivionVirusGC_panel = new JPanel();
		OblivionVirusGC_panel.setBackground(new Color(220, 220, 220));
		OblivionVirusGC_panel.setBounds(104, 20, 37, 37);
		this.add(OblivionVirusGC_panel);
		OblivionVirusGC_panel.setLayout(null);
		
		OblivionVirusGC_label = new JLabel();
		OblivionVirusGC_label.setEnabled(false);
		OblivionVirusGC_label.setBounds(1, 1, 35, 35);
		OblivionVirusGC_label.setIcon(DesignPatterns.oblivionVirusGC);
		OblivionVirusGC_panel.add(OblivionVirusGC_label);
		
		JPanel ParalysesVirusGC_panel = new JPanel();
		ParalysesVirusGC_panel.setBackground(new Color(220, 220, 220));
		ParalysesVirusGC_panel.setBounds(151, 20, 37, 37);
		this.add(ParalysesVirusGC_panel);
		ParalysesVirusGC_panel.setLayout(null);
		
		ParalysesVirusGC_label = new JLabel();
		ParalysesVirusGC_label.setEnabled(false);
		ParalysesVirusGC_label.setBounds(1, 1, 35, 35);
		ParalysesVirusGC_label.setIcon(DesignPatterns.paralysesVirusGC); 
		ParalysesVirusGC_panel.add(ParalysesVirusGC_label);
		
		Equipment2_panel = new JPanel();
		Equipment2_panel.setBackground(new Color(220, 220, 220));
		Equipment2_panel.setBounds(259, 20, 37, 37);
		this.add(Equipment2_panel);
		Equipment2_panel.setLayout(null);
		
		Equipment2_label = new JLabel();
		Equipment2_label.setBounds(1, 1, 35, 35);
		Equipment2_panel.add(Equipment2_label);
		
		Equipment3_panel = new JPanel();
		Equipment3_panel.setBackground(new Color(220, 220, 220));
		Equipment3_panel.setBounds(306, 20, 37, 37);
		this.add(Equipment3_panel);
		Equipment3_panel.setLayout(null);
		
		Equipment3_label = new JLabel();
		Equipment3_label.setBounds(1, 1, 35, 35);
		Equipment3_panel.add(Equipment3_label);
		
		JLabel Equipments_label = new JLabel("Equipments");
		Equipments_label.setFont(null);
		Equipments_label.setBounds(212, 3, 116, 17);
		Equipments_label.setFont(DesignPatterns.robotoMono12);
		this.add(Equipments_label);
		
		JLabel ActualEffectText_label = new JLabel("Actual effect");
		ActualEffectText_label.setFont(null);
		ActualEffectText_label.setBounds(212, 57, 116, 17);
		ActualEffectText_label.setFont(DesignPatterns.robotoMono12);
		this.add(ActualEffectText_label);
		
		JPanel ActualEffect_panel = new JPanel();
		ActualEffect_panel.setBackground(new Color(220, 220, 220));
		ActualEffect_panel.setBounds(306, 75, 37, 37);
		this.add(ActualEffect_panel);
		ActualEffect_panel.setLayout(null);
		
		ActualEffect_label = new JLabel();
		ActualEffect_label.setBounds(1, 1, 35, 35);
		ActualEffect_panel.add(ActualEffect_label);
		
		progressBar = new JProgressBar();
		progressBar.setBounds(212, 92, 84, 5);
		progressBar.setBorder(null);
		progressBar.setBackground(DesignPatterns.lightGrey);
		progressBar.setForeground(DesignPatterns.blue);
		progressBar.setMaximum(100);
		this.add(progressBar);
		
		JLabel PlayerName_label = new JLabel("Player 1");
		PlayerName_label.setBounds(362, 11, 149, 36);
		PlayerName_label.setFont(DesignPatterns.robotoMono20);
		this.add(PlayerName_label);
		
		JLabel MaterialLevel_label = new JLabel("Material level");
		MaterialLevel_label.setFont(null);
		MaterialLevel_label.setBounds(365, 58, 116, 17);
		MaterialLevel_label.setFont(DesignPatterns.robotoMono12);
		this.add(MaterialLevel_label);
		
		MaterialCount_label = new JLabel("0/100");
		MaterialCount_label.setFont(null);
		MaterialCount_label.setBounds(365, 80, 116, 17);
		MaterialCount_label.setFont(DesignPatterns.robotoMono14);
		this.add(MaterialCount_label);
		
		VaccineNumber_label_1 = new JLabel("0");
		VaccineNumber_label_1.setVisible(false);
		VaccineNumber_label_1.setFont(DesignPatterns.robotoMono12);
		VaccineNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		VaccineNumber_label_1.setOpaque(true);
		VaccineNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		VaccineNumber_label_1.setForeground(Color.WHITE);
		VaccineNumber_label_1.setBackground(new Color(69, 105, 144));
		VaccineNumber_label_1.setBounds(1019, 105, 14, 14);
		add(VaccineNumber_label_1);
		
		DanceVirusNumber_label_1 = new JLabel("0");
		DanceVirusNumber_label_1.setVisible(false);
		DanceVirusNumber_label_1.setFont(DesignPatterns.robotoMono12);
		DanceVirusNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		DanceVirusNumber_label_1.setOpaque(true);
		DanceVirusNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		DanceVirusNumber_label_1.setForeground(Color.WHITE);
		DanceVirusNumber_label_1.setBackground(new Color(69, 105, 144));
		DanceVirusNumber_label_1.setBounds(1066, 105, 14, 14);
		add(DanceVirusNumber_label_1);
		
		OblivionVirusNumber_label_1 = new JLabel("0");
		OblivionVirusNumber_label_1.setVisible(false);
		OblivionVirusNumber_label_1.setFont(DesignPatterns.robotoMono12);
		OblivionVirusNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		OblivionVirusNumber_label_1.setOpaque(true);
		OblivionVirusNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		OblivionVirusNumber_label_1.setForeground(Color.WHITE);
		OblivionVirusNumber_label_1.setBackground(new Color(69, 105, 144));
		OblivionVirusNumber_label_1.setBounds(1114, 105, 14, 14);
		add(OblivionVirusNumber_label_1);
		
		ParalysesVirusNumber_label_1 = new JLabel("0");
		ParalysesVirusNumber_label_1.setVisible(false);
		ParalysesVirusNumber_label_1.setFont(DesignPatterns.robotoMono12);
		ParalysesVirusNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		ParalysesVirusNumber_label_1.setOpaque(true);
		ParalysesVirusNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		ParalysesVirusNumber_label_1.setForeground(Color.WHITE);
		ParalysesVirusNumber_label_1.setBackground(new Color(69, 105, 144));
		ParalysesVirusNumber_label_1.setBounds(1162, 105, 14, 14);
		add(ParalysesVirusNumber_label_1);
		
		JPanel VaccineGC_panel_1 = new JPanel();
		VaccineGC_panel_1.setLayout(null);
		VaccineGC_panel_1.setBackground(new Color(220, 220, 220));
		VaccineGC_panel_1.setBounds(989, 20, 37, 37);
		add(VaccineGC_panel_1);
		
		VaccineGC_label_1 = new JLabel();
		VaccineGC_label_1.setEnabled(false);
		VaccineGC_label_1.setBounds(1, 1, 35, 35);
		VaccineGC_label_1.setIcon(DesignPatterns.vaccineGC);
		VaccineGC_panel_1.add(VaccineGC_label_1);
		
		JPanel DanceVirusGC_panel_1 = new JPanel();
		DanceVirusGC_panel_1.setLayout(null);
		DanceVirusGC_panel_1.setBackground(new Color(220, 220, 220));
		DanceVirusGC_panel_1.setBounds(1036, 20, 37, 37);
		add(DanceVirusGC_panel_1);
		
		DanceVirusGC_label_1 = new JLabel();
		DanceVirusGC_label_1.setEnabled(false);
		DanceVirusGC_label_1.setBounds(1, 1, 35, 35);
		DanceVirusGC_label_1.setIcon(DesignPatterns.danceVirusGC);
		DanceVirusGC_panel_1.add(DanceVirusGC_label_1);
		
		Vaccine_panel_1 = new JPanel();
		Vaccine_panel_1.setLayout(null);
		Vaccine_panel_1.setBackground(new Color(220, 220, 220));
		Vaccine_panel_1.setBounds(989, 75, 37, 37);
		add(Vaccine_panel_1);
		
		Vaccine_label_1 = new JLabel();
		Vaccine_label_1.setEnabled(false);
		Vaccine_label_1.setBounds(0, 0, 35, 35);
		Vaccine_label_1.setIcon(DesignPatterns.vaccine);
		Vaccine_panel_1.add(Vaccine_label_1);
		
		DanceVirus_panel_1 = new JPanel();
		DanceVirus_panel_1.setLayout(null);
		DanceVirus_panel_1.setBackground(new Color(220, 220, 220));
		DanceVirus_panel_1.setBounds(1036, 75, 37, 37);
		add(DanceVirus_panel_1);
		
		DanceVirus_label_1 = new JLabel();
		DanceVirus_label_1.setEnabled(false);
		DanceVirus_label_1.setBounds(1, 1, 35, 35);
		DanceVirus_label_1.setIcon(DesignPatterns.danceVirus); 
		DanceVirus_panel_1.add(DanceVirus_label_1);
		
		OblivionVirus_panel_1 = new JPanel();
		OblivionVirus_panel_1.setLayout(null);
		OblivionVirus_panel_1.setBackground(new Color(220, 220, 220));
		OblivionVirus_panel_1.setBounds(1083, 75, 37, 37);
		add(OblivionVirus_panel_1);
		
		OblivionVirus_label_1 = new JLabel();
		OblivionVirus_label_1.setEnabled(false);
		OblivionVirus_label_1.setBounds(1, 1, 35, 35);
		OblivionVirus_label_1.setIcon(DesignPatterns.oblivionVirus); 
		OblivionVirus_panel_1.add(OblivionVirus_label_1);
		
		ParalysesVirus_panel_1 = new JPanel();
		ParalysesVirus_panel_1.setLayout(null);
		ParalysesVirus_panel_1.setBackground(new Color(220, 220, 220));
		ParalysesVirus_panel_1.setBounds(1130, 75, 37, 37);
		add(ParalysesVirus_panel_1);
		
		ParalysesVirus_label_1 = new JLabel();
		ParalysesVirus_label_1.setEnabled(false);
		ParalysesVirus_label_1.setBounds(1, 1, 35, 35);
		ParalysesVirus_label_1.setIcon(DesignPatterns.paralyseVirus); 
		ParalysesVirus_panel_1.add(ParalysesVirus_label_1);
		
		JLabel Agents_label_1 = new JLabel("Agents");
		Agents_label_1.setFont(DesignPatterns.robotoMono12);
		Agents_label_1.setBounds(989, 57, 49, 17);
		add(Agents_label_1);
		
		JLabel GeneticCodes_label_1 = new JLabel("Genetic codes");
		GeneticCodes_label_1.setFont(DesignPatterns.robotoMono12);
		GeneticCodes_label_1.setBounds(989, 3, 116, 17);
		add(GeneticCodes_label_1);
		
		JPanel OblivionVirusGC_panel_1 = new JPanel();
		OblivionVirusGC_panel_1.setLayout(null);
		OblivionVirusGC_panel_1.setBackground(new Color(220, 220, 220));
		OblivionVirusGC_panel_1.setBounds(1083, 20, 37, 37);
		add(OblivionVirusGC_panel_1);
		
		OblivionVirusGC_label_1 = new JLabel();
		OblivionVirusGC_label_1.setEnabled(false);
		OblivionVirusGC_label_1.setBounds(1, 1, 35, 35);
		OblivionVirusGC_label_1.setIcon(DesignPatterns.oblivionVirusGC);
		OblivionVirusGC_panel_1.add(OblivionVirusGC_label_1);
		
		JPanel ParalysesVirusGC_panel_1 = new JPanel();
		ParalysesVirusGC_panel_1.setLayout(null);
		ParalysesVirusGC_panel_1.setBackground(new Color(220, 220, 220));
		ParalysesVirusGC_panel_1.setBounds(1130, 20, 37, 37);
		add(ParalysesVirusGC_panel_1);
		
		ParalysesVirusGC_label_1 = new JLabel();
		ParalysesVirusGC_label_1.setEnabled(false);
		ParalysesVirusGC_label_1.setBounds(1, 1, 35, 35);
		ParalysesVirusGC_label_1.setIcon(DesignPatterns.paralysesVirusGC);
		ParalysesVirusGC_panel_1.add(ParalysesVirusGC_label_1);
		
		Equipment3Number_label_1 = new JLabel("0");
		Equipment3Number_label_1.setVisible(false);
		Equipment3Number_label_1.setFont(DesignPatterns.robotoMono12);
		Equipment3Number_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment3Number_label_1.setOpaque(true);
		Equipment3Number_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment3Number_label_1.setForeground(Color.WHITE);
		Equipment3Number_label_1.setBackground(new Color(69, 105, 144));
		Equipment3Number_label_1.setBounds(960, 43, 14, 14);
		add(Equipment3Number_label_1);
		
		Equipment2Number_label_1 = new JLabel("0");
		Equipment2Number_label_1.setVisible(false);
		Equipment2Number_label_1.setFont(DesignPatterns.robotoMono12);
		Equipment2Number_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment2Number_label_1.setOpaque(true);
		Equipment2Number_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment2Number_label_1.setForeground(Color.WHITE);
		Equipment2Number_label_1.setBackground(new Color(69, 105, 144));
		Equipment2Number_label_1.setBounds(913, 43, 14, 14);
		add(Equipment2Number_label_1);
		
		Equipment1Number_label_1 = new JLabel("0");
		Equipment1Number_label_1.setVisible(false);
		Equipment1Number_label_1.setFont(DesignPatterns.robotoMono12);
		Equipment1Number_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment1Number_label_1.setOpaque(true);
		Equipment1Number_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment1Number_label_1.setForeground(Color.WHITE);
		Equipment1Number_label_1.setBackground(new Color(69, 105, 144));
		Equipment1Number_label_1.setBounds(866, 43, 14, 14);
		add(Equipment1Number_label_1);
		
		Equipment1_panel_1 = new JPanel();
		Equipment1_panel_1.setLayout(null);
		Equipment1_panel_1.setBackground(new Color(220, 220, 220));
		Equipment1_panel_1.setBounds(836, 20, 37, 37);
		add(Equipment1_panel_1);
		
		Equipment1_label_1 = new JLabel();
		Equipment1_label_1.setBounds(1, 1, 35, 35);
		Equipment1_panel_1.add(Equipment1_label_1);
		
		Equipment2_panel_1 = new JPanel();
		Equipment2_panel_1.setLayout(null);
		Equipment2_panel_1.setBackground(new Color(220, 220, 220));
		Equipment2_panel_1.setBounds(883, 20, 37, 37);
		add(Equipment2_panel_1);
		
		Equipment2_label_1 = new JLabel();
		Equipment2_label_1.setBounds(1, 1, 35, 35);
		Equipment2_panel_1.add(Equipment2_label_1);
		
		Equipment3_panel_1 = new JPanel();
		Equipment3_panel_1.setLayout(null);
		Equipment3_panel_1.setBackground(new Color(220, 220, 220));
		Equipment3_panel_1.setBounds(930, 20, 37, 37);
		add(Equipment3_panel_1);
		
		Equipment3_label_1 = new JLabel();
		Equipment3_label_1.setBounds(1, 1, 35, 35);
		Equipment3_panel_1.add(Equipment3_label_1);
		
		JLabel Equipments_label_1 = new JLabel("Equipments");
		Equipments_label_1.setFont(DesignPatterns.robotoMono12);
		Equipments_label_1.setBounds(836, 3, 116, 17);
		add(Equipments_label_1);
		
		JLabel ActualEffectText_label_1 = new JLabel("Actual effect");
		ActualEffectText_label_1.setFont(DesignPatterns.robotoMono12);
		ActualEffectText_label_1.setBounds(836, 57, 116, 17);
		add(ActualEffectText_label_1);
		
		JPanel ActualEffect_panel_1 = new JPanel();
		ActualEffect_panel_1.setBackground(new Color(220, 220, 220));
		ActualEffect_panel_1.setBounds(930, 75, 37, 37);
		add(ActualEffect_panel_1);
		ActualEffect_panel_1.setLayout(null);
		
		ActualEffect_label_1 = new JLabel();
		ActualEffect_label_1.setBounds(1, 1, 35, 35);
		ActualEffect_panel_1.add(ActualEffect_label_1);
		
		progressBar_1 = new JProgressBar();
		progressBar_1.setValue(40);
		progressBar_1.setForeground(new Color(69, 105, 144));
		progressBar_1.setBorder(null);
		progressBar_1.setBackground(new Color(220, 220, 220));
		progressBar_1.setBounds(836, 92, 84, 5);
		add(progressBar_1);
		
		PlayerName_label_1 = new JLabel("Player 2");
		PlayerName_label_1.setFont(null);
		PlayerName_label_1.setFont(DesignPatterns.robotoMono20);
		PlayerName_label_1.setBounds(714, 11, 149, 36);
		add(PlayerName_label_1);
		
		JLabel MaterialLevel_label_1 = new JLabel("Material level");
		MaterialLevel_label_1.setFont(null);
		MaterialLevel_label_1.setBounds(717, 58, 116, 17);
		MaterialLevel_label_1.setFont(DesignPatterns.robotoMono12);
		add(MaterialLevel_label_1);
		
		MaterialCount_label_1 = new JLabel("0/100");
		MaterialCount_label_1.setFont(null);
		MaterialCount_label_1.setBounds(717, 80, 116, 17);
		MaterialCount_label_1.setFont(DesignPatterns.robotoMono14);
		add(MaterialCount_label_1);
		
	
	}
	
	private static ImageIcon getImageByAgent(UI.Collectable type) {
		
		switch(type) {
			case DANCE:{
				return DesignPatterns.danceVirus;
			}
			case OBLIVION:{
				return DesignPatterns.oblivionVirus;
			}
			case PARALYSES:{
				return DesignPatterns.paralyseVirus;
			}
			case BEAR:{
				return DesignPatterns.bearVirus;
			}
			case VACCINE:{
				return DesignPatterns.vaccine;
			}
		}
		
		return null;
		
	}

		public static void setActualEffect(UI.Player player,UI.Collectable type) {
			
			if(player == UI.Player.PLAYER1) {
				ActualEffect_label.setIcon(getImageByAgent(type));
			}
			
			if(player == UI.Player.PLAYER2) {
				ActualEffect_label_1.setIcon(getImageByAgent(type));
			}
		}
		
		public static void setMaxMaterialLevel(UI.Player player,int level) {
			if(player == UI.Player.PLAYER1) {
				maxMaterial1 = level;
				MaterialCount_label.setText(actualMaterial1 + "/" + maxMaterial1);
				
			}
			
			if(player == UI.Player.PLAYER2) {
				maxMaterial2 = level;
				MaterialCount_label_1.setText(actualMaterial2 + "/" + maxMaterial2);
			}
		}
		
		public static void setMaterialLevel(UI.Player player,int level) {
			
			if(player == UI.Player.PLAYER1) {
				actualMaterial1 = level;
				MaterialCount_label.setText(actualMaterial1 + "/" + maxMaterial1);
				
			}
			
			if(player == UI.Player.PLAYER2) {
				actualMaterial2 = level;
				MaterialCount_label_1.setText(actualMaterial2 + "/" + maxMaterial2);
			}
		}


	// 0-100
	public static void setProgressBar(UI.Player player, int value) {
		if(player == UI.Player.PLAYER1) {
			progressBar.setValue(value);
		}
		
		if(player == UI.Player.PLAYER2) {
			progressBar_1.setValue(value);
		}
	}
	
	public static void transformToBear(UI.Player player) {
		
		JLabel perm;
		JLabel num;
		
		if(player == UI.Player.PLAYER1) {
			
			for(int i = 0; i < 3; i++) {
				perm = getEqLabel(player, i);
				num = getNumberLabel(player, i);
				perm.setIcon(null);
				num.setVisible(false);
				
			}
			
			DanceVirusNumber_label.setVisible(false);
			VaccineNumber_label.setVisible(false);
			OblivionVirusNumber_label.setVisible(false);
			ParalysesVirusNumber_label.setVisible(false);
			DanceVirusGC_label.setEnabled(false);
			VaccineGC_label.setEnabled(false);
			OblivionVirusGC_label.setEnabled(false);
			ParalysesVirusGC_label.setEnabled(false);
			DanceVirus_label.setEnabled(false);
			Vaccine_label.setEnabled(false);
			OblivionVirus_label.setEnabled(false);
			ParalysesVirus_label.setEnabled(false);
		
			
			
		}
		
		if(player == UI.Player.PLAYER2) {
			
			
			for(int i = 0; i < 3; i++) {
				perm = getEqLabel(player, i);
				num = getNumberLabel(player, i);
				perm.setIcon(null);
				num.setVisible(false);
				
			}
			
			DanceVirusNumber_label_1.setVisible(false);
			VaccineNumber_label_1.setVisible(false);
			OblivionVirusNumber_label_1.setVisible(false);
			ParalysesVirusNumber_label_1.setVisible(false);
			DanceVirusGC_label_1.setEnabled(false);
			VaccineGC_label_1.setEnabled(false);
			OblivionVirusGC_label_1.setEnabled(false);
			ParalysesVirusGC_label_1.setEnabled(false);
			DanceVirus_label_1.setEnabled(false);
			Vaccine_label_1.setEnabled(false);
			OblivionVirus_label_1.setEnabled(false);
			ParalysesVirus_label_1.setEnabled(false);
		}
		
		setActualEffect(player,UI.Collectable.BEAR);
		setProgressBar(player, 100);
		setMaterialLevel(player, 0);
	}
	
	public static void useAxe(UI.Player player) {
		
		int num = -1;
		JLabel perm = null;
		
		if(player == UI.Player.PLAYER1) {
			for(Collectable c:equipments1) {
				if(c == UI.Collectable.AXE) {
					num = equipments1.indexOf(c);
				}
			}
		}
		
		if(player == UI.Player.PLAYER2) {
			for(Collectable c:equipments2) {
				if(c == UI.Collectable.AXE) {
					num = equipments2.indexOf(c);
				}
			}
		}
		
		if(num == -1) {
			return;
		}
		
		perm = getEqLabel(player, num);
		perm.setIcon(DesignPatterns.brokenAxe);
	}
	
	private static JLabel getEqLabel(UI.Player player, int num) {
		
		JLabel perm = null;
		
		if(player == UI.Player.PLAYER1) {
			if(num == 0) {
				perm = Equipment1_label;
			}
			else if(num == 1) {
				perm = Equipment2_label;
			}
			else if(num == 2) {
				perm = Equipment3_label;
			}
			
		}
		if(player == UI.Player.PLAYER2) {
			if(num == 0) {
				perm = Equipment1_label_1;
			}
			else if(num == 1) {
				perm = Equipment2_label_1;
			}
			else if(num == 2) {
				perm = Equipment3_label_1;
			}
			
		}
		
		return perm;
	}
	
	private static JLabel getNumberLabel(UI.Player player, int num) {
		
		JLabel perm = null;
		
		if(player == UI.Player.PLAYER1) {
			if(num == 0) {
				perm = Equipment1Number_label;
			}
			else if(num == 1) {
				perm = Equipment2Number_label;
			}
			else if(num == 2) {
				perm = Equipment3Number_label;
			}
		}
		
		if(player == UI.Player.PLAYER2) {
			if(num == 0) {
				perm = Equipment1Number_label_1;
			}
			else if(num == 1) {
				perm = Equipment2Number_label_1;
			}
			else if(num == 2) {
				perm = Equipment3Number_label_1;
			}
		}
		
		return perm;
	}
	
	private static int getIndexOfEq(UI.Player player,UI.Collectable type) {
		int num = -1;
		
		if(player == UI.Player.PLAYER1) {
			for(Collectable c:equipments1) {
				if(c == type) {
					num = equipments1.indexOf(c);
				}
			}
		}
		
		if(player == UI.Player.PLAYER2) {
			for(Collectable c:equipments2) {
				if(c == type) {
					num = equipments2.indexOf(c);
				}
			}
		}
		
		return num;
	}
	
	public static void decreaseGlove(UI.Player player) {
		
		JLabel perm = null;
		
		int num = getIndexOfEq(player,UI.Collectable.GLOVE);
		
		if(num == -1) {
			return;
		}
		
		perm = getNumberLabel(player,num);
		
		if(perm != null) {
			
			int value = Integer.parseInt(perm.getText());
			value--;
			perm.setText(String.valueOf(value));
			
				perm.setVisible(true);
			
		}
		
		
	}
	
	public static void addEquipment(UI.Collectable type,UI.Player player) {
		
		JLabel perm = null;
		JLabel number = null;
		

				if(player == UI.Player.PLAYER1) {
					perm = getEqLabel(player, equipments1.size());
					number = getNumberLabel(player, equipments1.size());
					equipments1.add(type);
				}
				if(player == UI.Player.PLAYER2) {
					perm = getEqLabel(player, equipments2.size());
					number = getNumberLabel(player, equipments2.size());
					equipments2.add(type);
				}
				
				
				switch(type) {
					case AXE:
						{ perm.setIcon(DesignPatterns.axe);
							break;
						}
					case CLOAK:
						{ perm.setIcon(DesignPatterns.cloack);
							break;
						}
					case BAG:
					{ perm.setIcon(DesignPatterns.bag);
						break;
					}
					
					case GLOVE:
					{ perm.setIcon(DesignPatterns.glove);
						GloveNumber_label = number;
						number.setVisible(true);
						setCounter(number, 3);
						break;
					}
				}
	}
	
	public static void addGeneticCode(UI.Collectable type,UI.Player player) {
		switch(type) {
			case DANCE_GC:
			{
				if(player == UI.Player.PLAYER1) {
					DanceVirusGC_label.setEnabled(true);
				}
				if(player == UI.Player.PLAYER2) {
					DanceVirusGC_label_1.setEnabled(true);
				}
				
				break;
				
			}
			case VACCINE_GC:
			{
				if(player == UI.Player.PLAYER1) {
					VaccineGC_label.setEnabled(true);
				}
				if(player == UI.Player.PLAYER2) {
					VaccineGC_label_1.setEnabled(true);
				}
				
				break;
				
			}
			case OBLIVION_GC:
			{
				if(player == UI.Player.PLAYER1) {
					OblivionVirusGC_label.setEnabled(true);
				}
				if(player == UI.Player.PLAYER2) {
					OblivionVirusGC_label_1.setEnabled(true);
				}
				
				break;
			}
			
			case PARALYSES_GC:
			{
				if(player == UI.Player.PLAYER1) {
					ParalysesVirusGC_label.setEnabled(true);
				}
				if(player == UI.Player.PLAYER2) {
					ParalysesVirusGC_label_1.setEnabled(true);
				}
				
				break;
				
			}
		}
	}

	public static void setAgentNumber(UI.Collectable type,UI.Player player, int num) {
		
		switch(type) {
		case DANCE:
		{
			if(player == UI.Player.PLAYER1) {
				 setCounter(DanceVirusNumber_label,num);

				 if(num == 0) {
					 DanceVirus_label.setEnabled(false);
				 }
				 else {
					 DanceVirus_label.setEnabled(true);
				 }
			}
			if(player == UI.Player.PLAYER2) {
				 setCounter(DanceVirusNumber_label_1,num);
				 if(num == 0) {
					 DanceVirus_label_1.setEnabled(false);
				 }
				 else {
					 DanceVirus_label_1.setEnabled(true);
				 }
			}
			
			break;
		}
		case VACCINE:
		{
			if(player == UI.Player.PLAYER1) {
				 setCounter(VaccineNumber_label,num);
				 if(num == 0) {
					 Vaccine_label.setEnabled(false);
				 }
				 else {
					 Vaccine_label.setEnabled(true);
				 }
			}
			if(player == UI.Player.PLAYER2) {
				 setCounter(VaccineNumber_label_1,num);
				 if(num == 0) {
					 Vaccine_label_1.setEnabled(false);
				 }
				 else {
					 Vaccine_label_1.setEnabled(true);
				 }
			}
			
			break;
		}
		case OBLIVION:
		{
			if(player == UI.Player.PLAYER1) {
				 setCounter(OblivionVirusNumber_label,num);
				 if(num == 0) {
					 OblivionVirus_label.setEnabled(false);
				 }
				 else {
					 OblivionVirus_label.setEnabled(true);
				 }
			}
			if(player == UI.Player.PLAYER2) {
				 setCounter(OblivionVirusNumber_label_1,num);
				 if(num == 0) {
					 OblivionVirus_label_1.setEnabled(false);
				 }
				 else {
					 OblivionVirus_label_1.setEnabled(true);
				 }
			}
			
			break;
		}
		
		case PARALYSES:
		{
			if(player == UI.Player.PLAYER1) {
				 setCounter(ParalysesVirusNumber_label,num);
				 if(num == 0) {
					 ParalysesVirus_label.setEnabled(false);
				 }
				 else {
					 ParalysesVirus_label.setEnabled(true);
				 }
			}
			if(player == UI.Player.PLAYER2) {
				 setCounter(ParalysesVirusNumber_label_1,num);
				 if(num == 0) {
					 ParalysesVirus_label_1.setEnabled(false);
				 }
				 else {
					 ParalysesVirus_label_1.setEnabled(true);
				 }
			}
			
			break;
		}
		}

	}
	
	public static void enableGCorAgent(JLabel label,boolean flag) {
		if(flag) {
			label.setEnabled(true);
			return;
		}
		
		label.setEnabled(false);
	}
	
	public static void setCounter(JLabel label, int newValue) {

			label.setText(String.valueOf(newValue));
			
			if(label.getText().equals("0")) {
				label.setVisible(false);
			}
			else {
				label.setVisible(true);
			}
	}
	
	public static void setSelected(JPanel panel,boolean flag) {
		if(flag) {
			panel.setBorder(new LineBorder(DesignPatterns.blue, 2));
			return;
		}
		
		panel.setBorder(null);
	}
	
	public static void selectfirstAgent(UI.Player player){
		
		resetSelectionAgent(player);
		
		if(player == UI.Player.PLAYER1) {
			selectedAgent1 = 0;
			setSelected(Vaccine_panel,true);
			
		}
		if(player == UI.Player.PLAYER2) {
			selectedAgent2 = 0;
			setSelected(Vaccine_panel_1,true);
		}
		
	}
	
	public static void selectfirstEquipment(UI.Player player){
		
		resetSelectionEquipment(player);
		
		if(player == UI.Player.PLAYER1) {
			selectedEquipment1 = 1;
			setSelected(Equipment1_panel,true);
			
		}
		if(player == UI.Player.PLAYER2) {
			selectedEquipment2 = 1;
			setSelected(Equipment1_panel_1,true);
		}
		
	}
	
	public static UI.Collectable getSelectedAgent(UI.Player player){
		if(player == UI.Player.PLAYER1) {
			return getAgentByIndex(selectedAgent1);
		}
		
		if(player == UI.Player.PLAYER2) {
			return getAgentByIndex(selectedAgent2);
		}
		
		return null;
	}

	private static UI.Collectable getAgentByIndex(int index) {

			 switch(index) {
			 case 0:
				 return UI.Collectable.VACCINE;
			 case 1:
				 return UI.Collectable.DANCE;
			 case 2:
				 return UI.Collectable.OBLIVION;
			 case 3:
				 return UI.Collectable.PARALYSES;
			 }
			 
			 return null;
			
		
	 }

	private static JPanel getAgentPanelByIndex(UI.Player player, int index) {
		 if(player == UI.Player.PLAYER1) {
				
			 switch(index) {
			 case 0:
				 return Vaccine_panel;
			 case 1:
				 return DanceVirus_panel;
			 case 2:
				 return OblivionVirus_panel;
			 case 3:
				 return ParalysesVirus_panel;
			 }
			 
			 return null;
			 
		}
		 
		 
		 
		 if(player == UI.Player.PLAYER2) {
				
			 switch(index) {
			 case 0:
				 return Vaccine_panel_1;
			 case 1:
				 return DanceVirus_panel_1;
			 case 2:
				 return OblivionVirus_panel_1;
			 case 3:
				 return ParalysesVirus_panel_1;
			 }
			 
		}
		 
		 return null;
	 }
	 
	private static JPanel getEquipmentPanelByIndex(UI.Player player, int index) {
		 if(player == UI.Player.PLAYER1) {
				
			 switch(index) {
			 case 0:
				 return Equipment1_panel;
			 case 1:
				 return Equipment2_panel;
			 case 2:
				 return Equipment3_panel;
			 }
		 }
		 
		 if(player == UI.Player.PLAYER2) {
				
			 switch(index) {
			 case 0:
				 return Equipment1_panel_1;
			 case 1:
				 return Equipment2_panel_1;
			 case 2:
				 return Equipment3_panel_1;
			 }
		 }
		 
		 return null;
			 
		}
	
	public static void selectNextAgent(UI.Player player){
		resetSelectionAgent(player);
		
		if(player == UI.Player.PLAYER1) {
			selectedAgent1++;
			if(selectedAgent1 == 4)
				selectedAgent1 = 0;
			setSelected(getAgentPanelByIndex(player,selectedAgent1),true);
			
		}
		
		if(player == UI.Player.PLAYER2) {
			selectedAgent2++;
			if(selectedAgent2 == 4)
				selectedAgent2 = 0;
			setSelected(getAgentPanelByIndex(player,selectedAgent2),true);
		}
		
	}
	
	
	public static UI.Collectable getSelectedEquipment(UI.Player player){
		if(player == UI.Player.PLAYER1) {
			return equipments1.get(selectedEquipment1);
		}
		
		if(player == UI.Player.PLAYER2) {
			return equipments1.get(selectedEquipment2);
			
		} 
		
		return null;
	}
	
	
	public static void selectNextEquipment(UI.Player player){
		resetSelectionAgent(player);
		
		if(player == UI.Player.PLAYER1) {
			selectedEquipment1++;
			if(selectedEquipment1 == 3)
				selectedEquipment1 = 0;
			setSelected(getEquipmentPanelByIndex(player,selectedEquipment1),true);
			
		}
		
		if(player == UI.Player.PLAYER2) {
			selectedEquipment2++;
			if(selectedEquipment2 == 3)
				selectedEquipment2 = 0;
			setSelected(getEquipmentPanelByIndex(player,selectedEquipment2),true);
			
		}
	}
	
	static void resetSelectionAgent(UI.Player player){
		if(player == UI.Player.PLAYER1) {
			setSelected(Vaccine_panel,false);
			setSelected(DanceVirus_panel,false);
			setSelected(OblivionVirus_panel,false);
			setSelected(ParalysesVirus_panel,false);
		}
		if(player == UI.Player.PLAYER2) {
			setSelected(Vaccine_panel_1,false);
			setSelected(DanceVirus_panel_1,false);
			setSelected(OblivionVirus_panel_1,false);
			setSelected(ParalysesVirus_panel_1,false);
		}
		
	}
	
	static void resetSelectionEquipment(UI.Player player){
		
		if(player == UI.Player.PLAYER1) {
			setSelected(Equipment1_panel,false);
			setSelected(Equipment2_panel,false);
			setSelected(Equipment3_panel,false);
		}
		if(player == UI.Player.PLAYER2) {
			setSelected(Equipment1_panel_1,false);
			setSelected(Equipment2_panel_1,false);
			setSelected(Equipment3_panel_1,false);
		}
		
		

	}
	
	public static void dropEquipment(UI.Player player, UI.Collectable type) {

		
		if(player == UI.Player.PLAYER1) {
			if(!equipments1.contains(type)) {
				return;
			}
			
			int index = equipments1.indexOf(type);
			
			switch(index) {
				case 0:{
					Equipment1_label.setIcon(Equipment2_label.getIcon());
					setCounter(Equipment1Number_label,Integer.parseInt(Equipment2Number_label.getText()));
					Equipment2_label.setIcon(Equipment3_label.getIcon());
					setCounter(Equipment2Number_label,Integer.parseInt(Equipment3Number_label.getText()));
					Equipment3_label.setIcon(null);
					Equipment3Number_label.setVisible(false);
					
				}
				case 1:{
					Equipment2_label.setIcon(Equipment3_label.getIcon());
					setCounter(Equipment2Number_label,Integer.parseInt(Equipment3Number_label.getText()));
					Equipment3_label.setIcon(null);
					Equipment3Number_label.setVisible(false);
				}
				case 2:{
					Equipment3_label.setIcon(null);
					Equipment3Number_label.setVisible(false);
				}
				
			}

			equipments1.remove(index);
			
		}
		
		if(player == UI.Player.PLAYER2) {
			if(!equipments2.contains(type)) {
				return;
			}
			
			int index = equipments2.indexOf(type);
			
			switch(index) {
				case 0:{
					Equipment1_label_1.setIcon(Equipment2_label_1.getIcon());
					Equipment1Number_label_1.setVisible(Equipment2Number_label_1.isVisible());
					setCounter(Equipment1Number_label_1,Integer.parseInt(Equipment2Number_label_1.getText()));
					Equipment2_label_1.setIcon(Equipment3_label_1.getIcon());
					setCounter(Equipment2Number_label_1,Integer.parseInt(Equipment3Number_label_1.getText()));
					Equipment2Number_label_1.setVisible(Equipment3Number_label_1.isVisible());
					Equipment3_label_1.setIcon(null);
					Equipment3Number_label_1.setVisible(false);
					break;
					
				}
				case 1:{
					Equipment2_label_1.setIcon(Equipment3_label_1.getIcon());
					setCounter(Equipment2Number_label_1,Integer.parseInt(Equipment3Number_label_1.getText()));
					Equipment3_label_1.setIcon(null);
					Equipment3Number_label_1.setVisible(false);
					break;
				}
				case 2:{
					Equipment3_label_1.setIcon(null);
					Equipment3Number_label_1.setVisible(false);
					break;
				}
				
			} 
			
			

			equipments2.remove(index);
			
		}
	}

	public static void forgetAllGeneticCode(UI.Player player) {
		if(player == UI.Player.PLAYER1) {
			DanceVirusGC_label.setEnabled(false);
			VaccineGC_label.setEnabled(false);
			OblivionVirusGC_label.setEnabled(false);
			ParalysesVirusGC_label.setEnabled(false);
		}
		if(player == UI.Player.PLAYER2) {
			DanceVirusGC_label_1.setEnabled(false);
			VaccineGC_label_1.setEnabled(false);
			OblivionVirusGC_label_1.setEnabled(false);
			ParalysesVirusGC_label_1.setEnabled(false);
		}
	}
}
