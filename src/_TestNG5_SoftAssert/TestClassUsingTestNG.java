package _TestNG5_SoftAssert;//Error while Running.

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestClassUsingTestNG {
	WebDriver driver;
	KiteLogInPage LogIn;
	KiteHomePage Home;
	KitePinPage Pin1;
	
	SoftAssert soft=new SoftAssert();
	Sheet mysheet;
	
    @BeforeClass
	public void Launch() throws EncryptedDocumentException, IOException 
	{
    	FileInputStream f=new FileInputStream("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
	    mysheet=WorkbookFactory.create(f).getSheet("Sheet2");
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		LogIn=new KiteLogInPage(driver);
		Home=new KiteHomePage(driver);
		Pin1=new KitePinPage(driver);
	}
	@BeforeMethod
	public void LogInPin() throws InterruptedException 
	{
		
		String UserName = mysheet.getRow(0).getCell(0).getStringCellValue();
		String password = mysheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mysheet.getRow(0).getCell(2).getStringCellValue();
		
		LogIn.sendUserName(UserName);
		LogIn.sendPassword(password);
		LogIn.clickOnLogInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Pin1.sendPin(pin);
		
		Pin1.clickOnContinue();
	}
  @Test
  public void ValidateUserID() 
  {
	 String ActualID = Home.VerifyUserID();
	  String ExpectedID=mysheet.getRow(0).getCell(0).getStringCellValue();
	  soft.assertEquals(ActualID, ExpectedID,"ID is not matching TC is Failed.");
		Reporter.log("ID is matching TC is Passed.", true);
  }
  @Test
  public void ValidateName()
  {
	  Home.VerifyName();
  }
  @AfterMethod
  public void LogOut()
  {
	  Home.clickOnLogOutButton();
  }
  @AfterClass
  public void close()
  {
	  driver.close();
  }
}
