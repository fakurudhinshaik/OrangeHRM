package com.TestingLoginFuntionalityOforangeHRM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ApsrtcHomePage {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		
		WebDriver driver;
		driver=new EdgeDriver();
		
		String applicationUrlAdress="https://www.apsrtconline.in/oprs-web/guest/home.do?h=1";
		driver.get(applicationUrlAdress);
		
		By linksProperty=By.tagName("a");
		
		List <WebElement>linksapsrtc_homepagelinks=driver.findElements(linksProperty);
		
		int linksapsrtc_homepagelinksCount=linksapsrtc_homepagelinks.size();
		System.out.println("The number of links in the APSRTC homepage is:-"+linksapsrtc_homepagelinksCount);
		
		for(int index=0;index<linksapsrtc_homepagelinksCount;index++)
		{
			String linksapsrtc_homepagelinksname=linksapsrtc_homepagelinks.get(index).getText();
			System.out.println(index+""+linksapsrtc_homepagelinksname);
			
			
			
			
		}
		
	}

}
