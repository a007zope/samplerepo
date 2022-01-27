package LearnSelenium.seleniumPractice1;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import LearnSelenium.SyncWaitImplicitWaitExplicitWait.code.DropDownWithoutSelect;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WithoutSelectp1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WithoutSelectp1 w = new WithoutSelectp1();

		DropDownWithoutSelect s = new DropDownWithoutSelect();



		ArrayList<String> a =s.dropDownValuesWithoutSelectClass(driver,"Electronics",s.locator1);
		
		for(int i =0;i<a.size();i++)
		{
			String text=a.get(i);
			System.out.println(text);
		}



	}

}
