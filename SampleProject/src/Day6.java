import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day6 {

	WebDriver driver; 
	
	public void invokebrowser () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://madhavanbabu.github.io");
		driver.findElement(By.linkText("Download a copy")).click();
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(tabs.get(0));
		driver.findElement(By.linkText("LinkedIn")).click();
		driver.switchTo().window(tabs.get(0));
		String str = driver.findElement(By.xpath("//*[contains(text(),'RAPID')]")).getText();
		System.out.print(str);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Day6 d6 = new Day6();
d6.invokebrowser();
	}

}
