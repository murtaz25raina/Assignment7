abstract class Animal
{
	String color,breed,name;
   abstract void eat();
   void speak()
   {
	   System.out.println("Barks");
   }
   
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog eats Pedigree");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
     Animal A=new Dog();
     A.eat();
     A.speak();
     
	}
}