package LearnSelenium.FrameHandle_AuthPopUpHandle_ActionsClassConcepts.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");		 

		WebElement element =driver.findElement(By.id("ctl00_HyperLinkLogin"));

		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();

		WebElement element1 = driver.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[10]/ul/li[2]/a"));

		a.moveToElement(element1).build().perform();

		driver.findElement(By.linkText("Member Login")).click();

		String title =	driver.getTitle();
		System.out.println(title);
		
		System.out.println(driver.getCurrentUrl());
	}

}
