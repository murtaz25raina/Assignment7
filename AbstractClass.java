abstract class Animal
{
	String color="black",breed="German",name="Kesper";
   abstract void eat();
   void speak()
   {
	   
	   System.out.println(name+" is a "+color+" coloured "+breed +" breed who Barks");
   }
   
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println(super.name+" eats Pedigree");
	}
}
public class AbstractClass {

	public static void main(String[] args) {
     Animal A=new Dog();
     A.eat();
     A.speak();
     
	}
}
