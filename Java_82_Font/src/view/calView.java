package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.calControl;
import model.calModel;

public class calView extends JFrame{
	private calModel calmodel;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JLabel jLabel_value;
	
	private JPanel jpanel_head;
	private JPanel jpanel_button; 
	
	public calView() {
		this.calmodel = new calModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init()
	{
		this.setTitle("Last button");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(500, 500);
		
		Font font = new Font("Times New Roman",Font.BOLD,20);
		
		
		this.jpanel_head = new JPanel();
		jLabel_value = new JLabel("------");
		jLabel_value.setFont(font);
		jpanel_head.add(jLabel_value);
		
		
		this.jpanel_button = new JPanel();
		jpanel_button.setLayout(new GridLayout(2,2));
		
		ActionListener al = new calControl(this);
		
		this.button_1 = new JButton("1");
		button_1.setFont(font);
		button_1.addActionListener(al);
		
		this.button_2 = new JButton("2");
		button_2.setFont(font);
		button_2.addActionListener(al);
		
		this.button_3 = new JButton("3");
		button_3.setFont(font);
		button_3.addActionListener(al);
		
		this.button_4 = new JButton("4");
		button_4.setFont(font);
		button_4.addActionListener(al);
		
		jpanel_button.add(button_1);
		jpanel_button.add(button_2);
		jpanel_button.add(button_3);
		jpanel_button.add(button_4);
		
		this.setLayout(new BorderLayout());
		this.add(jpanel_head,BorderLayout.SOUTH);
		this.add(jpanel_button,BorderLayout.CENTER);
	}
	
	public void changTo_1()
	{
		this.calmodel.setValue_1();
		jLabel_value.setText("Last button: "+this.calmodel.getText());
	}
	
	public void changTo_2()
	{
		this.calmodel.setValue_2();
		jLabel_value.setText("Last button: "+this.calmodel.getText());
	}
	
	public void changTo_3()
	{
		this.calmodel.setValue_3();
		jLabel_value.setText("Last button: "+this.calmodel.getText());
	}
	
	public void changTo_4()
	{
		this.calmodel.setValue_4();
		jLabel_value.setText("Last button: "+this.calmodel.getText());
	}
	
	
	
	
	
	
}
