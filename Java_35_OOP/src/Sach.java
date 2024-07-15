import java.util.Iterator;

public class Sach 
{
	private String tenSach;
	private float giaBan;
	private int namXuatBan;
	private TacGia tacGia;
	
	public Sach(String name, float price, int yearRL, TacGia author)
	{
		this.tenSach=name;
		this.giaBan=price;
		this.namXuatBan=yearRL;
		this.tacGia=author;
	}
	
	public String getTenSach()
	{
		return tenSach;
	}
	public void setTenSach(String tenSachMoi)
	{
		tenSach=tenSachMoi;
	}

	public float getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(int giaBanMoi) {
		this.giaBan = giaBanMoi;
	}

	public int getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(int namXuatBanMoi) {
		this.namXuatBan = namXuatBanMoi;
	}

	public TacGia getTacgia() {
		return tacGia;
	}

	public void setTacgia(TacGia tacgiaMoi) {
		this.tacGia = tacgiaMoi;
	}
	
	public boolean kiemTraCungNam(Sach sachTam)
	{
//		if(namXuatBan!=sachTam.namXuatBan)
//		{
//			System.out.println("Sach "+sachTam.tenSach+" khong trung nam xuat ban voi sach "+tenSach);
//			return false;
//		}
//		else
//		{
//			System.out.println("Sach "+sachTam.tenSach+" trung nam xuat ban voi sach "+tenSach);
//			return true;
//		}
		return namXuatBan==sachTam.namXuatBan;
	}
	
	public float giamGiaSach(float phanTram)
	{
		return giaBan*(1-(phanTram/100));
	}
	
	
	
	
}
