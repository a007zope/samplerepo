package LearnSelenium.seleniumPractice1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsAlertp2 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com/");

		WebElement link1 =driver.findElement(By.cssSelector("img[src='https://company.naukri.com/homepage21/synechron-ns-tp-15jan2020.gif']"));
		link1.click();

		WebElement link2 = driver.findElement(By.cssSelector("img[src='https://company.naukri.com/homepage21/covance-cl-tp-24jun2021.gif']"));
		link2.click();

		WebElement link3 = driver.findElement(By.cssSelector("img[src='https://company.naukri.com/homepage21/genpact-vk-tp-2feb2021.gif']"));
		link3.click();


		Set<String> handles =driver.getWindowHandles();

		Iterator<String> it = handles.iterator();

		String parentId = it.next();
		String childId = it.next();
		String childId1 = it.next();
		String childId2 = it.next();

		driver.switchTo().window(childId1);//covance
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(childId2);//synechron
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		

		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());





















	}

}
