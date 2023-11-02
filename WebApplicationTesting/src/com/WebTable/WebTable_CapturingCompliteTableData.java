package com.WebTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebTable_CapturingCompliteTableData extends BaseTest{

	@Test
	public void capturingCompliteTableData()
	{
		
		// /html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[1]/td[1]
		
		String xpathExpressionPart1="/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[";
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[7]
		///html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr[36]/td[8]
		
		String xpathExpressionPart2="]/td[";
		String xpathExpressionPart3="]";
		
		for(int rowindex=1;rowindex<=36;rowindex++)
		{
			
			for(int rowOfCellindex=1;rowOfCellindex<=8;rowOfCellindex++)
			{
				
				By.xpath(xpathExpressionPart1+rowindex+xpathExpressionPart2+rowOfCellindex+xpathExpressionPart3);
				
				
				//By.xpath("/html/body/div[5]/section[1]/div/section/div[1]/div/table/tbody/tr["+rowindex+"]/td["+rowOfCellindex+"]");
				
				By tableDataProperty=By.xpath(xpathExpressionPart1+rowindex+xpathExpressionPart2+rowOfCellindex+xpathExpressionPart3);
				
				WebElement tableData=driver.findElement(tableDataProperty);
				String tableDataText=tableData.getText();
				System.out.println(tableDataText+"  |  ");
			}
			
			System.out.println();
			
		}
		
		
	}
	
	
}
