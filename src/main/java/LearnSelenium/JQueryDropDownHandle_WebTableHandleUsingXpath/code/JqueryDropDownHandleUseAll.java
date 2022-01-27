package LearnSelenium.JQueryDropDownHandle_WebTableHandleUsingXpath.code;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JqueryDropDownHandleUseAll {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		driver.findElement(By.id("justAnInputBox")).click();
		getChoiceValues(driver, "choice 2", "choice 2 1", "choice 2 2", "choice 2 3");
		//getChoiceValues(driver,"All");


	}

	public static  void getChoiceValues(WebDriver driver, String...ar )
	{
		List <WebElement> E =	driver.findElements(By.xpath("//div[@class ='comboTreeDropDownContainer']//ul//li/span[@class='comboTreeItemTitle']"));

		int count =E.size();
		System.out.println(count);

		if(!ar[0].equalsIgnoreCase("All"))
		{
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
		else
		{
			try{
				for(int all =0;all< E.size(); all++)
				{
					E.get(all).click();
				}
			}
			catch(Exception e )
			{

			}
		}





	}

}

