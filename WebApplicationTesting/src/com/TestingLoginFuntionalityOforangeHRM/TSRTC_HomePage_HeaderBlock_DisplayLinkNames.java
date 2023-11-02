package com.TestingLoginFuntionalityOforangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.LinksTesting.TSRTC_HeaderBlock_LinksCount;

public class TSRTC_HomePage_HeaderBlock_DisplayLinkNames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		WebDriver driver;
		driver = new FirefoxDriver();
		
		String applicationUrlAdress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAdress);
		
		By tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement tsrtc_HeaderBlock=driver.findElement(tsrtc_HeaderBlockProperty);
		
		By tsrtc_HomePage_LinksProperty=By.tagName("a");
		
		List<WebElement>tsrtc_HomePage_Links=tsrtc_HeaderBlock.findElements(tsrtc_HomePage_LinksProperty);
		
		int tsrtc_HomePage_LinksCount=tsrtc_HomePage_Links.size();
		System.out.println("The number of  links in Header Block of TSRTC application is:- "+tsrtc_HomePage_LinksCount);
		
		for(int index=0;index<tsrtc_HomePage_LinksCount;index++)
		{
			String tsrtc_HeaderBlockPropertyName=tsrtc_HomePage_Links.get(index).getText();
			System.out.println(index+" "+tsrtc_HeaderBlockPropertyName);
			
			tsrtc_HomePage_Links.get(index).click();
			
			String webPageTitle=driver.getTitle();
			System.out.println(webPageTitle);
			
			String webPageCurrentUrlAdress=driver.getCurrentUrl();
			System.out.println(webPageCurrentUrlAdress);
			
			
			
			
		}
		
		
		driver.quit();
		
		
	}

}
