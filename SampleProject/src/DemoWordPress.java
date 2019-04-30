import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 */

/**
 * @author Dell
 *
 */
public class DemoWordPress {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver ();
		driver.get("http://demosite.center/wordpress/wp-login.php");
		driver.manage().window().maximize();
		LoginPage Login = new LoginPage(driver);
		Login.typeuname();
				
		
		
		
	}
}
