package Example;

import java.util.Arrays;

public class Test {
	public static void main(String[] args) {
		
	String s = "Hello world, I'm Quan !";
	//method 1
	String[] a = s.split(" ");
	System.out.println(Arrays.toString(a));
	
	//method 2
	String[] b = s.split(",");
	System.out.println(Arrays.toString(b));
	
	
	String s2 = "Hello guys, I'm Peter, a sipder-man !";
	String [] c =s2.split("\\.|\\,");
	System.out.println(Arrays.toString(c));
	
	
	String s3 = "Nguyen Hong Minh Quan";
	String[] d = s3.split(" ");
	System.out.println(Arrays.toString(d));
	System.out.println(d[d.length-1]);
	}
}
