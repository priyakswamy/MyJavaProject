import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class makemytrip {

	WebDriver driver;

	public void perform(){
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();	
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class = 'input_fromto checkSpecialCharacters ui-autocomplete-input']")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.xpath("//input[@class ='input_fromto checkSpecialCharacters ui-autocomplete-input']")).sendKeys("Mum");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.findElement(By.xpath("//li[@contains(text(), 'tabindex=-1')]")).click();
		//driver.findElement(By.xpath("//span[@aria-label,'Mumbai']")).click();
		driver.findElement(By.id("hp-widget__sTo")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.id("hp-widget__sTo")).sendKeys("Del");
	
		driver.findElement(By.id("hp-widget__depart")).click();
		driver.findElement(By.linkText("15")).click();
		driver.findElement(By.id("hp-widget__paxCounter_pot")).click();
		driver.findElement(By.xpath("//ul[@class = 'adult_counter']/li[3]")).click();
		//System.out.println(driver.findElement(By.xpath("//div[@class ='description')]")).getText());
		driver.findElement(By.id("searchBtn")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
	}
	
	public static void main(String[] args) {
		makemytrip mktp = new makemytrip();
		mktp.perform();
	}

}
