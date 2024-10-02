package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.Encryption_Ceasar_Action;
import model.Encryption_Ceasar_model;

public class Encryption_Ceasar_view extends JFrame{
	private Encryption_Ceasar_model model;
	private JTextField textField_plainText;
	private JTextField textField_cypherText;
	private JTextField textField_key;

	private JTextArea area_PlainText;
	private JTextArea area_CypherText;
	private JTextArea area_Key;

	public Encryption_Ceasar_view()
	{
		this.model = new Encryption_Ceasar_model();
		this.init();
	}
	public void init()
	{
		this.setTitle("Ceasar Cipher o((>ω< ))o");
		this.setSize(600,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Encryption_Ceasar_Action action = new Encryption_Ceasar_Action(this);
		Font font = new Font("Arial",Font.BOLD,30);
		Font fontAreea = new Font(null);
		
		JPanel panel_top = new JPanel();
		panel_top.setLayout(new GridLayout(3,3,30,30));
		
		JLabel jLabel_PT = new JLabel("Plain text");
		jLabel_PT.setFont(font);
		area_PlainText = new JTextArea();
		panel_top.add(jLabel_PT);
		panel_top.add(area_PlainText);
		
		
		JLabel jLabel_Key = new JLabel("Key");
		jLabel_Key.setFont(font);
		area_Key = new JTextArea();
		panel_top.add(jLabel_Key);
		panel_top.add(area_Key);
		
		JLabel jLabel_CT = new JLabel("Cypher text");
		jLabel_CT.setFont(font);
		area_CypherText = new JTextArea();
		panel_top.add(jLabel_CT);
		panel_top.add(area_CypherText);

		
		JButton button_encryption = new JButton("Encryption");
		button_encryption.setFont(font);
		button_encryption.addActionListener(action);
		
		JButton button_decryption = new JButton("Decryption");
		button_decryption.setFont(font);
		button_decryption.addActionListener(action);
		
		JPanel panel_bottom = new JPanel();
		panel_bottom.setLayout(new BorderLayout());
		panel_bottom.add(button_encryption,BorderLayout.WEST);
		panel_bottom.add(button_decryption,BorderLayout.EAST);

		
		
		this.setLayout(new BorderLayout(20,20));
		this.add(panel_top);
		this.add(panel_bottom, BorderLayout.SOUTH);
		this.setVisible(true);
	}
	
	public void encrytion(){
		String plainText = area_PlainText.getText();
		int key = Integer.valueOf(area_Key.getText());
		this.model.setPlainText(plainText);
		this.model.setKey(key);
		this.model.encrytion();
		this.area_CypherText.setText(this.model.getCypher());
	}
	
	public void decryption() {
		String plainText = area_PlainText.getText();
		int key = Integer.valueOf(area_Key.getText());
		this.model.setPlainText(plainText);
		this.model.setKey(key);
		this.model.decryption();
		//this.test3.setText("Giải tay đi");
		this.area_CypherText.setText(this.model.getCypher());
	}
}
