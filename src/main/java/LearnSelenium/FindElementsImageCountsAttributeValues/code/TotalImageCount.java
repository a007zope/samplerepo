package LearnSelenium.FindElementsImageCountsAttributeValues.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImageCount {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https:\\www.amazon.in");
		List<WebElement> imgSize =  driver.findElements(By.tagName("img"));
		System.out.println(" the total image size is "+imgSize.size());

		for(int i =0;i<imgSize.size();i++)
		{
			String imageURL =imgSize.get(i).getAttribute("src");
			System.out.println(imageURL);

		}


	}

}
