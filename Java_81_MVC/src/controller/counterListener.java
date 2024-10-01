package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.counterView;

public class counterListener implements ActionListener{
	private counterView ctv;
	public counterListener(counterView ctvw)
	{
		this.ctv = ctvw;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("You're pressed the button");
		
		String src = e.getActionCommand();
		System.out.println("You're pressed the button " + src);
		
		if(src.equals("Up"))
		{
			this.ctv.increment();
		}
		else if(src.equals("Down"))
			this.ctv.decrement();
		else
			this.ctv.reset();
	}
}
