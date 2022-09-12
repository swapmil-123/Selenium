package paramtrzton;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prog3 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window(). maximize();
		driver.get("https://is.rediff.com/signup/register");
		
//		WebElement fullnmae = driver.findElement(By.id("fullname"));
//		 WebElement emailid = driver.findElement(By.id("emailid"));
//		 WebElement pass = driver.findElement(By.id("pass"));
//		
//		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\new\\Book1.xlsx");
//		Sheet z = WorkbookFactory.create(file).getSheet("Sheet2");
//		
//		fullnmae.sendKeys(z.getRow(0).getCell(0).getStringCellValue());
//		emailid.sendKeys(z.getRow(0).getCell(1).getStringCellValue());
//		pass.sendKeys(z.getRow(0).getCell(3).getStringCellValue());
	}

}
