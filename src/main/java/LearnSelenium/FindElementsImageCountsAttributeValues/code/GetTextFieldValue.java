package LearnSelenium.FindElementsImageCountsAttributeValues.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetTextFieldValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("a007zope@rediffmail.com");
		String value =driver.findElement(By.id("login1")).getAttribute("value");
		System.out.println(value);
		driver.findElement(By.id("password")).sendKeys("Ness@123");
		String value1=	driver.findElement(By.id("password")).getAttribute("value");
		System.out.println(value1);


		// for getting the value i e Text  available in the link we use get text method.In this example forgot password is the link.
		String y =driver.findElement(By.linkText("Forgot Password?")).getText();

		driver.findElement(By.linkText("Forgot Password?")).click();

		if(y.equals("Forgot Password?"))
		{
			System.out.println("Text Verification Successful");
		}


		System.out.println(driver.getTitle());

		driver.findElement(By.className("rTextfield")).sendKeys("a007zope@gmail.com");
		String emailID =	driver.findElement(By.className("rTextfield")).getAttribute("value");// For getting the value  I e Text available or entered  in the TextField 
		System.out.println(emailID);
		// 




	}

}
