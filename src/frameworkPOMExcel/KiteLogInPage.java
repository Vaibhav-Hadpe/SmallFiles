 package frameworkPOMExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage {
	//1.@findBy to locate the element and declare variable.
	@FindBy(id = "userid")private  WebElement UN;
	@FindBy(id = "password")private WebElement PASSWORD;
	@FindBy(xpath = "//button[@type='submit']") private  WebElement LogInButton;
	
	//2.Constructor to initialize the variables.
	public KiteLogInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Methods
	public void SendUserName(String UserName)
	{
		UN.sendKeys(UserName);
	}
	public void SendPassword(String Password)
	{
		PASSWORD.sendKeys(Password);
	}
	public void ClickOnLogInButton()
	{
		LogInButton.click();
	}

}
