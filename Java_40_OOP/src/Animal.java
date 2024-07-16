
public class Animal {
	protected String name;
	
	public Animal (String Ten)
	{
		this.name=Ten;
	}
		
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat()
	{
		System.out.println("Mam mam");
	}
}
