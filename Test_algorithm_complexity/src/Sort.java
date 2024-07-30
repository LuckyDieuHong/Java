
public class Sort {
	public int []sort(int arrays[])
	{
		int result[]=arrays;
		int tam;
		for (int i = 0; i < result.length; i++) 
		{
			for (int j = i+1; j < result.length; j++) 
			{
				if(result[j]<result[i])
				{
					tam = result[j];
					result[j]=result[i];
					result[i]=tam;
				}
			}
		}
		
		return result;
	}
}
