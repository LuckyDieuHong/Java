
public class test {
	public static void main(String[] args) {
		Manufacturer hsx1 = new Manufacturer("Toyota", "Japan");
		Manufacturer hsx2 = new Manufacturer("Martin", "Japan");
		Manufacturer hsx3 = new Manufacturer("Boeing", "USA");

		AirPlane phuongTien1 = new AirPlane("Oil", hsx3);
		Vehicle phuongTien2 = new Car("Gasoline", hsx1);
		Vehicle phuongTien3 = new Bicycle(hsx2);
		
		System.out.println("Hang san xuat 1: "+phuongTien1.layTenHangSanXuat());
		System.out.println("Ten phuong tien 1: "+phuongTien1.getTransportation());
		phuongTien1.batDau();
		phuongTien1.dungLai();
		System.out.println(phuongTien1.layVanToc()+"km/h");
		
		System.out.println(phuongTien1.getTransportation());



		
	}
}