package LearnSelenium.SyncWaitImplicitWaitExplicitWait.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExplicitPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://automationbookstore.dev/");

		driver.findElement(By.id("searchBar")).sendKeys("javascript");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,30);
		Boolean t =	w.until(ExpectedConditions.titleContains("Automation Bookstore"));
		System.out.println(t);


		driver.close();




	}
}

