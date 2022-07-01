package a_KiteAppPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteFPinPage 
{
	//1.Declaration of variable.
	
		@FindBy(id = "pin")private WebElement PIN;
		
		@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
		
		//2.Constructor
		public KiteFPinPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//3.Methods
		public void sendPin(String pin)
		{
			PIN.sendKeys(pin);
		}
		public void clickOnContinueButton()
		{
			ContinueButton.click();
		}


}
