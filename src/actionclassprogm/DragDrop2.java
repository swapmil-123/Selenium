package actionclassprogm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop2 {

	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement bank = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement bankamt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement sales = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement salesamt = driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
		WebElement dest1 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		WebElement dest2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
		WebElement dest3 = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		WebElement dest4 = driver.findElement(By.xpath("(//li[@class='placeholder'])[4]"));
		
		WebElement scroll = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",scroll);
		Thread.sleep(2000); 

		Actions z=new Actions(driver);
		z.moveToElement(bank).dragAndDrop(bank, dest1).build().perform();
		Thread.sleep(1000); 
		z.dragAndDrop(bankamt, dest2).build().perform();
		Thread.sleep(1000); 
		z.dragAndDrop(sales, dest3).build().perform();
		Thread.sleep(1000); 
		z.dragAndDrop(salesamt, dest4).build().perform();
		
		WebElement text = driver.findElement(By.xpath("(//a[@class='button button-green'])[1]"));
		System.out.println(text.getText());
		
		driver.close();

	}

}
