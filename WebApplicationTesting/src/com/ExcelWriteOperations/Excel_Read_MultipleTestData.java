package com.ExcelWriteOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_MultipleTestData {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile = new FileInputStream("./src/com/MultpleTestData/Book3.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet= workBook.getSheet("TestData");
		
		// Identify the number of Active Rows in the Sheet
		int	rowsCount=testDataSheet.getLastRowNum();
		
		// Go to Every Active Row of the Sheet
		
		for(int rowindex=0;rowindex<=rowsCount;rowindex++)
		{
			Row row =testDataSheet.getRow(rowindex);
			int rowOfCellsCount=row.getLastCellNum();
			
			for(int rowOfCellindex=0;rowOfCellindex<rowOfCellsCount;rowOfCellindex++)
			{
				
				Cell rowOfCell=row.getCell(rowOfCellindex);
				
				String testData=rowOfCell.getStringCellValue();
				System.out.println(testData+"|");
				
			}
			
			System.out.println();
			
			
			
		}
			
		
		
	}

}
