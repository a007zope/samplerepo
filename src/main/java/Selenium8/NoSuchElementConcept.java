package Selenium8;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NoSuchElementConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement firstName =driver.findElement(By.id("Form_submitForm_subdomain"));
		firstName.sendKeys("Aditya");

		//		List<WebElement> listElements =	driver.findElements(By.className("text"));
		//		System.out.println(listElements.size());
		//
		//		for(WebElement e :listElements)
		//		{
		//			System.out.println(e);
		//		}
		//To Verify a single element 
		By freeTrialLink = By.linkText("FREE TRIAL");
		driver.findElement(freeTrialLink).click();

		// Verifying element using Boolean

		//		Boolean flag =	driver.findElement(freeTrialLink).isDisplayed();
		//		System.out.println(flag);
		//
		//		if(driver.findElements(freeTrialLink).size()>0)
		//		{
		//			System.out.println("freeTrialLink exists on the page");
		//		}
		//		else 
		//		{
		//			System.out.println("link doesnt exist");
		//		}


		List<WebElement> eleList =getElement(freeTrialLink);
		verifyLinkDisplayed(freeTrialLink,eleList);

		driver.close();
	}

	public static  List<WebElement> getElement(By locator)
	{
		return driver.findElements(locator);
	}


	public static  void verifyLinkDisplayed(By locator, List<WebElement> lList)
	{
		if(lList.size()>0)
		{
			System.out.println(locator +" "+"link exists");
		}
	}
	

	
	
	




}
