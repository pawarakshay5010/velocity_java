package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class a2
{

	@FindBy(xpath = "//div[text()='Travel']")  private WebElement travel;
	
	
	public a2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		
	}
	
	
	public void a2_travel()
	{
		
		travel.click();
		
	}
	
	
	
	
	
	
	
}
