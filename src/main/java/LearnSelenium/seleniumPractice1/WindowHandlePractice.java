package LearnSelenium.seleniumPractice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		//driver.get("http://demo.guru99.com/popup.php");

		driver.get("https://www.naukri.com/");

		driver.findElement(By.cssSelector("img[src='https://company.naukri.com/homepage21/synechron-ns-tp-15jan2020.gif']")).click();

		Set<String> handles =driver.getWindowHandles();

		Iterator<String> it  = handles.iterator();

		String parentId = it.next();
		String childId = it.next();

		/*Alert a =driver.switchTo().alert();

		System.out.println(a.getText());*/


		driver.switchTo().window(childId);

		System.out.println(driver.getTitle());

		driver.findElement(By.name("qp")).sendKeys("Java Developer");

		driver.findElement(By.cssSelector("input[type='submit']")).click();

		driver.close();

		driver.switchTo().window(parentId);

		WebElement search =driver.findElement(By.className("sugInp"));
		search.sendKeys("Javascript");

		System.out.println(driver.getTitle());

		WebElement parentSearchBox = driver.findElement(By.className("btn"));
		parentSearchBox.click();

		System.out.println(driver.getTitle());

		driver.close();



























	}

}
