package com.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LanchBrowser {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		System.out.println("***** Broswer Lanched *****");
		
	String applicationUrlAddress="http://www.google.com";
		driver.get(applicationUrlAddress);
		
	driver.quit();	
	}
	
	

}
