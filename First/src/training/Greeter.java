package training;

public class Greeter {
	
	private String name;
	
	public Greeter (String aName)
	{
		name = aName;
	}
	
	public String sayHello(){
		return "Hello, " + name + "!";
	}
	
}
