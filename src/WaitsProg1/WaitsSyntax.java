package WaitsProg1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsSyntax {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	
	WebDriverWait z= new WebDriverWait(driver,Duration.ofSeconds(10));
//	z.Until(ExpectedConditions.textToBePresentInElement(a, " ");
	
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	
}
}