import java.util.Scanner;

public class Switch_Case {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int chon;
		System.out.println("Nhap vao lua chon 0-8 cua ban: ");
		chon=sc.nextInt();
		switch (chon) {
		case 1: 
		{
			System.out.println("Ban da chon 1");
			break;
		}
		case 2:
		{
			System.out.println("Ban da chon 2");
			break;
		}
		case 3:
		{
			System.out.println("Ban da chon 3");
			break;
		}case 4:
		{
			System.out.println("Ban da chon 4");
			break;
		}
		case 5:
		{
			System.out.println("Ban da chon 5");
			break;
		}
		case 6:
		{
			System.out.println("Ban da chon 6");
			break;
		}
		case 7:
		{
			System.out.println("Ban da chon 7");
			break;
		}
		case 8:
		{
			System.out.println("Ban da chon 8");
			break;
		}
		default:
			System.out.println("Ban da chon ngoai tam");
		}
	}
}
