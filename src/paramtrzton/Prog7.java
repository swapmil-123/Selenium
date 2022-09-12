package paramtrzton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog7 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window(). maximize();
		driver.get("https://www.facebook.com/login/");
		
		WebElement ID = driver.findElement(By.xpath("//input[@type='text']"));
		WebElement pass = driver.findElement(By.xpath("//input[@type='password']"));
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\new\\Book1.xlsx");
		Sheet z = WorkbookFactory.create(file).getSheet("Sheet6");	
		
		
		ID.sendKeys(z.getRow(0).getCell(0).getStringCellValue());
		pass.sendKeys(z.getRow(0).getCell(1).getStringCellValue());	
		
		
	}

}
