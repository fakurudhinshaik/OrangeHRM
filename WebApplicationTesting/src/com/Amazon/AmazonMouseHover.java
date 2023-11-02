package com.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonMouseHover {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		
		WebDriver driver;
		driver = new FirefoxDriver();	
		
		String amazonApplicationUrlAdress="https://www.amazon.in/";
		driver.get(amazonApplicationUrlAdress);
		
		By helloSignInProperty=By.id("nav-link-accountList-nav-line-1");
		WebElement helloSignin=driver.findElement(helloSignInProperty);
		
		Actions action = new Actions(driver);
		action.moveToElement(helloSignin).build().perform();
		
		By yourOrdersProperty=By.id("nav_prefetch_yourorders");
		WebElement yourOrder=driver.findElement(yourOrdersProperty);
		yourOrder.click();
				
	}

}
