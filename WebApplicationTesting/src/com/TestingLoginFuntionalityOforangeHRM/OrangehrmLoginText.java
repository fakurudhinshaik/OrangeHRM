package com.TestingLoginFuntionalityOforangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangehrmLoginText {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
	
	WebDriver driver;
	driver=new EdgeDriver();
	
	String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/";
	driver.get(applicationUrlAdress);
	driver.manage().window().maximize();
	
	By linksProperty=By.tagName("a");
	List <WebElement>tsrtc_HomePageLinks=driver.findElements(linksProperty);
	
	int tsrtc_HomePageLinksCount=tsrtc_HomePageLinks.size();
	System.out.println("The number of links on the TSRTC Application HomePage is:-"+tsrtc_HomePageLinksCount);
	
	for(int index=0;index<tsrtc_HomePageLinksCount;index++)
	{
		String tsrtc_HomePageLinkName=tsrtc_HomePageLinks.get(index).getText();
		System.out.println(index+" "+tsrtc_HomePageLinkName);
	}
	driver.quit();
	
	}

}
