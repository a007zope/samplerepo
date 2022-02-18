package staticandNonstatic;

public class Customer {
	String name ;
	int  id ;
	static String city = "Mumbai";
	static String paymentMethod ="CC";

	public void get() {
		System.out.println("get Info---");
	}

	public static  void sendMail()
	{
		System.out.println("Send Mail");
	}

	public static void main(String[] args) {
		Customer obj = new Customer();
		
		// how to call static methods
		// 1 call directly 
		sendMail();
		obj.get();
		
		//2 using class Name
		Customer.sendMail();
		
		// 3 using Object Reference but with a warning
		obj.sendMail();
		
		
	}





}
