import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegisPage {

	public  static WebDriver driver;


	public RegisPage(WebDriver driver)
	{
		this.driver = driver;

	}


	public static void main(String[] args) {

		//RegisPage r = new RegisPage(driver);

		BrowserUtil s = new BrowserUtil();
		WebDriver driver =	s.init_Driver("firefox");
		String title =  s.getURL("https://demo.opencart.com/index.php?route=account/register");

		// Locators 
		//		By firstName = By.name("firstname");
		//		By lastName = By.name("lastname");
		//		By email = By.name("email");
		//		By mobNo = By.name("telephone");
		//		By passWord  = By.name("password"); 
		//		//By passConfirm = By.name("confirm");
		//		By passConfirm = By.id("input-confirm");
		By newsLetterSubscription = By.name("newsletter");
		By checkBox = By.name("agree");
		By subButton = By.xpath("//input[@type='submit']");
		By tagName = By.tagName("h1");


		//		 RegisPage.doSendKeys(firstName,"aditya");
		//		 RegisPage.doSendKeys(lastName,"zope");
		//		  RegisPage.doSendKeys(email,"a007zope1@yopmail.com");
		//		  RegisPage.doSendKeys(mobNo,"9567672633123");
		//		  RegisPage.doSendKeys(passWord,"Ness@123");
		//		  RegisPage.doSendKeys(passConfirm,"Ness@123");

		//		click(newsLetterSubscription);
		//		click(checkBox);
		//		click(subButton);

		RegisPage.doSendKeys("name","firstname", "Aditya");
		RegisPage.doSendKeys("name","lastname", "Zope");
		RegisPage.doSendKeys("name","email", "a007zope5@yopmail.com");
		RegisPage.doSendKeys("name","telephone", "8675673627");
		RegisPage.doSendKeys("name","password", "Ness@123");
		RegisPage.doSendKeys("id","input-confirm", "Ness@123");

		click(newsLetterSubscription);
		click(checkBox);
		click(subButton);
		String a =getText(tagName);
		System.out.println(a);




	}

	// functions to be used 	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}




	public static void click(By locator)
	{
		getElement(locator).click();
	}


	public static String  getText( By locator)
	{
		return getElement(locator).getText();
	}


	public static void doSendKeys(By locator, String value)
	{
		getElement(locator).sendKeys(value);
	}


	/*
	 * @getBy( String locatorType, String locatorValue)
	 * will fetch you the By locator which will be used by the method @getElement(String locatorType, String locatorValue)
	 */

	public static By getBy( String locatorType, String locatorValue)
	{
		By locator = null;

		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);

			break;

		case "name":
			locator  = By.name(locatorValue);
			break;
		default:
			System.out.println("Please enter correct locatorType");
			break;
		}

		return locator;
	}

	/*
	 * @getElement will return  the WebElement which will be used by doSendKeys method
	 */

	//String locatorValue and locatorType
	public static WebElement getElement(String locatorType, String locatorValue)
	{
		return driver.findElement(getBy(locatorType,locatorValue));
	}

	/* 
	 * @doSendKeys method will allow user to type in the values in the textbox
	 * 
	 */
	// string locatorType, locatorValue, value
	public static void doSendKeys(String locatorType, String locatorValue, String value )
	{
		getElement(locatorType,locatorValue).sendKeys(value);
	}
















}
