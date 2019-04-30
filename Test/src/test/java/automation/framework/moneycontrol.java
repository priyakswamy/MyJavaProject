package automation.framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class moneycontrol {

	WebDriver driver;

	public void operation() throws Exception {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(
				"C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Workspace_Apr_23\\Test\\src\\test\\java\\automation\\framework\\property.properties");
		prop.load(fis);
		String browsername = prop.getProperty("browser");
		if (browsername.equalsIgnoreCase("chrome"))
			;
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();

		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		// driver.switchTo().alert().dismiss();
		// WebElement web = driver.findElement(By.xpath("//div[@class = 'col-xs-12
		// main-content'"));

		// System.out.println(driver.getTitle());
		driver.findElement(By.id("user_login")).sendKeys(prop.getProperty("username"));

		driver.findElement(By.id("user_pass")).sendKeys(prop.getProperty("password"));
		//driver.findElement(By.xpath("div[@class ='recaptcha-checkbox-border']")).click();
		//System.out.println(select);
		driver.findElement(By.id("wp-submit")).click();

	}

	public static void main(String[] args) throws Exception {
		moneycontrol mc = new moneycontrol();
		mc.operation();

	}

}
