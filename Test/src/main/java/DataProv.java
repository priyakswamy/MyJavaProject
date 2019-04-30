import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataProv {
WebDriver driver;


public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
driver.get("http://flipkart.com");
driver.manage().window().maximize();
/*driver.findElement(By.name("q")).sendKeys("amazon");
driver.findElement(By.xpath("//input[@value ='Google Search']")).click();
driver.findElement(By.xpath("//h3[contains(text(), 'Amazon.in')]")).click();*/
//String cwindow = driver.getWindowHandle();
Set <String> allwindows = driver.getWindowHandles();
int count = allwindows.size();
System.out.println(count);
//System.out.println("The current window is " +driver.getTitle());

driver.close();





}
public static void main(String[] args) {
DataProv dp = new DataProv();
dp.Login();
}
		
	
}

