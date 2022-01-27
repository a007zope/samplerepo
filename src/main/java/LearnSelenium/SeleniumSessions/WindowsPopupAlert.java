package LearnSelenium.SeleniumSessions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsPopupAlert {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver  driver = new ChromeDriver();	
		driver.get("http://demo.guru99.com/popup.php");
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();

		String parentId = it.next();
		String childId = it.next();
		driver.switchTo().window(childId);
		String aditya =driver.getTitle();
		driver.findElement(By.name("emailid")).sendKeys("a007zope@rediffmail.com");
		System.out.println(aditya);
		driver.manage().window().maximize();
		driver.findElement(By.name("btnLogin")).click();
		driver.switchTo().window(parentId);
		System.out.println( driver.getCurrentUrl());



	}

}
