package day9;

public class wrapperclassDemo {

	public static void main(String[] args) {
		 //autoboxing:
		 int i=10;// -> primitive type creation
		 Integer k=i;
		 
		 //unboxing:
		 Integer x=20;//wrapper type
		 int y=x;//-> new version
		// int z= x.intValue();//-> old version
		 System.out.println(k);
		 System.out.println(y);
		 
		 
		 float a=12.22f;
		//Interger b= a;-> error coz type mismatch
		Integer b=(int) a;
		System.out.println(b);
	}

}
