package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_HomePage_Links {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
		
		String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAdress);
		
		By linksproperty=By.tagName("a");
		List<WebElement>tsrtc_HomepageLinks=driver.findElements(linksproperty);
		
		int tsrtc_HomepageLinksCount=tsrtc_HomepageLinks.size();
		System.out.println("The Number of links on The TSRTC Application HomePage is :-"+tsrtc_HomepageLinksCount);
		
		for(int index=0;index<tsrtc_HomepageLinksCount;index++)
			
		{
			String tsrtc_HomepageLinksname=tsrtc_HomepageLinks.get(index).getText();
			System.out.println(index+" "+tsrtc_HomepageLinksname);
		}
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
	}
	
}
