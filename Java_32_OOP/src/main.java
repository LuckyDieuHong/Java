import java.util.Scanner;

public class main 
{
	public static void main(String[] args) 
	{
		final int MAX = 20;
		int maHang;
		String tenHang, mauSac;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao ma hang: ");
		maHang = sc.nextInt();
		System.out.println("Ma hang: "+ maHang);
		
		System.out.println("Nhap vao ten hang: ");
		tenHang = sc.next();
		System.out.println("Ten hang: "+ tenHang);

		System.out.println("Nhap vao mau sac: ");
		mauSac = sc.next();
		System.out.println("Ten hang: "+ mauSac);
		
		soucre nguon = new soucre(maHang,tenHang,mauSac);
		System.out.println(nguon.getMaHang());
		nguon.setMaHang(10000);
		System.out.println(nguon.getMaHang());
	}
}
