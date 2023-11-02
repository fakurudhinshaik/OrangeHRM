package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Shopclues {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		WebDriver driver;
		driver= new FirefoxDriver();
		
		String shopcluesApplicationUrlAdress="https://www.shopclues.com/";
		driver.get(shopcluesApplicationUrlAdress);
		
		Thread.sleep(3000);
		
		By shopcluesMobilesProperty=By.id("nav_44");
		WebElement shopcluesMobiles=driver.findElement(shopcluesMobilesProperty);
		
		Actions action = new Actions(driver);
		action.moveToElement(shopcluesMobiles).build().perform();
		
		By shopcluesAppleProperty=By.linkText("Apple");
		WebElement shopcluesApple=driver.findElement(shopcluesAppleProperty);
		shopcluesApple.click();
		
		Thread.sleep(5000);
		driver.quit();
		
	}

}
