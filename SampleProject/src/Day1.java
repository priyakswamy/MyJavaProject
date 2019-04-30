import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1 {
	WebDriver driver;
	

	public void openBrowser() {
		try {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
			driver.get("http://amazon.in");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Electronics");
			driver.findElement(By.className("nav-input")).click();
//		driver.findElement(By.className(
//				"a-row a-spacing-none scx-truncate-medium sx-line-clamp-2"))
//				.click();
			driver.findElement(By.xpath("//h2[contains(text(),'Billionbag Hot Melt Glue Gun Kit 40 Watt, High-Tech Electronic PTC Heating Technology, Black (15 Hot Glue Gun Sticks Included')]")).click();
			//driver.findElement(By.id("result_1")).click();
			//driver.manage().timeouts().pageLoadTimeout(2000, TimeUnit.SECONDS);
			ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(tabs.get(1));
			String url = driver.getCurrentUrl();
			System.out.println("Url is : " +url);
			driver.findElement(By.id("add-to-cart-button")).click();
			driver.findElement(By.id("hlb-ptc-btn-native")).click();
			driver.switchTo().window(tabs.get(0));
			Thread.sleep(5000);
			driver.quit();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		

	}

	public static void main(String[] args) {
;

		// TODO Auto-generated method stub
		Day1 d1 = new Day1();
		d1.openBrowser();
	}

}
