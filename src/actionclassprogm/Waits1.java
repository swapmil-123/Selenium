package actionclassprogm;

import java.time.Duration;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.Timeout;

public class Waits1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\selepract\\chromedriver_win32\\\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS );
		driver.get("https://www.americangolf.com/");
		driver.close();
		
		
		
	}

}
