import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Day2 {

	WebDriver driver;
	JavascriptExecutor js;
	
public void invokeBrowser( ) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
	driver.get("https://flipkart.com");
	driver.findElement(By.className("_2zrpKA")).sendKeys("9444645947");
	driver.findElement(By.xpath("//input[@type ='password']")).sendKeys("Shriya@1988");
	WebElement drv = driver.findElement(By.xpath("//span[contains(text(),'Login')]//following::div"));
	System.out.println(drv);
	drv.click();
	//driver.findElement(By.className("_2AkmmA _1LctnI _7UHT_c")).click();
	//driver.findElement(By.className("TVs & Appliances"));
	//driver.findElement(By.xpath("//span [contains (text(), 'Split ACs')]")).click();
	/*JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0, -250)", "");
	driver.findElement(By.xpath("//img [contains(text(), 'Lightning-Deals_1527407372055.jpg')]")).click();
	driver.findElement(By.className("filter-link")).click();
	driver.findElement(By.xpath("//a [contains(text(), 'Puma')]")).click();
	//driver.findElement(By.xpath("//select [contains(text(), 'whatsnew|desc')]")).click();
	driver.quit();*/
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Day2 d2 = new Day2();
	d2.invokeBrowser();
	}

}
