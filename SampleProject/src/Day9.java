import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day9 {
WebDriver driver;
public void InvokeBrowser () {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
driver.get("http://demo.guru99.com/V4/");
driver.manage().window().maximize();
driver.findElement(By.name("uid")).sendKeys("mngr153118");
driver.findElement(By.name("password")).sendKeys("gejYpyq");
driver.findElement(By.name("btnLogin")).click();;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day9 d9 = new Day9 ();
d9.InvokeBrowser();
	}

}
