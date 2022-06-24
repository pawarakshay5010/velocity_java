package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class sample1
{
public static void main(String[] args) throws IOException, InterruptedException {
	
	

	System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
	
	
	
	WebDriver driver = new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	
	Thread.sleep(5000);
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File f= new File("F:\\final chrome exe");
	
	FileHandler.copy(source, f);

	   
	
	
	
	
	
	
	
	
	
	
	
	
}
}
