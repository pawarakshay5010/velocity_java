package locators;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1 
{

	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.selenium.dev/documentation/webdriver/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//span[text()='Documentation'])[1]")).submit();
		
//		String text = driver.findElement(By.xpath("//a[text()='Python']")).getText();
//		
//		
//		System.out.println(text);
//		
//		
//		Thread.sleep(5000);
      driver.close();
//		
		
		
		
		
		
		
		
		
	}
	
	
	
}
