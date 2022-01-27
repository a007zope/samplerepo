package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigate {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();

		//System.setProperty("webdriver.chrome.driver", "C:/Users/p7111642/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//	driver.get("https:\\www.google.com");
		//driver.get("https:\\www.amazon.com");
		driver.get("https://app.hubspot.com/login");
		String title =driver.getTitle();
		System.out.println(title);
		

	driver.navigate().to("https:\\www.amazon.in");
		String title1 =	driver.getTitle();
		
		try
		{
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.titleContains("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"));
		
		System.out.println(title1);
		}
		catch(Exception e)
		{
			System.out.println("aditya throws exception");
		}
		driver.navigate().back();
		driver.navigate().forward();
		 
		//driver.close();



	}

}
