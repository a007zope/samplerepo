package LearnSelenium.ActionsSendkeys.Screenshotutil.Elementutil.genericmethod.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");

		Util u = new Util(driver);

		By firstName = By.name("firstname");
		By surName = By.name("lastname");
		By emailAddress = By.name("reg_email__");

		By click = By.name("websubmit");


		Util.getElement(firstName).sendKeys("Aditya");
		Util.getElement(surName).sendKeys("zope");
		Util.getElement(emailAddress).sendKeys("a007zope@gmail.com");
		Util.doClick(click);
		 
		System.out.println("success");


		/*String name  =	Util.doTypeInText(firstName, "Vijaya");
		System.out.println(name);


		Util.doClick(click);
		 */	
	}




}
