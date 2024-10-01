package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import controller.counterListener;
import model.counterModel;

public class counterView extends JFrame
{
	private counterModel ctmd;
	private JButton button_Up;
	private JButton button_Down;
	private JButton button_reset;
	private JLabel jlabel_Value;

	public counterView()
	{
		this.ctmd = new counterModel();
		this.init();
		this.setVisible(true);
	}
	
	public void init()
	{
		//Chi thiet ke giao dien nen khong de setVisible o day
		this.setTitle("Counter");
		this.setSize(300, 500);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ActionListener al = new counterListener(this);
		
		this.button_Up = new JButton("Up");
		button_Up.addActionListener(al);
		
		this.button_Down = new JButton("Down");
		button_Down.addActionListener(al);
		
		this.button_reset = new JButton("Reset");
		button_reset.addActionListener(al);
		
		this.jlabel_Value = new JLabel(this.ctmd.getValue()+"", JLabel.CENTER);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new BorderLayout());
		jPanel.add(button_Up,BorderLayout.WEST);
		jPanel.add(jlabel_Value,BorderLayout.CENTER);
		jPanel.add(button_Down,BorderLayout.EAST);
		jPanel.add(button_reset,BorderLayout.SOUTH);
		this.setLayout(new BorderLayout());
		this.add(jPanel, BorderLayout.CENTER);
	}
	
	public void increment()
	{
		this.ctmd.increment();
		this.jlabel_Value.setText(this.ctmd.getValue()+"");
	}
	
	public void decrement()
	{
		this.ctmd.decrement();
		this.jlabel_Value.setText(this.ctmd.getValue()+"");
	}

	public void reset()
	{
		this.ctmd.reset();
		this.jlabel_Value.setText(this.ctmd.getValue()+"");
	}

}
