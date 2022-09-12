package actionclassprogm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver2 {
		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			Thread.sleep(2000);

			WebElement link1 = driver.findElement(By.xpath("//a[text()='Login']"));
			
			Actions z=new Actions(driver);
			z.moveToElement(link1).build().perform();
			
			Thread.sleep(2000);
			driver.findElement(By.xpath("//div[text()='Orders']")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("7057919171");
			driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']")).sendKeys("Patilsk@123");
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
			Thread.sleep(2000);
			
			driver.close();

	}

}
