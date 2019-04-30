import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendar {
WebDriver driver;

public void open() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.goindigo.in/");
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//input[@placeholder = 'Departure Date']")).click();
	
	//boolean flag = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']")).getText().contains("July");
	while(!driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']")).getText().contains("July")) {
		driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();
	}

	int count = driver.findElements(By.className("ui-state-default")).size();
	for(int i =0; i<count; i++) {
		String text = driver.findElements(By.className("ui-state-default")).get(i).getText();
		if(text.equalsIgnoreCase("24")) {
			driver.findElements(By.className("ui-state-default")).get(i).click();
		}
	}
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
//driver.quit();	
}

	public static void main(String[] args) {
Calendar cal = new Calendar();
cal.open();
	}

}
