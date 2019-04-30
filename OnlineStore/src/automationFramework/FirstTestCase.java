package automationFramework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String exePath = "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);		
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		//driver.get("http://www.store.demoqa.com");
		System.out.println("Successfully opened the website, www.google.com");
		Thread.sleep(5000);
		driver.quit();

	}

}
