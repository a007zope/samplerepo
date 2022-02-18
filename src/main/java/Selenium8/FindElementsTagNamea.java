package Selenium8;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsTagNamea {

	public static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		FindElementsTagNamea findElements = new FindElementsTagNamea();
		driver.get("https://www.amazon.com/");
		By a = By.tagName("a");
		By img = By.tagName("img");
		//int y =getElementCount(a);
		//	System.out.println(y);
		//List<String>textList1 =getTextElement(a);
		//System.out.println(textList1);
		List<String> list =	getAttributeList(img,"src");

		findElements.printAttributeList(getAttributeList(img,"src"));


	}


	public static int  getElementCount(By locator)
	{
		return driver.findElements(locator).size();
	}

	public static List<String> getTextElement(By locator)
	{
		List<WebElement>linkList =driver.findElements(locator);
		List<String>textList = new ArrayList<String>();

		for(WebElement f :linkList)
		{
			String text= f.getText();

			if(!(text.isEmpty()))
			{
				//System.out.println(text);
				textList.add(text);
			}

		}

		return textList;
	}


	public static List<String> getAttributeList(By locator,String attValue)
	{
		List<WebElement>linkList =driver.findElements(locator);

		List<String> attList = new ArrayList<String>();
		for(WebElement e : linkList)
		{
			String attributeValue =e.getAttribute(attValue);
			attList.add(attributeValue);

		}

		return attList;
	}

	public void printAttributeList(List<String> printList)
	{
		for(String u: printList)
		{
			System.out.println(u);
		}

	}



}


