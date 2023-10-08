package day4;


class animall{ 
	void eat()
	{
	System.out.println("is eating");
	}  
}  
class dogg extends animall{  
	void bark()
	{
	System.out.println("dog is barking");
	}  
}  
class BabyDog extends dogg{ 
	void weep()
	{
		System.out.println("dog is weeping");
	}  
}  
public class multipleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BabyDog d=new BabyDog();  
		d.eat();
		d.weep();  
		d.bark();  
		 
		animall a=new animall();
		a.eat();

	}

}
