
public class Test {
	public static void main(String[] args)
	{
		LopHoc lopHoc1 = new LopHoc("CTDL&GT", "CNTT");
		LopHoc lopHoc2 = new LopHoc("Toan A1", "CNTT");
		LopHoc lopHoc3 = new LopHoc("Ly 2", "CNTT");

		NgaySinh ngaySinh1 = new NgaySinh(8, 2, 2004);
		NgaySinh ngaySinh2 = new NgaySinh(14, 4, 2005);
		NgaySinh ngaySinh3 = new NgaySinh(20, 2, 2004);
		
		SinhVien sinhVien1 = new SinhVien("DH52201291", "Nguyen Hong Minh Quan", ngaySinh1, 4.5, lopHoc2);
		SinhVien sinhVien2 = new SinhVien("DH52201111", "Nguyen Hong Kim Yen", ngaySinh2, 1, lopHoc1);
		SinhVien sinhVien3 = new SinhVien("DH52202222", "Who ?", ngaySinh3, 3.0, lopHoc3);

	}
}
