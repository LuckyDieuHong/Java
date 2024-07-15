
public class Circle extends Shape
{
	private double banKinh;
	public Circle(Coordinates toaDo, double r) 
	{
		super(toaDo);
		this.banKinh=r;
	}
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	@Override
	public double tinhDienTich() {
		return Math.PI*this.banKinh*banKinh;
	}
	
	

}
