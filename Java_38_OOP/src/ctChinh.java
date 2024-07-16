
public class ctChinh {
	public static void main (String[] args) {
		Nation quocGia1 = new Nation("VN", "Viet Nam");
		Nation quocGia2 = new Nation("JP", "Japan");
		Nation quocGia3 = new Nation("PL", "Philippines");
		Nation quocGia4 = new Nation("US", "United States");
		
		Producer nhaSanXuat1 = new Producer("Intel", quocGia4);
		Producer nhaSanXuat2 = new Producer("NVIDIA", quocGia3);
		Producer nhaSanXuat3 = new Producer("AMD", quocGia2);
		Producer nhaSanXuat4 = new Producer("VinBrain", quocGia1);
		
		DateOfManufacture ngaySanXuat1 = new DateOfManufacture(15, 6, 2017);
		DateOfManufacture ngaySanXuat2 = new DateOfManufacture(13, 2, 2011);
		DateOfManufacture ngaySanXuat3 = new DateOfManufacture(26, 5, 2024);
		DateOfManufacture ngaySanXuat4 = new DateOfManufacture(30, 9, 2018);
		
		Computer mayTinh1 = new Computer(nhaSanXuat3, ngaySanXuat4, 15000000, 36);
		Computer mayTinh2 = new Computer(nhaSanXuat2, ngaySanXuat3, 50000000, 12);
		Computer mayTinh3 = new Computer(nhaSanXuat1, ngaySanXuat2, 1000000, 36);
		Computer mayTinh4 = new Computer(nhaSanXuat4, ngaySanXuat1, 45000000, 36);
		
		System.out.println(mayTinh1.checkLowPrice(mayTinh2));
		System.out.println(mayTinh1.checkLowPrice(mayTinh3));
		System.out.println(mayTinh1.checkLowPrice(mayTinh4));
		
		System.out.println(mayTinh1.nameNationManufacture());
		System.out.println(mayTinh2.nameNationManufacture());
		System.out.println(mayTinh3.nameNationManufacture());
		System.out.println(mayTinh4.nameNationManufacture());
	}
}
