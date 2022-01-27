package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CssSelector {
	static WebDriver driver;
	static By day = By.xpath("//select[@id='day']");
	static By month = By.xpath("//select[@id='month']");
	static By year = By.xpath("//select[@id='year']");


	public static void main(String[] args) {

		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/reg");
		/*driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Aditya");
		driver.findElement(By.cssSelector("input[name=lastname]")).sendKeys("Zope");
		driver.findElement(By.cssSelector("input[name=reg_email__]")).sendKeys("march31@yopmail.com");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[4]")).sendKeys("march31@yopmail.com");
		driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Ness@123");
		WebElement s1 =driver.findElement(By.xpath("//select[@id='day']"));
		WebElement s2 = driver.findElement(By.xpath("//select[@id='month']"));
	      WebElement s3 = driver.findElement(By.xpath("//select[@id='year']"));*/
		/*WebElement day1 =  getLocator(driver,day);
		WebElement month1 =  getLocator(driver,month);
		WebElement year1 =  getLocator(driver,year);

		selector(day1,"5");
		selector(month1,"3");
		selector(year1,"2011");

		driver.close();*/
		driver.findElement(By.cssSelector("Select>option:nth-of-type(7)")).click();
		driver.findElement(By.cssSelector("span>select[id='month']>option:nth-of-type(2)")).click();
		driver.findElement(By.cssSelector("span>select[id='year']>option:nth-of-type(5)")).click();
	String year =	driver.findElement(By.cssSelector("span>select[id='year']>option:nth-of-type(5)")).getText();
	System.out.println(year);

		System.out.println("script successful");

		driver.close();





		//Select day = new Select(day2);
		//Select month = new Select(s2);
		//Select year = new Select(s3);

		/*day.selectByValue("2");
		month.selectByVisibleText("Mar");
		year.selectByValue("2019");
		 */
		//driver.get("https://demoqa.com/automation-practice-form");
		/*driver.findElement(By.cssSelector("input#firstName")).sendKeys("Aditya");// tag#id
		driver.findElement(By.cssSelector("input.form-control#lastName")).sendKeys("Zope");//tag.class#id
		driver.findElement(By.cssSelector("input[placeholder='name@example.com']")).sendKeys("a007zopemarch@yopmail.com");//using tag and other attributes 
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.cssSelector("input#userNumber[placeholder='Mobile Number']")).sendKeys("9860653475");
		 */
		//driver.findElement(By.id("//div[@id='dateOfBirth']")).sendKeys("03May21");
		//driver.findElement(By.cssSelector("input#dateOfBirthInput")).sendKeys("03May21");


		//driver.findElement(By.cssSelector("input#u_0_n_qH")).sendKeys("Aditya");
		/*driver.findElement(By.cssSelector("input#inputtext _58mg _5dba _2ph-")).sendKeys("Zope");
		driver.findElement(By.cssSelector("input#true")).sendKeys("a007march31@yopmail.com");
		driver.findElement(By.cssSelector("input#inputtext _58mg _5dba _2ph-#password")).sendKeys("Ness@123");*/



	}

	public static WebElement getLocator(WebDriver driver, By  locator)
	{
		WebElement element =driver.findElement(locator);
		return element;
	}

	public static void selector(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByValue(value);

	}

}
