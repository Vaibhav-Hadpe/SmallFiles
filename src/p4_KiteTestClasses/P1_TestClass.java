package p4_KiteTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a_KiteAppUtilityClasses.Utility;
import p1_KitePomClasses.P1HomeClass;
import p1_KitePomClasses.P1LogInClass;
import p1_KitePomClasses.P1PinClass;
import p3_KiteBaseClasses.LaunchSite;

public class P1_TestClass extends LaunchSite{
	P1LogInClass LogIn;
	P1PinClass Pin;
	P1HomeClass Home;
//	protected void initialize(WebDriver Webdriver)
//	{
//		Webdriver=driver;
//	}
	@BeforeClass
	public void LaunchBrowser()
	{
		openBrowser();
		LogIn=new P1LogInClass(driver);
		Pin=new P1PinClass(driver);
		Home=new P1HomeClass(driver);
		
	}
	@BeforeMethod
	public void LogInandPin() throws EncryptedDocumentException, IOException
	{
		LogIn.sendUserName(Utility.ReadDataFromExcel(0, 0));
		LogIn.sendPassword(Utility.ReadDataFromExcel(0, 1));
		LogIn.clickOnLogInButton();
		Utility.implicitwait(driver, 1000);
		Pin.sendpin(Utility.ReadDataFromExcel(0, 2));
		Pin.ClickOnContinueButton();
		Utility.implicitwait(driver, 1000);
	}
  @Test
  public void verifyUserID() throws EncryptedDocumentException, IOException 
  {
	  String ActualUserID = Home.validateUserID();
	  String ExpectedUserID=Utility.ReadDataFromExcel(0, 0);
	  Assert.assertEquals(ActualUserID, ExpectedUserID,"ID's are not Matching TC is Failed.");
	  Reporter.log("ID's are Matching TC is Passed.", true);
//	  Utility.implicitwait(driver, 2000);
//	  Utility.takeScreenshot(driver);
//	  Utility.implicitwait(driver, 2000);
  }
  @Test
  public void verifyNIckName() throws EncryptedDocumentException, IOException 
  {
	  String ActualName = Home.validateNickname();
	  String ExpectedName=Utility.ReadDataFromExcel(0, 3);
	  Assert.assertEquals(ActualName, ExpectedName,"Name's are not Matching TC is Failed.");
	  Reporter.log("Name's are Matching TC is Passed.", true);
  }
  @Test
  public void verifyNiftytext() throws EncryptedDocumentException, IOException 
  {
	  String ActualNiftyText = Home.validateNiftytext();
	  String ExpectedNiftyText=Utility.ReadDataFromExcel(0, 4);
	  Assert.assertEquals(ActualNiftyText, ExpectedNiftyText,"TextNifty's are not Matching TC is Failed.");
	  Reporter.log("TextNifty's are Matching TC is Passed.", true);
  }
  @Test
  public void verifySensexText() throws EncryptedDocumentException, IOException 
  {
	 String ActualSensexText = Home.validateSensextext();
	 String ExpectedSensexText=Utility.ReadDataFromExcel(0, 5);
	  Assert.assertEquals(ActualSensexText, ExpectedSensexText,"TextSensex's are not Matching TC is Failed.");
	  Reporter.log("TextSensex's are Matching TC is Passed.", true);
	 
  }
  @AfterMethod
  public void LogOutandChangeUser() throws InterruptedException
  {
	  Home.clickOnLogOutButton();
	  
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
