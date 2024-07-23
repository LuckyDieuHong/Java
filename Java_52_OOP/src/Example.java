
public class Example {
	public static void main(String[] args) {
		String s1 = "mInH qUaN";
		String s2 = "@gmail.com";
		String s3 = s1+s2;
		
		// concat
		String s4 = s1.concat(s2);
		System.out.println(s3);
		System.out.println(s4);
		
		// replaceAll()
		String s5 = "Cadieuhong.com";
		System.out.println( s5.replaceAll("123","cAdIeUhOnG" ) );
		
		// toLowerCase --- toUpperCase
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());

		// trim => delect blanch space
		String s9 = "   kho chiu        vai lin                    ";
		System.out.println(s9.trim());
		
		// subString => cut subtring
		String s10 = "Ca hong thom ngon .com";
		System.out.println(s10.substring(3, 5));
		System.out.println(s10.substring(2));
		System.out.println(s10.substring(-99));
	}
}
