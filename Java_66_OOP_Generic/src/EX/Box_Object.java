package EX;

public class Box_Object<T> {
	private T value;

	public Box_Object(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}

	public void setValue(T value) {
		this.value = value;
	}
	
}
