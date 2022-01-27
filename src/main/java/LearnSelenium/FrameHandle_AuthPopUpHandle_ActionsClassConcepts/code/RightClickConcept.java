package LearnSelenium.FrameHandle_AuthPopUpHandle_ActionsClassConcepts.code;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) throws InterruptedException {


		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/simple_context_menu.html");

		Actions a = new Actions(driver);
		WebElement element1 =	driver.findElement(By.xpath("//*[@id='authentication']/span"));
		a.contextClick(element1).build().perform();

		Thread.sleep(5000);

		String text =	driver.findElement(By.xpath("//ul/li[contains(@class ,'context-menu-icon-copy')]/span")).getText();
		System.out.println(text);

		WebElement element =driver.findElement(By.xpath("//ul/li[contains(@class ,'context-menu-icon-copy')]"));

		Thread.sleep(6000);

		a.contextClick(element).build().perform();

		Thread.sleep(3000);

		Alert aa = driver.switchTo().alert();
		aa.accept();


		String title =driver.getTitle();
		System.out.println(title);



	}

}
