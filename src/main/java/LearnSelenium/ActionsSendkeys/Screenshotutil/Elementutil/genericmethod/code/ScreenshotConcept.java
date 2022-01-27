package LearnSelenium.ActionsSendkeys.Screenshotutil.Elementutil.genericmethod.code;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenshotConcept {

	public static void main(String[] args) throws InterruptedException, IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		Thread.sleep(5000);

		/*
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(srcFile, new File("./target/screenshots/page1.png"));

		File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		FileUtils.copyFile(srcFile2, new File("./target/screenshots/page2.png"));
		 */		
		getScreenShot(driver,"AdityaTheGreat");

	}

	public static void getScreenShot(WebDriver driver, String fileName)
	{
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);


		File srcFile1 =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(srcFile1, new File("./target/screenshots/"+fileName+".png"));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}


		try
		{
			FileUtils.copyFile(srcFile, new File("./target/screenshots/"+fileName+".png"));
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}


	}
}


