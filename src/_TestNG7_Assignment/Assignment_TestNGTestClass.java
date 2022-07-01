package _TestNG7_Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assignment_TestNGTestClass {
	Assignment_LogINPage LogInpage;
	WebDriver driver;
	Sheet mysheet;
	@BeforeClass
	public void LaunchBrowser() throws EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
		mysheet=WorkbookFactory.create(f).getSheet("Sheet3");
		LogInpage=new Assignment_LogINPage(driver);
	}
	@BeforeMethod
	 public void clearFields()
	  {
		  LogInpage.clearField();
	  }

	@Test
	  public void validateInvalidpasswordmsg()
	
	{
		LogInpage.sendUserID(mysheet.getRow(0).getCell(0).getStringCellValue());
		LogInpage.sendPassword(mysheet.getRow(1).getCell(1).getStringCellValue());
		LogInpage.clickonLogInButton();
		 //Enter valid UN,invalid pass,click on LogInButton.Verify error msg.
		 String ActualInvalidMsg = LogInpage.passworderrormsg();
		 String ExpectedInvalidMsg=mysheet.getRow(0).getCell(4).getStringCellValue();
		 Assert.assertEquals(ActualInvalidMsg, ExpectedInvalidMsg,"Invalid Massages are not matching TC is Failed.");
		 Reporter.log("Invalid Massages are Matching TC is Passed.", true);
		
	}
  @Test
  public void validateUserIDErrorMsg() 
  {
	  LogInpage.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		LogInpage.clickonLogInButton();
	  //Enter Password Click on Log In Log In Button.Verify Error msg of UserID.
	  String ActualErrorUserIDmsg = LogInpage.userIDerrormsg();
	  String ExpectedUserIDerrorMsg=mysheet.getRow(0).getCell(3).getStringCellValue();
	  Assert.assertEquals(ActualErrorUserIDmsg, ExpectedUserIDerrorMsg,"Error Massages are not matching TC is Failed.");
	  Reporter.log("Error Messages are matching TC is Passed.", true);
  }

  @Test
  public void validatepassworderrormasg()
  {
	  
  }
  
 
}
