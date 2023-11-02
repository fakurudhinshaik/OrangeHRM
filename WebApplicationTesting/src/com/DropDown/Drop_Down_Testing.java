package com.DropDown;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.CapturingScreenShot.ScreenShot;

public class Drop_Down_Testing extends BaseTest{
	
	
	@Test
	public void dropDownTesting() throws InterruptedException, IOException
	{
	
		//id="gtranslate_selector"
		
		By selectDropDownLaunguageProperty=By.id("gtranslate_selector");
		WebElement selectDropDownLaunguage=driver.findElement(selectDropDownLaunguageProperty);
		
				//<option value="">Select Language</option>
				//<option value="en|fr">French</option>
				//<option value="en|de">German</option>
				//<option value="en|es">Spanish</option>
				
				//Getting all the elements of the DropDown
				
			By dropDownProperty=By.tagName("option");
			List<WebElement>selectLanunguges=selectDropDownLaunguage.findElements(dropDownProperty);
			
			for(int index=0;index<selectLanunguges.size();index++)
			{
				
				String dropDownLanugugeName=selectLanunguges.get(index).getText();
				System.out.println(dropDownLanugugeName);
				
				Select selection = new Select(selectDropDownLaunguage);
				selection.selectByIndex(index);
				
				Thread.sleep(5000);
				
				File ScreenShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(ScreenShot, new File("./ScreenShot/osmainaUniversity/"+dropDownLanugugeName+".png"));
			
			}
			
			Select selection = new Select(selectDropDownLaunguage);
			selection.selectByIndex(10);
			
			selection.deselectByVisibleText("Greek");
			
			selection.deselectAll();
			selection.deselectByVisibleText("Hindi");
			
			selection.deselectByValue("en|el");
			
			selection.deselectByIndex(1);
			
			
			
	}
	

}
