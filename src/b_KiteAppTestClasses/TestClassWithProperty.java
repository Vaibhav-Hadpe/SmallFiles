package b_KiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import b_KiteAppBaseClasses._b_LaunchSite;
import b_KiteAppPOMcalsses.KiteFHomePage;
import b_KiteAppPOMcalsses.KiteFLogInPage;
import b_KiteAppPOMcalsses.KiteFPinPage;
import b_KiteAppUtilityclasses.UtilitywithPropertyfile;

public class TestClassWithProperty extends _b_LaunchSite {
	KiteFLogInPage LogIn;
	KiteFPinPage Pin;
	KiteFHomePage Home;
	
	@BeforeClass
	public void LaunchBrowser() throws IOException
	{
		openBrowser();
		LogIn=new KiteFLogInPage(driver);
		Pin=new KiteFPinPage(driver);
		Home=new KiteFHomePage(driver);
		
	}
	@BeforeMethod
	public void logInandPin() throws IOException
	{
		LogIn.sendUserName(UtilitywithPropertyfile.readDataFromProprtyFile("UN"));
		LogIn.sendPassword(UtilitywithPropertyfile.readDataFromProprtyFile("Password"));
		LogIn.clickOnlogInButton();
		UtilitywithPropertyfile.implicitwait(driver, 100);
		Pin.sendPin(UtilitywithPropertyfile.readDataFromProprtyFile("Pin"));
		Pin.clickOnContinueButton();
	}
  @Test
  public void ValidateUserID() throws InterruptedException, IOException 
  {
	  String ActualUserID = Home.verifyUserID();
	 String expectedUserID= UtilitywithPropertyfile.readDataFromProprtyFile("UN");
	 Assert.assertEquals(ActualUserID, expectedUserID,"Id's are not matching TC is Failed.");
	 Reporter.log("Id's are not matching TC is Failed.", true);
	 
  }
  @AfterMethod
  public void LogOut() throws InterruptedException
  {
	  Home.clickOnLogOutButton();
  }
  public void closeBrowser()
  {
	  driver.close();
  }
}
