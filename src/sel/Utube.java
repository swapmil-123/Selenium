package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Utube {

	public static void main(String[] args) throws Exception {
		 System.setProperty("webdriver.edge.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\edgedriver\\msedgedriver_win64.exe");
		 WebDriver 	driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(2000);
		WebElement searchbox = driver.findElement(By.xpath("//input[@id='search']"));
		searchbox.sendKeys("har har shambhu");
	
		Thread.sleep(2000);

		
		WebElement searchbutton = driver.findElement(By.xpath("//button[@id='search-icon-legacy']"));
		searchbutton.click();
		
		Thread.sleep(2000);

		
		driver.findElement(By.xpath("(//img[@class='style-scope yt-img-shadow'])[116]")).click();
	
	
	}

}
