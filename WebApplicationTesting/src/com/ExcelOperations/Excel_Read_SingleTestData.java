package com.ExcelOperations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel_Read_SingleTestData {
	
		public static void main(String[] args) throws IOException {
		
	// Identify the files(Excel Files) in the System
		FileInputStream excelTestDataFiles = new FileInputStream("./src/com/ExcelSingleTextData/Book1.xlsx");
		
	// Identify the work book in the file
		XSSFWorkbook workbook = new XSSFWorkbook(excelTestDataFiles);
		
	// Identify a particular sheet in the workbook
		XSSFSheet TestDataSheet = workbook.getSheet("TestData");
		
	// Identify the row in the Sheet
		Row SheetRow=TestDataSheet.getRow(0);
	
	// Identify the row of the cell in the row
		Cell SheetRowOfCells=SheetRow.getCell(0);
		
	// Get the data from the row of a cell
		String testData=SheetRowOfCells.getStringCellValue();
		
		System.out.println(testData);
		
		
	}
	

}
