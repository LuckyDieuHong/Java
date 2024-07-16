import java.util.Scanner;

public class CinCinCoutCout {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Nhap ho va ten: ");
		String hoVaTen = sc.nextLine();
		
		System.out.println("Nhap MSSV: ");
		long maSinhVien=sc.nextLong();
		
		System.out.println("Nhap DTB: ");
		float diemThi=sc.nextFloat();
		
		System.out.println("Ho va ten: "+ hoVaTen);
		System.out.println("MSSVn: "+ maSinhVien);
		System.out.println("Diem DTB: "+ diemThi);
	}
}
