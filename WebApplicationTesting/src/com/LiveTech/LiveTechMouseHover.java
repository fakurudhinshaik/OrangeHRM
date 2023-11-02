package com.LiveTech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LiveTechMouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		
		WebDriver driver;
		driver = new FirefoxDriver();	
		
		String livetechApplicationUrlAdress="https://livetech.in/";
		driver.get(livetechApplicationUrlAdress);
		
		Thread.sleep(10000);
		
		By livetechpage=By.id("btnClose");
		WebElement livetech=driver.findElement(livetechpage);
		livetech.click();
		
	}



}
