package LearnSelenium.seleniumPractice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownSplitClass {


	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg");
		Thread.sleep(5000);

		DropdownSplitClass d =new DropdownSplitClass();
		String date ="12/सप्टें/2021";
		String arr[] = date.split("/");
		for(int i =0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		WebElement day=  driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		d.selectDropDown(day,arr[0]);
		d.selectDropDown(month,arr[1]);
		d.selectDropDown(year,arr[2]);


		System.out.println(arr[0]);
	}

	public void selectDropDown(WebElement element, String value)
	{
		Select s = new Select(element);
		s.selectByVisibleText(value);
	}


}
