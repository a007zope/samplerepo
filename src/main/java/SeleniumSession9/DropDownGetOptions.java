package SeleniumSession9;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownGetOptions {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		WebElement dropDown = driver.findElement(By.id("Form_submitForm_Country"));
		Select s = new Select(dropDown);
		//		List<WebElement> dropDownList  =  s.getOptions();
		//		int i =0;
		//		for(WebElement e : dropDownList)
		//		{
		//			System.out.println(e.getText()+" "+i);
		//			i++;
		//		}

		List<String> text =getDropDownList(s,dropDown);
		System.out.println(text);
		String a = text.get(9);
		System.out.println(a);

	}


	public static List<String> getDropDownList(Select s, WebElement element) {

		List<WebElement> dropDownList =s.getOptions();
		int i =0;
		List<String>text = new ArrayList<String>();
		for(WebElement e : dropDownList)
		{
			text.add(e.getText());
			//System.out.println(text+" "+i);
			i++;
		}
		return text ;

	}

}
