package _Kite_LogINModule_TestClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import _Kite_LogINModule_BaseClass.LaunchSite;
import _Kite_LogINModule_POMclasses.LogInPageOnly;
import _Kite_LogINModule_UtilityClasses.UtilityForLogInModule;

public class TestClass_LogInModule extends LaunchSite{
	LogInPageOnly LogIn;
	SoftAssert soft=new SoftAssert();
	@BeforeClass
	public void launchBrowser()
	{
		OpenBrowser();
		LogIn=new LogInPageOnly(driver);
		
	}
	@BeforeMethod
	public void ClearData() throws InterruptedException
	{//OpenBrowser();
	//LogIn=new LogInPageOnly(driver);
		UtilityForLogInModule.implicitwait(driver, 1000);
		  LogIn.ClearFields();
		  UtilityForLogInModule.implicitwait(driver, 3000);
	}
	
  @Test(priority=1)
  public void VerifyBlankUserIDErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException 
  {//UserID field is Blank,send correct pswd and click on Log In Button.
	  LogIn.sendPassword(UtilityForLogInModule.readDataFromExcel(0, 1));
	  LogIn.clickonLogInButton();
	  UtilityForLogInModule.implicitwait(driver, 200);
	  
	  String actualUserIDErrorMsg = LogIn.userIDErrorMsg();
	  String ExpectedUserIDErrorMsg=UtilityForLogInModule.readDataFromExcel(0, 3);
	  soft.assertEquals(actualUserIDErrorMsg, ExpectedUserIDErrorMsg,"UserID's Error Messages are not Matching TC is Failed.");
	  Reporter.log("UserID's Error Messages are Matching TC is Passed.", true);
	  Thread.sleep(1000);
      
  }
  @Test(priority=2)
  public void VerifyBlankPassErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException
  {//UN and Password field both Blank ,click on Log In Button.
	  LogIn.clickonLogInButton();
	  UtilityForLogInModule.implicitwait(driver, 200);
	  
	  String ActualPassErrorMsg = LogIn.passwordErrorMsg();
	  String ExpectedPassErrorMsg=UtilityForLogInModule.readDataFromExcel(0, 4);
	  soft.assertEquals(ActualPassErrorMsg, ExpectedPassErrorMsg,"Password's Error Messages are not Matching TC is Failed.");
	  Reporter.log("Password's Error Messages are Matching TC is Passed.", true);
  }
  @Test(priority=3)
  public void VerifyInvalidUserIDorPassErrorMsg() throws EncryptedDocumentException, IOException, InterruptedException
  {//enter valid UN and invalid Pass Click on LogIn Button
	  LogIn.sendUserID(UtilityForLogInModule.readDataFromExcel(1, 0));
	  LogIn.sendPassword(UtilityForLogInModule.readDataFromExcel(1, 0));
	  LogIn.clickonLogInButton();
      UtilityForLogInModule.implicitwait(driver, 3000);
	  
	  String ActualInvalidErrorMsg = LogIn.InvalidUserIDorPswdErrorMsg();
	  String ExpectedInvalidErrorMsg=UtilityForLogInModule.readDataFromExcel(0, 5);
	  soft.assertEquals(ActualInvalidErrorMsg, ExpectedInvalidErrorMsg,"Actual and Expected Invalid Error Messages are not Matching TC is Failed.");
	  Reporter.log("Actual and Expected Invalid Error Messages are Matching TC is Passed.", true);
	  Thread.sleep(1000);
  }	

}
