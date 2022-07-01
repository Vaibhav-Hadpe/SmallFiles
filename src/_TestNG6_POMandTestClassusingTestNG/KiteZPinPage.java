package _TestNG6_POMandTestClassusingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteZPinPage {
	//1.Declaration of variable.
	
	@FindBy(id = "pin")private WebElement PIN;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
	
	//2.Constructor
	public KiteZPinPage(WebDriver driver)
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
