import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCheck {

	WebDriver driver;	
	
	public void BrowserPopup() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://popuptest.com/goodpopups.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Good PopUp #1")).click();
	Set <String> win = driver.getWindowHandles();
	Iterator<String> It = win.iterator();
	String iter = It.next();
	System.out.println(iter);
	driver.switchTo().window(iter);
	String iter1 = It.next();
	driver.switchTo().window(iter1);
	System.out.println(driver.getCurrentUrl());
}
	public static void main(String[] args) {
	BrowserCheck bc = new BrowserCheck();
	bc.BrowserPopup();
	}

}
