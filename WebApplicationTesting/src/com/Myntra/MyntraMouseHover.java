package com.Myntra;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraMouseHover {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		WebDriver driver;
		driver= new FirefoxDriver();
		
		String myntraApplicationUrlAdress="https://www.myntra.com";
		driver.get(myntraApplicationUrlAdress);
		
		By myntraManProperty=By.className("desktop-main");
		WebElement myntraMan=driver.findElement(myntraManProperty);
		
		Actions action = new Actions(driver);
		action.moveToElement(myntraMan).build().perform();
		
		By myntrat_shirtsproperty=By.linkText("T-Shirts");
		WebElement myntraT_shirts=driver.findElement(myntrat_shirtsproperty);
		myntraT_shirts.click();
		
		Thread.sleep(5000);
		
		By myntraWomanProperty=By.linkText("Women");
		WebElement myntraWoman=driver.findElement(myntraWomanProperty);
		
		action.moveToElement(myntraWoman).build().perform();
		
		
		By myntraKurtiesProperty=By.className("desktop-categoryLink");
		WebElement myntraKurties=driver.findElement(myntraKurtiesProperty);
		myntraKurties.click();
		
		
		 By myntraHomeLivingProperty=By.className("desktop-main");
		 WebElement myntraHomeLiving=driver.findElement(myntraHomeLivingProperty);
		
		 action.moveToElement(myntraHomeLiving).build().perform();
		
		 
		 By myntraDinnerProperty=By.className("desktop-categoryLink");
		 WebElement myntraDinner=driver.findElement(myntraDinnerProperty);
		 myntraDinner.click();
		 
		
	
	
	}

}
