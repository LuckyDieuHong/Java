package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorController;
import model.MyColorModel;

public class MyColorView extends JFrame{
	private MyColorModel colorModel;
	private JLabel jLabel;
	
	public MyColorView()
	{
		this.colorModel =new MyColorModel();
		this.init();
	}
	
	public void init()
	{
		this.setTitle("My Color");
		this.setSize(1200,600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyColorController myColorController = new MyColorController(this);
		
		Font font_jlabel = new Font("times new romans",Font.BOLD,90);
		this.jLabel = new JLabel("CAC");
		jLabel.setFont(font_jlabel);
		
		JPanel jPanel =new JPanel();
		jPanel.setLayout(new GridLayout(2,3));
		
		Font font = new Font("Times New Roman",Font.BOLD,40);
				
		JButton jButton_red = new JButton("Red Text");
		jButton_red.setFont(font);
		jButton_red.setForeground(Color.red);
		jButton_red.addActionListener(myColorController);
		
		JButton jButton_yellow = new JButton("Yellow Text");
		jButton_yellow.setFont(font);
		jButton_yellow.setForeground(Color.yellow);
		jButton_yellow.addActionListener(myColorController);

		JButton jButton_Green = new JButton("Green Text");
		jButton_Green.setFont(font);
		jButton_Green.setForeground(Color.green);
		jButton_Green.addActionListener(myColorController);

		JButton jButton_Background_red = new JButton("Red Background");
		jButton_Background_red.setFont(font);
		jButton_Background_red.setBackground(Color.RED);
		jButton_Background_red.addActionListener(myColorController);


		JButton jButton_Background_yellow = new JButton("Yellow Background");
		jButton_Background_yellow.setFont(font);
		jButton_Background_yellow.setBackground(Color.yellow);
		jButton_Background_yellow.addActionListener(myColorController);

		JButton jButton_Background_Green = new JButton("Green Background");
		jButton_Background_Green.setFont(font);
		jButton_Background_Green.setBackground(Color.green);
		jButton_Background_Green.addActionListener(myColorController);

		jPanel.add(jButton_red);
		jPanel.add(jButton_yellow);
		jPanel.add(jButton_Green);
		
		jPanel.add(jButton_Background_red);
		jPanel.add(jButton_Background_yellow);
		jPanel.add(jButton_Background_Green);
		
		this.setLayout(new BorderLayout());
		this.add(jLabel,BorderLayout.NORTH);
		this.add(jPanel,BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}
	
	public void changeBackgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}
	
	
	
}
