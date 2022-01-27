package LearnSelenium.TestNG.sessions;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginAssertions {

	WebDriver driver;
	SoftAssert softAssert;
	By username = By.name("uid");
	By password = By.name("password");
	By login  = By.name("btnLogin");
	//softAssert = new SoftAssert();

	@BeforeTest
	//@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/V1/index.php");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		softAssert = new SoftAssert();
		Login login = new Login(driver);

	}

	@Test
	public void loginTest(){

		Login.loginTest(username, driver,"mngr315599");
		Login.loginTest(password, driver,"nAhAmYr");
		Login.submitTest(login, driver);
		//driver.findElement(username).sendKeys("mngr315599");		
		//driver.findElement(password).sendKeys("nAhAmYr");
		//driver.findElement(login).click();
		String homePage =driver.getTitle();
		softAssert.assertEquals(homePage,"GTPL Bank Manager HomePage", "header not matched successfully");
		System.out.println(homePage);

		softAssert.assertAll();
	}

	@Test
	public void verifyTitle(){
		Assert.assertTrue(driver.findElement(By.xpath("(//a[@rel='home'])[2]")).isDisplayed());
		driver.findElement(By.xpath("//a[@href='MiniStatementInput.php']")).click();
		driver.findElement(By.xpath("//input[@name='accountno']")).sendKeys("12345567");
		driver.findElement(By.xpath("//input[@name='AccSubmit']")).click();
	     String verifyText =	driver.findElement(By.xpath("/html/body/div/h2[@class='barone']")).getText();
	    String verifyErrorMessage= driver.findElement(By.xpath("/html/body/div/h2[@class='barone']")).getAttribute("title");
		Assert.assertEquals(verifyText,"Gtpl Bank");
		Assert.assertEquals(verifyErrorMessage,"could not connect : Access denied for user 'root'@'localhost' (using password: NO)");
		

	}

	@AfterTest
	//@AfterMethod
	public void tearDown()
	{
		driver.close();
	}



}
