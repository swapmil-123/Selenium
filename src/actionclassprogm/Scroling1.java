package actionclassprogm;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroling1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.americangolf.com/");
		
		WebElement value = driver.findElement(By.xpath("//h2[@class='pane-title']"));
		System.out.println(value.getText());
		
		JavascriptExecutor js=((JavascriptExecutor)driver);
		//Scroll	the	page	up to	the	element
//		 js.executeScript("arguments[0].scrollIntoView();",	value);
		//Scroll	the	page	up to	the	mentioned	coordinate
//		 js.executeScript("window.scrollBy(0,500)");
		//Scroll	the	page	up to	hight	of	page
		js.executeScript("window.scrollTo(0,	document.body.scrollHeight)");
		
	
		
	}

}
