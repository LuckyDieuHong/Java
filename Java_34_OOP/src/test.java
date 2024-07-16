
public class test
{
	public static void main(String[] args) 
	{
		MyDate md1 = new MyDate(30,1,2024);
		MyDate md2 = new MyDate(30,2,2024);
		MyDate md3 = new MyDate(30,1,2024);
		
		System.out.println(md1);
		System.out.println(md2);
		System.out.println(md3);
		
		System.out.println(md1.hashcode());
		System.out.println(md2.hashcode());
		System.out.println(md3.hashcode());
		
		System.out.println("Check giong nhau md1, md2: "+md1.equals(md2));
		System.out.println("Check giong nhau md1, md3: "+md1.equals(md3));
	}
}
