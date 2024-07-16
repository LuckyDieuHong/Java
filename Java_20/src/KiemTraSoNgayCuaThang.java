import java.util.Scanner;

public class KiemTraSoNgayCuaThang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int thang, nam;
		System.out.println("Nhap vao thang: ");
		thang = sc.nextInt();
		System.out.println("Nhap vao nam: ");
		nam = sc.nextInt();
		switch (thang) {
		case 1: {
			System.out.println("Co 31 ngay");
			break;
		}
		case 2: {
			if((nam%4==0) && nam %100!=0||nam%400==0)
				System.out.println("Co 29 ngay");
			else
				System.out.println("Co 28 ngay");
			break;
		}
		case 3: {
			System.out.println("Co 31 ngay");
			break;
		}
		case 4: {
			System.out.println("Co 30 ngay");
			break;
		}
		case 5: {
			System.out.println("Co 31 ngay");
			break;
		}
		case 6: {
			System.out.println("Co 30 ngay");
			break;
		}
		case 7: {
			System.out.println("Co 31 ngay");
			break;
		}
		case 8: {
			System.out.println("Co 31 ngay");
			break;
		}
		case 9: {
			System.out.println("Co 30 ngay");
			break;
		}
		case 10: {
			System.out.println("Co 31 ngay");
			break;
		}
		case 11: {
			System.out.println("Co 30 ngay");
			break;
		}
		case 12: {
			System.out.println("Co 31 ngay");
			break;
		}
		default:
			System.out.println("Da nhap sai thang");
		}

	}
}
