package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Desktop\\\\Chrome Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
			Thread.sleep(2000);
			
			
			JavascriptExecutor vp = ((JavascriptExecutor)driver);
			vp.executeScript("window.scrollBy(80,1000)");
		driver.findElement(By.xpath("//input[@name='chkSelectAll']")).click();
		Thread.sleep(2000);
		vp.executeScript("window.scrollBy(50,2000)");
		driver.findElement(By.xpath("//input[@name='chkSelectAll']")).click();
		Thread.sleep(2000);
		vp.executeScript("window.scrollBy(50,2000)");
		driver.findElement(By.xpath("//input[@name='chkSelectAll']")).click();
		Thread.sleep(3000);

		
		driver.close();
	}

}
