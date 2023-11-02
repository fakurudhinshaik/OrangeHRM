package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDown_Testing extends BaseTest{
	
	
	@Test
	public void dropDownTesting()
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
		List <WebElement>selectLaunguages=selectDropDownLaunguage.findElements(dropDownProperty);
		
		for(int index=0;index<selectLaunguages.size();index++)
		{
			
			String dropDownLaunguageName=selectLaunguages.get(index).getText();
			System.out.println(dropDownLaunguageName);
			
		}
		
		Select selection = new Select(selectDropDownLaunguage);
		selection.selectByIndex(10);
		
	}

}
