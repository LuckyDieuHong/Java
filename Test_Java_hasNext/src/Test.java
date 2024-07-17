import java.util.Scanner;

public class Test 
	{
	public static void main(String[] args) 
		{
        Scanner sc = new Scanner(System.in);
        int i =1;
        while (true) {
            String input = sc.nextLine();

            if (input.isEmpty()) {
              break;
            }
            
            System.out.println(i + " " + input);
            i++;
          }
        System.out.println("Congratulation");
	    }
	}
