package main;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class Example_Deque {
	public static void main(String[] args) {
		Deque<String> deque  = new ArrayDeque<String>();
		
		deque.offer("AVan Bang 2");
		deque.offer("AVan Bang 1");
		deque.offer("BRH 3");
		deque.offer("BRH 4");
		deque.offerLast("GMAIL 1");
		deque.offerFirst("GMAIL 2");
		
		//	GMAIL1>B4>B3>AV1>AV2>GMAIL2
		
		while(true)
		{
			String name = deque.peek();
			if(name==null)
				break;
			System.out.println(name);
		}
	}
}
