import java.util.Scanner;

public class EX {
	public static void main(String[] args) {
		int test [] = null;
		int selection1=0, selection2=0;
		int position=0;
		System.out.println(test.length);
		Scanner sc =new Scanner(System.in);
		do 
		{
			System.out.println("Enter number to init array: ");
			selection1 = sc.nextInt();
			test = new int[selection1];
			System.out.println("Enter number: ");
			selection2 = sc.nextInt();
			if(selection2==-1)
					break;
			//test[position]=selection;
		} while (true);
		Sort s = new Sort();
		s.sort(test);
		System.out.println(s.toString());
		
	} 
}
