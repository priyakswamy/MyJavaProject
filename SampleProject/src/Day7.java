import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day7 {

	WebDriver driver;
	public void InvokeBrowser() {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		//driver = new ChromeDriver();
		/*System.setProperty("webdriver.gecko.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();*/
		System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("Priya");
		driver.findElement(By.name("lastname")).sendKeys("Kuppuswamy");
		driver.findElement(By.id("u_0_o")).sendKeys("9444645947");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Qwert!@3");
		driver.findElement(By.id("day")).sendKeys("4");
		driver.findElement(By.id("month")).sendKeys("Mar");
		driver.findElement(By.id("year")).sendKeys("1988");
		driver.findElement(By.className("_58mt")).click();
		String str = driver.findElement(By.name("websubmit")).getText();
		System.out.print(str);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		/*driver.findElement(By.name("email")).sendKeys("meetpriyak@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Ready@2go");
		driver.findElement(By.id("u_0_2")).click();
		driver.findElement(By.className("linkWrap noCount")).click();*/
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day7 d7 = new Day7();
d7.InvokeBrowser();
	}

}
