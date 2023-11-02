package www.tsrtconline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println(" ***** Chrome Browser Launched Successfully *****");
		
		String applicationUrlAddress="www.tsrtconline.in";
		
		driver.get(applicationUrlAddress);
	System.out.println(" Navigated to TSRTC Home Page ");
	
	driver.manage().window().maximize();
	}
	
	@AfterTest
	
	public void tearDown()
	{
	
		driver.quit();
		
		System.out.println(" ***** TSRTC Application Along With Chrome Browser Closed ");
		
	}

}
