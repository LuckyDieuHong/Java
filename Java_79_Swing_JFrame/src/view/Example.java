package view;

import javax.swing.JFrame;

public class Example {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		jf.setTitle("Ceasar cipher demo");
		jf.setSize(800,600);
		jf.setLocation(500, 500);
		
		jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
		System.out.println(jf.EXIT_ON_CLOSE);
		
		
		
		//Always set it at bottom
		jf.setVisible(true);
	}
}
