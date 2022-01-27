package LearnSelenium.DropdownHandlingwithUtilties.code;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice3 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg");

		WebElement day =driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));



		ArrayList<String> ar=getDropdownList(month);
		System.out.println(ar);
		driver.close();

	}

	public static  ArrayList<String> getDropDownSelectByVisibleText(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);	
		s.selectByVisibleText(value);
		s.selectByVisibleText(value);
		ArrayList <String> ar = new ArrayList<String>();

		List<WebElement> list = 	s.getAllSelectedOptions();
		for(int i =0;i<list.size();i++)
		{
			String text =list.get(i).getText();
			ar.add(text);
			System.out.println(ar);
		}

		return  ar;
	}

	public static ArrayList<String> getDropdownList(WebElement element)
	{
		Select s = new Select(element);
		List<WebElement> list =	s.getOptions();
		String l = list.get(1).getText();
		ArrayList<String> ar = new ArrayList<String>();
		ar.add(l);

		for(int i =0;i<list.size();i++)
		{
			String l1=list.get(i).getText();
			ar.add(l1);
		}
		return ar;
	}








}


