package day6;

public class overloadingdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		point p= new point();///-> 1st constructor
	//	point p1= new point(3.0,5.0,8.0);//-> error coz this is double
		point p1= new point(3.0f,5.0f,8.0f);

		System.out.println(methodOverloading.add(10,20));
		methodOverloading.add(10.3f,20.6f);// doesnt print
		
		System.out.println(methodOverloading.add(10.3f,20.6f));
		//methodOverloading.add(10.0,20.0);//error, so create another with double as parameter
		}




	}


