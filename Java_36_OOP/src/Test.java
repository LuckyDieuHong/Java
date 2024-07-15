
public class Test {
	public static void main(String[] args)
	{
		NgayChieu nc1 = new NgayChieu(29,2,2024);
		NgayChieu nc2 = new NgayChieu(29,2,2023);
		NgayChieu nc3 = new NgayChieu(30,2,2024);
		
		HangSanXuat hsx1 = new HangSanXuat("A1","Japan");
		HangSanXuat hsx2 = new HangSanXuat("GhiBli","Japan");
		HangSanXuat hsx3 = new HangSanXuat("Tokyo","Japan");
		
		BoPhim bp1 = new BoPhim("Kobayashi",2016,hsx1,50000,nc1);
		BoPhim bp2 = new BoPhim("Takagi",2016,hsx2,49000,nc2);
		BoPhim bp3 = new BoPhim("Bocchi",2016,hsx3,50000,nc3);
	}
}
