package LearnSelenium.ActionsSendkeys.Screenshotutil.Elementutil.genericmethod.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionEvents {

	// using Action class sendKeys method

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/reg");
		String url =driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.tagName("input")).sendKeys("Aditya");
		System.out.println("Execution successful");
		WebElement firstName =driver.findElement(By.name("firstname"));
		WebElement signUp =driver.findElement(By.name("websubmit"));
		Actions a  = new Actions(driver);
		a.sendKeys(firstName, "aditya").build().perform();
		a.click(signUp).build().perform();
		driver.close();






	}

}
