package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_SignIn_GetAttribute {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		driver = new FirefoxDriver();
		
		System.out.println("lunch sucessFull");	
		
		
		String applicationUrlAdress="http://google.com";		
		driver.get(applicationUrlAdress);
		System.out.println("Google Home Page is Lanch");
		
		/*
		By signinProperty=By.linkText("Sign in");
		WebElement signin=driver.findElement(signinProperty);
		signin.click();
		
		System.out.println("Sucessfully Clicked on Signin Link");
		*/
		
		By signinProperty=By.linkText("Sign in");
		WebElement signin=driver.findElement(signinProperty);	
		
		String signinAttributevalue=signin.getAttribute("class");
		System.out.println(" The span attribute value os signin element is:-"+signinAttributevalue);
		
		
		signin.click();
		
		System.out.println("Click");
		
		
		
		driver.quit();
	}
	
	
}
