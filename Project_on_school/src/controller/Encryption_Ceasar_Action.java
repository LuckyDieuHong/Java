package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.Encryption_Ceasar_view;

public class Encryption_Ceasar_Action implements ActionListener{
	
	private Encryption_Ceasar_view view;
	
	public Encryption_Ceasar_Action(Encryption_Ceasar_view view) {
		this.view = view;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if(src.equals("Encryption"))
		{
			this.view.encrytion();
		}
		else if(src.equals("Decryption"))
		{
			this.view.decryption();	
		}
	}

}
