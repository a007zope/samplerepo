package LearnSelenium.ActionsSendkeys.Screenshotutil.Elementutil.genericmethod.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Util {

	static WebDriver driver;

	public Util (WebDriver driver)
	{
		this.driver = driver;
	}
	/** 
	 * the below webmethod will fetch u the locator
	 * @param locator
	 * @return
	 */
	public  static WebElement getElement(By locator)
	{
		WebElement element = null;
		try
		{
			element =  driver.findElement(locator);

		}
		catch(Exception e )
		{
			System.out.println("exception is thrown");
			//e.printStackTrace();
		}
		return element;
	}
	/**
	 * The below method will type the text in the empty textbox 
	 * @param locator
	 * @param textName
	 * @return
	 */

	public static String  doTypeInText(By locator,String textName)
	{

		getElement(locator).sendKeys(textName);

		
		return textName;
	}

	/**
	 * The below method helps to click on a web element
	 * @param locator
	 */
	public static void doClick(By locator)
	{
		getElement(locator).click();
	}

















}
