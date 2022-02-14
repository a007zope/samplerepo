import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	public WebDriver driver;




	public WebDriver init_Driver(String browserName)
	{
		if(browserName.equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();
			driver.manage().window().maximize();
			RegisPage rp = new RegisPage(driver);


		}

		else if(browserName.equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			RegisPage rp = new RegisPage(driver);



		}

		else if(browserName.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			RegisPage rp = new RegisPage(driver);


		}

		else
		{
			System.out.println(" Please enter correct browserName");
		}

		return driver;
	}


	public String  getURL(String url)
	{
		driver.get(url);

		return driver.getTitle();
	}





}
