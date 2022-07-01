package _TestNG6_POMandTestClassusingTestNG;

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
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MockTestclassUsingTestNG {
   KiteZLogInPage LogIN;
   KiteZPinPage Pin;
   KiteZHomePage Home;
   WebDriver driver;
   Sheet mysheet;
	@BeforeClass
  public void launchBrowser() throws EncryptedDocumentException, IOException
  {System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://kite.zerodha.com/");
   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
   
   LogIN=new KiteZLogInPage(driver);
   Pin=new KiteZPinPage(driver);
   Home=new KiteZHomePage(driver);
   File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
   mysheet=WorkbookFactory.create(f).getSheet("Sheet2");
		   
   
	  
  }
	@BeforeMethod
  public void LogINandPin()
  {
	  LogIN.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
	  LogIN.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
	  LogIN.clickOnlogInButton();
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
	  Pin.clickOnContinueButton();
  }
	@Test
  public void ValidateUserID() throws InterruptedException 
  {
		String ActualID = Home.verifyUserID();
		String ExpectedID =mysheet.getRow(0).getCell(0).getStringCellValue();
		Assert.assertEquals(ActualID, ExpectedID,"ID's are not matching TC is Failed.");
		Reporter.log("ID's are matching TC is Passed.", true);
  }
	@AfterMethod
	public void LogOut() throws InterruptedException
	{
		Home.clickOnLogOutButton();
	}
	@AfterClass()
	public void CloseBrowser()
	{
		driver.close();
	}
}
