package findelements;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample2
{

	
	
	
	public static void main(String[] args) {
		
		
		
		System.setProperty("webdriver.chrome.driver", "F:\\final chrome exe\\chromedriver.exe");
		
		
		
		
	WebDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
	
	
	List<WebElement> sll = driver.findElements(By.xpath("//a"));
	
//	for(WebElement t:sll)
//	{
//		
//		System.out.println(t.getText());
//	}
	
	
//tagname[@attribtename='attribute value'];
	
	//tagname[text()='text value'];
	
	//tagname[contains(@attributename,'av')];
	
	//tagname[contains(text(),'text valyue')];
	
	
	
	
	
	
}
}
