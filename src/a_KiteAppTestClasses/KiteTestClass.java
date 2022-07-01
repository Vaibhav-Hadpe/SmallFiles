package a_KiteAppTestClasses;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import a_KiteAppBaseClasses.LaunchSite;
import a_KiteAppPomClasses.KiteFHomePage;
import a_KiteAppPomClasses.KiteFLogInPage;
import a_KiteAppPomClasses.KiteFPinPage;
import a_KiteAppUtilityClasses.Utility;

public class KiteTestClass extends LaunchSite{
	KiteFLogInPage logIn;
	KiteFPinPage pin;
	KiteFHomePage home;
//	protected  void initialize(WebDriver WebDriver)
//	{
//      WebDriver =driver;
//	}

	@BeforeClass
	public void LaunchBrowser()
	{
		
		openBrowser();
		logIn=new KiteFLogInPage(driver);
		pin=new KiteFPinPage(driver);
		home=new KiteFHomePage(driver);
	}
	@BeforeMethod
	public void LogInToKite() throws EncryptedDocumentException, IOException
	{
		logIn.sendUserName(Utility.ReadDataFromExcel(0, 0));
		logIn.sendPassword(Utility.ReadDataFromExcel(0, 1));
		logIn.clickOnlogInButton();
		Utility.implicitwait(driver, 2000);
		pin.sendPin(Utility.ReadDataFromExcel(0, 2));
		pin.clickOnContinueButton();
		Utility.implicitwait(driver, 200);
	}
	
  @Test
  public void ValidateUserName() throws InterruptedException, EncryptedDocumentException, IOException 
  {
	  String ActualuserName = home.verifyUserID();
	  String ExpectedUserName=Utility.ReadDataFromExcel(0, 0);
	  Assert.assertEquals(ActualuserName, ExpectedUserName,"UserNames are not matching TC is Failed.");
	  Reporter.log("UserNames are Matching TC is Passed", true);
	  
  }
  @Test
  public void validateNickname() throws EncryptedDocumentException, IOException
  {
	  String Actualname = home.verifyNickname();
	  String Expectedname=Utility.ReadDataFromExcel(0, 3);
	  Assert.assertEquals(Actualname, Expectedname,"Names are not matching TC is Failed.");
	  Reporter.log("Names are matching TC is passed.", true);
  }
  @AfterMethod
  public void LogOut() throws InterruptedException
  {
	  home.clickOnLogOutButton();
	  Utility.implicitwait(driver, 2000);
	  driver.findElement(By.xpath("//a[@class='remove text-xxsmall']")).click();
  }
  @AfterClass
  public void CloseBrowser()
  {
	  driver.close();
  }
}
