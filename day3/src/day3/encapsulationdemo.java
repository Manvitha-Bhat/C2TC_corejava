package day3;

public class encapsulationdemo {
	public static void main(String[] args){
			customer c1 =new customer();
			c1.setCustomerId(1);
			c1.setCustomerName("mann ");
			c1.setCustomerCity("banglore ");
			System.out.println(c1.getCustomerId()+c1.getCustomerCity()+c1.getCustomerName());
	}
}
