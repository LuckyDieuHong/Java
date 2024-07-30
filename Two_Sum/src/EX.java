
public class EX {
	public static void main(String[] args) {
		int test [] = {3,2,4};
		int target = 6;
		Solution a =new Solution();
		int []b= a.twoSum(test, target);
		
		Solution_2 c = new Solution_2();
		int []d= c.twoSum(test, target);
		
		System.out.println("["+b[0]+","+b[1]+"]");
		System.out.println("["+d[0]+","+d[1]+"]");
	} 
}
