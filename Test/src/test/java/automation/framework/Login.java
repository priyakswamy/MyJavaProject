package automation.framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {

	WebDriver driver;
public Login(WebDriver driver) {
	this.driver=driver;
	

}
By signin = By.className("signin");
By username = By.id("login1");
By password = By.id("password");
By submit = By.xpath("//input[@type='submit']");



public WebElement signin() {
	return driver.findElement(signin);
}
public WebElement username() {
return driver.findElement(username);
}

public WebElement password() {
	return driver.findElement(password);

}

public WebElement submit (){
	return driver.findElement(submit);

}
}
