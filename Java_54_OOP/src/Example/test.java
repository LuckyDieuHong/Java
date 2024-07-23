package Example;

public class test {
	public static void main(String[] args) {
		Student sv1 = new Student(52201291, "Nguyen Hong Minh Quan", "D22-TH08", 8.0);
		Student sv2 = new Student(52200000, "Ha Hi", "D22-TH08", 5.0);

		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv2.compareTo(sv1));

	}
}
