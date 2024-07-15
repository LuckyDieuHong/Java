import java.util.Scanner;

public class TryCatch 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = 0;
		do
		{
			try 
			{
				System.out.println("Nhap so nguyen n (nhap 1 de thoat): ");
				n=sc.nextInt();
			}
				catch (Exception e) 
				{
					System.out.println("Du lieu n khong dung DM");
				}
		} while(n!=1);
			/*Finally: Co the co, co the khong
			finally
			{
				System.out.println("Finally");
			}
			*/
		System.out.println("Gia tri n = " + n );
		System.out.println("Ket thuc chuong trinh");
		
	}
}
