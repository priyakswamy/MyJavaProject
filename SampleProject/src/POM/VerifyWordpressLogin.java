/**
 * 
 */
package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Dell
 *
 */
public class VerifyWordpressLogin {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();	
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		WordPressLoginPage Logn = new WordPressLoginPage(driver);
		Logn.Login("admin", "demo123");
		
		
		

	}

}
