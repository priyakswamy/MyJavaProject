package automation.framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class money {


		WebDriver driver;
	


public money(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//a[@title='Live commentary of the Indian stock markets, stock quotes and business news']")
WebElement money;

@FindBy(xpath="//a[@href='//money.rediff.com/tools/forex']")
WebElement forex;

public WebElement mon() {
	return money;
}

public WebElement forex() {
	return forex;
}
}