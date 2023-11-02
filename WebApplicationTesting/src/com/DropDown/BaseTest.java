package com.DropDown;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
	WebDriver driver;
	String applicationUrlAddress="https://www.osmania.ac.in/";
	
	@BeforeTest
	public void setUp()
	{
	
	System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");	
	driver = new ChromeDriver();
	
	driver.get(applicationUrlAddress);
	driver.manage().window().maximize();
	
	
	}

	
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
		
	}
	
	
	
}
