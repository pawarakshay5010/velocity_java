package actions_class;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample1 
{

	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
		
		
		
		WebDriver driver = new ChromeDriver();

   driver.get("https://en-gb.facebook.com/");
   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	
	WebElement tt = driver.findElement(By.xpath("//select[@id='month']"));
	
	
	Actions a=new Actions(driver);
	Thread.sleep(5000);
	
	a.click(tt).perform();
	
	Thread.sleep(3000);
	a.sendKeys(Keys.HOME).perform();
	
	Thread.sleep(3000);

	for(int i=0; i<=12; i++)
	{
		
		a.sendKeys(Keys.ARROW_DOWN).perform();
	}
	
	Thread.sleep(3000);
	a.sendKeys(Keys.ENTER).perform();
	
	
}
}
