import java.util.Iterator;

public class Solution_Binary_Search {
	public int binarySearch(int []arrays, int target)
	{
		int result=0; 
		if(target == arrays[arrays.length/2])
			return result=arrays.length/2;
		if(target > arrays[arrays.length/2])
		{
			for (int i = arrays.length/2; i < arrays.length; i++) 
			{
				if(arrays[i]==target)
					return result=i;
			}
		}
		for (int i = 0; i < arrays.length/2; i++) 
		{
			if(arrays[i]==target)
				return result=i;
		}
		
		return result;
	}
}
