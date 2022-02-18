package Selenium8;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JSAlertPopupHandle {

	public static void main(String[] args) throws InterruptedException {
		
		//alert
		//confirmation pop up
		//warning/error pop up 
		// submission pop up 
		// modal dialog
		// Js pop up 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert a = driver.switchTo().alert();
		String text =a.getText();
		if(text.contains("Please enter a valid user name"))
		{
			System.out.println("correct validation message ");
		}
	   //a.accept();// click on ok button
	  a.dismiss();// press esc/ cancel button/dismiss  the alert
		
		
	
		
		

	}

}
