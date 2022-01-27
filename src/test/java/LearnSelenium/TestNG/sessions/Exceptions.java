package LearnSelenium.TestNG.sessions;

import java.io.IOException;

import org.testng.annotations.Test;

public class Exceptions {


	@Test(priority =1,expectedExceptions= ArithmeticException.class)
	public void Login()
	{
		System.out.println("Login Successful");
		int i =9/0;
	}

	@Test(priority =2,dependsOnMethods="Login")
	public void homePage()
	{
		System.out.println("homePage Methods");

	}





}
