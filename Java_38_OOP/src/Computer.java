
public class Computer {
	private Producer producer;
	private DateOfManufacture dateOfManufacture;
	private double price;
	private int warrantyPeriode;
	public Computer(Producer producer, DateOfManufacture dateOfManufacture, double price, int warrantyPeriode) {
		this.producer = producer;
		this.dateOfManufacture = dateOfManufacture;
		this.price = price;
		this.warrantyPeriode = warrantyPeriode;
	}
	public Producer getProducer() {
		return producer;
	}
	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	public DateOfManufacture getDateOfManufacture() {
		return dateOfManufacture;
	}
	public void setDateOfManufacture(DateOfManufacture dateOfManufacture) {
		this.dateOfManufacture = dateOfManufacture;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getWarrantyPeriode() {
		return warrantyPeriode;
	}
	public void setWarrantyPeriode(int warrantyPeriode) {
		this.warrantyPeriode = warrantyPeriode;
	}
	
	public boolean checkLowPrice(Computer other)
	{
		return this.price < other.price;
	}
	
	public String nameNationManufacture()
	{
		return this.producer.getNation().getNationName();
	}
	
	public String bruh()
	{
		return this.producer.layTenQuocGia();
	}
	
}
