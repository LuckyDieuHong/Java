
public class AirPlane extends Vehicle
{
	private String fuelTpye;
	
	public AirPlane(String fuelTpye, Manufacturer hsx) {
		super("AirPlane", hsx);
		this.fuelTpye = fuelTpye;
	}
	public String getFuelTpye() {
		return fuelTpye;
	}
	public void setFuelTpye(String fuelTpye) {
		this.fuelTpye = fuelTpye;
	}
	
	public void catCanh()
	{
		System.out.println("Take off");
	}
	
	public void haCanh()
	{
		System.out.println("Landing");
	}
	@Override
	public double layVanToc() {
		return 850;
	}

	
}
