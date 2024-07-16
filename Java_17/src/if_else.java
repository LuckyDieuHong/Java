import java.util.Scanner;

public class if_else {
	public static void main(String[] args) {
		double a,x,b;
		Scanner sc= new Scanner(System.in);
		System.out.println("Phuong trinh bac nhat ax+b");
		System.out.println("Nhap a: ");
		a=sc.nextDouble();
		System.out.println("Nhap b: ");
		b=sc.nextDouble();
		if(a==0)
		{
			if(b==0)
				System.out.println("Phuong trinh vo so nghiem");
			else if(b!=0)
				System.out.println("Phuong trinh vo nghiem");
		}
		else if(a!=0)
		{
			System.out.println("Phuong trinh co nghiem x = "+(-b/a));

		}
	}
}
