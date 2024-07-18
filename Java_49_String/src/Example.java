import java.util.Scanner;

public class Example {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chuoiS;
		System.out.println("Nhap vao chuoi s: ");
		chuoiS = sc.nextLine();
		System.out.println("--------------");
		
		//Method lenght()
		System.out.println(chuoiS.length());
		
		//Method charAt(position) => Lay ra 1 ky tu tai 1 vi tri bat ky
		int doDai = chuoiS.length();
		for (int i = 0; i < chuoiS.length(); i++)
		{
			System.out.println("Vi tri "+i+" la: "+chuoiS.charAt(i));
		}
		
		//Method getChar() => Lay loat ky tu/ END - 1
		char []arrayChar = new char[doDai];
		chuoiS.getChars(2, 5, arrayChar, 0);
		for (int i = 0; i < arrayChar.length; i++)
		{
			System.out.println("Gia tri cua mang tai "+i+" la: "+arrayChar[i]);
		}
		
		//Method getByte() => 3 ways
		byte[] arrayBytes = chuoiS.getBytes();
		for(byte b : arrayBytes)
		{
			System.out.println(b);
		}
	}
	
}
