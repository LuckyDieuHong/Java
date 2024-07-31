package main;

import java.util.LinkedList;
import java.util.Queue;

public class Example_Queue {
	public static void main(String[] args) {
		Queue<String> queueString = new LinkedList<String>();
		
		queueString.offer("Minh Quan 1");
		queueString.offer("Van Bang 2");
		queueString.offer("Tieu Long 3");
		queueString.offer("Rush hour 4");
		
		System.out.println(queueString.size());

		while(true)
		{
			//Take the value and remove it
			String name = queueString.poll();
			if(name == null)
				break;
			System.out.println(name);
		}
		System.out.println(queueString.size());
	}
}
