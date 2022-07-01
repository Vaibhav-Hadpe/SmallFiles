package frameworkPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogOutWindow {
	//1.Variables @findBy 
	//Variables should be private and public.
	@FindBy(xpath = "//a[@target='_self']")private WebElement  LogOut;
	
	//2.constructor
	public KiteLogOutWindow(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Method
	public void ClickOnLogOutButton()
	{
		LogOut.click();
	}

}
