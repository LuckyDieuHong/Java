import java.util.Scanner;

public class GiaiPhuongTrinhBac2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b,c,x,delta;
		System.out.println("Nhap a: ");
		a=sc.nextDouble();
		System.out.println("Nhap b: ");
		b=sc.nextDouble();
		System.out.println("Nhap c: ");
		c=sc.nextDouble();
		delta=(Math.pow(b,2))-4*a*c;
		System.out.println("Delta = "+delta);
		if(delta<0)
			System.out.println("Phuong trinh vo nghiem");
		else if(delta==0)
			System.out.println("Phuong trinh co nghiem kep x1=x1="+(-b/(2*a)));
		else if(delta>0)
		{
			System.out.println("Phuong trinh co 2 nghiem:");
			System.out.println("x1 = " + ((-b+Math.sqrt(delta))/2*a)); 
			System.out.println("x2 = " + ((-b-Math.sqrt(delta))/2*a)); 
		}
	}
}
