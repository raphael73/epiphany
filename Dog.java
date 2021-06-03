public class Dog {
	private String Name;
	private String color;
	private int age;
	public Dog(String name, String color, int age) {
		this.Name = name;
		this.color = color;
		this.age = age;
	}
	public void displayDog()
	{
		System.out.println("Name:"+Name);
		System.out.println("COLOR:"+color);
		System.out.println("age:"+age);
	}
}
