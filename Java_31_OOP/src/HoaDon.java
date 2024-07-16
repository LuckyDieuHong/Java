
public class HoaDon
{
	private String loaiCaPhe;
	private double giaTienTren1Kg;
	private double khoiLuongCaPhe;

	public HoaDon(String LCP, double giaTien, double KL) 
	{
		this.giaTienTren1Kg = giaTien;
		this.khoiLuongCaPhe = KL;
		this.loaiCaPhe=LCP;
	}
	
	public double tongTienHoaDon()
	{
		return this.khoiLuongCaPhe * this.giaTienTren1Kg;
	}
	
	public boolean kiemTraKhoiLuong(double khoiLuongCanNhap)
	{
		return this.khoiLuongCaPhe > khoiLuongCanNhap;
	}

	public boolean kiemTraTienHoaDonLonHon500K()
	{
		return this.tongTienHoaDon()>500000;
	}

	public double tinhTienGiamGia(double tongTienHoaDon)
	{
		if(tongTienHoaDon > 500000)
			return tongTienHoaDon+(tongTienHoaDon*0.1);
		else
			return tongTienHoaDon;
	}
}
