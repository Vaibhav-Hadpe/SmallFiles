package _TestNG7_Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Assignment_LogINPage
{
    //1.Variables
	@FindBy(id = "userid")private WebElement UserID;
	
	@FindBy(id = "password")private WebElement Password;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement LogInButton;
	
	@FindBy(xpath = "//span[contains(text(),'User ID should ')]")private WebElement userIDErrorMsg;
	
	@FindBy(xpath = "//p[@class='error text-center']")private WebElement incorrectpswdErrorMsg;
    
	//2.Constructor
	
	public Assignment_LogINPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public void sendUserID(String username)
	{
		UserID.sendKeys(username);
	}
	public void sendPassword(String password)
	{
		Password.sendKeys(password);
	}
    public void clickonLogInButton()
    {
    	LogInButton.click();
    }
    public String userIDerrormsg()
    {
    	String ActualUserIDerrorMsg = userIDErrorMsg.getText();
    	return ActualUserIDerrorMsg;
    }
    public String passworderrormsg()
    {
    	String ActualpswdincorrectErrormsg = incorrectpswdErrorMsg.getText();
    	return ActualpswdincorrectErrormsg;
    }
    public void clearField()
    {
    	UserID.clear();
    	Password.clear();
    }
	
	
}
