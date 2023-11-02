package com.EmployeeId;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployeeeid {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	
	System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
	
	WebDriver driver;
	driver = new EdgeDriver();
	
	String ApplicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(ApplicationUrlAdress);
	
	 String userNameTestData="admin";
	 By UserNameProperty=By.id("txtUsername");
	 WebElement UserName=driver.findElement(UserNameProperty);
	 UserName.sendKeys(userNameTestData);
	 
	 System.out.println();
	 
	 String PasswordTestdata="Shaik@123S";
	 By PasswordProperty=By.id("txtPassword");
	 WebElement Password=driver.findElement(PasswordProperty);
	 Password.sendKeys(PasswordTestdata); 
	 
		 
	 By LoginProperty=By.id("btnLogin");
	 WebElement Login=driver.findElement(LoginProperty);
	 Login.click();
	 
	 By AdminProperty=By.id("menu_admin_viewAdminModule");
	 WebElement Admin1=driver.findElement(AdminProperty);
	 Admin1.click();
	 
	 By PIMProperty=By.id("menu_pim_viewPimModule");
	 WebElement PIM=driver.findElement(PIMProperty);
	 
	 Actions action = new Actions(driver);
	 action.moveToElement(PIM).build().perform();
	 
	 By AddEmployeeProperty=By.id("menu_pim_addEmployee");
	 WebElement AddEmployee=driver.findElement(AddEmployeeProperty);
	 AddEmployee.click();
	 
	 By ExpectedFirstNameProperty=By.className("formInputText");
	 WebElement FirstName=driver.findElement(ExpectedFirstNameProperty);
	 FirstName.sendKeys("siri1");
	
	 By MiddleNameProperty=By.id("middleName");
	 WebElement MiddleName=driver.findElement(MiddleNameProperty);
	 MiddleName.sendKeys("fakru0");
		 
	 By LastNameProperty=By.id("lastName");
	 WebElement LastName=driver.findElement(LastNameProperty);
	 LastName.sendKeys("jakkanapally");
	 
	 By EmployeeIdProperty=By.id("employeeId");
	 WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
	 String Employeeid=EmployeeId.getAttribute("value");
	 System.out.println("The Employee id is:-"+Employeeid);
	 
	 By SaveProperty=By.id("btnSave");
	 WebElement Save=driver.findElement(SaveProperty);
	 Save.click();
	 	 
	By  PersonalDetailsProperty=By.id("personal_txtEmpFirstName");
	WebElement PersonalDetails=driver.findElement(PersonalDetailsProperty);
	String PersonalDetailsText=PersonalDetails.getAttribute("value");
	System.out.println("The Personal Details First Name is :-"+PersonalDetailsText);
	
	By personalMiddleNameProperty=By.id("personal_txtEmpMiddleName");
	WebElement personalMiddleName=driver.findElement(personalMiddleNameProperty);
	String personalMiddleNameText=personalMiddleName.getAttribute("value");
	System.out.println("The Personal Details Middle Name is :-"+personalMiddleNameText);
	
	By personalLastNameProperty=By.id("personal_txtEmpLastName");
	WebElement personalLastName=driver.findElement(personalLastNameProperty);
	String personalLastNameText=personalLastName.getAttribute("value");
	System.out.println("The Personal Details Last Name is :-"+personalLastNameText);
	
	
	
	 driver.quit();
	

	 
}
}