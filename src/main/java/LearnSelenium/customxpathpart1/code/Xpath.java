package LearnSelenium.customxpathpart1.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
        driver.findElement(By.id("username")).sendKeys("a007zope@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Aditya@123");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		driver.findElement(By.xpath("//img[@alt='Aditya Zope'][1]")).click();
		driver.findElement(By.xpath("(//span[@class='global-nav__primary-link-text'])[1]")).click();

		String verifyText =driver.findElement(By.xpath("(//div[@data-control-name='identity_welcome_message'])")).getText();
		System.out.println(verifyText);
		if(verifyText.equals("Aditya Zope"))
		{
			System.out.println("Text Verified Successfully");
		}
		else
		{
			System.out.println("text verification failed");
		}





	}

}
