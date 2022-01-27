package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:/Users/p7111642.NTIL/Downloads/chromedriver_win32/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		Thread.sleep(5000);
		WebElement t =	driver.findElement(By.id("firstName"));
		t.sendKeys("Aditya");
		WebElement y =driver.findElement(By.name("lastName"));
		y.sendKeys("Zope");
		Thread.sleep(2000);
		WebElement i =	driver.findElement(By.id("username"));
		i.sendKeys("azope398");
		WebElement u = driver.findElement(By.name("Passwd"));
		u.sendKeys("Ness@123");

		WebElement j = driver.findElement(By.xpath("//*[@id='confirm-passwd']/div[1]/div/div[1]/input"));
		j.sendKeys("Ness@123");

		WebElement k =  driver.findElement(By.className("VfPpkd-muHVFf-bMcfAe"));
		k.click();
		WebElement l =  driver.findElement(By.xpath("//*[@id='accountDetailsNext']/div/button/div[2]"));
		l.click();
		String url =	driver.getCurrentUrl();
		System.out.println(url);

		Thread.sleep(5000);

		WebElement back =	driver.findElement(By.xpath("//*[@id='view_container']/div/div/div[2]/div/div[2]/div/div[2]/div/div/button"));
		
	WebElement u1 =	driver.findElement(By.cssSelector("#phoneNumberId"));
u1.sendKeys("9860653475");


		//	JavascriptExecutor js =  (JavascriptExecutor)driver;
		//	js.executeScript("arguments[0].click",back);
		String url1 =	driver.getCurrentUrl();
		System.out.println(url1);


	//	back.click();

		//driver.close();













	}

}
