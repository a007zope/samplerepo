package LearnSelenium.TestNG.sessions;

import org.testng.annotations.Test;

public class InvocationCount {


	@Test(invocationCount =20)
	public void createUser()
	{
		System.out.println("Create user Successful");
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void loginUser()
	{
		System.out.println("User should be logged in successfully");
		int i =9/0;
	}
	
	
}
