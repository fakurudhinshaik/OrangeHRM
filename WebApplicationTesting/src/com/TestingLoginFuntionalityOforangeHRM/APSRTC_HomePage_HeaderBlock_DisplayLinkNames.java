package com.TestingLoginFuntionalityOforangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class APSRTC_HomePage_HeaderBlock_DisplayLinkNames {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
		
		String applicationUrlAdress="https://www.apsrtconline.in/oprs-web/guest/home.do?h=1";
		driver.get(applicationUrlAdress);
		
		By apsrtc_HeaderBlockProperty=By.className("menu-wrap");
		WebElement apsrtc_HeaderBlock=driver.findElement(apsrtc_HeaderBlockProperty);
	
		By apsrtc_HeaderBlockLinksProperty=By.tagName("a");
		List<WebElement>apsrtc_HeaderBlockLinks=apsrtc_HeaderBlock.findElements(apsrtc_HeaderBlockLinksProperty);
		
		
		int apsrtc_HeaderBlockLinksCount=apsrtc_HeaderBlockLinks.size();
		System.out.println("The Number of Links in The Header Block Of APSRTC Application HomePage are:-"+apsrtc_HeaderBlockLinksCount);
		
		for(int index=0;index<apsrtc_HeaderBlockLinksCount;index++)
		{
			String apsrtc_HeaderBlockLinkName=apsrtc_HeaderBlockLinks.get(index).getText();
			System.out.println(index+" "+apsrtc_HeaderBlockLinkName);
		
			
			apsrtc_HeaderBlockLinks.get(index).click();
		
		
		String webPageTitle=driver.getTitle();
		System.out.println(webPageTitle);
		
		String webPageCurrentUrlAdress=driver.getCurrentUrl();
		System.out.println(webPageCurrentUrlAdress);
		
		System.out.println();
		
		driver.navigate().back();
		
		apsrtc_HeaderBlockLinks=apsrtc_HeaderBlock.findElements(apsrtc_HeaderBlockLinksProperty);
		
		driver.close();
		
	}
	
	
	}
}
