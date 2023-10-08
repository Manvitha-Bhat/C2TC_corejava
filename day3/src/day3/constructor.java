package day3;

public class constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customer c = new customer();
		c.setCustomerId(1);
		//c.customerName="Mann";
		c.setCustomerName("Mann");
	    // c.customerCity="Blr";
		c.setCustomerCity("Bangalore");		
		//System.out.println(c.customerId + " " + c.customerName + " " + c.customerCity);
		System.out.println(c.getCustomerId() + " " + c.getCustomerName() + " " + c.getCustomerCity());
	}

}
