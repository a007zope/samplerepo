package LearnSelenium.DropdownHandlingwithUtilties.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandle {

	static WebDriver driver;
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();


		driver.get("https://www.facebook.com/reg");

		//driver.findElement(By.id("u_0_2")).click();

		String title =driver.getTitle();
		System.out.println(title);

		Thread.sleep(6000);

		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		/*Select select = new Select(day);
		select.selectByValue("13");
		select.selectByVisibleText("20");
		select.selectByIndex(5);



		Select select1 = new Select(month);
		select1.selectByValue("10");
		select1.selectByVisibleText("Jan");
		//select1.selectByVisibleText("jun");




		Select select2 = new Select(year);
		//select2.selectByValue("2005");
		select2.selectByVisibleText("2008");
		//select2.selectByIndex(3);
		 */		
		String day1 =getDate(day,"14");
		System.out.println(day1);

		String month1 = getDate(month,"3");
		System.out.println(month1);

		String year1 = getDate(year,"1994");
		System.out.println(year1);



	}

	public static  String getDate(WebElement  element,String value){

		Select s1 = new Select(element);
		s1.selectByValue(value);

      return   value;
	}

}
