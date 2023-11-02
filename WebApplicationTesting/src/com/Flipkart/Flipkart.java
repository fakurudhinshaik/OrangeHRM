package com.Flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		
		WebDriver driver;
		driver = new FirefoxDriver();	
		
		String flipkartApplicationUrlAdress="https://www.flipkart.com/";
		driver.get(flipkartApplicationUrlAdress);
		
		By flipkartloginpage=By.className("_30XB9F");
		WebElement loginpage=driver.findElement(flipkartloginpage);
		loginpage.click();
		
		By flipkartSigninProperty=By.className("_1sLnDu");
		WebElement flipkartSignin=driver.findElement(flipkartSigninProperty);
		
		Actions action = new Actions(driver);
		
		action.moveToElement(flipkartSignin).build().perform();
		
		// <li class="AT0fUR"><div class="_3pKU-e"><img class="SFnind" 
		//src="https://static-assets-web.flixcart.com/batman-returns/batman-returns/p/images/orders-bfe8c4.svg" 
		//alt="Orders" width="24" height="24"></div>Orders</li>
		
		By ordersProperty=By. className("_3pKU-e");
		WebElement orders=driver.findElement(ordersProperty);
		orders.click();
		
		
	}

}
