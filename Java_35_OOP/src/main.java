
public class main
{
	public static void main(String agrs[])
	{
		Ngay tacGiaNguyenTuan = new Ngay(28,7,1987);
		TacGia nguyenTuan = new TacGia("Nguyen Tuan", tacGiaNguyenTuan);
		Sach sach1= new Sach("Nguoi lai do song Da", 50000,1990,nguyenTuan);
		
		Ngay tacGiaBla = new Ngay(29,3,2015);
		TacGia BlaBlu = new TacGia("Bla blu", tacGiaBla);
		Sach sach2= new Sach("Bla bla blu blu", 50000,1990,BlaBlu);
		
		System.out.println(sach1.getTenSach());
		System.out.println(sach1.kiemTraCungNam(sach2));
		System.out.println("Sach 1 sau khi giam gia la: " + sach1.giamGiaSach(23));
	}
}
