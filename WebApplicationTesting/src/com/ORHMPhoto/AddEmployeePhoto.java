package com.ORHMPhoto;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddEmployeePhoto {
	
public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
	
	WebDriver driver;
	driver = new ChromeDriver();
	
	String ApplicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	driver.get(ApplicationUrlAdress);
	
	 String expectedOrangeHrmUrlAdress=driver.getCurrentUrl();
	 System.out.println("The Expected Current OrangeHRm Url Is :-"+expectedOrangeHrmUrlAdress);
	 
	 System.out.println();
	 
	 String actualOrangeHRMUrlAdress=driver.getCurrentUrl();
	 System.out.println("The Actual Current OrangeHRM  Url Is :-"+actualOrangeHRMUrlAdress);
	 
	 System.out.println();
	 
	 if(actualOrangeHRMUrlAdress.equals(expectedOrangeHrmUrlAdress))
	 {
		 System.out.println(" The OrangeHRM Url Adress is Matched ----- PASS -----");
	 }
	 else
	 {
		 System.out.println(" The OrangeHRM Url Adress is Not Matched ----- FAIL -----");
	 }
	
	 System.out.println();
	 
	 By LOGINPanelProperty=By.id("logInPanelHeading");
	 WebElement LOGINPanel=driver.findElement(LOGINPanelProperty);
	 String LOGINpannel=LOGINPanel.getText();
	 System.out.println(" The LOGINPanel Text is :-"+LOGINpannel);
	
	 System.out.println();
	 
	 String userNameTestData="admin";
	 By UserNameProperty=By.id("txtUsername");
	 WebElement UserName=driver.findElement(UserNameProperty);
	 UserName.sendKeys(userNameTestData);
	 
	 System.out.println();
	 
	 String PasswordTestdata="Shaik@123S";
	 By PasswordProperty=By.id("txtPassword");
	 WebElement Password=driver.findElement(PasswordProperty);
	 Password.sendKeys(PasswordTestdata); 
	 
	 System.out.println();
	 
	 By LoginProperty=By.id("btnLogin");
	 WebElement Login=driver.findElement(LoginProperty);
	 Login.click();
	 
	 String HomePageUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/dashboard";
	 driver.get(HomePageUrlAdress);
	 
	 String ExpectedHomepageUrlAdress=driver.getCurrentUrl();
	 System.out.println(" The OrangeHRM Home Page Url Adress is :-"+ExpectedHomepageUrlAdress);
	 
	 System.out.println();
	 
	 String ActualHomepageUrlAdress=driver.getCurrentUrl();
	 System.out.println(" The OrangeHRM Home Page Url Adress Is:-"+ActualHomepageUrlAdress);
	 
	 System.out.println();
	 
	 if(ActualHomepageUrlAdress.contains(ExpectedHomepageUrlAdress))
	 {
		 System.out.println(" The OrangeHRM Home Page Url Is Matched ----- PASS -----");
	 }
	 else
	 {
		 System.out.println(" The OrangeHRM Home Page Url Is NOT Matched ----- FAIL -----");
	 }
	 
	 System.out.println();
	 
	 By AdminTextProperty=By.id("menu_admin_viewAdminModule");
	 WebElement Admin=driver.findElement(AdminTextProperty);
	 String adminText=Admin.getText();
	 System.out.println(" The Admin Text is:-"+adminText);
	 
	 System.out.println();
	 
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
	 
	 String AddemployeeUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/pim/addEmployee";
	 driver.get(AddemployeeUrlAdress);
	 
	 String ExpectedAddemployeeUrlAdress=driver.getCurrentUrl();
	 System.out.println(" The Expected ADD EMPLOYEE Url Is :-"+ExpectedAddemployeeUrlAdress);
	 
	 System.out.println();
	 
	 String ActualAddemployeeUrlAdress=driver.getCurrentUrl();
	 System.out.println(" The Actual ADD EMPLOYEE Url is :-"+ActualAddemployeeUrlAdress);
	 
	 System.out.println();
	 
	 if(ActualAddemployeeUrlAdress.contains(ExpectedAddemployeeUrlAdress))
	 {
		 System.out.println(" The OrangeHRM Add Employee Url Is Matched ----- PASS -----");
	 }
	 else
	 {
		 System.out.println(" The OrangeHRM Add Employee Url Is Not Matched ----- FAIL -----");
	 }
	 
	 System.out.println();
	 
	 By FirstNameProperty=By.id("firstName");
	 WebElement FirstName=driver.findElement(FirstNameProperty);
	 FirstName.sendKeys("Fakurudhin");
	 
	 Actions keybordActions = new Actions(driver);
	 keybordActions.sendKeys(Keys.TAB).build().perform();
	 
	 keybordActions.sendKeys("fakru").build().perform();
	 keybordActions.sendKeys(Keys.TAB).build().perform();
	 keybordActions.sendKeys("shiak").build().perform();
	 keybordActions.sendKeys(Keys.TAB).build().perform();
	 keybordActions.sendKeys(Keys.TAB).build().perform();
	 
	
	 keybordActions.sendKeys(Keys.ENTER).build().perform();
	 
	 Thread.sleep(3000);
	 java.lang.Runtime.getRuntime().exec("C:\\Users\\MD\\Desktop\\Eclips\\WebApplicationTesting\\src\\com\\Photo\\AutoitAddEmployeePhoto.exe");
	 
	 Thread.sleep(3000);
	 
	 By photographimageProperty=By.id("empPic");
	 WebElement photographimage=driver.findElement(photographimageProperty);
	 
	 boolean flag=photographimage.isDisplayed();
	 
	 if(flag)
	 {
		 
		 System.out.println(" Employee PhotoGraph Sucessfully Uploaded To Application - Pass ");
	 }
	 else
	 {
		 System.out.println(" Employee PhotoGraph Failed To Uploaded To Application - Fail ");
	 }
	 
//	 By MiddleNameProperty=By.id("middleName");
//	 WebElement MiddleName=driver.findElement(MiddleNameProperty);
//	 MiddleName.sendKeys("Fakru");
//	 
//	 By LastNameProperty=By.id("lastName");
//	 WebElement LastName=driver.findElement(LastNameProperty);
//	 LastName.sendKeys("Shaik");
//	 
//	 By EmployeeIdProperty=By.id("employeeId");
//	 WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
//	 String Employeeid=EmployeeId.getAttribute("value");
//	 System.out.println("The Employee id is:-"+Employeeid);
//	 
//	 System.out.println();
	 
	 By SaveProperty=By.id("btnSave");
	 WebElement Save=driver.findElement(SaveProperty);
	 Save.click();
//	 
//		By ActualPersonalDetailsProperty=By.id("personal_txtEmpFirstName");
//		WebElement PersonalDetails=driver.findElement(ActualPersonalDetailsProperty);
//		String PersonalDetailsText=PersonalDetails.getAttribute("value");
//		System.out.println("The Personal Details First Name is :-"+ PersonalDetailsText);
//		
//		System.out.println();
//		
//		By ActualpersonalMiddleNameProperty=By.id("personal_txtEmpMiddleName");
//		WebElement personalMiddleName=driver.findElement(ActualpersonalMiddleNameProperty);
//		String personalMiddleNameText=personalMiddleName.getAttribute("value");
//		System.out.println("The Personal Details Middle Name is :-"+  personalMiddleNameText);
//		
//		System.out.println();
//		
//		By ActualpersonalLastNameProperty=By.id("personal_txtEmpLastName");
//		WebElement personalLastName=driver.findElement(ActualpersonalLastNameProperty);
//		String personalLastNameText=personalLastName.getAttribute("value");
//		System.out.println("The Personal Details Last Name is :-"+ personalLastNameText);
//	
//		System.out.println();
//	 
//		By ExpectedPersonalDetailsProperty=By.id("personal_txtEmpFirstName");
//		WebElement personalDetails=driver.findElement(ExpectedPersonalDetailsProperty);
//		String personaldetails=personalDetails.getAttribute("value");
//		System.out.println("Expected Personal Deatails is :-"+personaldetails);
		

}
}