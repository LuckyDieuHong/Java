
public class BreakContinueReturn {
	public static void main(String[] args) {
		int MAX = 10;
		int b[]= {6,7,8,9,10};
		demA: for(int i=0; i < 5; i++)
		{
			demB: for(int j=0;j<5;j++)
			{
				System.out.println(i+"-"+b[j]);
				if(i==3)
					break demA;
			}
		}
	}
}
