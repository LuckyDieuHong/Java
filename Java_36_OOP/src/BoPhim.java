
public class BoPhim {
	private String tenPhim;
	private int namSX;
	private HangSanXuat hSX;
	private float giaVe;
	private NgayChieu ngayChieu;
	
	public BoPhim(String tenPhim, int namSX, HangSanXuat hSX, float giaVe, NgayChieu ngayChieu) {
		this.tenPhim = tenPhim;
		this.namSX = namSX;
		this.hSX = hSX;
		this.giaVe = giaVe;
		this.ngayChieu = ngayChieu;
	}
	
	
	public String getTenPhim() {
		return tenPhim;
	}
	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}



	public int getNamSX() {
		return namSX;
	}
	public void setNamSX(int namSX) {
		this.namSX = namSX;
	}


	public HangSanXuat gethSX() {
		return hSX;
	}
	public void sethSX(HangSanXuat hSX) {
		this.hSX = hSX;
	}


	public float getGiaVe() {
		return giaVe;
	}
	public void setGiaVe(float giaVe) {
		this.giaVe = giaVe;
	}


	public NgayChieu getNgayChieu() {
		return ngayChieu;
	}
	public void setNgayChieu(NgayChieu ngayChieu) {
		this.ngayChieu = ngayChieu;
	}


	public boolean kiemTraGiaVe(BoPhim giaVeKhac)
	{
		/*
		if(this.giaVe < giaVeKhac.giaVe)
		{
			System.out.println(tenPhim+" co gia re hon phim "+giaVeKhac.tenPhim);
			return true;
		}
		else
		{
			System.out.println(tenPhim+" khong co gia re hon phim "+giaVeKhac.tenPhim);
			return false;
		}
		*/
		return giaVe < giaVeKhac.giaVe;
	}
	
	public String tenHangSXPhim()
	{
		return this.hSX.getTenHangSX();
	}
	
	public float giaVeSauKhiKhuyenMai(float phanTram)
	{
		return giaVe * (1-(phanTram/100));
	}
	
	
}
