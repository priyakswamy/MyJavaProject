import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLearn {

	WebDriver driver;
	
public void openBrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("http://flipkart.com");
	driver.findElement(By.cssSelector("input._2zrpKA")).sendKeys("9444645947");
	driver.findElement(By.cssSelector("input[type =password]")).sendKeys("Shriya@1988");
	//driver.findElement(By.className("_2VTdOs _1_qmw3")).click();
	driver.findElement(By.cssSelector("button:contains('Login')")).click();
}
	public static void main(String[] args) {
FlipkartLearn fl = new FlipkartLearn();
fl.openBrowser();
	}

}
