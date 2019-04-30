package com.qa.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestngDemo {

	WebDriver driver;

	@Test (dataProvider = "wordpress1")
	
	public void Login(String username, String password) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.id("wp-submit")).click();
	}
	
	@DataProvider(name = "wordpress1")
	public Object[][] passdata(){
		Object[][] arr = new Object[2][2];
		arr[0][0] = "admin1";
		arr[0][1] = "demo1";
		
		arr[1][0] = "admin";
		arr[1][1] = "demo123";
		return arr;
	}
	
}
