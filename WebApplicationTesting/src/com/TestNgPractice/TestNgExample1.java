package com.TestNgPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class TestNgExample1 {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.icicibank.com/";
	
	@BeforeTest
	
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver= new ChromeDriver();
		
		System.out.println(" Chrome Browser Launched Successfully"); 
		System.out.println();
		
		driver.get(applicationUrlAddress);
		System.out.println(" Navigate To ICICI Bank Home Page");
		System.out.println();
		
		driver.manage().window().maximize();
	}

	@AfterTest

		public void tearDown()
		{
		
		driver.quit();
		
		System.out.println(" Chrome Driver Closed ");
		
		}
}
