import java.util.Scanner;

public class CongTruNhanChia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so nguyen a: ");
		int a = sc.nextInt();
		System.out.println("Nhap so nguyen b: ");
		int b = sc.nextInt();
		System.out.println("a + b = " + (a+b));
		float tong = a+ b;
		System.out.println("a + b = " + tong);
		int hieu = a-b;
		System.out.println("a - b = " + hieu);
		float chiaLayNguyen = (float) a/b;
		System.out.println("a / b = " + chiaLayNguyen);
		float chiaLayDu = a%b;
		System.out.println("a % b = " + chiaLayDu);
	}
}
