import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class config {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
Properties prop = new Properties(); 
FileInputStream fis = new FileInputStream("C:\\Users\\Dell\\Documents\\Eclipse_Workspaces\\Workspace_Apr_23\\Test\\src\\main\\java\\com\\qa\\config\\config.properties");
prop.load(fis);	
String browsername = prop.getProperty("browser");
if (browsername.equals("Chrome")) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
driver = new ChromeDriver();

}
else if (browsername.equals("Firefox")) {

	System.out.println("Firefox not in config");
}
	prop.getProperty("url");

	}

	}
