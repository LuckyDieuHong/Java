
public class BangCuuChuong 
{
	public static void main(String[] args) 
	{
		System.out.println("Bang cuu chuong: ");
		for(int i=1;i<=10;i++)
		{
			System.out.println("Bang cuu chuong "+i+": ");
			for(int j=1;j<=10;j++)
			{
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			System.out.println("---------------------------");
		}
	}
}
