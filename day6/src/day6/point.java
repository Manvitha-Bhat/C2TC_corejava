package day6;

public class point {

	private float x;
	private float y;
	private float z;
	

	public point(){
	super();
	}
	public point(float x, float y){
	super();
	this.x=x;
	this.y=y;}

	public point(float x){
	super();
	this.x=x;
	
	}
	public point (float x, float y, float z){
	super();
	this.x=x;
	this.y=y;
	this.z=z;
	}

	public String toString()
	{
	return "point [x="+x+",y="+y+"]";
	}


}
