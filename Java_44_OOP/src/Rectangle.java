
public class Rectangle extends Shape {
	 private double chieuRong, chieuCao;
	 
	public Rectangle(Coordinates toaDo,double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuRong=chieuRong;
		this.chieuCao=chieuCao;
	}

	@Override
	public double tinhDienTich() 
	{
		return this.chieuRong*this.chieuCao;
	}

	


}
