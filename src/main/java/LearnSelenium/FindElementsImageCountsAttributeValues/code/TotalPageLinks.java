package LearnSelenium.FindElementsImageCountsAttributeValues.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.amazon.in");

		List<WebElement> linkList=	driver.findElements(By.tagName("a"));

		System.out.println("the size of link list is "+ linkList.size());

		for(int i =0;i<linkList.size();i++)
		{
			String text = linkList.get(i).getText();
//System.out.println(text);
		//	if(text.equals(""))
/*			if(text.isEmpty())
			{

			}
			else
			{
				System.out.println(text);
			}*/
		}










	}

}
