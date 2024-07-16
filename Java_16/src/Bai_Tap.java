import java.util.Scanner;

public class Bai_Tap {
	public static void main(String[] args) {
		//Khai bao math
		Scanner sc = new Scanner(System.in);
		
		//Tinh dien tich & chu vi hinh tron
		System.out.println("Nhap ban kinh hinh tron: ");
		float banKinh=sc.nextFloat();
		double dienTich, chuVi;
		chuVi=Math.round(2*Math.PI*banKinh);
		System.out.println("Chu vi hinh tron la: "+ chuVi);
		dienTich=(Math.PI*Math.pow(banKinh, 2));
		System.out.println("Dien tich hinh tron la: "+ dienTich);
		System.out.println("Dien tich hinh tron la: "+ Math.round(dienTich*100.0)/100.0);
	}
}
