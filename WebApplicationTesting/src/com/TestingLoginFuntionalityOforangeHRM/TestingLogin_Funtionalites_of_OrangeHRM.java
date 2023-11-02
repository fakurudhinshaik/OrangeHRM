package com.TestingLoginFuntionalityOforangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestingLogin_Funtionalites_of_OrangeHRM {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		WebDriver driver;
		driver = new EdgeDriver();
		
		String applicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(applicationUrlAdress);
		
		String orangehrmCurrentUrlAdress=driver.getCurrentUrl();
		System.out.println("The Current OrangeHRM Url is:-"+orangehrmCurrentUrlAdress);
		
		// Expected orangeHRM Url adress
		String expectedCurrentUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		System.out.println("The Expected Current URL is :-"+expectedCurrentUrlAdress);
		
		// Actual orangeHRM  Url Adress
		String actualCurrentUrlAdress=driver.getCurrentUrl();
		System.out.println("The Actual Current URL is :-"+actualCurrentUrlAdress);
		
		if(actualCurrentUrlAdress.contains(expectedCurrentUrlAdress))
		{
			System.out.println("The OrangeHRM Home Page is Matched ----- PASS ----- ");
		}
		else
		{
			System.out.println("The OrangeHRM Home Page is Not Matched ----- FAIL -----");
		}
		
		
		
		// Login to Application with valid Data
		
		By userNameProperty=By.id("txtUsername");
		WebElement userName=driver.findElement(userNameProperty);
		userName.sendKeys("admin");
		
		By passwordProperty=By.name("txtPassword");
		WebElement password =driver.findElement(passwordProperty);
		password.sendKeys("Shaik@123S");
		
		By loginProperty=By.id("btnLogin");
		WebElement login =driver.findElement(loginProperty);
		login.click();
		
		// Validating orangeHRM Home Page
		String expectedorangeHRMTitle="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
		String orangehrmTitle=driver.getTitle();
		System.out.println("The orangehrm title is :-"+orangehrmTitle);
		
		By adminWelcomePage=By.className("firstLevelMenu");
		WebElement admin=driver.findElement(adminWelcomePage);
		admin.click();
		System.out.println(" Welcome To orangehrm ADMIN Page");
		
		String expectedTextOrhrm="Admin";
		System.out.println("The Expected Text of Admin Orhm Home Page is:-"+expectedTextOrhrm);
		
		
		By actualAdminProperty=By.className("firstLevelMenu");
		WebElement adminText=driver.findElement(actualAdminProperty);
		String OrhnAdminText=adminText.getText();
		System.out.println("The Actual Admin Text Name is:-"+OrhnAdminText);
		
		if (OrhnAdminText.contains(expectedTextOrhrm))
		{
			System.out.println(" The Orhm Admin Text is Matched");
		}
		else
		{
			System.out.println("The Orhm Admin Text is Not Matched");
		}
		
		By pimproperty=By.id("menu_pim_viewPimModule");
		WebElement pim=driver.findElement(pimproperty);
		pim.click();
		
		//id="menu_pim_addEmployee"
		
		By addEmployeeProperty=By.id("menu_pim_addEmployee");
		WebElement addEmployee=driver.findElement(addEmployeeProperty);
		addEmployee.click();
		Thread.sleep(5000);
		
		By firstNameProperty=By.className("hasTopFieldHelp");
		WebElement firstName=driver.findElement(firstNameProperty);
		String FirstName=firstName.getText();
		System.out.println("The First Name Text Is :-"+FirstName);
		
		
		By BoxfirstNameProperty=By.id("firstName");
		WebElement boxfirstName=driver.findElement(BoxfirstNameProperty);
		boxfirstName.sendKeys("siri1");
		
		By middleNameProperty=By.id("middleName");
		WebElement middleName=driver.findElement(middleNameProperty);
		middleName.sendKeys("fakru0");
		
		By lastNameProperty=By.id("lastName");
		WebElement lastName=driver.findElement(lastNameProperty);
		lastName.sendKeys("jakkanapally");
		
		By saveProperty=By.id("btnSave");
		WebElement save=driver.findElement(saveProperty);
		save.click();
		
		Thread.sleep(3000);
		
		By firstname=By.className("fieldDescription");
		WebElement firstnametext=driver.findElement(firstname);
		System.out.println("firstname text is :-"+firstnametext);
		
		By AdminProperty=By.id("menu_admin_viewAdminModule");
		WebElement Admin=driver.findElement(AdminProperty);
		Admin.click();
		
		By welcomeProperty=By.id("welcome");
		WebElement welcome=driver.findElement(welcomeProperty);
		welcome.click();
		
		Thread.sleep(5000);
		
		By logoutProperty=By.linkText("Logout");
		WebElement logout=driver.findElement(logoutProperty);
		logout.click();
		
		
	
		
		
		
		driver.quit();
		
		
		
	}
	

}
