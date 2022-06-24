package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class a3_test
{
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
	
	
	
	WebDriver driver= new ChromeDriver();
	
	
	driver.get("https://www.flipkart.com/");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	
	
	a1 s = new a1(driver);
	
	s.a1_username();
	s.a1_password();
	s.a1_loginbutton();
	
	
	a2 w = new a2(driver);
	
	w.a2_travel();
	
	
}
}
