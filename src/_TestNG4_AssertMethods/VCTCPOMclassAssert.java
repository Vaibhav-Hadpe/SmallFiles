package _TestNG4_AssertMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class VCTCPOMclassAssert {
   //1.Variable
	@FindBy(xpath = "//input[@value='Radio4']") private  WebElement RadioButton4;
	
	@FindBy(id = "autocomplete")private   WebElement SelectCountriesField;
	
	@FindBy(xpath = "//h1[text()='Welcome To Practice Page']")private WebElement  Text;
	
	SoftAssert soft=new SoftAssert();
	
	
	//2.Constructor
	public VCTCPOMclassAssert(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//3.Methods
	public  void RadioTrue() 
	{
		//By using Hard Assert
		//Assert.assertTrue(RadioButton4.isSelected(),"RadioButton is not selected TC failed.");
		// Reporter.log("RadioButton is not selected TC is Passed.", true);
		 
		//By using Soft Assert,object created at class level.
		 soft.assertFalse(RadioButton4.isSelected(), "RadioButton is selected TC is Failed.");
		 Reporter.log("RadioButton is not selected TC is Passed.", true);
		 soft.assertAll();
	}
	public void countries()
	{
		Assert.assertTrue(SelectCountriesField.isEnabled(), "Field is disabled TC is Failed.");
		Reporter.log("SelectCountriesField is enabled TC is Passed.", true);;
	}
	public void Text1()
	{
		String ActualText = Text.getText();
		String ExpectedText = "Welcome To Practice Page";
		Assert.assertEquals(ActualText, ExpectedText,"Text is not matching TC is failed.");
		Reporter.log("Text is matching TC is Passed", true);
	}
}
