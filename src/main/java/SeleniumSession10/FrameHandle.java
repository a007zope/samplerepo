package SeleniumSession10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	static WebDriver driver ;
	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http:\\Londonfreelance.org/courses/frames/index.html");

		driver.switchTo().frame(2);
		Thread.sleep(3000);
		String text =driver.findElement(By.xpath("/html/body/h2")).getText();
		System.out.println(text);

		driver.close();

	}

}
