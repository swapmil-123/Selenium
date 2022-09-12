package actionclassprogm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.SeleniumCdpConnection;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://chercher.tech/practice/explicit-wait");
		
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
	    WebElement clickme = driver.findElement(By.xpath("//button[@id='alert']"));
		clickme.click();		
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		WebElement textbtn = driver.findElement(By.xpath("//button[@id='populate-text']"));
		textbtn.click();
		WebElement lable = driver.findElement(By.xpath("//h2[@id='h2']"));	
		wait.until(ExpectedConditions.textToBePresentInElement(lable, "Selenium Webdriver"));
		
		WebElement Displaybtn = driver.findElement(By.xpath("//button[@id='display-other-button']"));
		Displaybtn.click();
		WebElement hiddenbutton = driver.findElement(By.xpath("//button[@id='hidden']"));
		wait.until(ExpectedConditions.elementToBeClickable(hiddenbutton));
		
		WebElement unblbtn = driver.findElement(By.xpath("//button[@id=\"enable-button\"]"));
		unblbtn.click();
		
		WebElement button = driver.findElement(By.xpath("//button[@id=\"disable\"]"));
		wait.until(ExpectedConditions.elementToBeClickable(button));
		
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView();",button);
		
		
		WebElement checkboxbtn = driver.findElement(By.xpath("//button[@id=\"checkbox\"]"));
		checkboxbtn.click();
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='ch']"));
		wait.until(ExpectedConditions.elementToBeClickable(checkbox));
		
		
		
		
		
		
		
		
		
		driver.close();
	}

}
