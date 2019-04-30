package com.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	public WebDriver driver;
	public Properties prop;

	public TestBase() throws IOException {
		prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Workspace_Apr_23\\Test\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);


	}

	public void initialization() {
		String browsername = prop.getProperty("browser");
		if (browsername.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else {
			System.out.println("no");
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);

	}
}
