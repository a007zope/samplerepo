package LearnSelenium.seleniumPractice1;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown1 {

	public static void main(String[] args) {
		DropDown1 d = new DropDown1();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");

		WebElement dropDown = driver.findElement(By.id("Form_submitForm_NoOfEmployees"));

		WebElement dropDown1 = driver.findElement(By.id("Form_submitForm_Industry"));

		d.selectDropDown(dropDown,"76 - 100");
		d.selectDropDown(dropDown1,"Agriculture/Forestry");

		

		/*Select s = new Select(dropDown);
		s.selectByValue("201 - 250");

		List<WebElement> dropDownList = s.getAllSelectedOptions();

		for(int i =0;i<dropDownList.size();i++){

			System.out.println(dropDownList.get(i).getText());

		}*/

	}

	public void selectDropDown(WebElement element,String value)
	{
		Select s1 = new Select(element);
		s1.selectByValue(value);

		List<WebElement> dropDownList = s1.getAllSelectedOptions();

		for(int i =0;i<dropDownList.size();i++){

			System.out.println(dropDownList.get(i).getText());

		}

		
   	
		

	}






}
