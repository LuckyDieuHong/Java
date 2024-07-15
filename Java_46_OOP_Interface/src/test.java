
public class test {
	public static void main(String[] args) {
		System.out.println("Test a: ");
		MayTinhCasioFX500 mfx500 = new MayTinhCasioFX500();
		MayTinhVinacal500 mvn500 = new MayTinhVinacal500();
		
		System.out.println("5 + 3 = "+mfx500.cong(5, 3));
		System.out.println("-4 * 3 = "+mfx500.nhan(5, 3));
		System.out.println("4/0 = "+mvn500.chia(4, 0));

		System.out.println("Test b: ");
		double[] arr1 = new double[] {10,9,62,88,99,-77,111,2021,33};
		double[] arr2 = new double[] {56,9,62,52,99,-77,-999,2021,33};
		InsertionSort sxchen = new InsertionSort();
		SelectionSort sxchhon = new SelectionSort();
		sxchen.sapXepTang(arr1);
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		System.out.println();
		sxchen.sapXepGiam(arr1);
		for (int i = 0; i < arr1.length; i++)
		{
			System.out.print(arr1[i]+" ");
		}
		
		
		System.out.println("Test c: ");
		PhanMemMayTinh pmmt = new PhanMemMayTinh();
		System.out.println("5 + 3 = "+pmmt.cong(5, 3));
		System.out.println("-4 * 3 = "+pmmt.nhan(5, 3));
		System.out.println("4/0 = "+pmmt.chia(4, 0));
		double[] arr3 = new double[] {-541,9,62,51651,99,-77,-66,888,33};
		pmmt.sapXepTang(arr3);
		for (int i = 0; i < arr3.length; i++)
		{
			System.out.print(arr3[i]+" ");
		}

	}
}
