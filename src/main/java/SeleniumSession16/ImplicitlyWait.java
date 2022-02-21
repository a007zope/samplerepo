package SeleniumSession16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWait {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));	
		driver.get("https://ui.cogmento.com/");
		driver.findElement(By.name("email")).sendKeys("a007zope@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Ness@123");
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();


		// implicit wait 
		// dynamic wait 
		// Global wait : the moment you apply this wait it will be applicable to all the global elements.


	}

}
