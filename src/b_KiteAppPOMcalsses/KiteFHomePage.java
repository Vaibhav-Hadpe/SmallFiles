package b_KiteAppPOMcalsses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteFHomePage 
{
	//1.declaration of variables.
		@FindBy(xpath = "//span[@class='user-id']")private WebElement UserID;
		
		@FindBy(xpath = "//span[@class='nickname']")private WebElement Nickname;
		
		@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;
	     
		//2.Constructor
		public KiteFHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//3.Methods
		public String verifyUserID() throws InterruptedException
		{  Thread.sleep(1000);
			String ActualUserID = UserID.getText();
			return ActualUserID;
		}
		public String verifyNickname()
		{
			String ActualNickname=Nickname.getText();
			return ActualNickname;
		}
		public void clickOnLogOutButton() throws InterruptedException
		{
			UserID.click();
			Thread.sleep(1000);
			LogOutButton.click();
		}

}
