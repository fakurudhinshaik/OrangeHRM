package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMLoginText {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		
		WebDriver driver;
		driver = new EdgeDriver();
		
		String ApplicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAdress);
		
		 By LoginProperty=By.id("btnLogin");
		WebElement Login=driver.findElement(LoginProperty);
		String LoginText=Login.getText();
		System.out.println(" The OrangeHRM WebPage Login Text is:-"+LoginText);
		
	}

}
