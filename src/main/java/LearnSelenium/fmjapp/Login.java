package LearnSelenium.fmjapp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\qa.jewellermanagement.forevermark.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@id='onetrust-accept-btn-handler']")).click();
		driver.findElement(By.xpath("(//a[@class='menu-link'])[2]")).click();
		Thread.sleep(3000);

		WebElement userName =driver.findElement(By.name("username"));
		userName.sendKeys("us1@yopmail.com");

		WebElement passWord =driver.findElement(By.name("password"));
		passWord.sendKeys("Ness@999");

		WebElement submit =	driver.findElement(By.cssSelector("input.button.button-primary"));
		submit.click();

	
		
		Thread.sleep(3000);
		
		WebElement loginBtn = driver.findElement(By.xpath("(//span[contains(text(),'Manage My Diamonds')]"));
		
		JavascriptExecutor js1 = ((JavascriptExecutor) driver);
		
		js1.executeScript("arguments[0].click();", loginBtn);
		
		
		
		

		//clickElementByJS(mmd1,driver);

		/*Actions a = new Actions(driver);
		a.click(mmd).build().perform();
		 */		System.out.println("execution successful");

		 driver.close();



	}

	public static void clickElementByJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();", element);






	}


}