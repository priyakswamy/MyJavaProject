import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Property {

	public static void main(String[] args) throws IOException {
		WebDriver driver = null;



		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Workspace_Apr_23\\Test\\src\\main\\java\\com\\qa\\config\\testconfig\\congig.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome")) {	
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
	driver.get(prop.getProperty("url"));	
	driver.findElement(By.id("user_login")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.id("user_pass")).sendKeys(prop.getProperty(("password")));
	driver.findElement(By.name("wp-submit")).click();
	try {
		Thread.sleep(2000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.quit();
		
				}
	
		
		
		
	
}
