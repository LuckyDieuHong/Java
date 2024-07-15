
public abstract class Shape {
	protected Coordinates toaDo;

	public Shape(Coordinates toaDo) {
		this.toaDo = toaDo;
	}

	public Coordinates getToaDo() {
		return toaDo;
	}

	public void setToaDo(Coordinates toaDo) {
		this.toaDo = toaDo;
	}
	
	public abstract double tinhDienTich();
}
