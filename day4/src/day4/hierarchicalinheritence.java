package day4;


class Animalll{  
	void eat()
	{
		System.out.println(" is eating");
		}  
}  
class Doggg extends Animalll{ 
	void bark()
	{
	System.out.println("dog is barking");
	}  
}  
class Cat extends Animalll{
	void meow()
	{
		System.out.println("cat is meowing");
		}  
}
public class hierarchicalinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c=new Cat();  
		c.meow();  
		c.eat();  
		//c.bark();//C.T.Error  
		Doggg d=new Doggg();
		d.bark();
		d.eat();

	}

}
