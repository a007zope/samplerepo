package LearnSelenium.locators.notes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CSSlocators {

	public static void main(String[] args) {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("input.mr-sm-2.form-control[placeholder='Last Name']")).sendKeys("Zope");
		driver.findElement(By.cssSelector("input[id='userEmail']")).sendKeys("a007zope@yopmail.com");
		driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-1']")).click();
		driver.findElement(By.cssSelector("div>input[id='userNumber']")).sendKeys("9860653475");

		System.out.println("successful");
		driver.findElement(By.cssSelector("div>input[id^='date']")).click();
		System.out.println("alert");
		//driver.findElement(By.xpath("//div[@id='subjectsContainer']")).sendKeys("Selenium");

			driver.findElement(By.cssSelector("label[for*='hobbies']")).click();
			
				driver.findElement(By.cssSelector("label[for='hobbies-checkbox-2']")).click();
		
	

		System.out.println("execution successful");
		//driver.close();





	}

}
