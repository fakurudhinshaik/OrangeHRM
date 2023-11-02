package com.RadioBottons;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	public WebDriver driver;
	String applicationUrlAddress="https://echoecho.com/htmlforms10.htm";

	@BeforeTest
	public void setUp()
	{
	
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println("***** Chrome Browser Launched Sucessfully *****");
		
		driver.get(applicationUrlAddress);
		
		System.out.println(" Navigated to ehoeho Application Home Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
	}
	
	@AfterTest
	
	public void tearDown()
	{
	
		driver.quit();
		System.out.println(" ***** EhoEho Application along with Chrome Browser Closed *****");
		
	}
	
}
