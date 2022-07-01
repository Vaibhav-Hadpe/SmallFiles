package _Kite_LogINModule_POMclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPageOnly {
	//1.variable
    @FindBy(id = "userid")private WebElement UserID;
	@FindBy(id = "password")private WebElement Password;
	@FindBy(xpath = "//button[@type='submit']")private WebElement LogInButton;
	@FindBy(xpath = "//span[contains(text(),'User ID should ')]")private WebElement wrongUserIDErrorMsg;
	@FindBy(xpath = "//span[@class='su-message']")private WebElement wrongPasswordErrorMsg;
	@FindBy(xpath = ("//p[@class='error text-center']"))private WebElement InvalidUerIDorPasswordErrorMsg;
    
    //2.Constructor
	public LogInPageOnly(WebDriver driver)
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
    public String userIDErrorMsg()
    {
    	String ActualUserIDerrorMsg = wrongUserIDErrorMsg.getText();
    	return ActualUserIDerrorMsg;
    }
    public String passwordErrorMsg()
    {
    	String ActualpswdincorrectErrormsg = wrongPasswordErrorMsg.getText();
    	return ActualpswdincorrectErrormsg;
    }
    public String InvalidUserIDorPswdErrorMsg()
    {
    	String ActualpswdincorrectErrormsg = InvalidUerIDorPasswordErrorMsg.getText();
    	return ActualpswdincorrectErrormsg;
    }
    public void ClearFields() throws InterruptedException
    {
    	UserID.clear();
    	Thread.sleep(1000);
    	Password.clear();
    	Thread.sleep(1000);
    }
}
