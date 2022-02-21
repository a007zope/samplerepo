package SeleniumSession9;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelectTag {

	static WebDriver driver;

	public static void main(String[] args) {
		// drop down -- html tag --> Select 
		// select class in selenium  . will work only for those drop downs who have html tag as Select.
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//		//       s.selectByValue("Cuba");// value attribute
		//    s.selectByVisibleText("India");// text of the option

		By country = By.id("Form_submitForm_Country");
		WebElement dropDown =	getElement(country);
		doSelectDropDownByIndex(dropDown,3);

	}

	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}


	public static  void doSelectDropDownByIndex(WebElement element, int index)
	{
		Select s = new Select(element);

		s.selectByIndex(index);

	}
}
