package LearnSelenium.DropdownHandlingwithUtilties.code;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");

		WebElement day =	driver.findElement(By.id("day"));
		
	List<WebElement> dayl =	getDate(day);
	for(int i =0;i<dayl.size();i++)
	{
		System.out.println(dayl.get(i).getText());
	}

		WebElement month = driver.findElement(By.id("month"));
		
		List<WebElement> monthl = getDate(month);
		for(int i =0;i<monthl.size();i++)
		{
			System.out.println(monthl.get(i).getText());
		}

		WebElement year = driver.findElement(By.id("year"));

		
		List<WebElement> yearl=getDate(year);
		for(int i =0;i<yearl.size();i++)
		{
			System.out.println(yearl.get(i).getText());
		}
		
		/*Select s = new Select(day);
		List<WebElement> dayList	=s.getOptions();

		System.out.println(dayList.size());

		for(int i =0;i<dayList.size();i++)
		{
			System.out.println(dayList.get(i).getText());
		}

		System.out.println("-----------------------------------------------------------------------------------------");
		Select s1 = new Select (month);
		List<WebElement> monthList = s1.getOptions();
		System.out.println(monthList.size());

		for(int i =0;i<monthList.size();i++)
		{
			System.out.println(monthList.get(i).getText());
		}

		System.out.println("-----------------------------------------------------------------------------------------");

		Select s2 = new Select(year);
		List<WebElement>yearList=s2.getOptions();
		System.out.println(yearList.size());

		for(int i =0;i<yearList.size();i++)
		{
			System.out.println(yearList.get(i).getText());
		}

		
		
*/		driver.close();

	}
	
	public static List<WebElement> getDate(WebElement element)
	{
		Select s2 = new Select(element);
		List<WebElement>dropDownList=s2.getOptions();
		System.out.println(dropDownList.size());

		for(int i =0;i<dropDownList.size();i++)
		{
			System.out.println(dropDownList.get(i).getText());
		}

		return dropDownList;
	}

}
