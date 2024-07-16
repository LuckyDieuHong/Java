
public class test
{
	public static void main(String[] args) 
	{
		MyDate md = new MyDate(30,1,2024);
		System.out.println("Day = "+ md.getDay());
	
		md.setDay(10);
		System.out.println("Day = "+ md.getDay());

		
	
		System.out.println(md);
	}
}
