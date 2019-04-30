import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowtest {

	WebDriver driver;
	
	public void browser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Privacy")).click();
		System.out.println(driver.getTitle());
		Set <String> list = driver.getWindowHandles();
		Iterator <String> it = list.iterator();
		String parentid = it.next();
		String childid =it.next();
		driver.switchTo().window(childid);
		System.out.println(driver.getTitle());
	}
	public static void main(String[] args) {
Windowtest wt = new Windowtest();
wt.browser();
	}

}
