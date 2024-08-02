package EX;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Dictionary_Hash_Map {
	private Map<String, String> data = new HashMap<String, String>();
	
	public String addNewWord(String keyWord, String meaning)
	{
		return this.data.put(keyWord, meaning);
	}
	
	public String deleteWord (String keyword)
	{
		//Delete key and meaning
		return this.data.remove(keyword);
	}
	
	public String findMeaningOfKey (String keyWord)
	{
		return this.data.get(keyWord);
	}
	
	public void printAllKeyWord() 
	{
		Set<String> setOfKeyWord = this.data.keySet();
		System.out.println(Arrays.toString(setOfKeyWord.toArray()));
	}
	
	public int amountOfWord()
	{
		return this.data.size();
	}
	
	public void deleteAllKeyWord()
	{
		this.data.clear();
	}
	
	public static void main(String[] args) {
		Dictionary_Hash_Map dr = new Dictionary_Hash_Map();
		int option=0;
		String keyWord, value;
		Scanner sc = new Scanner(System.in);
		do
		{
			System.out.println("--------------------------------------");
			System.out.println("+++++++++++++++++Menu+++++++++++++++++");
			System.out.println("1. Add new word");
			System.out.println("2. Delete a word");
			System.out.println("3. Find the meaning of keywords");
			System.out.println("4. Print list of keywords");
			System.out.println("5. Print amount of keywords");
			System.out.println("6. Delete all keyword");
			System.out.println("0. Exit");
			option = sc.nextInt();
			sc.nextLine();
			if(option==1)
			{
				System.out.println("Enter your keyword: ");
				keyWord = sc.nextLine();
				System.out.println("Enter the meaning of "+keyWord+": ");
				value = sc.nextLine();
				dr.addNewWord(keyWord, value);
			}
			else if(option==2 || option==3)
			{
				System.out.println("Enter your keyword: ");
				keyWord = sc.nextLine();
				if(option==2)
				{
					dr.deleteWord(keyWord);
				}
				else
					System.out.println("The meaning of "+keyWord+" is: "+dr.findMeaningOfKey(keyWord));
			}
			else if(option == 4)
				dr.printAllKeyWord();
			else if(option == 5)
				System.out.println("Amount of keywords: "+dr.amountOfWord());
			else if(option == 6)
				dr.deleteAllKeyWord();
		} while (option!=0);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
