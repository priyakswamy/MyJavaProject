import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Reading_Excel {

	XSSFWorkbook wb;
XSSFSheet sheet1;
FileInputStream fis;
public void excelconfig(){
	try {
		 fis = new FileInputStream("C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Data.xlsx");
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	try {
		wb = new XSSFWorkbook(fis);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	sheet1 = wb.getSheetAt(0);
	//String data1 = sheet1.getRow(0).getCell(0).getStringCellValue();
	//System.out.println(data1);
	int lastrow = sheet1.getLastRowNum();
	for(int i=0;i<lastrow;i++) {
		String data0 = sheet1.getRow(i).getCell(0).getStringCellValue();
		System.out.println(data0);
	}
}
public static void main(String[] args)  {
Reading_Excel re = new Reading_Excel();
re.excelconfig();
	
	}

}
