package com.qa.testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.Table.Cell;

public class Datadriven {
	WebDriver driver;

	public void setdata(String value, String colcount) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.findElement(By.id("user_login")).sendKeys(value);
		driver.findElement(By.id("user_pass")).sendKeys(colcount);
		driver.findElement(By.name("wp-submit")).click();
	}

	public void getdata() throws IOException {
		// open file input stream to get the data from excel
		FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\Selenium\\Data\\Exceldata.xlsx");
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		// create two dummy variables to get the values
		String value = null;
		String colcount = null;
		int sheets = workbook.getNumberOfSheets();
		for (int i = 0; i < sheets; i++) {
			
			XSSFSheet sh = workbook.getSheetAt(i);
			if (workbook.getSheetName(i).equalsIgnoreCase("Testcase")) {
				int rowcount = sh.getLastRowNum();

				for (int j = 0; j <= rowcount; j++) {
					value = sh.getRow(j).getCell(0).getStringCellValue();
					System.out.println(value);
					colcount = sh.getRow(j).getCell(1).getStringCellValue();
					System.out.println(colcount);
					setdata(value, colcount);
				}
			}

		}
	}

	public static void main(String[] args) throws IOException {
		// creating the object for DataDriven class
		Datadriven dd = new Datadriven();
		// call the getData method to read the excel and get the value and colcount
		dd.getdata();
	}
}
