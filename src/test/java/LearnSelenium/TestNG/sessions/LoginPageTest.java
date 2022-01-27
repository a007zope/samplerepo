package LearnSelenium.TestNG.sessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.asserts.*;

public class LoginPageTest {


	WebDriver driver;

	@BeforeTest
	public void setUp(){
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://demo.guru99.com/test/selenium-xpath.html");
	}

	@Test(priority =1,expectedExceptions=ArithmeticException.class)
	public void loginPageTitleTest()
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.titleContains("XPath in Selenium"));

		String title = driver.getTitle();
		System.out.println("page title is "+ title);
		org.testng.Assert.assertEquals(title, "XPath in Selenium");
		int i =9/0;
	}

	@Test(priority = 2,dependsOnMethods="loginPageTitleTest")
	public void verifyLink()
	{
		//boolean flag =driver.findElement(By.linkText("Security Project")).isDisplayed();
		Assert.assertTrue(driver.findElement(By.linkText("Security Project")).isDisplayed());	
	}

	@Test(priority =3,dependsOnMethods="verifyLink")
	public void verifyLogin()
	{
		driver.findElement(By.linkText("Bank Project")).click();
		driver.findElement(By.name("uid")).sendKeys("mngr315599");
		driver.findElement(By.name("password")).sendKeys("nAhAmYr");
		driver.findElement(By.name("btnLogin")).click();
		String title =driver.getTitle();
		Assert.assertEquals(title,"GTPL Bank Manager HomePage");
		Assert.assertTrue(driver.findElement(By.xpath("//li[@class='orange']")).isDisplayed());

	}

	@AfterTest
	public void tearDown(){

		driver.quit();
	}



}



