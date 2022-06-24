package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class a1 
{

	
	
	@FindBy(xpath = "(//input[@type='text'])[2]")  private WebElement UN;
	
	@FindBy(xpath = "//input[@type='password']")  private WebElement PASS;
	
//	@FindBy(xpath = "//a[@href='https://www.flipkart.com/travel/flights?param=DTNavIcon&fm=neo%2Fmerchandising&iid=M_cf97ce62-1584-4d7a-9f24-9a7b6ab08546_2_372UD5BXDFYS_MC.V4ZPKTOAO321&otracker=hp_rich_navigation_8_2.navigationCard.RICH_NAVIGATION_Travel_V4ZPKTOAO321&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_8_L0_view-all&cid=V4ZPKTOAO321']") private WebElement login;
	
	@FindBy(xpath = "(//a[@href]//div[@class='xtXmba'])[4]")  private WebElement login;
	
	public a1(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	public void a1_username()
	{
		
		UN.sendKeys("8928201111");
		
		
	}
	
	public void a1_password()
			{
				
				PASS.sendKeys("akshay@123");
			}
	
	
	public void a1_loginbutton()
	{
		
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
