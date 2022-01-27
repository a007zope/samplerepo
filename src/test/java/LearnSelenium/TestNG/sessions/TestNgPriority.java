package LearnSelenium.TestNG.sessions;

import org.testng.annotations.Test;

public class TestNgPriority {

	@Test(priority =2)
	public void signIn()
	{
		System.out.println("test1");
	}

	@Test(priority =1)
	public void signIn2()
	{
		System.out.println("test2");
	}

	@Test
	public void alogout()
	{
		System.out.println("test3");	
	}

	@Test(expectedExceptions=ArithmeticException.class)
	public void finalLogout()
	{
		System.out.println("Final Logout");
		int i =9/0;
		System.out.println("Exception Faced");
	}

}
