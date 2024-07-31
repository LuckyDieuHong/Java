package main;

import java.util.Scanner;
import java.util.Stack;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> stackString = new Stack<String>();
		
//		//Add new value into Stack
//		stackString.push("Value");
//		
//		//Take the value but delete from Stack
//		stackString.pop();
//		
//		//Take the value but not delete from Stack
//		stackString.peek();
//		
//		//Clear all value in Stack
//		stackString.clear();
//		
//		//Check the value is exist or not in Stack
//		stackString.contains("Value");
		
		//Length of stack
//		stackString.size()	
		
		//Example reverse the String
		System.out.println("Enter a string: ");
		String s = sc.nextLine();
		// Quan
		for (int i = 0; i < s.length(); i++) 
		{
			stackString.push(s.charAt(i)+"");
		}
		System.out.println("String reverse: ");
		
		for (int i = 0; i < s.length(); i++) 
		{
			System.out.print(stackString.pop());
		}
		System.out.println();
		
		//Change decimal to binary
		Stack<Integer> stackInt = new Stack<Integer>();
		System.out.println("Enter 1 integer number: ");
		int x = sc.nextInt();
		while (x>0)
		{
			int surplus = x % 2;
			stackInt.push(surplus);
			x=x/2;
		}
		int n=stackInt.size();
		System.out.println("Number binary is: ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(stackInt.pop());
		}
		
	}
}
