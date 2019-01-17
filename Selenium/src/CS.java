import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class CS 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "D://Selenium//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.equals("Welcome: Mercury Tours"))
		{
			System.out.println("Title Matched");
		}
		else
		{
			System.out.println("Title Not Matched");
		}
		driver.close();
		System.exit(0);
	}
}