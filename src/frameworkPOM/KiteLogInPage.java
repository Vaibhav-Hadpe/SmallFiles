package frameworkPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLogInPage {
     
	//1.Variables @findBy and store it into ref. variable.
	//Variable must be private and global.
	
	@FindBy(id = "userid")private WebElement UN;
	   
	@FindBy(id = "password") private WebElement Pass;
	
	@FindBy(xpath = "//button[@type='submit']")private WebElement LogInButton;
	
	//2.Constructor to initialize the variables.
	//Constructor must be Public.
	
	public KiteLogInPage( WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.Methods,here no. of variables are 3 so methods to take actions must be 3.
	//Methods should be public.
	public void sendUserName() 
	{
		UN.sendKeys("ELR321");
	}
	public void sendPassword()
	{
		Pass.sendKeys("Dhana1111");
	}
	public void ClickOnLogInButton()
	{
		LogInButton.click();
	}
	
}
