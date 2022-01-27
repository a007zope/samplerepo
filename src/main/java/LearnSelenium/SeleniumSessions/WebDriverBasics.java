package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverBasics {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "C:/Users/p7111642/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//1) open the browser

		//C:\Users\p7111642\Downloads\chromedriver_win32

		//driver.get("https:\\www.google.com");//2) enter url
		driver.get("https://app.hubspot.com/contacts/20112154/contacts/list/view/unassigned/");
		String h = driver.getTitle();//3) getTitle
		System.out.println(h);

		//4 Validation point 
		if(h.equals("Google"))
		{
			System.out.println("correct title");
		}
		else
		{
			System.out.println("Incorrect title");
		}

		System.out.println(driver.getCurrentUrl());
		//driver.close();
		//	System.out.println(driver.getPageSource());
		//	driver.quit();


	}

}
