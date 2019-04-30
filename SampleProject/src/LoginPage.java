import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


/**
 * 
 */

/**
 * @author Dell
 *
 */
public class LoginPage {

	WebDriver driver;
/*	By username = By.id("user_login");
	By password = By.id("user_pass");
	By LoginButton = By.id("wp-submit");*/
	
public LoginPage (WebDriver driver)
{
	this.driver = driver;
}
public void typeuname() {
	driver.findElement(By.id("user_login")).sendKeys("admin");
	driver.findElement(By.id("user_pass")).sendKeys("demo123");
	driver.findElement(By.id("wp-submit")).click();
/*	driver.findElement(username).sendKeys("admin");
	driver.findElement(password).sendKeys("demo123");
	driver.findElement(LoginButton).click();*/
		
}
	
}	
	

