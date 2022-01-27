package LearnSelenium.SyncWaitImplicitWaitExplicitWait.code;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownWithoutSelect {
	public String locator1 ="//select[@id='Form_submitForm_Industry']/option";


public String date ="12-09-2021";

	public static void main(String[] args) throws InterruptedException {

		DropDownWithoutSelect s = new DropDownWithoutSelect();

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
          

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		//driver.get("https://www.facebook.com/reg");
		Thread.sleep(3000);
		
		String arr[] = s.date.split("/");
		
		

		//If no select class
		//List<WebElement>dropDownList2 = driver.findElements(By.xpath("//select[@id='Form_submitForm_Industry']/option"));

		//List<WebElement>dropDownList3 =driver.findElements(By.xpath("//select[@id='day']/option"));


		//System.out.println(dropDownList2);
		//String locator1 ="//select[@id='Form_submitForm_Industry']/option";

		//s.dropDownValuesWithoutSelectClass(driver,"Education",locator1);
	}

	public ArrayList<String> dropDownValuesWithoutSelectClass(WebDriver driver,String value,String locator)
	{
		List<WebElement>dropDownList2 = driver.findElements(By.xpath(locator));
		ArrayList<String> ad = new ArrayList<String>();

		for(int i =0;i<dropDownList2.size();i++)
		{
			String dropDownValues =dropDownList2.get(i).getText();
			System.out.println(dropDownValues);

			ad.add(dropDownValues);

			if(dropDownValues.equals(value))
			{
				dropDownList2.get(i).click();
			}


		}


		return ad;


	}








}


