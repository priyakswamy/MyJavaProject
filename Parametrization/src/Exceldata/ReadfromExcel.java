package Exceldata;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadfromExcel {
	

	public static void main(String[] args) throws IOException {
		
			File exc = new File("C:\\Users\\Dell\\Documents\\Selenium\\Data\\ExcelData.xlsx");
			FileInputStream fl = new FileInputStream(exc);
			XSSFWorkbook wb = new XSSFWorkbook(fl);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(data1);
		

	}
}

