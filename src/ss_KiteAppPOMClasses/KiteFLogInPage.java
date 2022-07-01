package ss_KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteFLogInPage 
{
	//1.Declaring variable as private achieving Encapsulation.
		@FindBy(id = "userid") private WebElement UN;
	    
		@FindBy(id = "password")private WebElement PASS;
		
		@FindBy(xpath = "//button[@type='submit']")private WebElement LogInButton;
		
		//2.Constructor
		public KiteFLogInPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		//3.Methods
		public void sendUserName(String userName)
		{
			UN.sendKeys(userName);
		}
		public void sendPassword(String password)
		{
			PASS.sendKeys(password);
		}
		public void clickOnlogInButton()
		{
			LogInButton.click();
		}

}
