package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Google_SignIn_GetText {
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver = new EdgeDriver();
		
		String applicationUrlAdress="http://google.com";
		driver.get(applicationUrlAdress);
		
		By  signinProperty=By.linkText("Sign in");
		WebElement signin=driver.findElement(signinProperty);
		String signin_Text=driver.getTitle();
		System.out.println(" The Text Of The Element signin On The Google HomePage is :-"+signin_Text);
		
	}

}
