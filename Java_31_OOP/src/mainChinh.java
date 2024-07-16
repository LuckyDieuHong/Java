import java.util.Scanner;

public class mainChinh {
	public static void main(String[] ags) {
		Scanner sc = new Scanner(System.in);
		HoaDon hd = new HoaDon("Legend", 100000, 6.5);
		System.out.println("Tong tien hoa don la: " + hd.tongTienHoaDon());
		System.out.println("Kiem tra khoi luong > 5: " + hd.kiemTraKhoiLuong(5));
		System.out.println("Kiem tra tien hoa don > 500.000VND: " + hd.kiemTraTienHoaDonLonHon500K());
		System.out.println("Giam gia hoa donn > 500.000VND: " + hd.tinhTienGiamGia(hd.tongTienHoaDon()));

	}
}
