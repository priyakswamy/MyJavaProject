import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataprovider {
	WebDriver driver;

	@Test(dataProvider = "getvalue")
	public void value(String username, String pword) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	driver.get("http://demosite.center/wordpress/wp-login.php");
	driver.manage().window().maximize();
	driver.findElement(By.id("user_login")).sendKeys(username);
	driver.findElement(By.id("user_pass")).sendKeys(pword);
	driver.findElement(By.id("wp-submit")).click();
	}
	
	@DataProvider
	public Object getvalue() {
	Object[][] data = new Object[2][2];
	data[0][0] = "admin1";
	data[0][1] = "demo123";
	data[1][0] = "admin";
	data[1][1] = "demo123";
	return data;
		
	}
}
