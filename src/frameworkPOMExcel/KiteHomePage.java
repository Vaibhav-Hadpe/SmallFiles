package frameworkPOMExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	//1.Variables
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserID;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;
	
	//2.constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Methods
	public void ValidatingUserID(String ExpectedID)
	{
		String ActualID = UserID.getText();
		if(ActualID.equals(ExpectedID))
		{
			System.out.println("UserID is Matching TC is Passed.");
		}
		else
		{
			System.out.println("UserID is not Matching TC is Failed.");
		}
	}
	public void ClickOnUserID()
	{
		UserID.click();
	}
	public void ClickOnLOgOutButton()
	{
		LogOutButton.click();
	}
	

}
