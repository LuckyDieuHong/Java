package test;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Method_2 {
	public static void main(String[] args) {
		Locale lc = new Locale("vi","VN");
		NumberFormat nf = NumberFormat.getCurrencyInstance(lc);
		
		Random rd = new Random();
		ArrayList<Integer> ar = generateUniqueNumber(rd);
		//ar.sort(null);
		for(int i : ar)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(ar.size());
		
		ArrayList<Integer> p1 = new ArrayList<Integer>();
		for (int i = 0; i < 13; i++) 
		{
			p1.add(ar.get(i));
		}
		for(int i : p1)
		{
			System.out.print(i+" ");
		}
		for (int i = 0; i < 13; i++)
		{
			ar.remove(0);
		}
		System.out.println();
		
		ArrayList<Integer> p2 = new ArrayList<Integer>();
		for (int i = 0; i < 13; i++) 
		{
			p2.add(ar.get(i));
		}
		for(int i : p2)
		{
			System.out.print(i+" ");
		}
		for (int i = 0; i < 13; i++)
		{
			ar.remove(0);
		}
		System.out.println();
		
		ArrayList<Integer> p3 = new ArrayList<Integer>();
		for (int i = 0; i < 13; i++) 
		{
			p3.add(ar.get(i));
		}
		for(int i : p3)
		{
			System.out.print(i+" ");
		}
		for (int i = 0; i < 13; i++)
		{
			ar.remove(0);
		}
		System.out.println();
		
		ArrayList<Integer> p4 = new ArrayList<Integer>();
		for (int i = 0; i < 13; i++) 
		{
			p4.add(ar.get(i));
		}
		for(int i : p4)
		{
			System.out.print(i+" ");
		}

	}
	
	private static ArrayList<Integer> generateUniqueNumber(Random random) {
        ArrayList<Integer> numbers = new ArrayList<>();
        while (numbers.size() < 52) 
        {
            int value = random.nextInt(1, 53);
            if (!numbers.contains(value)) 
            {
                numbers.add(value);
            }
        }
        return numbers;
    }
}
