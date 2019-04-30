/**
 * 
 */
package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author Dell
 *
 */
public class WordPressLoginPage {

	WebDriver driver;
	
	public WordPressLoginPage (WebDriver driver) {
		this.driver= driver;
	}
	/**
	 * @param args
	 */
	
	public void Login (String uname, String pass) {
	driver.findElement(By.id("user_login")).sendKeys(uname);
	driver.findElement(By.id("user_pass")).sendKeys(pass);
	driver.findElement(By.id("wp-submit")).click();

		
	}
	

	}


