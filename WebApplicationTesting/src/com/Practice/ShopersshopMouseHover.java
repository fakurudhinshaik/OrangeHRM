package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ShopersshopMouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		WebDriver driver;
		driver= new FirefoxDriver();
		
		String shopersApplicationUrlAdress="https://www.shoppersstop.com/";
		driver.get(shopersApplicationUrlAdress);
		
		Thread.sleep(5000);
		
		By shopersManProperty=By.className("lvl2-main");
		WebElement shopersMan=driver.findElement(shopersManProperty);
		
		Actions action = new Actions(driver);
		action.moveToElement(shopersMan).build().perform();
		
		
		By shopersWatchesProperty=By.linkText("Watches");
		WebElement shoperWatch=driver.findElement(shopersWatchesProperty);
		action.moveToElement(shoperWatch).build().perform();
		
		By shopersSmartWatchesProperty=By.linkText("Smartwatch & Fitness Bands");
		WebElement shopersSmartWatches=driver.findElement(shopersSmartWatchesProperty);
		shopersSmartWatches.click();
	
	}

}
