package com.CapturingScreenShots;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tsrtc_HeaderBlock_Testing_CapturingScreenShot extends BaseText {
	
	@Test
	
	public void headerBlock_CapturingScreenShots() throws InterruptedException
	
	{
		By Tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement Tsrtc_HeaderBlock=driver.findElement(Tsrtc_HeaderBlockProperty);
		
		By Tsrtc_HeaderBlockLinksProperty=By.tagName("a");
		List <WebElement>Tsrtc_HeaderBlockLinks=Tsrtc_HeaderBlock.findElements(Tsrtc_HeaderBlockLinksProperty);
		
		int Tsrtc_HeaderBlockLinksCount=Tsrtc_HeaderBlockLinks.size();
		System.out.println(" The Number of Links In The Header Block Of TSRTC Application Home Page Are:-"+Tsrtc_HeaderBlockLinksCount);
		
		for(int index=0;index<Tsrtc_HeaderBlockLinksCount;index++)
		{
			String Tsrtc_HeaderBlockLinkName=Tsrtc_HeaderBlockLinks.get(index).getText();
			System.out.println(index+""+Tsrtc_HeaderBlockLinkName);
			
			String  expectd_webPageLinkUrlAddress=Tsrtc_HeaderBlockLinks.get(index).getText();
			System.out.println(expectd_webPageLinkUrlAddress);
			
			Tsrtc_HeaderBlockLinks.get(index).click();
			
			Thread.sleep(5000);
			
			String actual_webPageTitle=driver.getTitle();
			System.out.println(actual_webPageTitle);
			
			String actual_webPageCurrentUrlAddress=driver.getCurrentUrl();
			System.out.println(actual_webPageCurrentUrlAddress);
			
			if(actual_webPageCurrentUrlAddress.equals(expectd_webPageLinkUrlAddress))
			{
				System.out.println(" Successfully Navigated to Expected Link WebPage -Pass ");
				
			}
			else
			{
				System.out.println(" Failed to Navigated to Experted Link Web Page -Fail ");
			}
			
			
			
			
		}
		
	}

	
	
}
