
public class DataType {
	public static void main(String[] args) {
		int a=100;
		int b=50;
		//Ep kieu ngam dinh
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		
		float c=a;
		float d= b;
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		//Ep kieu tuong minh
		float e=5.5f;
		float f=9.5f;
		//Do la tu 'float' xuong 'int' la nho hon nen phai buoc ep kieu ()
		int g=(int)e;
		int h=(int)f;
		
		System.out.println("h = "+h);
		System.out.println("g = "+g);
				
		//Ep kieu nguyen thuy va doi tuong
		int x = new Integer(9999);
		System.out.println("x = "+x);
	}
}
