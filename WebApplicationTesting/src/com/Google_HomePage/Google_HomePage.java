package com.Google_HomePage;

import org.openqa.selenium.edge.EdgeDriver;

public class Google_HomePage {
	
	public static void main(String[] args) {
		
		// Automating the Browsers
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver = 	new EdgeDriver();
	
		// Navigate the Google HomePage
		String ApplicationUrlAdress="http://www.google.com";
		driver.get(ApplicationUrlAdress);
		
		String GoogleHomePageCurrentUrl=driver.getCurrentUrl();
		System.out.println(" The Current Url of Google HomePage is:-"+GoogleHomePageCurrentUrl);
		
		// Expected Google HomePAge url
		
		String expected_GoogleHomePageCurrentUrl="google.com";
		System.out.println(" The Expected Google Home Page is :-"+expected_GoogleHomePageCurrentUrl);
		
		// Actual Google Home PAge url
		String actual_GoogleHomePageCurrentUrl= driver.getCurrentUrl();
		System.out.println(" The Actual Google Home Page is :-"+actual_GoogleHomePageCurrentUrl);
		
		if(actual_GoogleHomePageCurrentUrl.contains(expected_GoogleHomePageCurrentUrl))
		{
			System.out.println(" The Title of Google Home Page is Matched ---- PASS ----");
		}
		else
		{
			System.out.println(" The Title of Google is Not Matched ---- FAIL ----");
		}
		
		
		
		
		driver.quit();
		
		
		
		
		
		
		
	}

}
