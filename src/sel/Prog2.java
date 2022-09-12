package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog2 {

	
		public static void main(String[] args) throws Exception {    
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.youtube.com/");
		    driver.findElement(By.tagName("input")).sendKeys("hum hai rahi pyaar ke");
		        Thread.sleep(2000);
		        

		       driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		        Thread.sleep(2000);

		       driver.findElement(By.xpath("(//a[@id='video-title'])[1]")).click();
		       
		}

}
