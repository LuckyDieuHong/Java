package Example;

import java.util.Arrays;

public class Test {
	public static int[] reverse (int[] x)
	{
		int []result = new int[x.length];
		int tam=0;
		for (int i = x.length-1; i >=0 ; i--) 
		{
			result[tam] = x[i];
			tam++;
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		int[] a = new int [] {4,9,3,7,5,2,1,0,10};
		int[] b = new int [15];
		
		//
		System.out.println("a: "+Arrays.toString(a));
		
		//sort
		Arrays.sort(a);
		//System.out.println("a: "+Arrays.toString(a));
		
		//sort v.2
		a = Test.reverse(a);
		System.out.println("a: "+Arrays.toString(a));

		
		//binarySearch
		System.out.println(Arrays.binarySearch(a, 100)); 

		//fillValue
		Arrays.fill(b, 99);
		System.out.println(Arrays.toString(b));
		
		
	}
}


