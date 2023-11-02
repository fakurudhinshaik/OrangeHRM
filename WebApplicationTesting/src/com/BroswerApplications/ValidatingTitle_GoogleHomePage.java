package com.BroswerApplications;

import org.openqa.selenium.edge.EdgeDriver;

public class ValidatingTitle_GoogleHomePage {
	
	public static void main(String[] args) {
		
		// Automate the browsers
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver =  new EdgeDriver();
		
		// Navigating the Google HomePage
		
		String applicationUrlAdress="http://www.google.com";
		driver.get(applicationUrlAdress);
		
		// Expected Title of the Google HomePage ------ Srini Requirement
		
		String expected_GoogleHomePageTitle="oogle";
		System.out.println(" the Expected Title of the Google HomePage is:-"+expected_GoogleHomePageTitle);
		
		// Actual Title of the Google HomePage --------- developer developed title of the Google HomePage
		
		String actual_GoogleHomePageTitle=driver.getTitle();
		System.out.println(" The Actual Title of the Google Home Page is:-"+actual_GoogleHomePageTitle);
		
		// Validating of the Title of the Google HomePage
		
		if(actual_GoogleHomePageTitle.equals(expected_GoogleHomePageTitle))
		{
			System.out.println(" Title of the Google HomePage is Matched ----- PASS ----- ");
		}
		
		else
		{
			System.out.println(" Title of the Google HomePage is Not Matched ----- FAIL -----");
		}

		driver.quit();
		
	}

	
	
}
