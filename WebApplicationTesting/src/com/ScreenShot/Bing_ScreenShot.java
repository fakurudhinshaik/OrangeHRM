package com.ScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.ScreenshotException;

public class Bing_ScreenShot extends BaseTest{
	
	public void bingScreenShotTest() throws IOException
	{
	
	File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
	FileUtils.copyFile(screenshot, new File("./ScreenShot/bingscreenshot.png"));	
		
	}
	
	public static void main(String[] args) throws IOException {
		
		Bing_ScreenShot capturingScreenShot = new Bing_ScreenShot();
		capturingScreenShot.applicationLaunch();
		capturingScreenShot.bingScreenShotTest();
		capturingScreenShot.applicationClose();
		
		
	}

	
	
}
