package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.calView;

public class calControl implements ActionListener {
	private calView calview;

	public calControl(calView clv) {
		this.calview = clv;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();

		
		if(src.equals("1"))
		{
			this.calview.changTo_1();
		}
		else if(src.equals("2"))
		{
			this.calview.changTo_2();
		}
		else if(src.equals("3"))
		{
			this.calview.changTo_3();
		}
		else if(src.equals("4"))
		{
			this.calview.changTo_4();
		}
	}

}
