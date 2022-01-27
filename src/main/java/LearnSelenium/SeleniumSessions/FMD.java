package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FMD {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://qa.diamantaire.forevermark.com/system/login?ReturnUrl=%2f");
		driver.findElement(By.id("txbUsername")).sendKeys("adityafmd");
		driver.findElement(By.id("txbPassword")).sendKeys("Ness@123");

		Thread.sleep(5000);
		driver.findElement(By.name("ctl00$ctl00$Content$Content$btnlogin")).click();


		driver.findElement(By.className("rmText rmExpandDown"));
		driver.findElement(By.className("rmText"));
		
	}

}
