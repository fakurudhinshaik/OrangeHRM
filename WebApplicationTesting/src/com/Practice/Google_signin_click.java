package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_signin_click {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver=new EdgeDriver();
		
		String applicationUrlAdress="http://google.com";
		driver.get(applicationUrlAdress);
		
		String GoogleHomePageTitle=driver.getTitle();
		System.out.println(" The Google Home Page Text Title is :-"+GoogleHomePageTitle);
		driver.quit();
		
		
	}
	
	

}
