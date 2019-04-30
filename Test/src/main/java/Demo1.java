import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	WebDriver driver;
	
	public void Login() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
		driver.get("http://flipkart.com");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("input._2zrpKA")).sendKeys("9444645947");
		driver.findElement(By.cssSelector("input[type=password]")).sendKeys("Shriya@1988");
		driver.findElement(By.cssSelector("span:contains('Login')")).click();
		driver.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Demo1 d1 = new Demo1();
	d1.Login();

	}

}
