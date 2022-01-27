package LearnSelenium.seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorDemo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");

		WebElement email = driver.findElement(By.id("input-email"));
		email.sendKeys("a008zope@yopmail.com");

		WebElement firstName = driver.findElement(By.name("firstname"));
		firstName.sendKeys("Aditya");

		WebElement lastName =driver.findElement(By.xpath("(//input[@class='form-control'])[2]"));	
		lastName.sendKeys("Zope");

		WebElement telePhone =driver.findElement(By.name("telephone"));
		telePhone.sendKeys("9561630596");

		//WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
		//passWord.sendKeys("Aditya@123");
		
		WebElement passWord1 = driver.findElement(By.cssSelector("input[name='password']"));
		
		passWord1.sendKeys("Aditya@123");

		WebElement passConfirm = driver.findElement(By.cssSelector("input#input-confirm"));
		passConfirm.sendKeys("Aditya@123");

		WebElement subscribe = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		subscribe.click();


		WebElement checkBox = driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkBox.click();


		WebElement continue1 = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		continue1.click();
		
		
		
		
		
		
		
		



	}

}
