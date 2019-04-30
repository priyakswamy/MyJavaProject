import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class makemytrip1 {

	WebDriver driver;
	
	public void open() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://amazon.in");
		Actions action = new Actions(driver);
		WebElement hover = driver.findElement(By.xpath("//a[@id = 'nav-link-shopall']"));
		//driver.findElement(By.id("nav-link-shopall")).click();
		action.moveToElement(hover).build().perform();
		Select sel = new Select(driver.findElement(By.xpath("//*[@id = 'searchDropdownBox']")));
		sel.selectByIndex(8);
		driver.findElement(By.xpath("//input[@value ='Go']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		WebElement move = driver.findElement(By.linkText("Activity & Entertainment"));
		action.moveToElement(move).build().perform();
		driver.findElement(By.xpath("//img[@alt = 'Baby & Toddler Toys']")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	public static void main(String[] args) {
makemytrip1 obj = new makemytrip1();
obj.open();

	}

}
