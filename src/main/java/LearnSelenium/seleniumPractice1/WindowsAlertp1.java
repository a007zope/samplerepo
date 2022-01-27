package LearnSelenium.seleniumPractice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsAlertp1 {

	//CASE 1 :From child 1 to child 2 without coming back to parent from child 1 .

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("http://demo.guru99.com/popup.php");

		WebElement  onClick =	driver.findElement(By.linkText("Click Here"));

		onClick.click();

		onClick.click();

		Set<String> handles =driver.getWindowHandles();

		Iterator<String> it =handles.iterator();

		String parentId = it.next();
		String childId = it.next();
		String childId1 = it.next();

		System.out.println(childId);
		System.out.println(childId1);
		System.out.println(parentId);


		driver.switchTo().window(childId);

		driver.getCurrentUrl();
		WebElement emailId = driver.findElement(By.name("emailid"));
		emailId.sendKeys("a009@yopmail.com");

		WebElement submit = driver.findElement(By.name("btnLogin"));
		submit.click();

		WebElement clickLink=driver.findElement(By.linkText("Click Here"));

		clickLink.click();




		//  CASE 1 :From child 1 to child 2 without coming back to parent from child 1 

		driver.switchTo().window(childId1);

		driver.getCurrentUrl();

		WebElement emailId1 = driver.findElement(By.name("emailid"));
		emailId1.sendKeys("a008@yopmail.com");

		WebElement submit1 = driver.findElement(By.name("btnLogin"));
		submit1.click();

		System.out.println(driver.getTitle());











	}

}
