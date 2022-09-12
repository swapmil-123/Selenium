package actionclassprogm;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown1{

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.railyatri.in/train-ticket/create-new-irctc-user");
		driver.findElement(By.xpath("//input[@id='user-number']")).sendKeys("7057919171");
		driver.findElement(By.xpath("//input[@id='email_id']")).sendKeys("patilsk6905@gmail.com");
		driver.findElement(By.xpath("//button[@id='irtct-acc-detail']")).click();
		Thread.sleep(2000); 
//		For Scrolling Down
		WebElement fname = driver.findElement(By.xpath("//label[@id='f_name_label']"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",fname);
		Thread.sleep(2000); 
		
//		Handle DropDown by ActionClass
		WebElement dropdown = driver.findElement(By.xpath("(//button[@class='btn dropdown-toggle'])[1]"));
	
		Actions z=new Actions(driver);
		z.moveToElement(dropdown).click().build().perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		System.out.println(options.size());
		
		
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
	for (int i=0;i<options.size();i++)
		{
			if(options.get(i).getText().equals("Student"))
			{
				options.get(i).click();
			}
		}
		
	
	}

}
