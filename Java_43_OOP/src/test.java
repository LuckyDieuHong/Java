
public class test {
	public static void main(String[] args) {
		MyMath math = new MyMath();
		System.out.println(math.timMin(5000, 5000.9));
		System.out.println(math.timMin(5000, 5000));
		System.out.println(math.tinhTong(5.99, 5/3));
		double mang[] = new double[] {1,6,5,9.3};
		System.out.println(math.tinhTong(mang));
	}
}
