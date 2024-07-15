
public class NgayChieu 
{
	private int ngay;
	private int thang;
	private int nam;
	
	public NgayChieu(int day, int month, int year)
	{
		if(year>=0)
		{
			if(year%4==0)
			{
				if(month==2)
				{
					if(day>=1 && day<=29)
						this.ngay=day;
					else
						this.ngay=1;
				}
				else
				{
					if(month==4 || month==6 || month==9 || month==11)
					{
						if(day>=1 && day<=30)
							this.ngay=day;
						else
							this.ngay=1;
					}
					else
					{
						if(day>=1 && day<=31)
							this.ngay=day;
						else
							this.ngay=1;
					}
				}
			}
			else
			{
				if(month==2)
				{
					if(day>=1 && day<=28)
						this.ngay=day;
					else
						this.ngay=1;
				}
				else
				{
					if(month==4 || month==6 || month==9 || month==11)
					{
						if(day>=1 && day<=30)
							this.ngay=day;
						else
							this.ngay=1;
					}
					else
					{
						if(day>=1 && day<=31)
							this.ngay=day;
						else
							this.ngay=1;
					}
				}
			}
		}
		else
			this.nam=1;
	}

	public int getNgay() {
		return ngay;
	}

	public void setNgay(int ngay) {
		this.ngay = ngay;
	}

	public int getThang() {
		return thang;
	}

	public void setThang(int thang) {
		this.thang = thang;
	}

	public int getNam() {
		return nam;
	}

	public void setNam(int nam) {
		this.nam = nam;
	}
}
