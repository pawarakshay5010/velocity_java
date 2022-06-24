package locators;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class sample2 
{
public static void main(String[] args) throws InterruptedException {
	
	
	System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
	
	
	
	WebDriver driver = new ChromeDriver();
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.get("https://www.facebook.com/");
	
	
	driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	
	WebElement list = driver.findElement(By.xpath("//select[@id='month']"));
	
	Thread.sleep(5000);
	Select s = new Select(list);
	//Thread.sleep(5000);
	
	
	
	s.selectByIndex(2);
	
	boolean t = s.isMultiple();
	
	System.out.println(t);
	
	
	List<WebElement> all = s.getOptions();
	
	for(WebElement options:all)
	
	{
		
		System.out.println(options);
	}
}
}
