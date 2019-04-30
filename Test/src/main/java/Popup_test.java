import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_test {

	WebDriver driver;
	
public void display() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://popuptest.com/goodpopups.html");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Good PopUp #1")).click();
	Set <String> str = driver.getWindowHandles();
Iterator<String> it = str.iterator();
String parentwindow = it.next();
System.out.println(driver.getCurrentUrl());
String childwindow = it.next();
driver.switchTo().window(childwindow);
System.out.println(driver.getCurrentUrl());

}
	
	public static void main(String[] args) {
	Popup_test pt = new Popup_test();
	pt.display();

		
	}

}
