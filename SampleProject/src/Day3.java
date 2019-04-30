import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day3 {

WebDriver driver;

public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://amazon.com");
/*	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	Select selectbyvalue =  new Select(driver.findElement(By.id("searchDropdownBox")));
	selectbyvalue.selectByIndex(4);
	driver.findElement(By.className("nav-input")).click();
	driver.findElement(By.linkText("Dehumidifiers")).click();
	driver.findElement(By.xpath("//*[contains(text(),'Frigidaire')]")).click();
	driver.findElement(By.id("add-to-cart-button")).click();
	driver.findElement(By.id("hlb-view-cart-announce")).click();
	driver.findElement(By.xpath("//*[contains(@aria-label,'Delete Frigidaire 70-Pint Dehumidifier with Effortless Humidity Control, White')]")).click();*/
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Electronics");
	driver.findElement(By.className("nav-input")).click();
	JavascriptExecutor JSE;
	JSE = (JavascriptExecutor)driver;
	JSE.executeScript("window.scrollBy(0, -250)", "");
	//driver.findElement(By.xpath("//*[contains(text(),'Smart Home Store')]")).click();
	driver.findElement(By.linkText("Home Entertainment")).click();
    driver.findElement(By.xpath("//*[contains(text(),'Fire TV Cube | Hands-Free with Alexa and 4K')]")).click();
	//driver.findElement(By.xpath("//*[contains(text(),'Philips Hue White A19 4-Pack 60W Equivalent Dimmable LED Smart')]")).click();
	Actions act = new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath("//*[contains @value ,'Pre-order: Add to Cart']"))).build().perform();
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//driver.quit();
			
	
	
}
	public static void main(String[] args) {
	Day3 d3 = new Day3();
	d3.openBrowser();
	
	}

}
