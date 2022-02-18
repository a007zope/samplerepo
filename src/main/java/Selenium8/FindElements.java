package Selenium8;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	static int i =0;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		/*
		 * List<WebElement>imgList=driver.findElements(By.tagName("img"));
		 * 
		 * 
		 * System.out.println(imgList.size()); for(WebElement l:imgList) { String
		 * altValue =l.getAttribute("alt"); String srcValue = l.getAttribute("src");
		 * System.out.println(altValue + "----->>>"+" "+srcValue); }
		 */


		List<WebElement>linksList = driver.findElements(By.tagName("a"));
		System.out.println(linksList.size());
		for(WebElement h :linksList)
		{
			//			String linkValue =h.getText();
			//			System.out.println(linkValue);

			String actValue =linksList.get(i).getText();

			if(!(actValue.isEmpty()))
			{
				System.out.println(actValue);

			}

			if(actValue.contains("Shenanigans"))
			{
				System.out.println("Amazon contains the wordings Shenanigans");
			}
			i++;

		}

		driver.close();





	}

}
