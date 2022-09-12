package paramtrzton;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prog2 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window(). maximize();
		driver.get("https://is.rediff.com/signup/register");
		
		WebElement fullname = driver.findElement(By.id("fullname"));
		WebElement emailid = driver.findElement(By.id("emailid"));
		WebElement newpass = driver.findElement(By.id("pass"));
		WebElement repass = driver.findElement(By.id("repass"));
		WebElement gender = driver.findElement(By.id("sex"));
		WebElement day = driver.findElement(By.id("date_day"));
		WebElement month = driver.findElement(By.id("date_mon"));
		WebElement year = driver.findElement(By.name("Date_Year"));
		WebElement location = driver.findElement(By.id("signup_city"));
		WebElement school = driver.findElement(By.id("school"));
		WebElement clg = driver.findElement(By.id("college"));
		WebElement code = driver.findElement(By.id("fld_captcha")); 
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\eclipse-workspace\\selenium\\new\\Book1.xlsx");
		Sheet z = WorkbookFactory.create(file).getSheet("Sheet2");
		fullname.sendKeys(z.getRow(0).getCell(0).getStringCellValue());
		emailid.sendKeys(z.getRow(0).getCell(1).getStringCellValue());
		newpass.sendKeys(z.getRow(0).getCell(2).getStringCellValue());
		repass.sendKeys(z.getRow(0).getCell(3).getStringCellValue());
		gender.click();
		
	    Select s1=new Select(day);
	    s1.selectByVisibleText(z.getRow(0).getCell(4).getStringCellValue());
	    
	    Select s2=new Select(month);
	    s2.selectByVisibleText(z.getRow(0).getCell(5).getStringCellValue());
	    
	    Select s3=new Select(year);
	    s3.selectByVisibleText(z.getRow(0).getCell(6).getStringCellValue());
	    
		location.sendKeys(z.getRow(0).getCell(7).getStringCellValue());
		school.sendKeys(z.getRow(0).getCell(8).getStringCellValue());
		clg.sendKeys(z.getRow(0).getCell(9).getStringCellValue());
		code.sendKeys(z.getRow(0).getCell(10).getStringCellValue());
	
		
	
		

	}

}
