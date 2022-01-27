package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
		driver.manage().window().fullscreen();
		int w =25;
		for(int i=25;i<39;i++)
		{
			String actualXpath ="(//*[@id='java_technologies']//child::li)"+"["+w+"]";
			System.out.println(actualXpath);
			String text =driver.findElement(By.xpath(actualXpath)).getText();
			System.out.println(text);
			if(text.equals("SAP Basis"))
			{
				driver.findElement(By.xpath(actualXpath)).click();
				System.out.println(driver.getCurrentUrl());
				System.out.println(driver.getTitle());
				driver.navigate().back();
			}
			w++;
		}
	}

}
