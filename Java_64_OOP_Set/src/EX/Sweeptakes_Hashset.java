package EX;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Sweeptakes_Hashset {
	Set<String> setOfPrizeTicket = new TreeSet<String>();
	
	public Sweeptakes_Hashset() {
	}
	
	//1. Add new prize code
	public boolean addNewCode(String value)
	{
		return this.setOfPrizeTicket.add(value);
	}
	
	//2. Delete a prize code
	public boolean deleteAPrizeCode(String value)
	{
		return this.setOfPrizeTicket.remove(value);
	}

	//3. Check prize code is exist or not
	public boolean checkPrize(String value)
	{
		return this.setOfPrizeTicket.contains(value);
	}
	
	//4. Delete all prize code
	public void deleteAllPrizeCode ()
	{
		 this.setOfPrizeTicket.clear();
	}
	
	//5. Number of prize code
	public int numberOfSizeCode()
	{
		return this.setOfPrizeTicket.size();
	}
	
	//6. Drawn lots
	public String drawn()
	{
		String result="";
		Random rd = new Random();
		try {
			int position = rd.nextInt(this.setOfPrizeTicket.size());
			result = (String) this.setOfPrizeTicket.toArray()[position];
			return result;
		} catch (Exception e) {
			System.out.println("Wrong dude, your array is empty or something like that");
			return "";
		}
		
		
	}
	
	//7. Print all prize code
	public void printAllPriceCode()
	{
		System.out.println(Arrays.toString(this.setOfPrizeTicket.toArray()));
	}
	

	public static void main(String[] args) {
		int option=0;
		Scanner sc = new Scanner(System.in); 
		Sweeptakes_Hashset hs = new Sweeptakes_Hashset();
		do
		{
			System.out.println("------------------MENU------------------");
			System.out.println("1. Add new prize code");
			System.out.println("2. Delete a prize code");
			System.out.println("3. Check prize code is exist or not");
			System.out.println("4. Delete all prize code");
			System.out.println("5. Number of prize code");
			System.out.println("6. Drawn lots");
			System.out.println("7. Print all prize code");
			System.out.println("0. Exit program");
			System.out.println("Enter your option");
			option = sc.nextInt();
			
			if(option == 1 || option == 2 || option == 3)
			{
				System.out.println("Enter the prize code: ");
				sc.nextLine();
				String value = sc.nextLine();
				if (option == 1)
					hs.addNewCode(value);
				else if(option == 2)
					hs.deleteAPrizeCode(value);
				else if(option == 3)
				{
					if(hs.checkPrize(value))
						System.out.println("The prize code is exist");
					else
						System.out.println("The prize code isn't exist");
				}
			}
			else
			{
				if(option == 4)
					hs.deleteAllPrizeCode();
				else if(option == 5)
					System.out.println("The number of prize code in set is: "+hs.numberOfSizeCode());
				else if(option == 6)
					System.out.println("Your prize code is: "+hs.drawn());
				else if(option == 7)		
					hs.printAllPriceCode();
			}
			
		} while (option!=0);
		
		
		
		
		
		
		
		
	}
}
