package LearnSelenium.dropdownCommonUtilsSelectTag.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {
	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://orangehrm.com/orangehrm-30-day-trial/");

		By industry =By.id("Form_submitForm_Industry");
		By country = By.id("Form_submitForm_Country");
		By employees = By.id("Form_submitForm_NoOfEmployees");

		/*Select s = new Select(driver.findElement(industry));
s.selectByValue("Education");

		selectDropDown(industry,"Education");
		 */
		selectDropDownByValue(industry,"3","index");
		selectDropDownByValue(country,"Bahamas","visibleText");
		selectDropDownByValue(employees,"251 - 300","value");

	}

	public static void selectDropDownByValue(By locator,String value, String type)
	{
		Select s= new Select(getElement(locator));
		switch (type) {
		case "index":
			s.selectByIndex(Integer.parseInt(value));
			break;
		case "value":
			s.selectByValue(value);
			break;
		case "visibleText":
			s.selectByVisibleText(value);
			break;
		default:
			System.out.println("please pass the correct locator");
			break;
		}


	}

	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}


	public static void selectDropDown(By locator , String value)
	{
		Select s1 = new Select(getElement(locator));
		s1.selectByValue(value);
		List <WebElement> l1 =s1.getAllSelectedOptions();
		for(WebElement  e: l1)
		{
			String listValue =e.getText();
			System.out.println(listValue);


		}



	}

}
