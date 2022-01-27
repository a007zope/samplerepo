package LearnSelenium.TestNG.sessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	static WebDriver driver;
	
	
	public Login( WebDriver driver)
	{
		this.driver=driver;
	}

	/*public static void main(String[] args) {
	    

	}
	*/
	public static void loginTest(By locator, WebDriver driver,String text){
		
		driver.findElement(locator).sendKeys(text);
			
	}
	
	public static void submitTest(By locator, WebDriver driver)
	{
		driver.findElement(locator).click();
	}
	
	
	

}
