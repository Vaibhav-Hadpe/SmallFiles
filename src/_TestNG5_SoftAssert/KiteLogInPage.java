package _TestNG5_SoftAssert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage 
{
//1.variable declaration.
	@FindBy(id = "userid")private WebElement UN;
	
	@FindBy(id = "password") private WebElement PASS;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement LogInButton;
	
	//2.constructor
	
	public KiteLogInPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void sendUserName(String UserName)
	{
		UN.sendKeys(UserName);
	}
	public void sendPassword(String password)
	{
		PASS.sendKeys(password);
	}
	public void clickOnLogInButton()
	{
		LogInButton.click();
	}
}
