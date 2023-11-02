package com.WebTable;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingFirstColumnCityNames extends BaseTest{
	
	@Test
	public void CapturingFirstColumnCityNames()
	{
		for(int index=1;index<=36;index++)
		{
			// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
			By firstColumnCityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]");
			WebElement cityName=driver.findElement(firstColumnCityNameProperty);
			
			String cityNameText=cityName.getText();
			System.out.println(cityNameText);
		}
	}

}
