package Selenium8;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		By giftCards = By.linkText("Gift Cards");
		By AmazonDevices = By.linkText("Amazon Devices");
		String giftCardsHref =	getAttribute(giftCards,"href");
		String deviceHref =getAttribute(AmazonDevices, "href");
		System.out.println(giftCardsHref);
		System.out.println(deviceHref);

	}

	public static  WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}

	public static String getAttribute(By locator, String value )
	{
		return getElement(locator).getAttribute(value);
	}


}
