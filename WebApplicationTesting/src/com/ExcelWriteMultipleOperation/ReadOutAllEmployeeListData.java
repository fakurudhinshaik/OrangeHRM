package com.ExcelWriteMultipleOperation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.CapturingScreenShot.ScreenShot;

public class ReadOutAllEmployeeListData extends BaseTest{
	
	@Test
	public void EmployeeListData() throws IOException 
	{
	
		FileInputStream validData=new FileInputStream("./src/com/MultpleTestData/Book5.xlsx");
		XSSFWorkbook wb= new XSSFWorkbook(validData);
		XSSFSheet sheet = wb.getSheet("testData");
		
		int rowCount=sheet.getLastRowNum();
		
		for(int index=0;index<=rowCount;index++)
		{
			
			XSSFRow row = sheet.getRow(index);
			
			String userNameData=row.getCell(0).getStringCellValue();
			
			By userNameProperty=By.id("txtUsername");
			WebElement userName=driver.findElement(userNameProperty);
			userName.sendKeys("admin");
			
			String passwordData=row.getCell(0).getStringCellValue();
			
			By passwordProperty=By.id("txtPassword");
			WebElement password=driver.findElement(passwordProperty);
			password.sendKeys("Shaik@123S");
			
			XSSFCell cell = row.createCell(0);
			
		File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyDirectory(ScreenShot, new File("./ScreenShot/orhmapplication.png"));	
		
		By loginProperty=By.id("btnLogin");
		WebElement login=driver.findElement(loginProperty);
		login.click();
			
		}
		
		
	}
	
}

