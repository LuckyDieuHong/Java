package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/*A player will have an account and the player have to bet less
 than or equal to amount they currently have
*Here is gameplay:
*A match will have 3 dice have 6 sides, each time the dealer 
*shakes 3 dice, it will appear a side each one dice have value
*from 1 to 6
*Result: value of dice 1, value of dice 2, value of dice 3
*1.Result=3 or 18, the dealer will take all and all player lose
*2.Result from 4 to 10, if player bet under(xiu) => Player win
*rest will lose
*3.Result from 11 to 17, if player bet over(tai) => Player win
*rest will lose
**/
public class TaiXiu {
	public static void main(String[] args) {
		
		Locale lc = new Locale("vi", "VN");
		NumberFormat numF2 = NumberFormat.getCurrencyInstance(lc);
		
		double accountBalanceOfPlayer = 5000;
		double bet=0;
		int selctionOverUnder = -1;
		Scanner sc = new Scanner(System.in);
		int option = 1;
		do {
			System.out.println("------------Please select option------------");
			System.out.println("Press (1) to play");
			System.out.println("Press any key to exit");
			option = sc.nextInt();
			if(option==1)
			{
				System.out.println("***Let's play !***");
				System.out.println("*******This is your balance: "+numF2.format(accountBalanceOfPlayer)+", how much do you want to bet ?");
				do
				{
					bet = sc.nextDouble();
					if(bet > accountBalanceOfPlayer) {
						System.out.println("You can't bet over your balance");
					}
				}while(bet>accountBalanceOfPlayer);
				
				do 
				{
					System.out.println("Do you want to bet under or over (1 is under/2 is over) ?");
					selctionOverUnder = sc.nextInt();

				} while (selctionOverUnder!=1 && selctionOverUnder!=2);
				
				//Shake dice
				Random dice1 = new Random();
				Random dice2 = new Random();
				Random dice3 = new Random();

				int value1 = dice1.nextInt(1, 6);
				int value2 = dice2.nextInt(1, 6);
				int value3 = dice3.nextInt(1, 6);
//				System.out.println(value1);
//				System.out.println(value2);
//				System.out.println(value3);
				int result = value1+value2+value3;
				System.out.println(result);
				if(result == 3 || result == 18)
				{
					accountBalanceOfPlayer-=bet;
					System.out.println("Shit you lost "+bet);
					System.out.println("Your balance: "+numF2.format(accountBalanceOfPlayer));
				}
				else if(result >=4 && result<=10)
				{
					if(selctionOverUnder == 1)
					{
						accountBalanceOfPlayer+=bet;
						System.out.println("Damn, you win");
						System.out.println("Your balance: "+numF2.format(accountBalanceOfPlayer));
					}
					else
					{
						accountBalanceOfPlayer-=bet;
						System.out.println("Shit you lost "+bet);
						System.out.println("Your balance: "+numF2.format(accountBalanceOfPlayer));
					}
				}
				else
				{
					if(selctionOverUnder == 2)
					{
						accountBalanceOfPlayer+=bet;
						System.out.println("Damn, you win");
						System.out.println("Your balance: "+numF2.format(accountBalanceOfPlayer));
					}
					else
					{
						accountBalanceOfPlayer-=bet;
						System.out.println("Shit you lost "+bet);
						System.out.println("Your balance: "+numF2.format(accountBalanceOfPlayer));
					}
				}
				
				
				
				
			}
		} while (option==1);
	}
}
