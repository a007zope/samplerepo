package LearnSelenium.FindElementsImageCountsAttributeValues.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorText {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.shopify.com/lookup?rid=0632564f-3737-4238-beb1-f4ec751fa198");
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.getTitle();
		driver.findElement(By.id("account_email")).sendKeys("a007zope");
		driver.findElement(By.name("commit")).click();
		String errorText =	driver.findElement(By.className("validation-error__message")).getText();
		System.out.println(errorText);


	}

}
