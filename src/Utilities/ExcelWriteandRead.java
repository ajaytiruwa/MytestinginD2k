package Utilities;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriteandRead {
	XSSFSheet sheet;
	XSSFWorkbook wb;
	public ExcelWriteandRead(String ExcelPath) {
		try {
			File path=new File(ExcelPath);
			FileInputStream fis= new FileInputStream(path);
			 wb= new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		} 
	}
	public String getData(int sheetnum,int row,int cell) {
		 sheet=wb.getSheetAt(sheetnum);
		 String data=sheet.getRow(row).getCell(cell).getStringCellValue();
		 return data;
	}

}