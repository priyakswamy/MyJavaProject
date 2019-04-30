import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	WebDriver driver;
	
	public void frame() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	//driver.get("https://www.rediff.com/");
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"electronics");;
	WebElement footer = driver.findElement(By.id("navFooter"));
	WebElement footersec = driver.findElement(By.xpath("//div[@class = 'navFooterLinkCol navAccessibility']"));
	System.out.println(footersec.findElements(By.tagName("a")).size());
	System.out.println(footer.findElements(By.tagName("a")).size());
	
	for(int i = 0; i<footersec.findElements(By.tagName("a")).size();i++) {
		String clickon = Keys.chord(Keys.CONTROL,Keys.ENTER);
		footersec.findElements(By.tagName("a")).get(i).sendKeys(clickon);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	Set <String> windowss = driver.getWindowHandles();
	java.util.Iterator<String> it = windowss.iterator();
	String windowid = it.next();
	driver.switchTo().window(windowid);
	driver.getTitle();
	
	driver.quit();
	//System.out.println(driver.findElements(By.tagName("iframe")));
	//WebElement source = driver.findElement(By.id("moneyiframe"));
	//driver.switchTo().frame(source);
	//WebElement source2 = driver.findElement(By.id("metric_iframe"));
	//driver.switchTo().frame(source2);
	//WebElement frame = driver.findElement(By.id("courses-iframe"));
	//frame.click();
	/*try {
		Thread.sleep(4000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
driver.switchTo().alert().dismiss();*/
	//driver.findElement(By.xpath("//input[@type = 'text']")).sendKeys("market");
	}
	public static void main(String[] args) {
Frames frm = new Frames();
frm.frame();
	}

}
