package LearnSelenium.SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUpload {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		driver.findElement(By.name("upfile")).sendKeys("C:/Users/p7111642/Documents/expense-16jan2021.txt");
		driver.findElement(By.name("note")).sendKeys("Aditya text file");

		String title =driver.getTitle();
		System.out.println(title);



	}

}
