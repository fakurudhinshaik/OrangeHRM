package com.ICICIBank;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ICICIBankHeaderBlock {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		WebDriver driver;
		driver = new ChromeDriver();
		
		String  applicationUrlAddress="https://www.icicibank.com/";
		driver.get(applicationUrlAddress);
		
		By IciciHeaderBlockProperty=By.className("main-menu");
		WebElement IciciHeaderBlock=driver.findElement(IciciHeaderBlockProperty);
		
		By IciciHeaderBlockLinksProperty=By.tagName("a");
		List <WebElement>IciciHeaderBlockLinks=driver.findElements(IciciHeaderBlockLinksProperty);
		
		int IciciHeaderBlockLinksCount=IciciHeaderBlockLinks.size();
		System.out.println("The Number of Links in The HeaderBlock Of ICICI Bank is:-"+IciciHeaderBlockLinksCount);
		
		for(int index=0;index<IciciHeaderBlockLinksCount;index++)
		{
			
			String IciciHeaderBlockLinksName=IciciHeaderBlockLinks.get(index).getText();
			System.out.println(index+""+IciciHeaderBlockLinksName);
			
			String expectedWebPageLinkUrlAddress=IciciHeaderBlockLinks.get(index).getAttribute("");
			System.out.println(expectedWebPageLinkUrlAddress);
			
			IciciHeaderBlockLinks.get(index).click();
			
			Thread.sleep(5000);
			driver.quit();
			
			
		}
		
	}

}
