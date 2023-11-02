package com.Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chrome {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Libaray/geckodriver.exe");
		
		WebDriver driver;
		driver= new FirefoxDriver();
		
		String orhmApplicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(orhmApplicationUrlAdress);
		
		String userNameTestData="admin";
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys(userNameTestData);
		
		String passwordTestData="Shaik@123S";
		By passwordProperty=By.name("txtPassword");
		WebElement password=driver.findElement(passwordProperty);
		password.sendKeys(passwordTestData);
		
		By loginProperty=By.className("button");
		WebElement login=driver.findElement(loginProperty);
		login.click();
		
		Thread.sleep(5000);
		
		//id="menu_pim_viewPimModule"
		
		By pimproperty=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimproperty);
		pim.click();
		
		//id="menu_pim_addEmployee"
		
		By addEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeProperty);
		addEmployee.click();
		Thread.sleep(5000);
		
		By firstNameProperty=By.id("firstName");
		WebElement firstName=driver.findElement(firstNameProperty);
		firstName.sendKeys("siri1");
		
		By middleNameProperty=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.sendKeys("fakru0");
		
		By lastNameProperty=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys("jakkanapally");
		
		By saveProperty=By.id("btnSave");
		WebElement save=driver.findElement(saveProperty);
		save.click();
		
		By welcomeProperty=By.id("welcome");
		WebElement welcome=driver.findElement(welcomeProperty);
		welcome.click();
		
		//<a href="/orangehrm-4.2.0.1/symfony/web/index.php/auth/logout">Logout</a>
		
		By logoutProperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		
		
	
	}

}
