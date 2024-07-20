
public class Example {
	public static void main(String[] args) {
		String s1 = "Hello guys, I'm nigga, nigga, nigga";
		String s2 = "nigga";
		String s3 = "bla bla blu";
		
		char c1 = 'g';
		
		//indexOf
		
		System.out.println("Position of s2 in s1 "+s1.indexOf(s2));
		System.out.println("Position of s3 in s1 "+s3.indexOf(s1));

		//indexOf but in first
		System.out.println("Position of s2 in s1 "+s1.indexOf(s2,16));

		//Search char
		System.out.println("Position of s2 in s1 "+s1.indexOf(c1));
		System.out.println("Position of s2 in s1 "+s1.indexOf(c1,12));

		
		//lastIndexOf
		System.out.println("Position of s2 in s1 "+s1.lastIndexOf(s2));

	}
}
