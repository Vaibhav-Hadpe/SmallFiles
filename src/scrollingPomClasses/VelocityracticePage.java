package scrollingPomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VelocityracticePage 
{
  //1.variable
	@FindBy(xpath = "//input[@value='Radio1']")private WebElement Radio1Button;
	@FindBy(id = "hide-textbox")private WebElement HideButton;
	@FindBy(xpath = "//legend[text()='iFrame Example']")private WebElement IframeButton;
	
	//2.Constructor
	public VelocityracticePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Methods
	public WebElement radiobutton()
	{
		WebElement RadioButton1=Radio1Button;
		return RadioButton1;
	}
	public WebElement hideButton()
	{
		WebElement Hidebutton=HideButton;
		return Hidebutton;
	}
	public WebElement iframebutton()
	{
		WebElement iframeButton=IframeButton;
		return iframeButton;
	}
}
