package com.BroswerApplications;

import org.openqa.selenium.edge.EdgeDriver;

public class CapturingTitle_BingHomePage {
	
	public static void main(String[] args) {
		
		// Automating the browsers
		
		System.setProperty("webdriver.edge.driver","./Libaray/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		
		// Navigating to Bing Home PAge
		
		String applicationUrlAdress="http://www.Bing.com";
		driver.get(applicationUrlAdress);
		
		// Getting the Bing Home Page Title
		
		String bingHomePageTitle=driver.getTitle();
		System.out.println(" The Title of the Bing Home Page is:-"+bingHomePageTitle);
		
		driver.quit();
		
		
		
	
	}
	

}
