package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMLoginTest {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver;
		
		driver = new EdgeDriver();
		
		String applicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAdress);
		
		//driver.findElement(By.id("txtUsername")).sendKeys("admin");
		//driver.findElement(By.id("txtPassword")).sendKeys("Shaik@123S");
		//driver.findElement(By.id("btnLogin")).click();
		
		//WebElement userName=driver.findElement(By.id("txtUsername"));
		//userName.sendKeys("admin");
		
		//WebElement password =driver.findElement(By.id("txtPassword"));
		//password.sendKeys("Shaik@123S");
		
		//WebElement login =driver.findElement(By.id("btnLogin"));
		//login.click();
		
		By userNameProperty=By.id("txtUsername");
		WebElement userName =driver.findElement(userNameProperty);
		userName.sendKeys("admin");
		
		By passwordProperty=By.id("txtPassword");
		WebElement password =driver.findElement(passwordProperty);
		password.sendKeys("Shaik@123S");
		
		By loginProperty=By.id("btnLogin");
		WebElement login=driver.findElement(loginProperty);
		login.click();
		
		
		
		
	}

}
