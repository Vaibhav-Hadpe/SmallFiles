package ss_KiteAppTestClasses;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ss_KiteAppBaseClasses.LaunchSitess;
import ss_KiteAppPOMClasses.KiteFHomePage;
import ss_KiteAppPOMClasses.KiteFLogInPage;
import ss_KiteAppPOMClasses.KiteFPinPage;
import ss_KiteAppUtilityClasses.Utilityss;
@Listeners(ss_KiteAppUtilityClasses.Listners_ss.class)
public class TestClass_ss extends LaunchSitess{
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
	public void LogInandPin() throws IOException
	{
		LogIn.sendUserName(Utilityss.ReadDataFromPropertyFile("UN"));
		LogIn.sendPassword(Utilityss.ReadDataFromPropertyFile("PASS"));
		LogIn.clickOnlogInButton();
		Utilityss.implicitwait(driver, 200);
		
		Pin.sendPin(Utilityss.ReadDataFromPropertyFile("PIN"));
		Pin.clickOnContinueButton();
		Utilityss.implicitwait(driver, 200);
	}
	@Test
	public void verifyNickName() throws IOException
	{
		String ActualNickName = Home.verifyNickname();
		String ExpectedNickName=Utilityss.ReadDataFromPropertyFile("NickName");
		Assert.assertEquals(ActualNickName, ExpectedNickName);
		Reporter.log("NickNames are matching TC is Passed.", true);
	}
  @Test
  public void VerifyUserID() throws InterruptedException, IOException 
  {
	  String ActualUserID=Home.verifyUserID();
	  String ExpectedUserID=Utilityss.ReadDataFromPropertyFile("UN1");
	  Assert.assertEquals(ActualUserID, ExpectedUserID,"Actual and Expected UserID's are not matching TC is Failed.");
	  Reporter.log("Actual and Expected UserID's are  matching TC is Passed.", true);
  }
  @AfterMethod
  public void LOgOut() throws InterruptedException
  {
	  Home.clickOnLogOutButton();
	  Utilityss.implicitwait(driver, 200);
	  driver.findElement(By.xpath("//a[@class='remove text-xxsmall']")).click();
  }
  @AfterClass
  public void closeBrowser()
  {
	  driver.close();
  }
}
