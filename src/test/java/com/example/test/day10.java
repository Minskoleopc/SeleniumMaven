package com.example.test;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day10 {
	
	@DataProvider(name= "excel")
	public static Object[][] readExcelData() throws IOException{
		
		String filepath = "C:\\Users\\Lenovo\\eclipse-workspace\\SeleniumMavenProject\\src\\test\\resources\\test_data.xlsx";
		FileInputStream file = new FileInputStream(filepath);
		Workbook wb = XSSFWorkbook(file);
		Sheet sheet = wb.getSheet("LoginData");
		
		// total number of rows 
		
		int rows = sheet.getPhysicalNumberOfRows();	 // total row	
		int cols = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][] data = new Object[rows -1][cols];
		// total number of columns
		
		for(int i = 1; i < rows ; i++) {
			Row row = sheet.getRow(i);
			for(int j = 0 ; j < cols ; i++) {
				data[i-1][i] = row.getCell(j).toString();				
			}
			
		}
		wb.close();
		return data;
			
	}
	
	@Test(dataProvider="excel")
	public void excelData(String username , String password) {
			System.out.println(username);
			System.out.println(password);
	}
	
	
	
	
}
