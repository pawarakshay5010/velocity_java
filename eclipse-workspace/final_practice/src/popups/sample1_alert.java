package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample1_alert
{
public static void main(String[] args) throws InterruptedException {
	
	
	
	
	System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
	
	
	
	WebDriver driver = new ChromeDriver();

   driver.get("http://demo.automationtesting.in/Alerts.html");
	
	
	//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   Thread.sleep(4000);
	
	driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
	
	Alert aa = driver.switchTo().alert();
	
	Thread.sleep(4000);
	
	aa.accept();
	
	
	
	
	
	
	
	
	
	
	
	
}
}
