
public class main {
	public static void main(String[] args)
	{
		LopHoc lopHoc1 = new LopHoc("CTDL&GT", "CNTT");
		LopHoc lopHoc2 = new LopHoc("Toan A1", "CNTT");
		LopHoc lopHoc3 = new LopHoc("Ly 2", "CNTT");

		NgaySinh ngaySinh1 = new NgaySinh(8, 2, 2004);
		NgaySinh ngaySinh2 = new NgaySinh(14, 4, 2005);
		NgaySinh ngaySinh3 = new NgaySinh(8, 2, 2004);
		
		SinhVien sinhVien1 = new SinhVien("DH52201291", "Nguyen Hong Minh Quan", ngaySinh1, 4.5, lopHoc2);
		SinhVien sinhVien2 = new SinhVien("DH52201111", "Nguyen Hong Kim Yen", ngaySinh2, 10, lopHoc1);
		SinhVien sinhVien3 = new SinhVien("DH52202222", "Who ?", ngaySinh3, 3.0, lopHoc3);

		System.out.println("Ten khoa cua sinh vien "+ sinhVien1.getHoTen()+" la: "+sinhVien1.tenKhoaDangTheoHoc());
		System.out.println("Ten khoa cua sinh vien "+ sinhVien2.getHoTen()+" la: "+sinhVien2.tenKhoaDangTheoHoc());
		System.out.println("Ten khoa cua sinh vien "+ sinhVien3.getHoTen()+" la: "+sinhVien3.tenKhoaDangTheoHoc());

		if(sinhVien1.kiemTraDauRot()==true)
			System.out.println("Sinh vien "+sinhVien1.getHoTen()+" qua mon.");
		else
			System.out.println("Sinh vien "+sinhVien1.getHoTen()+" rot mon.");
		
		if(sinhVien2.kiemTraDauRot()==true)
			System.out.println("Sinh vien "+sinhVien2.getHoTen()+" qua mon.");
		else
			System.out.println("Sinh vien "+sinhVien2.getHoTen()+" rot mon.");
		
		if(sinhVien3.kiemTraDauRot()==true)
			System.out.println("Sinh vien "+sinhVien3.getHoTen()+" qua mon.");
		else
			System.out.println("Sinh vien "+sinhVien3.getHoTen()+" rot mon.");
		
		
		if(sinhVien1.kiemTraTrungNgaySinh(sinhVien2)==true)
			System.out.println("Sinh vien "+sinhVien1.getHoTen()+" trung ngay sinh voi sinh vien "+sinhVien2.getHoTen());
		else
			System.out.println("Sinh vien "+sinhVien1.getHoTen()+" khong trung ngay sinh voi sinh vien "+sinhVien2.getHoTen());

		if(sinhVien1.kiemTraTrungNgaySinh(sinhVien3)==true)
			System.out.println("Sinh vien "+sinhVien1.getHoTen()+" trung ngay sinh voi sinh vien "+sinhVien3.getHoTen());
		else
			System.out.println("Sinh vien "+sinhVien1.getHoTen()+" khong trung ngay sinh voi sinh vien "+sinhVien3.getHoTen());
	}
}
