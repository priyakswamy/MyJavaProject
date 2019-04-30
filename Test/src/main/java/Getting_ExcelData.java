import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getting_ExcelData {
	XSSFWorkbook wb;
	XSSFSheet sheet1;
	FileInputStream fis;
	WebDriver driver;
	String data1, data2;

	public void excelData(String excelpath) throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		driver.findElement(By.id("user_login")).sendKeys(data1);
		driver.findElement(By.id("user_pass")).sendKeys(data2);
		driver.findElement(By.xpath("//input[@type = 'submit'")).click();

		fis = new FileInputStream(excelpath);
		try {
			wb = new XSSFWorkbook(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int rownum = sheet1.getLastRowNum();
		for (int i = 0; i < rownum; i++) {
		
			data1 = wb.getSheetAt(0).getRow(i).getCell(0).getStringCellValue();
			data2 = wb.getSheetAt(0).getRow(i).getCell(1).getStringCellValue();
		}
	}

	public static void main(String[] args) throws Exception {
		Getting_ExcelData excel = new Getting_ExcelData();
		excel.excelData("C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Data.xlsx");
	}

}
