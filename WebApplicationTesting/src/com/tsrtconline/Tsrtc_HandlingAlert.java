package com.tsrtconline;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tsrtc_HandlingAlert extends BaseTest{

	@Test(priority=1,description=" Validating Check Avaliablity Button Test ")
	public void CheckAvailabilityTest()
	{
		
		By checkAvailabilityProperty=By.id("searchBtn");
		WebElement checkAvailability=driver.findElement(checkAvailabilityProperty);
		checkAvailability.click();
	}
	@Test(priority=2,description=" Validating The Alert Window Test ")
	public void handlingAlert() throws InterruptedException
	{
	
		Alert tsrtcAlertWindow=driver.switchTo().alert();
		Thread.sleep(5000);
		
		String alertWindowMessage=tsrtcAlertWindow.getText();
		System.out.println(" The Text Of The Alert Window is :-"+alertWindowMessage);
		
		tsrtcAlertWindow.accept(); 
		// accept method will perform opertion on ok botton in the alert window
		
		Thread.sleep(3000);
		
		//tsrtcAlertWindow.dismiss();	
		// dismiss method will perform operation on cancel button  
		
		//tsrtcAlertWindow.sendKeys("Testing");
		// To send a test Data into the Alert Window
		
		
	}
	
}
