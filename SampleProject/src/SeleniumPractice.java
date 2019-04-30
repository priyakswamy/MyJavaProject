
import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {

	WebDriver driver;
	
	public void openBrowser() throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");

/*System.out.println(driver.manage().window().getSize());	
Dimension d = new Dimension();
JavascriptExecutor js = ((JavascriptExecutor)driver);
js.executeScript("window.resizeTo(2500,728)");

//driver.manage().window().setSize(420,620);
		driver.get("https://www.amazon.in/");
		//driver.findElement(By.id("twotabsearchtextbox")).sendKeys(Keys.SHIFT,"electronics");
		Actions action  = new Actions(driver);
		WebElement web = driver.findElement(By.id("twotabsearchtextbox"));
		action.moveToElement(web).click().keyDown(Keys.SHIFT).sendKeys("electronics").keyUp(Keys.SHIFT).sendKeys(" new").build().perform();
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Dell\\Documents\\Selenium\\Screenshot\\sc.png"));*/
		//driver.findElement(By.xpath("//span[@class = 'icl-TextPromo-linkText']")).click();
		//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

		//WebElement element = driver.findElement(By.id("upload-resume-button"));
		//driver.findElement(By.id("pop_sbm")).click();
		//element.sendKeys("C:\\Users\\Dell\\Documents\\Document\\Priya Kuppuswamy.docx");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("document.getElementById('SE_home_autocomplete').value='Testing'");
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(element))
		
	}
	public static void main(String[] args) throws IOException {
SeleniumPractice sp = new SeleniumPractice();
sp.openBrowser();
	}
	
	

}
