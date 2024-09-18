package EX;

public class Test_Box_Object {
	public static void main(String[] args) {
		Box_Object<String> hop = new Box_Object<String>("Yeu em 123");
		Box_Object hop2 = new Box_Object<Integer>(15);
		Box_Object<Double> hop3 = new Box_Object<Double>(15.6);
		System.out.println("String: "+hop.getValue());
		System.out.println("Integer: "+hop2.getValue());
		System.out.println("Double: "+hop3.getValue());

	}
}
