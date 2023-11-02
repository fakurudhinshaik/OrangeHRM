package com.TestNgPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.CapturingScreenShot.ScreenShot;

public class TestNgExampleContinues extends TestNgExample1 {
	
	@Test
	
	public void ICICIScreenShot() throws IOException
	{
		
		File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ScreenShot, new File("./ScreenShot/ICICI.png"));
	}

}
