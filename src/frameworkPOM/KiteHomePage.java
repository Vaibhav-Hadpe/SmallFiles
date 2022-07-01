package frameworkPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
    
	//1.variables global and private.locate by @FindBy
	@FindBy(xpath = "//span[@class='user-id']") private WebElement UserId;
	
	//2.constructor to initialize the variables.
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Methods
	public void Compare()
	{
		String ActualText = UserId.getText();
		String ExpectedText="ELR321";
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("UserId is Matching TC is Passed");
		}
		else
		{
			System.out.println("UserId is not matching TC is Failed.");
		}   
	}
	public void ClickOnUserId()
	{
		UserId.click();
	}
	
	
}
