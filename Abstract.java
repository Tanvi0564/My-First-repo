//abstract demo
abstract class Animal
{
     abstract void sound();
     void eat()
     {
     	System.out.println("we are carnivorous");
     }
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Dogs bark");
	}
}
class Lion extends Animal
{
	void sound()
	{
		System.out.println("Lions roar");
	}
}
class Abstract
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		Lion l=new Lion();
		d.eat();
		d.sound();
		l.eat();
		l.sound();
	}
}
