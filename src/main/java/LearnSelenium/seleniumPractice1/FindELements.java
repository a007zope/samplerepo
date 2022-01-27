package LearnSelenium.seleniumPractice1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindELements {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		List<WebElement> links =  driver.findElements(By.tagName("a"));

		System.out.println(links.size());

		for(int i=0;i<links.size();i++)
		{
			System.out.println(links.get(i).getText());

		}

//text
		List<WebElement> typeTextList = driver.findElements(By.xpath("//input[@type='text']"));

		System.out.println(typeTextList.size());

		for(int i=0;i<typeTextList.size();i++)
		{
			System.out.println(typeTextList.get(i).getText());
		}

//img
		
		//driver.get("https://www.amazon.in/");
		driver.get("https:\\www.flipkart.com");
		List<WebElement> imgList = driver.findElements(By.tagName("img"));
		imgList.size();
		for(int i=0;i<imgList.size();i++)
			
		{
			String imgUrl =imgList.get(i).getAttribute("src");
			System.out.println(imgUrl);
			
			
		}
		
		//getting the text which we type thru sendkeys method
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		driver.findElement(By.name("name5752a194")).sendKeys("Aditya");
		String attributeValue = driver.findElement(By.name("name5752a194")).getAttribute("value");
		System.out.println(attributeValue);
		
		
//text 
		
		


	}

}
