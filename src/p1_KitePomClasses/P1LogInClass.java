package p1_KitePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1LogInClass {
	//1.variable which required with private access specifier;
	@FindBy(id = "userid")private WebElement UN;
	@FindBy(id = "password")private WebElement PASS;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LogInButton;
	
	//2.Constructor
	public P1LogInClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	//3.Methods to take Actions on Variables 
	public void sendUserName(String username)
	{
		UN.sendKeys(username);
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
