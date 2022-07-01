package _TestNG5_SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.asserts.SoftAssert;

public class KiteHomePage 
{//1.Variable Declaration.'
	@FindBy(xpath = "//span[@class='user-id']")private WebElement UserID;
	
	@FindBy(xpath = "//a[@target='_self']")private  WebElement LogOutButton;
    
	@FindBy(xpath = "//span[@class='nickname']")private WebElement Nickname;
	 SoftAssert soft=new SoftAssert();
	//2.Constructor
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public String VerifyUserID()
	{
		String ActualID = UserID.getText();
		return ActualID;
	}
	public void VerifyName()
	{
		String ActualName = Nickname.getText();
		String ExpectedName="Dhananjay";
		soft.assertEquals(ActualName, ExpectedName,"Name is not matching TC is Failed.");
	}
	public void clickOnLogOutButton()
	{
		LogOutButton.click();
	}
}
