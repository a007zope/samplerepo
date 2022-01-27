package LearnSelenium.seleniumPractice1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		WebElement proceedButton =driver.findElement(By.cssSelector("input.signinbtn"));
		proceedButton.click();

		Alert a = driver.switchTo().alert();
		String alertText =a.getText();
		System.out.println(alertText);

		if(a.getText().equals("Please enter a valid user name"))
		{
			System.out.println("Alert verification Successful");
		}

		else 
		{
			System.out.println("Alert Verification not successful");
		}

		Thread.sleep(5000);
		a.accept();


		//driver.close();
	}

}
