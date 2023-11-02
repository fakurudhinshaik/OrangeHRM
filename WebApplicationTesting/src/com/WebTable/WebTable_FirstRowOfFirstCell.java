package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_FirstRowOfFirstCell extends BaseTest{

	@Test
	public void getCityName()
	{
		
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a
	// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[1]/a
		
		By webTable_FirstRowOfFirstCell_CityNameProperty=By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]/a");
		WebElement cityName=driver.findElement(webTable_FirstRowOfFirstCell_CityNameProperty);
		
		String cityNameText=cityName.getText();
		System.out.println(" The City Name is:-"+cityNameText);
		
		
		
	}
	
}
