
public class MyDate
{
	private int day, month, year;
	
	public MyDate(int d, int m, int y)
	{
		this.day=d;
		this.month=m;
		this.year=y;
	}
	
	public void printDay()
	{
		System.out.println("Ngay: "+this.day);
	}
	public void printMonth()
	{
		System.out.println("Thang: "+this.month);
	}
	public void printYear()
	{
		System.out.println("nam: "+this.year);
	}
	public void printDate()
	{
		System.out.println("Ngay thang nam: "+this.day+"-"+this.month+"-"+this.year);
	}
}
