package com.ExcelWriteOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelWriteOperation {
	
	public static void main(String[] args) throws IOException {
		
		FileInputStream testDataFile = new FileInputStream("./src/com/ExcelSingleTextData/Book1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(testDataFile);
		XSSFSheet testDataSheet = workBook.getSheet("TestData");
		
		//Creating a Row in the Sheet
		Row testDataSheetRow=testDataSheet.createRow(4);
		
		//Creating a Row of a cell
		Cell rowOfCell=testDataSheetRow.createCell(4);
		
		
		// Setting a value into the row of a cell created 
		rowOfCell.setCellValue(" Selenium ");
		
		// Setting a value into another row of cell (4th row of 6th cell)
	
		//Row row=testDataSheet.createRow(4);
		Cell cell=testDataSheetRow.createCell(6);
		cell.setCellValue(" Testing ");
		
		FileInputStream testResultFile = new FileInputStream("./src/com/ExcelSingleTextData/Book1.xlsx");
		
		// saving the Excel workbook
		//workBook.write(testResultFile);
	}

}
