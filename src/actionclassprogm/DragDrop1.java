package actionclassprogm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDrop1 {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
//		Change selenium focus from main page to iframe
		WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(iframe);
		
		WebElement img1 = driver.findElement(By.xpath("//h5[text()='High Tatras']"));
		WebElement img2 = driver.findElement(By.xpath("//h5[text()='High Tatras 2']"));
		WebElement img3 = driver.findElement(By.xpath("//h5[text()='High Tatras 3']"));
		WebElement img4 = driver.findElement(By.xpath("//h5[text()='High Tatras 4']"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));


		Actions a=new Actions(driver) ;
//		a.moveToElement(img1).clickAndHold().moveToElement(dest).release().build().perform();

		a.dragAndDrop(img1, dest).build().perform();
		a.dragAndDrop(img2, dest).build().perform();
		a.dragAndDrop(img3, dest).build().perform();
		a.dragAndDrop(img4, dest).build().perform();
		
		Thread.sleep(2000);
//		a.dragAndDrop(img1, dest).build().perform();
//		a.dragAndDrop(img2, dest).build().perform();
//		a.dragAndDrop(img3, dest).build().perform();
//		a.dragAndDrop(img4, dest).build().perform();
		
		
		
	}

}
