package LearnSelenium.FindElementsImageCountsAttributeValues.code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureTotalTextFields {

	//private WebElement number;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://register.rediff.com/register/register.php");
		driver.get("https://www.facebook.com/reg");

		List<WebElement> listInput =driver.findElements(By.xpath("//input[@type='text']"));

		System.out.println("the size of the list is "+listInput.size());

		for(int i =0;i<listInput.size();i++){
			if(i==3&i==4)
			{
				listInput.get(i).sendKeys("Ness@123");
				//	String.valueOf(956));
			}	
			else if(i==2)
			{
				listInput.get(i).sendKeys("nd@yopmail.com");
			}

			else
			{
				listInput.get(i).sendKeys("Aditya");

			}
		}

		//	driver.close();








	}

}
