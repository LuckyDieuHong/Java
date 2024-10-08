
public class PhanMemMayTinh implements MayTinhBoTuiInterface, SapXepInterface{

	@Override
	public void sapXepTang(double[] arr) {
		int i, j, n = arr.length;
		double key;
		for (i = 0; i < n; i++) {
			key = arr[i];
			j = i - 1;
			
			while(j>=0 && arr[j]>key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

	@Override
	public void sapXepGiam(double[] arr) {
		int i, j, n = arr.length;
		double key;
		for (i = 0; i < n; i++) {
			key = arr[i];
			j = i - 1;
			
			while(j>=0 && arr[j]<key)
			{
				arr[j+1] = arr[j];
				j = j-1;
			}
			arr[j+1] = key;
		}
	}

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
			tong=a/b;
		}
		catch (Exception e)
		{
			System.out.println("b==0 is wrong !");
			b=1;
		}
		return a/b;
	}

}
