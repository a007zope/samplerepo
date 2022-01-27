package LearnSelenium.JQueryDropDownHandle_WebTableHandleUsingXpath.code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandle {
	// By passing Array 

	static String[] ar = new String[5];


	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();



		/*	List <WebElement> E =	driver.findElements(By.xpath("//div[@class ='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		int count =E.size();
		System.out.println(count);

		for(int i =0;i<E.size();i++)
		{
			String text =E.get(i).getText();
			System.out.println(text);

		}
		 */	

		ar[0]="choice 1";
		ar[1] ="choice 2";
		ar[2] ="choice 2 3";
		ar[3] ="choice 6 2";
		ar[4] ="choice 6 2 2";
		getChoiceValues(driver,ar);
	}

	public static void getChoiceValues(WebDriver driver, String[] ar)
	{


		List <WebElement> E =	driver.findElements(By.xpath("//div[@class ='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		int count =E.size();
		System.out.println(count);

		for(int i =0;i<E.size();i++)
		{
			String text =E.get(i).getText();
			System.out.println(text);

			for(int j =0;j<ar.length;j++)
			{
				if(text.equals(ar[j]))
				{
					E.get(i).click();
					break;

				}

			}

		}
	}

}

