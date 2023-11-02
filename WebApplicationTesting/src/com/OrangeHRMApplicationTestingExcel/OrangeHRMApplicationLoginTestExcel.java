package com.OrangeHRMApplicationTestingExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OrangeHRMApplicationLoginTestExcel {
	
	WebDriver driver;
	
	String ApplicationUrlAddress="http://127.0.0.1/orangehrm-4.2.0.1/symfony/web/index.php/auth/login";
	
	FileInputStream testDataFile;
	XSSFWorkbook workBook;
	XSSFSheet testDataSheet;
	Row testDataRow;
	
	public void applicationLaunch() {
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver = new EdgeDriver();
		
		driver.get(ApplicationUrlAddress);
		
		driver.manage().window().maximize();
		
	}

	public void applicationClose()
	{
		
		driver.quit();
		
	}
	
	public void loginTest()
	{
		
		
		
	}
	
}
