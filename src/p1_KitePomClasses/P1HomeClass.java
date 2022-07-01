package p1_KitePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1HomeClass {
	//1.Variables 
	@FindBy(xpath ="//span[@class='user-id']")private WebElement userID;
	@FindBy(xpath = "//span[@class='nickname']")private WebElement Nickname;
	@FindBy(xpath = "(//span[@class='tradingsymbol link-chart'])[1]")private WebElement NiftyText;
	@FindBy(xpath = "(//span[@class='tradingsymbol link-chart'])[2]")private WebElement SensexText;
	@FindBy(xpath = "//a[@target='_self']")private WebElement LogOutButton;
	@FindBy(xpath = "//a[@class='remove text-xxsmall']")private WebElement ChangeUserButton;
	//2.Constructors
	public P1HomeClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods
	public String validateUserID()
	{
		String actualID = userID.getText();
		return actualID;
	}
	public String validateNickname()
	{
		String actualname = Nickname.getText();
		return actualname;
	}
	public String validateNiftytext()
	{
		String actualnifty = NiftyText.getText();
		return actualnifty;
	}
	public String validateSensextext()
	{
		String actualsensex = SensexText.getText();
		return actualsensex;
	}
	public void clickOnLogOutButton() throws InterruptedException
	{
		userID.click();
		Thread.sleep(2000);
		LogOutButton.click();
		Thread.sleep(1000);
		ChangeUserButton.click();
		
	}
	

}
