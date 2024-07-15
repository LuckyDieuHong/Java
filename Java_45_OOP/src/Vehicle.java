
public abstract class Vehicle {
	protected String transportation;
	protected Manufacturer hsx;
	public Vehicle(String loaiPhuongTien, Manufacturer hangSanXuat) {
		this.transportation = loaiPhuongTien;
		this.hsx = hangSanXuat;
	}

	public String getTransportation() {
		return transportation;
	}

	public void setTransportation(String transportation) {
		this.transportation = transportation;
	}
	
	
	public String layTenHangSanXuat()
	{
		return hsx.getTenHangSanXuat();
	}
	
	public void batDau()
	{
		System.out.println("Khoi dong");
	}
	
	public void tangToc()
	{
		System.out.println("Nhan ga");
	}
	
	public void dungLai()
	{
		System.out.println("Stop");
	}
	
	public abstract double layVanToc();
}

