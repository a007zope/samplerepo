package SeleniumSession9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchAssignment {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[@class=\"ac_results\"]//li[contains(text(),'Summer Dresses > Printed Chiffon')]")).click();
		By dressList = By.xpath("//div[@class=\"ac_results\"]//ul/li[@class=\"ac_even\"]");
		
		String value ="Summer Dresses > Printed Chiffon";
		
		selectOptionFromSuggList(value);
		
		//		List<WebElement> dressList =	driver.findElements(By.xpath("//div[@class=\"ac_results\"]//ul/li[@class=\"ac_even\"]"));
		//
		//		System.out.println(dressList.size());
		//		for(WebElement e : dressList)
		//		{
		//			String text =e.getText();
		//			System.out.println(text);
		//			if(text.equals("Casual Dresses > Printed Dress"))
		//			{
		//				e.click();
		//				break;
		//			}
		//		}

		//doSearch("Casual Dresses > Printed Dress",dressList);
		//textVerification();
	}

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void selectOptionFromSuggList(String value)
	{
		driver.findElement(By.xpath("//div[@class=\"ac_results\"]//li[contains(text(),'"+value+"')]")).click();
	}

	public static void doSearch(String value , By locator) {

		System.out.println(getElements(locator).size());


		for(WebElement e : getElements(locator))
		{
			String text =e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
		textVerification();

	}

	public static void textVerification()
	{
		String actualText =driver.findElement(By.xpath("//h1[text()=\"Printed Dress\"]")).getText();
		if(actualText.equals("Printed Dress"))
		{
			System.out.println("Printed Dress Verification successful");
		}

	}


}
