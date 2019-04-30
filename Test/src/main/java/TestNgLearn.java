import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgLearn {
WebDriver driver;

@BeforeMethod
public void setup() {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
driver = new ChromeDriver();
driver.get("http://google.com");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
}

@Test(priority =1)
public void test() {
driver.findElement(By.name("q")).sendKeys("Selenium");;
driver.findElement(By.xpath("//input[@value='Google Search']")).click();
//driver.findElement(By.xpath("//input[@type='Google Search']")).click();

}

@Test(priority =2, dependsOnMethods = "test")
public void test1(){
driver.findElement(By.name("q")).sendKeys("Selenium");
driver.findElement(By.xpath("//input[@value='Google Search']")).click();
driver.findElement(By.linkText("Books")).click();
driver.findElement(By.className("LC20lb")).click();	
}
@AfterMethod
public void teardown() {
driver.quit();


}
}