package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMPractice {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		String orangehrmHomePageUrl="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(orangehrmHomePageUrl);
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("Shaik@123S");
		driver.findElement(By.id("btnLogin")).click();
		
		System.out.println(" The OrangeHRM HomePage Login Page is Sucessfully Created ");
		driver.quit();
		
		
	}
	
}
