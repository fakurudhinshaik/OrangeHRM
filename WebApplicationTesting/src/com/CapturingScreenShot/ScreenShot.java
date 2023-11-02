package com.CapturingScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


	public class ScreenShot {
	WebDriver driver;
	String ApplicatonUrlAddress="https://www.tsrtconline.in/oprs-web/guest/home.do?h=1";

	
	public void setUp()
	{
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");	
		
		driver= new EdgeDriver();
	
		System.out.println(" ***** Edge Browser Launched Successfully ");
		
		driver.get(ApplicatonUrlAddress);
	System.out.println(" Navigated To Tsrtc Application HomePage ");
	
	driver.manage().window().maximize();
		
	}
	

	public void tearDown()
	{
	
		driver.quit();
		System.out.println(" ***** Tsrtc Application along with Edge Browser Closed ");
		
	}
	
	
}
	
	
