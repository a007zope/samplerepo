package LearnSelenium.FrameHandle_AuthPopUpHandle_ActionsClassConcepts.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDropConcept {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag =driver.findElement(By.id("draggable"));
		WebElement drop =	driver.findElement(By.id("droppable"));

		Actions a = new Actions(driver);
		a.clickAndHold(drag).moveToElement(drop).build().perform();
		driver.getCurrentUrl();

	}

}
