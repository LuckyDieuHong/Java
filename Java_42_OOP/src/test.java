
public class test {
	public static void main(String[] args) {
		Dog d = new Dog();
		Cat c = new Cat();
		Bird b = new Bird();
		
		System.out.println("-----------------------");
		System.out.println(d.getName());
		d.eat();
		d.makeSound();
		System.out.println("-----------------------");
		System.out.println(c.getName());
		c.eat();
		c.makeSound();
		System.out.println("-----------------------");
		System.out.println(b.getName());
		b.eat();
		b.makeSound();
		System.out.println("-----------------------");
		
	}
}
