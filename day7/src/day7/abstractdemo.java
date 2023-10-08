package day7;

public  class abstractdemo  {

	public static void main(String[] args) {
		square s = new square();
		rectangle r= new rectangle();
		r.length=2;
		r.breadth=2;
//		rectangle r = new rectangle();
        //square s= new square();
		s.side=5;
		//System.out.println(s.calcarea());//--> wont print
		// so we can either do
		s.calcarea();s.show();
		r.calcarea();
		r.show();
		
		
		
		
	}


}
