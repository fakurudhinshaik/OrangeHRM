package com.Practice;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSRTC_HeaderBlock {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		
		String applicationUrlAddress="https://www.tsrtconline.in/oprs-web/";
		driver.get(applicationUrlAddress);
		
		By Tsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement Tsrtc_HeaderBlock=driver.findElement(Tsrtc_HeaderBlockProperty);
		
		By Tsrtc_HeaderBlockLinksProperty=By.tagName("a");
		List <WebElement>Tsrtc_HeaderBlockLinks=Tsrtc_HeaderBlock.findElements(Tsrtc_HeaderBlockLinksProperty);
		
		int Tsrtc_HeaderBlockLinksCount=Tsrtc_HeaderBlockLinks.size();
		System.out.println(" The Number Of Links In The Header Block Of TSRTC Application HomePage Are:-"+Tsrtc_HeaderBlockLinksCount);
		
		for(int index=0;index<Tsrtc_HeaderBlockLinksCount;index++)
		{
			
			String Tsrtc_HeaderBlockLinkName=Tsrtc_HeaderBlockLinks.get(index).getText();
			System.out.println(index+""+Tsrtc_HeaderBlockLinkName);
			
			String expected_webPageLinkUrlAddress=Tsrtc_HeaderBlockLinks.get(index).getAttribute("href");
			System.out.println(expected_webPageLinkUrlAddress);
			
			
			Tsrtc_HeaderBlockLinks.get(index).click();
			
			Thread.sleep(5000);
			
			String actual_webPageTitle=driver.getTitle();
			System.out.println(actual_webPageTitle);
			
			String actual_webPageCurrentUrlAddress=driver.getCurrentUrl();
			driver.getCurrentUrl();
			System.out.println(actual_webPageCurrentUrlAddress);
			
			if(actual_webPageCurrentUrlAddress.equals(expected_webPageLinkUrlAddress))
			{
				
				System.out.println(" Successfully navigated To Expected Link WebPage - PASS ");
				
			}
			else
			{
				
				System.out.println(" Failed to Navigate to Expected Link WebPage - FAIL ");
				
			}
			
			File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(ScreenShot, new File ("./ScreenShot/"+Tsrtc_HeaderBlockLinkName+".png"));
			
			System.out.println();
			
			driver.navigate().back();
			
			Tsrtc_HeaderBlock=driver.findElement(Tsrtc_HeaderBlockProperty);
			Tsrtc_HeaderBlockLinks=Tsrtc_HeaderBlock.findElements(Tsrtc_HeaderBlockLinksProperty);
			
			
	}

		driver.quit();
	}
}

