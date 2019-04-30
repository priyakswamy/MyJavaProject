import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown_test {
	WebDriver driver;

	public void dropdown() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
	}
		public void operation() {
			driver.get("https://www.spicejet.com/");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//span[@contains(@class = 'text')]")).click();
			Select s = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			s.selectByIndex(1);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.selectByValue("AED");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			s.selectByVisibleText("USD");
		}
		
		

	public static void main(String[] args) {
Dropdown_test dtext = new Dropdown_test();
dtext.dropdown();
dtext.operation();
	}

}
