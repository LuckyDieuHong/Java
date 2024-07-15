
public class Car extends Vehicle{
	private String fuelType;
	public Car(String loaiNhienLieu, Manufacturer hsx) {
		super("Car", hsx);
		this.fuelType = loaiNhienLieu;
	}
	public String getFuelType() {
		return fuelType;
	}
	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}
	@Override
	public double layVanToc() {
		return 120;
	}

	
}