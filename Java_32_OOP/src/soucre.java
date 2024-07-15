
public class soucre 
{
	private int maHang;
	private String tenHang;
	private String mauSac;
	public soucre(int MH, String TH, String color)
	{
		this.maHang=MH;
		this.tenHang=TH;
		this.mauSac=color;
	}
	
	public int getMaHang()
	{
		return maHang;
	}
	public void setMaHang(int MHUser)
	{
		this.maHang=MHUser;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		this.tenHang = tenHang;
	}

	public String getMauSac() {
		return mauSac;
	}

	public void setMauSac(String mauSac) {
		this.mauSac = mauSac;
	}
	
	
}
