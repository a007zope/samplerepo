package LearnSelenium.FrameHandle_AuthPopUpHandle_ActionsClassConcepts.code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://londonfreelance.org/courses/frames/index.html");

		WebElement frame1 = driver.findElement(By.name("main"));
		driver.switchTo().frame(frame1);

		String text =	driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text);

		WebElement Frame =  driver.findElement(By.name("navbar"));

		driver.switchTo().frame(Frame);
		
		String text1 = driver.findElement(By.linkText("Sample content")).getText();
		System.out.println(text1);

		driver.findElement(By.linkText("Sample content")).click();

		/*String text =	driver.findElement(By.linkText("No frames")).getText();
		System.out.println(text);

		driver.findElement(By.linkText("No frames")).click();
		 */
		driver.switchTo().defaultContent();

		String text2=	driver.findElement(By.cssSelector("body > h2")).getText();
		System.out.println(text2);

		System.out.println(driver.getCurrentUrl());



	}

}
