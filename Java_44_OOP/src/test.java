
public class test {
	public static void main(String[] args) {
		Coordinates td1 = new Coordinates(5, 5);
		Coordinates td2 = new Coordinates(7, 9);
		Coordinates td3 = new Coordinates(12, 1);
		
		Shape hinhCham = new Point(td1);
		Shape hinhCN = new Rectangle(td2,2,10);
		Shape hinhTron = new Circle(td3, 10);
		
		
		
		System.out.println("DT cham: "+hinhCham.tinhDienTich());
		System.out.println("DT HCN: "+hinhCN.tinhDienTich());
		System.out.println("DT cham: "+hinhTron.tinhDienTich());


	}
}
