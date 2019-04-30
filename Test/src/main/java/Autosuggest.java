import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {
	
	WebDriver driver;
	
	public void content() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/login/show.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);	
		driver.findElement(By.id("userName")).sendKeys("meetpriyak@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Sky2high");
		driver.findElement(By.id("submitBtn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("fromPlaceName")).sendKeys("BEN");
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		JavascriptExecutor js = ((JavascriptExecutor)(driver));
		String text = (String) (js.executeScript("return document.getElementById('fromPlaceName').value;"));
			

		while(!text.contains("CHIKKALSANDRA")) {
			driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
			text = (String) (js.executeScript("return document.getElementById('fromPlaceName').value;"));
			System.out.println(text);
		}
		/*if(text.contains("CHIKKALSANDRA")) {
			driver.findElement(By.id("fromPlaceName")).click();		}*/
		}
	

	public static void main(String[] args) {
Autosuggest auto = new Autosuggest();
auto.content();
	}

}
