import java.util.Iterator;

public class Solution_Search {
	public int binarySearch(int []arrays, int target)
	{
		int result=0; 
		for (int i = 0; i < arrays.length; i++) 
		{
			if(arrays[i]==target)
				return result;
		}
		
		return result;
	}
}
