package LearnSelenium.SyncWaitImplicitWaitExplicitWait.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	String title;

	public Login(String title)
	{
		this.title = title ;
	}

	public static void main(String[] args)  {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		driver.get("https://phptravels.org/clientarea.php");
		String title =driver.getTitle();
		System.out.println(title);

		Login l = new Login(title);
		//l.setTitle(title);

		//WebDriverWait wait = new WebDriverWait(driver,3);

		//	driver.findElement(By.id("inputEmail")).sendKeys("a007zope@gmail.com");
		By emailID =By.id("inputEmail");

		/*wait.until(ExpectedConditions.titleContains("title"));
		wait.until(ExpectedConditions.presenceOfElementLocated(emailID));
		 */


		String titleVerification = l.waitForElement(driver, 7);
		System.out.println(titleVerification);
		driver.findElement(By.id("inputPassword")).sendKeys("Ness@123");
	}

	/*public void setTitle (String title)
	{

		this.title =title;
	}
	 */


	public String waitForElement(WebDriver driver, long value ){
		WebDriverWait wait = new WebDriverWait(driver,value);
		Boolean t=wait.until(ExpectedConditions.titleContains(title));
		if(t.equals(true))
		{
		
		}

		return title;
	}

}
