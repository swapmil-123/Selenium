package actionclassprogm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement link1 = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		
		Actions z= new Actions(driver);
		z.moveToElement(link1).build().perform();
		driver.findElement(By.xpath("//a[@title='American Golf Careers']")).click();
		

		
	}

}
