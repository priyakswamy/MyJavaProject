import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Parameterization {

	WebDriver driver;
	@Test (dataProvider="wordpressdata" )
	
	public void Browser(String username, String password) {	
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("http://demosite.center/wordpress/wp-login.php");
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("user_pass")).sendKeys(password);
	driver.findElement(By.id("wp-submit")).click();
	passdata();
	}
	
	@DataProvider (name = "wordpressdata")
	public Object [][] passdata(){
		Object[][] data = new Object [3][2];
		data[0][0] = "admin23";
		data[0][1] = "demo123"; 
		data[1][0] = "admin34";
		data[1][1] = "demo123";
		data[2][0] = "admin";
		data [2][1] = "demo123";
		return data;
		
	
		
		
			
	
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
Parameterization P1 = new Parameterization();
P1.Browser(String username, String password);
	}
*/
}
