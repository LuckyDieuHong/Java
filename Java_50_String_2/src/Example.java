
public class Example {
	public static void main(String[] args)
	{
		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		

		//Method equals => so sanh 2 chuoi giong nhau
		System.out.println("s1 equals s2: "+s1.equals(s2));
		System.out.println("s1 equals s3: "+s1.equals(s3));

		//equalsIgnoreCase => Khong racist
		System.out.println("s1 equalsIgonreCase s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgonreCase s3: "+s1.equalsIgnoreCase(s3));

		//compareTo
		String sv1 = "Phu";
		String sv2 = "Quan";
		String sv3 = "Quy";
		System.out.println("sv1 ? sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 ? sv3: "+sv1.compareTo(sv3));
		System.out.println("sv3 ? sv2: "+sv3.compareTo(sv2));

		//compareToIgnoreCase => Y chang equalsIgnoreCase
		String sv4 = "quy";
		String sv5 = "Quy";
		System.out.println("sv4 ? sv5: "+sv4.compareToIgnoreCase(sv5));
		System.out.println("sv4 ? sv5: "+sv4.compareTo(sv5));

		//regionMatches
		String r1 = "Ha Hong quan";
		String r2 = "Nguyen Hong Minh Quan";
		boolean check = r1.regionMatches(false, 8, r2, 17, 4);
		System.out.println("r1 ? r2: "+ check);
		
		//startsWith
		String sdt = "0901068775";
		System.out.println(sdt.startsWith("0931"));
		System.out.println(sdt.startsWith("0901"));
		//endWith
		String fileName = "Fuck you.PNG";
		System.out.println(fileName.endsWith(".PNG"));

	}
}
