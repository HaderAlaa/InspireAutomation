package com.Inspire.data;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	String projectPath=System.getProperty("user.dir");

	public ExcelUtils()
	{
		try 
		{
			 workbook =new XSSFWorkbook(projectPath+"\\Data\\DEPandDES_data.xlsx");
			sheet=workbook.getSheet("sheet1");		
		
		} 
		
		catch (IOException e) 
		{
		
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.fillInStackTrace();
		}
	}
	
	public  String getCellDataValue(int roNum,int colNum)
	{
		String value =sheet.getRow(roNum).getCell(colNum).getStringCellValue();
		return value;
	}
	
	

}
