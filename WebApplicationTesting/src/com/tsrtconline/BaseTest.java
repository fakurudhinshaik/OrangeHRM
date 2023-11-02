package com.tsrtconline;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	
	String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
	
	@BeforeTest
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		System.out.println(" Chrome Broswer Launched ");
		
		driver.get(applicationUrlAddress);
		System.out.println(" Navigated To TSRTC Home Page ");
		driver.manage().window().maximize();
		
		}

	
	@AfterTest
	public void tearDown()
	{
		
	driver.quit();
	System.out.println(" Broswer Closed ");
	}
}
