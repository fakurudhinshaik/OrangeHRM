package com.BroswerApplications;

import org.openqa.selenium.edge.EdgeDriver;

public class ValidatingTitle_BingHomePage {
	
	public static void main(String[] args) {
		
		// Automating the Browsers
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		// Navigating to Bing HomePage
		
		String applicationUrlAdress="http://www.bing.com";
		driver.get(applicationUrlAdress);
		
		//Expected Title of the Bing Home Page--- Client Requirement
		
		String expected_BingHomePageTitle=" Bing"; // Should be
		System.out.println(" The Expected Title of the Bing Home Page is :-"+expected_BingHomePageTitle);
		
		
		// Getting the Bing Home Page Title ---- Developer developed title of the Bing Home page
		
		String actual_BingHomePageTitle=driver.getTitle();
		System.out.println(" The Actual Title of the Bing Home Page is :-"+actual_BingHomePageTitle);
		
		// Validating the title of the Bing HomePage
		
		
		
		if(actual_BingHomePageTitle.equals(expected_BingHomePageTitle))
		{
			System.out.println(" Title of the Bing Home Page Matched ---- PASS ----- ");
		}
		
		else
		{
			System.out.println(" Title of the Bing Home Page Not Matched ----- FAIL -----");
		}
		
		
		
		driver.quit();
		
		
	}

}
