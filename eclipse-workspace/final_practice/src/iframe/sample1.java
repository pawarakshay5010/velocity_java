package iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 {

	
		
		public static void main(String[] args) throws InterruptedException {
			
			
			
			
			
			System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
			
			
			
			WebDriver driver = new ChromeDriver();

       driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
       
       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		Thread.sleep(3000);
		
		
		driver.switchTo().frame("iframeResult");
		
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("(//a[contains(@class,'w3-button w3')])[6]")).click();
		
		
		
		
		
		
		
		
		
	}
}
