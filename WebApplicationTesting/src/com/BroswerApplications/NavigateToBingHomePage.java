package com.BroswerApplications;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigateToBingHomePage {
	
	public static void main(String[] args) {
		
		 //System.setProperty("webdriver.gecko.driver", ".//Libaray/geckodriver.exe");
		
		// Class    Object
		//FirefoxDriver driver = new FirefoxDriver();
		
		//driver.get("http://bing.com");
		//driver.navigate().to("http://Google.com");
		
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		driver.navigate().to("http://www.facebook.com");
		driver.get("http://bing.com");
		
		
		
		//driver.close();
		
		
		
	}

}
