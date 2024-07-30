
public class Solution_2 {
	public int[] twoSum(int[] numbers, int target) {
        int result[]= new int [2];
        int position1, position2;
        for(int i=0; i<numbers.length-1; i++)
        {
            position1= i+1;
            for(int j=i+1; j<numbers.length; j++)
            {
                position2 = j+1;
                if(numbers[i]+numbers[j]==target)
                {
                    result[0] = position1;
                    result[1] = position2;
                    return result; 
                }
            }
        }
        return result;
    }
}
