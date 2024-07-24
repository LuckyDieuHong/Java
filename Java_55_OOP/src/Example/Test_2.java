package Example;

import java.util.Arrays;

public class Test_2 {
	public static void main(String[] args) {
		Student sv1 = new Student(52201291, "Nguyen Hong Minh Quan", "D22-TH08", 8.0);
		Student sv2 = new Student(52200000, "Ha Hi", "D22-TH08", 5.0);
		Student sv3 = new Student(52205451, "Ramona Flowers", "D22-TH08", 10.0);

		Student[] array_st = new Student[] {sv1,sv2,sv3};
		
		System.out.println(Arrays.toString(array_st));
		Arrays.sort(array_st);
		System.out.println(Arrays.toString(array_st));

		System.out.println(Arrays.binarySearch(array_st, sv3));
	}
}
