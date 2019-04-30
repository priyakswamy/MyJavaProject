package com.qa.pages;

import java.io.IOException;

import org.openqa.selenium.By;

import com.qa.base.TestBase;

public class Login extends TestBase  {
	
	

	public Login() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void login(String un, String pwd ) {
		
//		System.out.println(driver.findElement(By.name("username")));
//		System.out.println(driver.findElement(By.name("password")));
//		System.out.println(By.xpath("//input[@type = 'submit']"));
		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
	}

}
