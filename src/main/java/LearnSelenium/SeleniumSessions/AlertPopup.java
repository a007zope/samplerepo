package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(6000);
		Alert alert = driver.switchTo().alert();

		Thread.sleep(6000);
		System.out.println(alert.getText());

		if(alert.getText().equals("Please enter a valid user name"))
		{
			System.out.println("Alert Verification successful");
		}
		else
		{
			System.out.println("Alert Verification successfully verified for incorrect message");
		}



	}

}
