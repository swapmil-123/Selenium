package sel;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog4 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\\\Desktop\\\\Chrome Driver\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		driver.findElement(By.xpath("//b[text()='Admin']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
			
		List<WebElement> table = driver.findElements(By.xpath("//div[@class='inner']//td"));	
		
		System.out.println(table.size());
		
		for(int i=0;i<table.size();i++)
		{
			System.out.println(table.get(i).getText());
		}
		for(int i=0;i<table.size();i++)
		{
			
                    
				table.get(i).click();	
		}

		for(int i=0;i<table.size();i++)
		{
                    
				table.get(i).click();	
		}
driver.close();
	}

}
