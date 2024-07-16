
public class MyDate 
{
	private int day;
	private int month;
	private int year;
	
	public MyDate(int day, int month, int year) 
	{
		if(day >=1 && day <=31)
		{
		this.day = day;
		}
		else
			this.day = 1;
		
		if(month >=1 && month <=12)
		{
		this.month = month;
		}
		else
			this.month = 1;
		
		if(year >=1)
			this.year = year;
		else
			this.day = 1;
	}
	
	public int getDay()
	{
		return day;
	}
	public void setDay(int ngay)
	{
		if(ngay>=1 && ngay <=31)
			this.day = ngay; 
	}
	
	public int getMonth()
	{
		return month;
	}
	public void setMonth()
	{
		this.month = month;
	}
	
	public int getYear()
	{
		return year;
	}
	public void setYear()
	{
		this.year = year;
	}

	@Override
	public String toString()
	{
		return this.day+"/"+this.month+"/"+this.year;
	}
	
	@Override
	public boolean equals(Object doiTuong)
	{
		if(this == doiTuong)
			return true;
		if(doiTuong == null)
			return false;
		if(this.getClass() != doiTuong.getClass())
			return false;
		MyDate ngay = (MyDate) doiTuong;
		if(this.day != ngay.day)
			return false;
		if(this.month != ngay.month)
			return false;
		if(this.year != ngay.year)
			return false;
		return true;
	}
	
	//@Override
	public int hashcode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + this.day;
		result = prime * result + month;
		result = prime * result + year;
		return result;
	}
	
}
