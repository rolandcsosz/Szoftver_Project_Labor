package UI.Components;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;

import UI.DesignPatterns;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Panel extends JPanel {
	
	
	JLabel Vaccine_label;
	private JLabel OblivionVirusNumber_label;
	private JLabel ParalysesVirusNumber_label;

	/**
	 * Create the panel.
	 */
	public Panel() {

		this.setBounds(0, 490, 1200, 130);
		this.setBackground(DesignPatterns.grey);
		this.setLayout(null);
		
		JLabel Equipment3Number_label = new JLabel("0");
		Equipment3Number_label.setFont(DesignPatterns.robotoMono12);
		Equipment3Number_label.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment3Number_label.setOpaque(true);
		Equipment3Number_label.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment3Number_label.setForeground(Color.WHITE);
		Equipment3Number_label.setBackground(new Color(69, 105, 144));
		Equipment3Number_label.setBounds(336, 43, 14, 14);
		add(Equipment3Number_label);
		
		JLabel Equipment2Number_label = new JLabel("0");
		Equipment2Number_label.setFont(DesignPatterns.robotoMono12);
		Equipment2Number_label.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment2Number_label.setOpaque(true);
		Equipment2Number_label.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment2Number_label.setForeground(Color.WHITE);
		Equipment2Number_label.setBackground(new Color(69, 105, 144));
		Equipment2Number_label.setBounds(289, 43, 14, 14);
		add(Equipment2Number_label);
		
		JLabel Equipment1Number_label = new JLabel("0");
		Equipment1Number_label.setFont(DesignPatterns.robotoMono12);
		Equipment1Number_label.setOpaque(true);
		Equipment1Number_label.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment1Number_label.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment1Number_label.setForeground(Color.WHITE);
		Equipment1Number_label.setBackground(new Color(69, 105, 144));
		Equipment1Number_label.setBounds(242, 43, 14, 14);
		add(Equipment1Number_label);
		
		JPanel Equipment1_panel = new JPanel();
		Equipment1_panel.setBackground(new Color(220, 220, 220));
		Equipment1_panel.setBounds(212, 20, 37, 37);
		this.add(Equipment1_panel);
		Equipment1_panel.setLayout(null);
		
		JLabel Equipment1_label = new JLabel();
		Equipment1_label.setEnabled(false);
		Equipment1_label.setBounds(1, 1, 35, 35);
		Equipment1_panel.add(Equipment1_label);
		
		JLabel VaccineNumber_label = new JLabel("0");
		VaccineNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		VaccineNumber_label.setVerticalAlignment(SwingConstants.BOTTOM);
		VaccineNumber_label.setFont(DesignPatterns.robotoMono12);
		VaccineNumber_label.setBounds(40, 105, 14, 14);
		add(VaccineNumber_label);
		VaccineNumber_label.setOpaque(true);
		VaccineNumber_label.setBackground(DesignPatterns.blue);
		VaccineNumber_label.setForeground(Color.WHITE);
		
		JLabel DanceVirusNumber_label = new JLabel("0");
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
		ParalysesVirusNumber_label.setHorizontalAlignment(SwingConstants.CENTER);
		ParalysesVirusNumber_label.setVerticalAlignment(SwingConstants.BOTTOM);
		ParalysesVirusNumber_label.setFont(DesignPatterns.robotoMono12);
		ParalysesVirusNumber_label.setOpaque(true);
		ParalysesVirusNumber_label.setForeground(Color.WHITE);
		ParalysesVirusNumber_label.setBackground(new Color(69, 105, 144));
		ParalysesVirusNumber_label.setBounds(183, 105, 14, 14);
		add(ParalysesVirusNumber_label);
		
		
		
		JPanel VaccineGC_panel = new JPanel();
		VaccineGC_panel.setBounds(10, 20, 37, 37);
		VaccineGC_panel.setBackground(DesignPatterns.lightGrey);
		this.add(VaccineGC_panel);
		VaccineGC_panel.setLayout(null);
		
		JLabel VaccineGC_label = new JLabel();
		VaccineGC_label.setIcon(DesignPatterns.vaccineGC);
		VaccineGC_label.setBounds(1, 1, 35, 35);
		VaccineGC_panel.add(VaccineGC_label);
		
		JPanel DanceVirusGC_panel = new JPanel();
		DanceVirusGC_panel.setBackground(new Color(220, 220, 220));
		DanceVirusGC_panel.setBounds(57, 20, 37, 37);
		this.add(DanceVirusGC_panel);
		DanceVirusGC_panel.setLayout(null);
		
		JLabel DanceVirusGC_label = new JLabel();
		DanceVirusGC_label.setBounds(1, 1, 35, 35);
		DanceVirusGC_label.setIcon(DesignPatterns.danceVirusGC);
		DanceVirusGC_panel.add(DanceVirusGC_label);
		
		Vaccine_label = new JLabel();
		Vaccine_label.setEnabled(false);
		Vaccine_label.setBounds(0, 0, 35, 35);
		Vaccine_label.setIcon(DesignPatterns.vaccine);
		
		JPanel Vaccine_panel = new JPanel();
		Vaccine_panel.setBackground(new Color(220, 220, 220));
		Vaccine_panel.setBounds(10, 75, 37, 37);
		Vaccine_panel.setLayout(null);
		Vaccine_panel.add(Vaccine_label);
		this.add(Vaccine_panel);
		
		
		JLabel DanceVirus_label = new JLabel();
		DanceVirus_label.setBounds(1, 1, 35, 35);
		DanceVirus_label.setIcon(DesignPatterns.danceVirus); 
		
		JPanel DanceVirus_panel = new JPanel();
		DanceVirus_panel.setBackground(new Color(220, 220, 220));
		DanceVirus_panel.setBounds(57, 75, 37, 37);
		DanceVirus_panel.setLayout(null);
		DanceVirus_panel.add(DanceVirus_label);
		this.add(DanceVirus_panel);
		
		JLabel OblivionVirus_label = new JLabel();
		OblivionVirus_label.setEnabled(false);
		OblivionVirus_label.setBounds(1, 1, 35, 35);
		OblivionVirus_label.setIcon(DesignPatterns.oblivionVirus); 
		
		JPanel OblivionVirus_panel = new JPanel();
		OblivionVirus_panel.setBackground(new Color(220, 220, 220));
		OblivionVirus_panel.setBounds(104, 75, 37, 37);
		OblivionVirus_panel.setLayout(null);
		OblivionVirus_panel.add(OblivionVirus_label);
		this.add(OblivionVirus_panel);
		
		JLabel ParalysesVirus_label = new JLabel();
		ParalysesVirus_label.setEnabled(false);
		ParalysesVirus_label.setBounds(1, 1, 35, 35);
		ParalysesVirus_label.setIcon(DesignPatterns.paralyseVirus); 
		
		JPanel ParalysesVirus_panel = new JPanel();
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
		
		JLabel OblivionVirusGC_label = new JLabel();
		OblivionVirusGC_label.setEnabled(false);
		OblivionVirusGC_label.setBounds(1, 1, 35, 35);
		OblivionVirusGC_label.setIcon(DesignPatterns.oblivionVirusGC);
		OblivionVirusGC_panel.add(OblivionVirusGC_label);
		
		JPanel ParalysesVirusGC_panel = new JPanel();
		ParalysesVirusGC_panel.setBackground(new Color(220, 220, 220));
		ParalysesVirusGC_panel.setBounds(151, 20, 37, 37);
		this.add(ParalysesVirusGC_panel);
		ParalysesVirusGC_panel.setLayout(null);
		
		JLabel ParalysesVirusGC_label = new JLabel();
		ParalysesVirusGC_label.setEnabled(false);
		ParalysesVirusGC_label.setBounds(1, 1, 35, 35);
		ParalysesVirusGC_label.setIcon(DesignPatterns.paralysesVirusGC); 
		ParalysesVirusGC_panel.add(ParalysesVirusGC_label);
		
		JPanel Equipment2_panel = new JPanel();
		Equipment2_panel.setBackground(new Color(220, 220, 220));
		Equipment2_panel.setBounds(259, 20, 37, 37);
		this.add(Equipment2_panel);
		Equipment2_panel.setLayout(null);
		
		JLabel Equipment2_label = new JLabel();
		Equipment2_label.setEnabled(false);
		Equipment2_label.setBounds(1, 1, 35, 35);
		Equipment2_panel.add(Equipment2_label);
		
		JPanel Equipment3_panel = new JPanel();
		Equipment3_panel.setBackground(new Color(220, 220, 220));
		Equipment3_panel.setBounds(306, 20, 37, 37);
		this.add(Equipment3_panel);
		Equipment3_panel.setLayout(null);
		
		JLabel Equipment3_label = new JLabel();
		Equipment3_label.setEnabled(false);
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
		
		JLabel ActualEffect_label = new JLabel();
		ActualEffect_label.setEnabled(false);
		ActualEffect_label.setBounds(1, 1, 35, 35);
		ActualEffect_panel.add(ActualEffect_label);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(212, 92, 84, 5);
		progressBar.setBorder(null);
		progressBar.setBackground(DesignPatterns.lightGrey);
		progressBar.setForeground(DesignPatterns.blue);
		progressBar.setMaximum(0);
		progressBar.setMaximum(100);
		progressBar.setValue(40);
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
		
		JLabel MaterialCount_label = new JLabel("0/100");
		MaterialCount_label.setFont(null);
		MaterialCount_label.setBounds(365, 80, 116, 17);
		MaterialCount_label.setFont(DesignPatterns.robotoMono14);
		this.add(MaterialCount_label);
		
		JLabel VaccineNumber_label_1 = new JLabel("0");
		VaccineNumber_label_1.setFont(DesignPatterns.robotoMono12);
		VaccineNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		VaccineNumber_label_1.setOpaque(true);
		VaccineNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		VaccineNumber_label_1.setForeground(Color.WHITE);
		VaccineNumber_label_1.setBackground(new Color(69, 105, 144));
		VaccineNumber_label_1.setBounds(1019, 105, 14, 14);
		add(VaccineNumber_label_1);
		
		JLabel DanceVirusNumber_label_1 = new JLabel("0");
		DanceVirusNumber_label_1.setFont(DesignPatterns.robotoMono12);
		DanceVirusNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		DanceVirusNumber_label_1.setOpaque(true);
		DanceVirusNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		DanceVirusNumber_label_1.setForeground(Color.WHITE);
		DanceVirusNumber_label_1.setBackground(new Color(69, 105, 144));
		DanceVirusNumber_label_1.setBounds(1066, 105, 14, 14);
		add(DanceVirusNumber_label_1);
		
		JLabel OblivionVirusNumber_label_1 = new JLabel("0");
		OblivionVirusNumber_label_1.setFont(DesignPatterns.robotoMono12);
		OblivionVirusNumber_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		OblivionVirusNumber_label_1.setOpaque(true);
		OblivionVirusNumber_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		OblivionVirusNumber_label_1.setForeground(Color.WHITE);
		OblivionVirusNumber_label_1.setBackground(new Color(69, 105, 144));
		OblivionVirusNumber_label_1.setBounds(1114, 105, 14, 14);
		add(OblivionVirusNumber_label_1);
		
		JLabel ParalysesVirusNumber_label_1 = new JLabel("0");
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
		
		JLabel VaccineGC_label_1 = new JLabel();
		VaccineGC_label_1.setBounds(1, 1, 35, 35);
		VaccineGC_label_1.setIcon(DesignPatterns.vaccineGC);
		VaccineGC_panel_1.add(VaccineGC_label_1);
		
		JPanel DanceVirusGC_panel_1 = new JPanel();
		DanceVirusGC_panel_1.setLayout(null);
		DanceVirusGC_panel_1.setBackground(new Color(220, 220, 220));
		DanceVirusGC_panel_1.setBounds(1036, 20, 37, 37);
		add(DanceVirusGC_panel_1);
		
		JLabel DanceVirusGC_label_1 = new JLabel();
		DanceVirusGC_label_1.setBounds(1, 1, 35, 35);
		DanceVirusGC_label_1.setIcon(DesignPatterns.danceVirusGC);
		DanceVirusGC_panel_1.add(DanceVirusGC_label_1);
		
		JPanel Vaccine_panel_1 = new JPanel();
		Vaccine_panel_1.setLayout(null);
		Vaccine_panel_1.setBackground(new Color(220, 220, 220));
		Vaccine_panel_1.setBounds(989, 75, 37, 37);
		add(Vaccine_panel_1);
		
		JLabel Vaccine_label_1 = new JLabel();
		Vaccine_label_1.setEnabled(false);
		Vaccine_label_1.setBounds(0, 0, 35, 35);
		Vaccine_label_1.setIcon(DesignPatterns.vaccine);
		Vaccine_panel_1.add(Vaccine_label_1);
		
		JPanel DanceVirus_panel_1 = new JPanel();
		DanceVirus_panel_1.setLayout(null);
		DanceVirus_panel_1.setBackground(new Color(220, 220, 220));
		DanceVirus_panel_1.setBounds(1036, 75, 37, 37);
		add(DanceVirus_panel_1);
		
		JLabel DanceVirus_label_1 = new JLabel();
		DanceVirus_label_1.setBounds(1, 1, 35, 35);
		DanceVirus_label_1.setIcon(DesignPatterns.danceVirus); 
		DanceVirus_panel_1.add(DanceVirus_label_1);
		
		JPanel OblivionVirus_panel_1 = new JPanel();
		OblivionVirus_panel_1.setLayout(null);
		OblivionVirus_panel_1.setBackground(new Color(220, 220, 220));
		OblivionVirus_panel_1.setBounds(1083, 75, 37, 37);
		add(OblivionVirus_panel_1);
		
		JLabel OblivionVirus_label_1 = new JLabel();
		OblivionVirus_label_1.setEnabled(false);
		OblivionVirus_label_1.setBounds(1, 1, 35, 35);
		OblivionVirus_label_1.setIcon(DesignPatterns.oblivionVirus); 
		OblivionVirus_panel_1.add(OblivionVirus_label_1);
		
		JPanel ParalysesVirus_panel_1 = new JPanel();
		ParalysesVirus_panel_1.setLayout(null);
		ParalysesVirus_panel_1.setBackground(new Color(220, 220, 220));
		ParalysesVirus_panel_1.setBounds(1130, 75, 37, 37);
		add(ParalysesVirus_panel_1);
		
		JLabel ParalysesVirus_label_1 = new JLabel();
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
		
		JLabel OblivionVirusGC_label_1 = new JLabel();
		OblivionVirusGC_label_1.setEnabled(false);
		OblivionVirusGC_label_1.setBounds(1, 1, 35, 35);
		OblivionVirusGC_label_1.setIcon(DesignPatterns.oblivionVirusGC);
		OblivionVirusGC_panel_1.add(OblivionVirusGC_label_1);
		
		JPanel ParalysesVirusGC_panel_1 = new JPanel();
		ParalysesVirusGC_panel_1.setLayout(null);
		ParalysesVirusGC_panel_1.setBackground(new Color(220, 220, 220));
		ParalysesVirusGC_panel_1.setBounds(1130, 20, 37, 37);
		add(ParalysesVirusGC_panel_1);
		
		JLabel ParalysesVirusGC_label_1 = new JLabel();
		ParalysesVirusGC_label_1.setEnabled(false);
		ParalysesVirusGC_label_1.setBounds(1, 1, 35, 35);
		ParalysesVirusGC_label_1.setIcon(DesignPatterns.paralysesVirusGC);
		ParalysesVirusGC_panel_1.add(ParalysesVirusGC_label_1);
		
		JLabel Equipment3Number_label_1 = new JLabel("0");
		Equipment3Number_label_1.setFont(DesignPatterns.robotoMono12);
		Equipment3Number_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment3Number_label_1.setOpaque(true);
		Equipment3Number_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment3Number_label_1.setForeground(Color.WHITE);
		Equipment3Number_label_1.setBackground(new Color(69, 105, 144));
		Equipment3Number_label_1.setBounds(960, 43, 14, 14);
		add(Equipment3Number_label_1);
		
		JLabel Equipment2Number_label_1 = new JLabel("0");
		Equipment2Number_label_1.setFont(DesignPatterns.robotoMono12);
		Equipment2Number_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment2Number_label_1.setOpaque(true);
		Equipment2Number_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment2Number_label_1.setForeground(Color.WHITE);
		Equipment2Number_label_1.setBackground(new Color(69, 105, 144));
		Equipment2Number_label_1.setBounds(913, 43, 14, 14);
		add(Equipment2Number_label_1);
		
		JLabel Equipment1Number_label_1 = new JLabel("0");
		Equipment1Number_label_1.setFont(DesignPatterns.robotoMono12);
		Equipment1Number_label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		Equipment1Number_label_1.setOpaque(true);
		Equipment1Number_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		Equipment1Number_label_1.setForeground(Color.WHITE);
		Equipment1Number_label_1.setBackground(new Color(69, 105, 144));
		Equipment1Number_label_1.setBounds(866, 43, 14, 14);
		add(Equipment1Number_label_1);
		
		JPanel Equipment1_panel_1 = new JPanel();
		Equipment1_panel_1.setLayout(null);
		Equipment1_panel_1.setBackground(new Color(220, 220, 220));
		Equipment1_panel_1.setBounds(836, 20, 37, 37);
		add(Equipment1_panel_1);
		
		JLabel Equipment1_label_1 = new JLabel();
		Equipment1_label_1.setEnabled(false);
		Equipment1_label_1.setBounds(1, 1, 35, 35);
		Equipment1_panel_1.add(Equipment1_label_1);
		
		JPanel Equipment2_panel_1 = new JPanel();
		Equipment2_panel_1.setLayout(null);
		Equipment2_panel_1.setBackground(new Color(220, 220, 220));
		Equipment2_panel_1.setBounds(883, 20, 37, 37);
		add(Equipment2_panel_1);
		
		JLabel Equipment2_label_1 = new JLabel();
		Equipment2_label_1.setEnabled(false);
		Equipment2_label_1.setBounds(1, 1, 35, 35);
		Equipment2_panel_1.add(Equipment2_label_1);
		
		JPanel Equipment3_panel_1 = new JPanel();
		Equipment3_panel_1.setLayout(null);
		Equipment3_panel_1.setBackground(new Color(220, 220, 220));
		Equipment3_panel_1.setBounds(930, 20, 37, 37);
		add(Equipment3_panel_1);
		
		JLabel Equipment3_label_1 = new JLabel();
		Equipment3_label_1.setEnabled(false);
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
		ActualEffect_panel_1.setLayout(null);
		ActualEffect_panel_1.setBackground(new Color(220, 220, 220));
		ActualEffect_panel_1.setBounds(930, 75, 37, 37);
		add(ActualEffect_panel_1);
		
		JLabel ActualEffect_label_1 = new JLabel();
		ActualEffect_label_1.setEnabled(false);
		ActualEffect_label_1.setBounds(1, 1, 35, 35);
		ActualEffect_panel_1.add(ActualEffect_label_1);
		
		JProgressBar progressBar_1 = new JProgressBar();
		progressBar_1.setValue(40);
		progressBar_1.setMaximum(0);
		progressBar_1.setForeground(new Color(69, 105, 144));
		progressBar_1.setBorder(null);
		progressBar_1.setBackground(new Color(220, 220, 220));
		progressBar_1.setBounds(836, 92, 84, 5);
		add(progressBar_1);
		
		JLabel PlayerName_label_1 = new JLabel("Player 2");
		PlayerName_label_1.setFont(null);
		PlayerName_label_1.setFont(DesignPatterns.robotoMono20);
		PlayerName_label_1.setBounds(714, 11, 149, 36);
		add(PlayerName_label_1);
		
		JLabel MaterialLevel_label_1 = new JLabel("Material level");
		MaterialLevel_label_1.setFont(null);
		MaterialLevel_label_1.setBounds(717, 58, 116, 17);
		MaterialLevel_label_1.setFont(DesignPatterns.robotoMono12);
		add(MaterialLevel_label_1);
		
		JLabel MaterialCount_label_1 = new JLabel("0/100");
		MaterialCount_label_1.setFont(null);
		MaterialCount_label_1.setBounds(717, 80, 116, 17);
		MaterialCount_label_1.setFont(DesignPatterns.robotoMono14);
		add(MaterialCount_label_1);
		
	
		



	}
	
	public void enableVaccine() {
		Vaccine_label.disable();
	}
}
