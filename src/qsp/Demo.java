package qsp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo
{
	WebDriver driver;
	
	@BeforeMethod
	public void m1()
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.google.com");
		String t = driver.getTitle();
		System.out.println(t);
	}
		@AfterMethod
		public void m2()
		{
			driver.close();
		
	     }
		@Test
		public void m3()
		{
			Reporter.log("hi",true);
		}

}
