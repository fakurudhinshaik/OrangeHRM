package com.Xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Log;

public class FacebookLoginTest {
	
	public WebDriver driver;
	String applicationUrlAddress="https://www.facebook.com/";
	
	@BeforeTest
	public void setUp()
	{
		
		System.setProperty("webdriver.chrome.driver", "./ChromeDriver/chromedriver.exe");
		driver = new ChromeDriver();
		
		//Log.info("*** Chrome Browser Launched Successfully ***");
		System.out.println("*** Chrome Browser Launched Successfully ***");
		
		driver.get(applicationUrlAddress);
		
		//Log.info("*** Navigated To FaceBook Application Login Page");
		System.out.println("*** Navigated To FaceBook Application Login Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
	}

	/*
	@AfterTest
	public void tearDown()
	{
		
		driver.quit();
		
		//Log.info("*** FaceBook Application along with Chrome Browser Closed ***");
		//System.out.println(*** FaceBook Application along with Chrome Browser Closed ***);
	}
	
	*/
	
	@Test
	public void facebookLoginTest() throws InterruptedException
	{
		//<input type="text" class="inputtext _55r1 _6luy" name="email" id="email" data-testid="royal_email" 
		//placeholder="Email address or phone number" autofocus="1" aria-label="Email address or phone number">
		
		//Reletive xpath
		// //tagname[@attribute='attributeValue']
		// //input[@data-testid='royal_email']
		
		By emailIdProperty=By.xpath("//input[@data-testid='royal_email']");
		WebElement emailId=driver.findElement(emailIdProperty);
		emailId.sendKeys("shaik.fakurudhin@gmail.com");
		
		//<input type="password" class="inputtext _55r1 _6luy _9npi" name="pass" id="pass"
		//data-testid="royal_pass" placeholder="Password" aria-label="Password">
		
		// //input[@name='pass']
		
	By passwordProperty=By.xpath("//input[@name='pass']");
	WebElement password=driver.findElement(passwordProperty);	
	password.sendKeys("fakurudhinshaik");
	
	Thread.sleep(2000);
		
			/*
		    <button value="1" class="_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy" 
			name="login" data-testid="royal_login_button" type="submit" 
			id="u_0_5_RR">Log in</button>
			*/
	
		// //button[@data-testid='royal_login_button']
	
		By loginBottonProperty=By.xpath(" //button[@data-testid='royal_login_button']");
		WebElement loginBotton=driver.findElement(loginBottonProperty);
		loginBotton.click();
		
		Thread.sleep(1000);
		
		System.out.println();
		
		
		
		
		
	}
	
	
	
}
