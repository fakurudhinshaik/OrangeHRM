package com.validationOrhm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ValidatingOrhmAssignement {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		
		WebDriver driver;
		driver = new EdgeDriver();
		
		String ApplicationUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(ApplicationUrlAdress);
		
		 driver.manage().window().maximize();
		
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
		 
		 By MiddleNameProperty=By.id("middleName");
		 WebElement MiddleName=driver.findElement(MiddleNameProperty);
		 MiddleName.sendKeys("Fakru");
		 
		 By LastNameProperty=By.id("lastName");
		 WebElement LastName=driver.findElement(LastNameProperty);
		 LastName.sendKeys("Shaik");
		 
		 By EmployeeIdProperty=By.id("employeeId");
		 WebElement EmployeeId=driver.findElement(EmployeeIdProperty);
		 String Employeeid=EmployeeId.getAttribute("value");
		 System.out.println("The Employee id is:-"+Employeeid);
		 
		 System.out.println();
		 
		 By SaveProperty=By.id("btnSave");
		 WebElement Save=driver.findElement(SaveProperty);
		 Save.click();
		 
		 	By ActualPersonalDetailsProperty=By.id("personal_txtEmpFirstName");
			WebElement PersonalDetails=driver.findElement(ActualPersonalDetailsProperty);
			String PersonalDetailsText=PersonalDetails.getAttribute("value");
			System.out.println("The Personal Details First Name is :-"+ PersonalDetailsText);
			
			System.out.println();
			
			By ActualpersonalMiddleNameProperty=By.id("personal_txtEmpMiddleName");
			WebElement personalMiddleName=driver.findElement(ActualpersonalMiddleNameProperty);
			String personalMiddleNameText=personalMiddleName.getAttribute("value");
			System.out.println("The Personal Details Middle Name is :-"+  personalMiddleNameText);
			
			System.out.println();
			
			By ActualpersonalLastNameProperty=By.id("personal_txtEmpLastName");
			WebElement personalLastName=driver.findElement(ActualpersonalLastNameProperty);
			String personalLastNameText=personalLastName.getAttribute("value");
			System.out.println("The Personal Details Last Name is :-"+ personalLastNameText);
		
			System.out.println();
		 
			By ExpectedPersonalDetailsProperty=By.id("personal_txtEmpFirstName");
			WebElement personalDetails=driver.findElement(ExpectedPersonalDetailsProperty);
			String personaldetails=personalDetails.getAttribute("value");
			System.out.println("Expected Personal Deatails is :-"+personaldetails);
			
			System.out.println();
			
			if(ActualPersonalDetailsProperty.equals(ExpectedPersonalDetailsProperty))
			{
				System.out.println("Personal Details are matched ***Pass***");
			}
			else
			{
				System.out.println("Personal Deatails are Not Matched ***Fail***");
			}
			
			System.out.println();
			
			By ExpectedpersonalMiddleNameProperty=By.id("personal_txtEmpMiddleName");
			WebElement personalmiddleName=driver.findElement(ExpectedpersonalMiddleNameProperty);
			String personlmiddlename=personalmiddleName.getAttribute("value");
			System.out.println("Expected Personal Middle is :-"+personlmiddlename);
			
			System.out.println();
			
			if(ActualpersonalMiddleNameProperty.equals(ExpectedpersonalMiddleNameProperty))
			{
				System.out.println("Personal Middle Name is Matched ***Pass***");
			}
			
			else
			{
				System.out.println("Personal Middle Anme is Not matched ***Fail***");
			}
			
			System.out.println();
			
			By ExpectedpersonalLastNameProperty=By.id("personal_txtEmpLastName");
			WebElement personallastname=driver.findElement(ExpectedpersonalLastNameProperty);
			String personallastName=personallastname.getAttribute("value");
			System.out.println("Expected Last Name is :-"+personallastName);
			
			System.out.println();
			
			if(ActualpersonalLastNameProperty.equals(ExpectedpersonalLastNameProperty))
				
			{
				System.out.println("Personal Last Name is Matched ***Pass***");
			}
			else
			{
				System.out.println("Persoanl Last Name is Not Matched ***Fail***");
			}
			
			System.out.println();
			
		 By FullNameText=By.className("hasTopFieldHelp");
		 WebElement Fullname=driver.findElement(FullNameText);
		 String fullnametext=Fullname.getText();
		 System.out.println(" The Orangehrm Add Employee  Deatails First Name is :-"+fullnametext);
		 
		 System.out.println();
		 
		 String PersonalUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/pim/viewPersonalDetails/empNumber/0025";
		 driver.get(PersonalUrlAdress);
		 
		 String ExpectedPersoanlUrlAdress=driver.getCurrentUrl();
		 System.out.println(" The Expected Personal Url Adress is :-"+ExpectedPersoanlUrlAdress);
		 
		 System.out.println();
		 
		 String ActualPersonalUrlAdress=driver.getCurrentUrl();
		 System.out.println(" The Actual Personal Url Adress is :-"+ActualPersonalUrlAdress);
		 
		 System.out.println();
		 
		 if(ActualPersonalUrlAdress.equals(ExpectedPersoanlUrlAdress))
		 {
			 System.out.println(" The OrangeHRM Persoanl Url Adress is Matched ----- PASS -----");
		 }
		 else
		 {
			 System.out.println(" The OrangeHRM Personal Url Adress is NOT Matches ----- FAIL -----");
		 }
		
		 System.out.println();
		 
		 By WelcomeAdminProperty=By.id("welcome");
		 WebElement WelcomeAdmin=driver.findElement(WelcomeAdminProperty);
		 WelcomeAdmin.click();
		 
		 Thread.sleep(5000);
		 
		 By LogoutProperty=By.linkText("Logout");
		 WebElement Logout=driver.findElement(LogoutProperty);
		 Logout.click();
		 System.out.println(" LogOut Operation Will Be Done");
		 
		 System.out.println();
		 
		 String Orangehrmloginproperty="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		 driver.get(Orangehrmloginproperty);
		 
		 String Expectedloginpage=driver.getCurrentUrl();
		 System.out.println(" The Expected Login page is :-"+Expectedloginpage);
		 
		 System.out.println();
		 
		 String Actualloginpage=driver.getCurrentUrl();
		 System.out.println(" The Actual Login Page is :-"+Actualloginpage);
		 
		 System.out.println();
		 
		 if(Actualloginpage.equals(Expectedloginpage))
		 {
			 System.out.println(" The orham login page is matched --Pass--");
		 }
		 else
		 {
			 System.out.println(" The orhm login page is not matched ---Fail---");
		 }
		 
		 System.out.println();
		 
		 String OrangeHrmTitle=driver.getTitle();
		 System.out.println(" The OrangeHRM Login Page Title Is :-"+OrangeHrmTitle);
		 
		 System.out.println();
		 
		 By LoginBottonProperty=By.id("btnLogin");
		 WebElement LoginBotton=driver.findElement(LoginBottonProperty);
		 String loginBottonText=LoginBotton.getAttribute("value");
		 System.out.println("The OrangeHrm Login Botton Text is:-"+loginBottonText);
		 
		 
		 System.out.println();
		 
		 Thread.sleep(5000);
		
		
		 driver.quit();
		

		
		
	}
	

}
