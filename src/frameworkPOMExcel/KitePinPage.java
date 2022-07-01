package frameworkPOMExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
   //1.Variables private and global.
	@FindBy(id = "pin")private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']")private WebElement ClickOnContinue;
	
	//2.constructor
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Methods
	public void SendPin(String SendPin)
	{
		PIN.sendKeys(SendPin);
	}
	public void ClickOnContinueButton()
	{
		ClickOnContinue.click();
	}
}
