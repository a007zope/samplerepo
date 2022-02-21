package SeleniumSession9;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FBAssign {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver  = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");

		By day = By.id("day");
		By month = By.id("month");
		By year = By.id("year");
		//WebElement ele = driver.findElement(day);

		//s.selectByValue("1");

		doDropDownSelect(day,"20");
		doDropDownSelect(month,"4");
		doDropDownSelect(year,"1994");
		List<String> selectedDay =	getAllSelectedOptions(day);

		List<String> selectedMonth =	getAllSelectedOptions(month);

		List<String> selectedYear =	getAllSelectedOptions(year);

		System.out.println(selectedDay);
		System.out.println(selectedMonth);
		System.out.println(selectedYear);
	}

	public  static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static void doDropDownSelect(By locator ,String value)

	{	Select s = new Select(getElement(locator));
	s.selectByValue(value);
	}

	public static void doDropDownSelect(By locator ,int index)

	{	Select s = new Select(getElement(locator));
	s.selectByIndex(index);
	}

	public static List<String> getAllSelectedOptions(By locator) {

		Select s = new Select(getElement(locator));
		List<WebElement> list =  s.getAllSelectedOptions();
		List<String> optSelected = new ArrayList<String>();
		for(WebElement e : list)
		{
			optSelected.add(e.getText());
		}


		return optSelected;
	}

	public static void doDropDownSelect(String value, By locator)

	{	Select s = new Select(getElement(locator));
	s.selectByVisibleText(value);	
	}








}
