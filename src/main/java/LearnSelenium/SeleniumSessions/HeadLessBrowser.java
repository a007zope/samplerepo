package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class HeadLessBrowser {

	public static void main(String[] args) {

		//HeadLess -NO UI	
		//testing is happening behind the scene
		//faster than normal mode

		/*WebDriverManager.chromedriver().setup();
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		*/
		WebDriverManager.firefoxdriver().setup();
		FirefoxOptions f1 = new FirefoxOptions();
		f1.addArguments("--headless");
		
		
		

		//WebDriver e = new ChromeDriver(co);
		WebDriver r = new FirefoxDriver(f1);
		r.get("https:\\www.google.com");
	//	e.get("https:\\www.google.com");
		System.out.println(r.getTitle());
		System.out.println(r.getCurrentUrl());








	}

}
