package com.ScreenShot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseTest {

	WebDriver driver;
	String applicationUrlAddress="http://Bing.com";
	
	
	public void applicationLaunch()
	{
		System.setProperty("webdriver.edge.driver", "./Libaray/msedgedriver.exe");
		driver = new EdgeDriver();
		
		System.out.println("******** Edge Broswer Lanched Sucessfully ********");
		
		driver.get(applicationUrlAddress);
		System.out.println("Navigated To OrangeHRM Application Login Page");
		driver.manage().window().maximize();
		
		}
	
	public void applicationClose()
	{
		driver.quit();
		
		System.out.println("****** OrangeHRM Application along with Edge Broswer Closed ******");
	}
	

}
