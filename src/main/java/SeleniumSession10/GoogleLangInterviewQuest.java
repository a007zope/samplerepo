package SeleniumSession10;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLangInterviewQuest {

	static WebDriver driver ;

	// 1) func to click on a specific link
	// 2 ) return list of link text

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		List<WebElement> langList =		driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
		By lang1 = By.xpath("//div[@id='SIvCob']/a");
		System.out.println(langList.size());

		clickOnSpecificLink(lang1,"हिन्दी");
		List<String> text =getAllLanguages(lang1);
		System.out.println(text);

	}

	public static void clickOnSpecificLink( By locator, String value)
	{
		List<WebElement> langList = driver.findElements(locator);
		for(WebElement lang :langList)
		{
			String text =lang.getText();
			System.out.println(text);
			if(text.equals(value))
			{
				lang.click();
				break;
			}
		}
	}

	public static List<String> getAllLanguages(By locator)
	{
		List<WebElement> langList =driver.findElements(locator);
		List<String> langText = new ArrayList<String>();
		for(WebElement e : langList)
		{
			langText.add(e.getText());


		}
		return langText;

	}




}
