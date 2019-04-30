import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day4 {
WebDriver driver;

public void Browser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	driver.get("http://amazon.in");
	driver.findElement(By.linkText("See all deals")).click();
	ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	driver.switchTo().window(tabs.get(1));
	driver.findElement(By.id("nextButton")).click();
	JavascriptExecutor JSE;
	JSE = (JavascriptExecutor)driver;
	JSE.executeScript("window.scrollBy(0, -250)", "");
	driver.findElement(By.xpath("//[contains(@data-gbdeal-actionrecord, 'a04379d3')]")).click();
	driver.switchTo().window(tabs.get(2));
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Day4 d4 = new Day4();
	d4.Browser();
		
	}

}
