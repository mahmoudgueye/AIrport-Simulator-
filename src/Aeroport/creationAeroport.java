package Aeroport;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;
import java.awt.Button;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;

public class creationAeroport extends JFrame {
	private JTextField tFAeroNom;
	private JTextField textField;
	private JTextField tFnbreTerm;
	private JPanel panel_1;
	private JPanel panel; 
	private JFrame frame;
	private  String aeroNom;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBox= new JComboBox(); 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					creationAeroport frame = new creationAeroport();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public creationAeroport() {
		getContentPane().setLayout(new CardLayout(0, 0));
		
		 panel = new JPanel();
		getContentPane().add(panel, "name_2003882822053204");
		panel.setLayout(null);
		
		 panel_1 = new JPanel();
		getContentPane().add(panel_1, "name_2003886186680804");
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		getContentPane().add(panel_2, "name_2010351410036945");
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		getContentPane().add(panel_3, "name_2039517720248807");
		
		
		JLabel lblMyAirport = new JLabel("AIMS");
		lblMyAirport.setFont(new Font("Snap ITC", Font.BOLD | Font.ITALIC, 18));
		lblMyAirport.setBounds(202, 11, 201, 24);
		panel.add(lblMyAirport);
		
		JLabel lblNomDeLaroport = new JLabel("Nom de l'a\u00E9roport");
		lblNomDeLaroport.setBounds(36, 88, 138, 14);
		panel.add(lblNomDeLaroport);
		
		JLabel tVAeroNom = new JLabel("New label");
		tVAeroNom.setBounds(329, 20, 46, 14);
		panel_1.add(tVAeroNom);
		
		tFAeroNom = new JTextField();
		tFAeroNom.setBounds(184, 85, 86, 20);
		panel.add(tFAeroNom);
		tFAeroNom.setColumns(10);
		aeroNom = tFAeroNom.getText();
		System.out.println(aeroNom);
		
		JLabel lblNombreDePistes = new JLabel("Nombre de pistes");
		lblNombreDePistes.setBounds(36, 130, 108, 14);
		panel.add(lblNombreDePistes);
		
		textField = new JTextField();
		textField.setBounds(184, 127, 86, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btnFinish = new JButton("Terminer");
		btnFinish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			panel.setVisible(false);
			}
		});
		btnFinish.setBounds(345, 227, 89, 23);
		panel.add(btnFinish);
		
		JButton btnNext = new JButton("Ajouter un nouveau terminal");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tVAeroNom.setText(aeroNom);
				panel_1.setVisible(true);
				panel.setVisible(false);
				System.out.println(aeroNom);
			}
		});
		btnNext.setBounds(150, 227, 190, 23);
		panel.add(btnNext);
		
		JButton btnCancel = new JButton("Annuler");
		btnCancel.setBounds(10, 227, 89, 23);
		panel.add(btnCancel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		rdbtnNewRadioButton.setBounds(115, 151, 109, 23);
		panel.add(rdbtnNewRadioButton);
		
		String [] sa = {"a", "v"}; 
		comboBox= new JComboBox(sa);
		comboBox.setBounds(52, 49, 28, 20);
		panel.add(comboBox);
		
		
		
		JLabel lblTerminalsDeLaroport = new JLabel("Terminals de l'a\u00E9roport");
		lblTerminalsDeLaroport.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblTerminalsDeLaroport.setBounds(47, 11, 328, 33);
		panel_1.add(lblTerminalsDeLaroport);
		
		JLabel lblNombreDeTerminals = new JLabel("Nom du terminal");
		lblNombreDeTerminals.setBounds(10, 74, 109, 14);
		panel_1.add(lblNombreDeTerminals);
	
		
		JButton btnFinish_1 = new JButton("Finish");
		btnFinish_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_1.setVisible(false);
			}
		});
		btnFinish_1.setBounds(335, 227, 89, 23);
		panel_1.add(btnFinish_1);
		
		JButton btnNextTerm = new JButton("Ajouter une porte d'embarquement");
		btnNextTerm.setToolTipText("Add a gate");
		btnNextTerm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.setVisible(true);
				panel_1.setVisible(false);
			}
		});
		btnNextTerm.setBounds(133, 227, 201, 23);
		panel_1.add(btnNextTerm);
		
		JButton btnPreced = new JButton("Annuler");
		btnPreced.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				panel.setVisible(true);
				panel_1.setVisible(false);
			}
		});
		btnPreced.setBounds(0, 227, 89, 23);
		panel_1.add(btnPreced);
		
		for (int i= 0; i<2; i++){
			tFnbreTerm = new JTextField();
			tFnbreTerm.setBounds(164, 71, 86, 20);
			panel_1.add(tFnbreTerm);
			tFnbreTerm.setColumns(10);
		}
		tFnbreTerm = new JTextField();
		tFnbreTerm.setBounds(164, 71, 86, 20);
		panel_1.add(tFnbreTerm);
		tFnbreTerm.setColumns(10);
		
		Button button = new Button("Ajouter un terminal");
		button.setBounds(143, 110, 138, 22);
		panel_1.add(button);
		
		
		
		JLabel lblTerminals = new JLabel("Portes d'embarquement");
		lblTerminals.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		lblTerminals.setBounds(107, 11, 264, 39);
		panel_2.add(lblTerminals);
		
		JLabel lblNom = new JLabel("Nom du terminale 1");
		lblNom.setBounds(10, 64, 124, 14);
		panel_2.add(lblNom);
		
		
		textField_1 = new JTextField();
		textField_1.setBounds(189, 61, 86, 20);
		panel_2.add(textField_1);
		textField_1.setColumns(10);
		String ss = textField_1.getText();
	//	int i = Integer.parseInt(ss);
		//System.out.print(i);
		
		JButton btnBack_2 = new JButton("Back");
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_1.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		btnBack_2.setBounds(10, 227, 89, 23);
		panel_2.add(btnBack_2);
		
		JButton btnFinish_2 = new JButton("Finish");
		btnFinish_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(false);
			}
		});
		btnFinish_2.setBounds(335, 227, 89, 23);
		panel_2.add(btnFinish_2);
		
		JButton btnNext_2 = new JButton("Add another Gate");
		btnNext_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_3.setVisible(true);
				panel_2.setVisible(false);
			}
		});
		btnNext_2.setBounds(189, 227, 145, 23);
		panel_2.add(btnNext_2);
		btnBack_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				panel_2.setVisible(true);
				panel_3.setVisible(false);
			}
		});
		btnBack_2.setBounds(10, 227, 89, 23);
		
		textField_4 = new JTextField();
		textField_4.setBounds(186, 92, 86, 20);
		panel_2.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblNombreDePortes = new JLabel("Nombre de portes");
		lblNombreDePortes.setBounds(10, 105, 112, 14);
		panel_2.add(lblNombreDePortes);
		panel_3.setLayout(null);
		

		JButton btnNext_3 = new JButton("Next");
		btnNext_3.setBounds(262, 227, 55, 23);
		panel_3.add(btnNext_3);
		
		JButton btnFinish_3 = new JButton("Finish");
		btnFinish_3.setBounds(335, 227, 89, 23);
		panel_3.add(btnFinish_3);
		
		JButton btnBack_3 = new JButton("Back");
		btnBack_3.setBounds(10, 227, 89, 23);
		btnBack_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel_2.setVisible(true);
				panel_3.setVisible(false);
			}
		});
		panel_3.add(btnBack_3);
		
		JLabel lblPortesDembarquements = new JLabel("Portes d'embarquement");
		lblPortesDembarquements.setBounds(68, 11, 249, 40);
		lblPortesDembarquements.setFont(new Font("Sitka Small", Font.BOLD | Font.ITALIC, 17));
		panel_3.add(lblPortesDembarquements);
		
		JLabel lblNomDeLa = new JLabel("Nom de la porte");
		lblNomDeLa.setBounds(10, 58, 89, 14);
		panel_3.add(lblNomDeLa);
		
		JLabel lblPortesDuTerminale = new JLabel("Portes du terminale n\u00B0 ");
		lblPortesDuTerminale.setBounds(10, 94, 121, 14);
		panel_3.add(lblPortesDuTerminale);
		
		textField_2 = new JTextField();
		textField_2.setBounds(155, 62, 86, 20);
		panel_3.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(155, 91, 86, 20);
		panel_3.add(textField_3);
		textField_3.setColumns(10);
	}
}
