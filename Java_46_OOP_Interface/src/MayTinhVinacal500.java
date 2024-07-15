
public class MayTinhVinacal500 implements MayTinhBoTuiInterface{

	@Override
	public double cong(double a, double b) {
		return a+b;
	}

	@Override
	public double tru(double a, double b) {
		return a-b;
	}

	@Override
	public double nhan(double a, double b) {
		return a*b;
	}

	@Override
	public double chia(double a, double b) 
	{
		double tong = 0;
		try
		{
			return a/b;
		}
		catch (Exception e)
		{
			System.out.println("b==0 is wrong !");
			b=1;
		}
		return a/b;
	}
}
