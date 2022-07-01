package _TestNG1;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UseOfAnnotations1 {
	@Test
	  public void ValidateUserID() 
	  {
		  Reporter.log("Verify actual user ID is matching with expected(@Test) ", true);
	  }
	  @Test
	  public void validatetext1()
	  {
		  Reporter.log("Verify actual text1 is matching with expected text1 ", true);
	  }
	  @BeforeMethod
	  public void LogInAndPin()
	  {
		  Reporter.log("LogIn and Enter Pin(@BeforeMethod)", true);
	  }
	  @AfterMethod
	  public void LogOut()
	  {
		  Reporter.log("LogOut(@AfterMethod", true);
	  }
	  @BeforeClass
	  public void LaunchBrowser()
	  {
		  Reporter.log("Launch the Browser(@BeforeClass", true);
	  }
	  @AfterClass
	  public void CloseBrowser()
	  {
		  Reporter.log("Close the Browser(@AfterClass", true);
	  }
}
