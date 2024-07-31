package test;



//import code_a.Example;

public class TestExample {
	public static void main(String[] args) {
		code_a.Example vd = new code_a.Example(5, 6);
		System.out.println(vd.getB());
		
		
		code_b.Example vd2 = new code_b.Example(5, 2, 9);
		System.out.println(vd2.getC());
	
	}
}
