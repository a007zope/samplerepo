package SeleniumSession16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitlyWait {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		/* Explicitly wait is a high level wait 
		 * it can be applied for a specific element  
		 * i e it can be customize for a specific element as per the use case. 
		 * not a global wait
		 * It can be applied for all the non web elements 
		 * eg alert,url,title
		 * 
		 * WebDriverWait(C)---Extends-->FluentWait(C)--implements----> Wait(I)
		 * 
		 * 
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
	
		By userName = By.name("email");
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
	WebElement userName_ele =	wait.until(ExpectedConditions.presenceOfElementLocated(userName));
		
		userName_ele.sendKeys("a007zope@yopmail.com");
		driver.findElement(By.name("password")).sendKeys("Ness@123");
		driver.findElement(By.xpath("//div[text()=\"Login\"]")).click();

		


















	}

}
