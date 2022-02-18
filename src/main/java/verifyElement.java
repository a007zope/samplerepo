import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class verifyElement {

	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By formFields = By.className("text");

		int fieldsCount =	driver.findElements(formFields).size();
		if(fieldsCount==0)
		{
			System.out.println("form fields are not available ");


		}
		else 
		{
			System.out.println("form fields are available");
		}
	}

}
