import java.util.Scanner;

public class ChuyenDoiThapPhanSangNhiPhan {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen n>0: ");
		n=sc.nextInt();
		String nhiPhan="";
		while(n>0)
		{
			nhiPhan = (n%2) + nhiPhan;
			n/=2;
		}
		System.out.println("He nhi phan la: "+nhiPhan);
	}
}
