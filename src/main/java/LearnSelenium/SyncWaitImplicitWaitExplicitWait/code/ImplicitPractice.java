package LearnSelenium.SyncWaitImplicitWaitExplicitWait.code;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class ImplicitPractice {

	static WebDriver driver;


	@BeforeTest
	public void setUp(){
		// TODO Auto-generated method stub
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
	}

	@Test
	public void verifyText()
	{
		driver.get("https://app.hubspot.com/login?__cf_chl_jschl_tk__=81c1766e6e315e62611246db23bbbc8b5b836dce-1617183014-0-ATpvU0NRUXW9glovT_qXJW5QEDLgtI1CjfgqlOeCcl4ZlWlhHE4UzdOXK12PJM3SvhbBqjtNeCNxVrRWleO3jRLFa5rFj6w-eZ_CGWBFccoq79gQ3iDtAw0w00YB5HL5OTmLTdD5KgpmPpkq9CVXpBlHoH_hG2JzWhZS62TxCSyu-cTfrFCMLQFb3eOq5_HPi_GG0W_wdgj_xN-Qu4AZsfRykRy9OinZDuVDw99ct7uOnJraLWv-DEuTdJgr7f1L8pnT_wLQEAvKX1xLfon13aQ7AjOHE8ppnj18xNl4iu5gSUw1UhprcVmhbrtJSAXQr0_topmyGUX2VfAwoswXT7NLEKu-zz-o-4W0Fe5KNc44ecf8iy1wszB0yEYN4I-z0VQ_9psBM25LoVVhgZbqjMUR7HZH7ABi91edjf3IPM4SIHFCpU4wPlX6a3VtCPVpzQ");
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("aditya@yopmail.com");
		driver.findElement(By.id("password")).sendKeys("Ness@123");
		driver.findElement(By.xpath("//i18n-string[text()='Log in']")).click();

		//driver.get("https://automationbookstore.dev/");
		//driver.get("http://demo.guru99.com/test/guru99home/");
		/*driver.manage().window().fullscreen();
		driver.findElement(By.id("searchBar")).sendKeys("java");

		String bookName = driver.findElement(By.xpath("//h2[text()='Java For Testers']")).getText();
		System.out.println(bookName);
		Assert.assertEquals(bookName, "Java For Testers");*/
		//String text =driver.findElement(By.xpath("//h3[text()='All provided FREE!!!']")).getText();
		/*Assert.assertEquals(text,"All provided FREE!!!");
		System.out.println(text);*/

	}

	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}


}
