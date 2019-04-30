package com.qa.testcase;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeMethod;

import com.qa.base.TestBase;
import com.qa.pages.Login;

public class Test extends TestBase {

	Test() throws IOException {
		super();
	}

	public static void main(String[] args) throws IOException {

		Test tb = new Test();
		tb.initialization();
//		Login.login(prop.getProperty("username"), prop.getProperty("password"));
		
		Login loginObj = new Login();
		loginObj.initialization();
		loginObj.login(tb.prop.getProperty("username"),  tb.prop.getProperty("password"));

	}

}
