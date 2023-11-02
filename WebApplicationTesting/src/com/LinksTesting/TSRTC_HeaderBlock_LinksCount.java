package com.LinksTesting;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class TSRTC_HeaderBlock_LinksCount {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
		
		String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAdress);
		
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		
		By tsrtc_HomePage_LinksProperty=By.tagName("a");
		
		List<WebElement>tsrtc_HomePage_Links=tsrtc_HeaderBlock.findElements(tsrtc_HomePage_LinksProperty);
	
		int tsrtc_HeaderBlock_LinksCount=tsrtc_HomePage_Links.size();
		System.out.println("The number of links in the Header Block of TSRTC Application HomePage is:-"+tsrtc_HeaderBlock_LinksCount);
		
		
		
		driver.quit();
	}

}
