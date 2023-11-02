package com.CapturingScreenShots;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseText {
	
	WebDriver driver;
	String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";
	
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver = new EdgeDriver();
		System.out.println(" Edge Broswer Launched Sucessfully ");
		
		
		driver.get(applicationUrlAdress);
		System.out.println(" Navigated to TSRTC Home Page ");
		driver.manage().window().maximize();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
		System.out.println("***** TSRTC Application Along with Edge Driver Closed ");
	}
	
}
