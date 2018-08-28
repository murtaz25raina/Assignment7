interface Animal
{
	void speak();
	void eat();
}
class Dog implements Animal
{
	public void speak()
	{
		System.out.println("Dog Barks");
	}
	public void  eat()
	{
		System.out.println("Dog eats Pedigree");	
	}
}
class Cat implements Animal
{
	public void speak()
	{
		System.out.println("Cat Meows");
	}
	public void eat()
	{
		System.out.println("Cats love Milk");
	}
}
public class Interfaces {

	public static void main(String[] args) {
	 Animal obj=new Dog();
	 Animal obj2=new Cat();
	 obj.speak();
	 obj.eat();
	 obj2.speak();
	 obj2.eat();

	}

}