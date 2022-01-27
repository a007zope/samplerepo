package LearnSelenium.DropdownHandlingwithUtilties.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		//WebElement day =	driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[22]/td[3]/select[1]"));

		//driver.findElement(By.id("u_0_2")).click();

		//WebElement day =	driver.findElement(By.id("day"));

		WebElement day = driver.findElement(By.id("day"));
		WebElement month =	driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));


		int y =	getData(day,5);
		System.out.println(y);

		int z =getData(month,8);
		System.out.println(z);

		int r = getData(year,9);
		System.out.println(r);

	}
	public static int getData(WebElement element, int value)
	{
		Select s1 = new Select(element);
		s1.selectByIndex(value);



		return value;
	}



}
