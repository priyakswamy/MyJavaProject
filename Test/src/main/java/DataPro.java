import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataPro {

	WebDriver driver;
	
	@Test(dataProvider = "freecrm")
	public void data(String username, String password) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://freecrm.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("password")).sendKeys(password);
	driver.findElement(By.xpath("//input[@type ='submit']")).click();
	}
	
@DataProvider(name ="freecrm")
public Object[][] datapro() {
Object[][] dta = new Object[2][2];
dta[0][0] = "priyak";
dta[0][1] = "test123";
dta[1][0] = "priyak";
dta[1][1] = "test@123";
return dta;
}
}
