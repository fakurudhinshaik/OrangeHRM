package com.Practice;

import org.openqa.selenium.edge.EdgeDriver;

public class UrlValidationOrangeHRM {
	
	public static void main(String[] args) {

		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		String orangeHRMUrlAdress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
		driver.get(orangeHRMUrlAdress);
		
		// Expected OrangeHRM Url ------- Client
		
		String orangeHRMCurrentApplicationUrl=driver.getCurrentUrl();
		System.out.println(" The Expected Current OrangeHRM is :-"+orangeHRMCurrentApplicationUrl);
		
		// Actual OrangeHRM Url
		
		String OrangeHRMApplicationUrl=driver.getCurrentUrl();
		System.out.println(" The Actual OrangeHRM is:-"+OrangeHRMApplicationUrl);
		
		
		if(OrangeHRMApplicationUrl.contains(orangeHRMUrlAdress))
		{
			System.out.println(" The Title of Orange HRM is Matched ----- PASS ----- ");
		}
		else
		{
			System.out.println(" The Title of Orange HRM is NOT Matched ----- FAIL -----");
		}
		
		driver.quit();
		
				
	}

}
