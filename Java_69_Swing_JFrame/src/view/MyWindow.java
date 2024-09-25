package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame{
	
	public MyWindow()
	{
		this.setDefaultCloseOperation(3);
	}
	
	public void showMyWindow()
	{
		this.setVisible(true);
	}
	
	public void showMyWindow(String title)
	{
		this.setTitle(title);
		this.setVisible(true);
	}
	
	public void showMyWindow(String title, int width, int height)
	{
		this.setTitle(title);
		this.setSize(width,height);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		MyWindow mw1 = new MyWindow();
		mw1.showMyWindow();

		MyWindow mw2 = new MyWindow();
		mw2.showMyWindow("Caesar",1000,500);

		MyWindow mw3 = new MyWindow();
		mw3.showMyWindow("Caesar",500,600);

		
	}
}
