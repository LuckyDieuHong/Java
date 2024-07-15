
public class MyDate {
	private int day;
	private int month;
	private int year;

	public MyDate(int ngay, int thang, int nam) 
	{
		if( ngay>=1 &&  ngay <=31)
		{
			this.day = ngay;
		}
		else
		{
			this.day=1;
		}
		if(thang>=1 && thang <=12)
		{
			this.month = thang;
		}
		else
		{
			this.month=1;
		}
		if(nam>=1)
		{
			this.year = nam;
		}
		else
		{
			this.year=1;
		}
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if(day>=1 && day <=31)
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month>=1 && month <=12)
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		if(year>=1)
		this.year = year;
	}
	
	@Override
	public String toString()
	{
		return this.year+"";
	}

}
