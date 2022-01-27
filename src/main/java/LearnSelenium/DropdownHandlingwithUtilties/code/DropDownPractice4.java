package LearnSelenium.DropdownHandlingwithUtilties.code;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPractice4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/reg");

		WebElement day = driver.findElement(By.id("day"));
		WebElement year= driver.findElement(By.id("year"));



		String date ="13-6-2018";

		String s5[] = date.split("-");

		for(int j=0;j<s5.length;j++)
		{
			System.out.println(s5[j]);
			if(j==2)
			{
				Practice3.getDropDownSelectByVisibleText(year,s5[j]);

			}
			else
			{
				Practice3.getDropDownSelectByVisibleText(day,s5[j]);
			}
		}

		//Practice3.getDropDownSelectByVisibleText(day, s5[0]);
		System.out.println(driver.getTitle());




		/*		WebElement month = driver.findElement(By.id("month"));

		ArrayList<String> arList =Practice3.getDropDownSelectByVisibleText(day, "12");
		ArrayList<String> arList1 =Practice3.getDropDownSelectByVisibleText(month, "Jun");
		ArrayList<String> arList2 =Practice3.getDropDownSelectByVisibleText(year, "1995");
			for(int i =0;i<arList.size();i++)
		{
			System.out.println(arList.get(i));
		}

		ArrayList <String>ar =	Practice3.getDropdownList(day);
		System.out.println(ar);


		ArrayList <String>ar1 =	Practice3.getDropdownList(month);
		System.out.println(ar1);


		ArrayList<String> ar2 =	Practice3.getDropdownList(year);
		System.out.println(ar2);
		 */
	}

}
