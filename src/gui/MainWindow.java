package gui;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class MainWindow {

	private JFrame frame;
	private JTextField textField;
	private JLabel lblFaction;
	private JLabel lblHomeworld;
	private JLabel lblRace;
	private JLabel lblEmployer;
	private JComboBox textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
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
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(100, 11, 145, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblName = new JLabel("Name");
		lblName.setBounds(10, 14, 46, 14);
		frame.getContentPane().add(lblName);
		
		JLabel lblBackground = new JLabel("Background");
		lblBackground.setBounds(10, 39, 80, 14);
		frame.getContentPane().add(lblBackground);
		
		lblFaction = new JLabel("Faction");
		lblFaction.setBounds(10, 89, 67, 14);
		frame.getContentPane().add(lblFaction);
		
		lblHomeworld = new JLabel("Homeworld");
		lblHomeworld.setBounds(10, 64, 67, 14);
		frame.getContentPane().add(lblHomeworld);
		
		lblRace = new JLabel("Race");
		lblRace.setBounds(10, 114, 67, 14);
		frame.getContentPane().add(lblRace);
		
		lblEmployer = new JLabel("Employer");
		lblEmployer.setBounds(10, 139, 67, 14);
		frame.getContentPane().add(lblEmployer);
		
		textField_1 = new JComboBox();
		textField_1.setBounds(100, 36, 145, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(100, 86, 145, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(100, 61, 145, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(100, 111, 145, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(100, 136, 145, 20);
		frame.getContentPane().add(textField_5);
	}
}
