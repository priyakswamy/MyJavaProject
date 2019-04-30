import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class PopupHandle {
	ChromeDriver driver;
	
	public void popup () {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\Documents\\Selenium_Content\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://book.spicejet.com/Register.aspx");
		driver.manage().window().maximize();
		
	
	//action.moveToElement(driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$TextBoxFirstName"))).sendKeys("Priya");
	driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstName")).sendKeys("Priya");
Select drptitle = new Select(driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$DropDownListTitle")));
drptitle.selectByIndex(2);
driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxLastName")).sendKeys("K");
Select drpcountry = new Select(driver.findElement(By.name("CONTROLGROUPREGISTERVIEW$PersonInputRegisterView$DropDownListCountry")));
drpcountry.selectByIndex(1);
driver.findElement(By.id("CONTROLGROUPREGISTERVIEW_PersonInputRegisterView_TextBoxFirstPhone")).sendKeys("9444645947");
//driver.findElement(By.className("button")).click();
	
		/*driver.get("https://phptravels.com/");
		
		driver.findElement(By.id("onesignal-popover-cancel-button")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.findElement(By.className("mc-closeModal")).click();*/
	//driver.findElement(By.id("highlight-book")).click();
Actions actions = new Actions(driver);
actions.moveToElement(driver.findElement(By.id("highlight-addons"))).build().perform();

		
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				driver.findElement(By.xpath("//a[@href = 'RetrieveBooking.aspx?AddSeat=true')]")).click();
			}
			
			

			
		}
	/*Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
	alert.dismiss();*/
	

	public static void main(String[] args) {
		PopupHandle ph = new PopupHandle();
		ph.popup();
		

	}

}
