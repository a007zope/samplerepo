package LearnSelenium.seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GettingTextValue {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("Aditya");


		String attributeValue = driver.findElement(By.xpath("//input[@id='login1']")).getAttribute("value");
		System.out.println(attributeValue);



	}

}
