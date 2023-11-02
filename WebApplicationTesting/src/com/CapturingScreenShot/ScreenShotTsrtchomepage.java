package com.CapturingScreenShot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;


public class ScreenShotTsrtchomepage extends ScreenShot {
	
	
	public void TsrtcHomePageScreenShot() throws IOException
	
	{
	
	File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShot, new File ("./ScreenShot/TsrtcHomePage.png"));
	
	}

	public static void main(String[] args) throws IOException {
		{
			
			ScreenShotTsrtchomepage screenShot =  new ScreenShotTsrtchomepage();
					
			
			screenShot.setUp();		
			screenShot.TsrtcHomePageScreenShot();
			screenShot.tearDown();		
		}
	}
}
