package LearnSelenium.JavascriptExecutor.code;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(5000);
		System.out.println(JavaScriptUtil.getTitleByJS(driver));
	    System.out.println(JavaScriptUtil.getBrowserInfo(driver));
		JavaScriptUtil.generateAlert(driver,"This is Aditya");
		
		System.out.println("Aditya is Awesome");
		driver.close();
		System.out.println("this scenario is complete");
		
		
		



	}

}
