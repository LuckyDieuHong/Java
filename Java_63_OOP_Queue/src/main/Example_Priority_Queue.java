package main;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Example_Priority_Queue {
	public static void main(String[] args) {
		Queue<String> queueString = new PriorityQueue<String>();
		
		queueString.offer("AVan Bang 2");
		queueString.offer("AVan Bang 1");
		queueString.offer("BRH 3");
		queueString.offer("BRH 4");
		
		while(true)
		{
			//Take the value and remove it
			String name = queueString.poll();
			if(name == null)
				break;
			System.out.println(name);
		}
	}
}
