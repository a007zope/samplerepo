import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsImg {


	public  static WebDriver driver;

	public FindElementsImg(WebDriver driver) {
		this.driver = driver;	
	}


	public static void main(String[] args){
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		FindElementsImg f = new FindElementsImg(driver);
		driver.get("https://www.amazon.com/");

		By loc = By.tagName("img");

		List<WebElement>imgList = getElements(loc);
		String var = getAttribute(imgList);
		System.out.println(var);



		//		List<WebElement> imgList =driver.findElements(By.tagName("img"));
		//		System.out.println(imgList.size());
		//
		//		for(WebElement e : imgList)
		//		{
		//			String altValue = e.getAttribute("alt");
		//			String classValue = e.getAttribute("class");
		//			System.out.println(altValue+ "->"+classValue);
		//		}



	}

	public static  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}



	public  static String getAttribute(List<WebElement> imgList)

	{
		String altValue= null, srcValue =null;

		for(WebElement e : imgList)
		{
			altValue = e.getAttribute("alt");
			srcValue = e.getAttribute("src");
			System.out.println(altValue+ "->"+srcValue);
		}

		return altValue+ "->"+srcValue;




	}




}
