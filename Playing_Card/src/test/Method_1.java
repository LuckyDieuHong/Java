package test;
import java.util.ArrayList;
import java.util.Random;

public class Method_1 {
	
	    public static void main(String[] args) {
	        Player p1 = new Player("1", 5000000);
	        Player p2 = new Player("2", 10000000);
	        Player p3 = new Player("3", 15000000);
	        Player p4 = new Player("4", 20000000);

	        Random random = new Random();

	        ArrayList<Integer> arrayP1 = generateUniqueNumbers1(random, 13, 52);
	        ArrayList<Integer> arrayP2 = generateUniqueNumbers2(random, 13, 52, arrayP1);
	        ArrayList<Integer> arrayP3 = generateUniqueNumbers3(random, 13, 52, arrayP1, arrayP2);
	        ArrayList<Integer> arrayP4 = generateUniqueNumbers4(random, 13, 52, arrayP1, arrayP2, arrayP3);

	        arrayP1.sort(null);
	        for (int i : arrayP1)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        
	        arrayP2.sort(null);
	        for (int i : arrayP2)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        
	        arrayP3.sort(null);
	        for (int i : arrayP3)
	        {
	            System.out.print(i+" ");
	        }
	        System.out.println();
	        
	        arrayP4.sort(null);
	        for (int i : arrayP4)
	        {
	            System.out.print(i+" ");
	        }
	    }

	    private static ArrayList<Integer> generateUniqueNumbers1(Random random, int count, int max) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        while (numbers.size() < count) 
	        {
	            int value = random.nextInt(1, max + 1);
	            if (!numbers.contains(value)) 
	            {
	                numbers.add(value);
	            }
	        }
	        return numbers;
	    }
	    
	    private static ArrayList<Integer> generateUniqueNumbers2(Random random, int count, int max, ArrayList<Integer> number2) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        while (numbers.size() < count) 
	        {
	            int value = random.nextInt(1, max + 1);
	            if (!numbers.contains(value) && !number2.contains(value)) 
	            {
	                numbers.add(value);
	            }
	        }
	        return numbers;
	    }
	    
	    
	    private static ArrayList<Integer> generateUniqueNumbers3(Random random, int count, int max, ArrayList<Integer> number2, ArrayList<Integer> number3) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        while (numbers.size() < count) 
	        {
	            int value = random.nextInt(1, max + 1);
	            if (!numbers.contains(value) && !number2.contains(value) && !number3.contains(value)) 
	            {
	                numbers.add(value);
	            }
	        }
	        return numbers;
	    }
	    
	    private static ArrayList<Integer> generateUniqueNumbers4(Random random, int count, int max, ArrayList<Integer> number2, ArrayList<Integer> number3, ArrayList<Integer> number4) {
	        ArrayList<Integer> numbers = new ArrayList<>();
	        while (numbers.size() < count) 
	        {
	            int value = random.nextInt(1, max + 1);
	            if (!numbers.contains(value) && !number2.contains(value) && !number3.contains(value) && !number4.contains(value)) 
	            {
	                numbers.add(value);
	            }
	        }
	        return numbers;
	    }
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

