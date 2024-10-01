package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.CalculatorView;

public class CaculatorAction implements ActionListener{
	private CalculatorView miniView;
	
	
	public CaculatorAction(CalculatorView miniView) {
		this.miniView = miniView;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("+"))
		{
			this.miniView.plus();;
		}
		else if(src.equals("-"))
		{
			this.miniView.minus();
		}
		else if(src.equals("*"))
		{
			this.miniView.multiply();
		}
		else if(src.equals("/"))
		{
			this.miniView.divide();
		}
		else if(src.equals("%"))
		{
			this.miniView.mod();
		}
		else if(src.equals("^"))
		{
			this.miniView.pow();
		}
	}
	
}
