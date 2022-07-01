package frameworkPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	//1.Variables @findBy method using locators.
	//Variables must be private and global.
	@FindBy(id = "pin")private WebElement Pin;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement Continue;
	
	//2.Constructor should be public and used to initialize variables.
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods public and elements equal to methods.
	//variables equal to actions or methods.
	public void sendPin()
	{
		Pin.sendKeys("982278");
	}
	public void ClickOnContinueButton()
	{
		Continue.click();
	}

}
