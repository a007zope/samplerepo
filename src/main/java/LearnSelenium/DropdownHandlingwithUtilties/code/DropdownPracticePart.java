package LearnSelenium.DropdownHandlingwithUtilties.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownPracticePart {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.get("https://www.facebook.com/reg");
		driver.get("https://www.facebook.com/reg");

		DropdownPracticePart s = new DropdownPracticePart();
		System.out.println(s.toString());
		
		









	}

}
