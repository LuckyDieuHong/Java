
public class Cat extends Animal{

	public Cat() {
		super("Cat");
	}
	
	@Override
	public void eat()
	{
		System.out.println("Toi an xuong ca");
	}

	@Override
	public void makeSound() {
		System.out.println("Meo meo");
	}

	
}
