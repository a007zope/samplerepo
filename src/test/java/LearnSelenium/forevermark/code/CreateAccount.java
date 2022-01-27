package LearnSelenium.forevermark.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://cms.uat.forevermark.com/en-us/my-account/sign-in/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("onetrust-accept-btn-handler")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("span.btn.button[data-stay-button='']")).click();


		Thread.sleep(5000);


		driver.findElement(By.cssSelector("input#login_UserName[class='fullWidth']")).sendKeys("mar2501@yopmail.com");
		driver.findElement(By. cssSelector("input#login_Token[class='fullWidth']")).sendKeys("Ness@123");
		driver.findElement(By.id("btnSubmit")).click();
		driver.findElement(By.cssSelector("span.name.dashboard-name[href='/en-us/my-account/marketing-preferences/'']")).click();
		driver.findElement(By.cssSelector("label[for='EmailConsent']")).click();

		System.out.println("alrt");
		//driver.findElement(By.xpath("//a[@data-site='en-US']")).click();
		/*driver.findElement(By.cssSelector("button#onetrust-accept-btn-handler")).click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.xpath("img[alt ='icons_2018']")).click();*/
		System.out.println("Execution successful");
		//driver.close();






	}

}
