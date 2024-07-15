
public class Manufacturer {
	private String tenHangSanXuat;
	private String tenQuocGia;
	public Manufacturer(String ManufacturerName, String CountryName) {
		this.tenHangSanXuat = ManufacturerName;
		this.tenQuocGia = CountryName;
	}
	
	public String getTenHangSanXuat() {
		return tenHangSanXuat;
	}
	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}
	public String getTenQuocGia() {
		return tenQuocGia;
	}
	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
	
}
