package SeleniumSession9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

// Without using select class then we need to create a xpath  or a css selector.

public class SelectDropDownWithoutSelectClassInterviewQuestion {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By country = By.id("Form_submitForm_Country");

		By countryXpath  = By.xpath("//Select[@id=\"Form_submitForm_Country\"]/option");
//
//		List<WebElement>countryList =	driver.findElements(By.xpath("//select[@id=\"Form_submitForm_Country\"]/option"));
//
//		for(WebElement e : countryList)
//		{
//			String text =e.getText();
//			if(text.equals("Cuba"))
//			{
//				e.click();
//				break;
//			}
//		}
		
		doClickUsingWSel(countryXpath,"India");
		
	}

	public  static List<WebElement> getElement(By locator)
	{
		return driver.findElements(locator);
	}

	public static void doClickUsingWSel(By locator, String value)
	{
		List<WebElement>countryList  =getElement(locator);

		for(WebElement e : countryList)
		{
			String text =e.getText();
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}

	}

}
