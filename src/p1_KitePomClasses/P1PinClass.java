package p1_KitePomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class P1PinClass {
	//1.variable declaration
	@FindBy(id = "pin")private WebElement PIN;
    @FindBy(xpath = "//button[@type='submit']")private WebElement ContinueButton;
    
    //2.Constructor
    public P1PinClass(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
    
    //3.Methods
    public void sendpin(String pin)
    {
    	PIN.sendKeys(pin);
    }
    public void ClickOnContinueButton()
    {
    	ContinueButton.click();
    }


}
