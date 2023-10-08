package day7;

public  class square extends shape{
	float side;
	@Override
	void calcarea() {
		// super we use to access the parent class variable
		super.area=side*side;
		
}
}
