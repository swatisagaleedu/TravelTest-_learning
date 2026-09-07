package com.travelTest.ExcelUtil;

import java.io.FileInputStream;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
       public static String[][] excel(String path , String SheetName) throws Exception{
    	   FileInputStream fis = new FileInputStream(path);   //read document
    	   XSSFWorkbook work = new XSSFWorkbook(fis);       // read workbook new copy
    	   XSSFSheet sheet = work.getSheet(SheetName);     // workbook --> sheet
    	   
    	   int row = sheet.getPhysicalNumberOfRows();    // count row
    	   int col = sheet.getRow(0).getPhysicalNumberOfCells();  // count column
    	   
    	   String[][] data = new String[row-1][col];   //2-D array row, column
    	   
    	   for(int i = 1; i < row; i++) {    // row
    		   for(int j = 0; j<col; j++) {  // column
    			   DataFormatter format = new DataFormatter();  // for proper number convert String
    			   String form = format.formatCellValue(sheet.getRow(i).getCell(j));
//    			   System.out.println(form);
    			    data[i-1][j] = form;  //row, column store in data
    		   }
    	   }
    	   return data; // return data to method
       }
}
