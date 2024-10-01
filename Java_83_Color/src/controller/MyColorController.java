package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;



public class MyColorController implements ActionListener{
	
	private MyColorView colorView;
	
	public MyColorController(MyColorView colorView) {
		this.colorView = colorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		
		if(src.equals("Red Text"))
		{
			this.colorView.changeTextColor(Color.red);
		}
		else if(src.equals("Yellow Text"))
		{
			this.colorView.changeTextColor(Color.yellow);
		}
		else if(src.equals("Green Text"))
		{
			this.colorView.changeTextColor(Color.green);
		}
		else if(src.equals("Red Background"))
		{
			this.colorView.changeBackgroundColor(Color.RED);
		}
		else if(src.equals("Yellow Background"))
		{
			this.colorView.changeBackgroundColor(Color.yellow);
		}
		else if(src.equals("Green Background"))
		{
			this.colorView.changeBackgroundColor(Color.green);
		}
		
			
		
	}

}
