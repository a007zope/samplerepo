package LearnSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_axes {

	public static void main(String[] args) throws InterruptedException {

		// input[@class='form-control']//following::input[@class='form-control']

		// input[@class='form-control']//following::input)[2]

		/*
		 * Understanding X path Axes Ancestor
		 * //div[@class='Mammal']/ancestor::div[@class='Animal']
		 * //div[@class='Mammal']/ancestor::div/h2[text()='Animal']
		 * 
		 * Ancestor or self //div[@class='Mammal']/ancestor-or-self::div
		 * 
		 * 
		 * Child //div[@class='Mammal']//child::h5
		 * //div[@class='Mammal']//child::div[@class='Tiger']//h6
		 * //div[@class='Mammal']//child::div[@class='Tiger']//h6[text()='Tiger']
		 * 
		 * descendant //div[@class='Mammal']/descendant::div
		 * //div[@class='Mammal']/descendant::div
		 * //div[@class='Mammal']/descendant::div[@class='Carnivore']/div[@class='Lion']
		 * /h6[text()='Lion']
		 * 
		 * 
		 * 
		 */

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/india-in-south-africa-2021-22-1277060/south-africa-vs-india-2nd-test-1277080/full-scorecard");

		Thread.sleep(5000);


		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//i[@class=\"espn-icon icon-caret-down-solid-after icon-xl header-icon\"])[1]")).click();
		String batsmanName = driver.findElement(By.xpath("(//div[@id=\"__next\"]//a[@target=\"_self\" and text()=\"KL Rahul\"])[1]")).getText();
		//System.out.println(batsmanName);
		String batsmanInfo = driver.findElement(By.xpath("//table[@class=\"table batsman\"]//a[text()=\"KL Rahul\"]/following::td")).getText();
		//System.out.println(batsmanInfo);

		// String text=driver.findElement(By.xpath("(//table[@class=\"table
		// batsman\"]//a[contains(text(),\"KL Rahul\")]/following::td)[3]")).getText();


		// driver.findElement(By.xpath("(//div[@id=\"__next\"]//a[@target=\"_self\" and
		// text()=\"KL Rahul\"])[1]")).click();
		Xpath_axes axes = new Xpath_axes();

		String cricName = axes.getScoreCard(driver,"Ajinkya Rahane");

	}

	public String getScoreCard(WebDriver driver, String cricName) {

		//String batsmanInfo = driver.findElement(By.xpath("(//table[@class=\"table batsman\"])[1]//td/following::td")).getText(); '"+i+"'

		for (int i = 1; i <= 7;i++) {

			String t =driver.findElement(By.xpath("(//table[@class=\"table batsman\"]//a[contains(text(),'"+ cricName + "')]/following::td)["+i+"]")).getText();
			System.out.print(" "+t);
			//System.out.println("Execution Successful");

		}
		return cricName;

		//		public String getWicketTakerDetails()
		//		{
		//			
		//			
		//		}







	}

}
