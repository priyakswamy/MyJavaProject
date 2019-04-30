import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNG {

	
@Test(dependsOnMethods = {"secondtest"})
public void firsttest() {
	System.out.println("First Test");
	//System.out.println(link);
}

@Parameters({"url"})
@Test
public void secondtest(String link) {
	System.out.println("Second test");
	System.out.println(link);
}
}

	
