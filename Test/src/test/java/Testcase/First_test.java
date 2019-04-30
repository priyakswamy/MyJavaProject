package Testcase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import automation.framework.Login;
import automation.framework.money;

public class First_test {
@Test
	public void test() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		/*Login log = new Login(driver);
		log.signin().click();
		log.username().sendKeys("priyakuppuswamy");
		log.password().sendKeys("Sky2high");
		//log.submit().click();*/
	money mn = new money(driver);
	mn.mon().click();
	mn.forex().click();
	}
	
}
