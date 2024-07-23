import java.util.Arrays;

public class Example {
	public static void main(String[] args) {
		int [] array_1 = {1,2,3};
		System.out.println(array_1.length);
		
		//copy
		int [] array_1_a = array_1;
		array_1_a[0]=999;
		System.out.println("array_1"+Arrays.toString(array_1));
		System.out.println("array_1_a"+Arrays.toString(array_1_a));
	
		//copy 2
		int []array_1_b = array_1.clone();
		array_1_b[0]=555;
		System.out.println("array_1"+Arrays.toString(array_1));
		System.out.println("array_1_a"+Arrays.toString(array_1_b));
		
		//copy 3
		int []array_1_c = new int[array_1.length];
		System.arraycopy(array_1, 0, array_1_c, 0, array_1.length);
		array_1_c[0]=63546415;
		array_1_c[2]=977997;
		System.out.println("array_1"+Arrays.toString(array_1));
		System.out.println("array_1_c"+Arrays.toString(array_1_c));

		//
		String[] object= {"blabla","bluallauiav"};
		System.out.println("object"+Arrays.toString(object));

	}
	
}
