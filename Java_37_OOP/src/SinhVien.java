
public class SinhVien {
	private String mssv;
	private String hoTen;
	private NgaySinh sinhNhat;
	private double diemTrungBinh;
	private LopHoc lop;
	
	public SinhVien(String mssv, String hoTen, NgaySinh sinhNhat, double diemTrungBinh, LopHoc lop) {
		this.mssv = mssv;
		this.hoTen = hoTen;
		this.sinhNhat = sinhNhat;
		this.diemTrungBinh = diemTrungBinh;
		this.lop = lop;
	}

	public String getMssv() {
		return mssv;
	}

	public void setMssv(String mssv) {
		this.mssv = mssv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public NgaySinh getSinhNhat() {
		return sinhNhat;
	}

	public void setSinhNhat(NgaySinh sinhNhat) {
		this.sinhNhat = sinhNhat;
	}

	public double getDiemTrungBinh() {
		return diemTrungBinh;
	}

	public void setDiemTrungBinh(double diemTrungBinh) {
		this.diemTrungBinh = diemTrungBinh;
	}

	public LopHoc getLop() {
		return lop;
	}

	public void setLop(LopHoc lop) {
		this.lop = lop;
	}
	
	public String tenKhoaDangTheoHoc()
	{
		return this.lop.getTenKhoa();
	}
	
	public boolean kiemTraDauRot()
	{
		return this.diemTrungBinh >= 5;
	}
	
	public boolean kiemTraTrungNgaySinh(SinhVien sv2)
	{
		return this.sinhNhat.equals(sv2.sinhNhat);
	}
	
	
}
