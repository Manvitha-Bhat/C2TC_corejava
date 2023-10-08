package day4;


class Animal{  
void eat()
{
	System.out.println(" is eating");
	}  
}  
class Dog extends Animal{  
void bark()
{
	System.out.println("dog is barking.");
	}  
}  
public class singleInheritence {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();  
		Animal a= new Animal();
		a.eat();
		d.bark();  
		d.eat();
		
	}

}
