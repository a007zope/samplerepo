package SeleniumSession9;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutUsingSelctINterVIewQUestion {

	// Interview Question asked, Without using any select methods,
	//Click on the selected drop down value

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		By country = By.id("Form_submitForm_Country");

		doClick(country,"India");
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void  doClick(By locator, String value)
	{
		Select s = new Select(getElement(locator));
		List<WebElement> optList =	s.getOptions();	
		for(WebElement e : optList)
		{
			String text =e.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				e.click();
				break;
			}
		}
	}

}
