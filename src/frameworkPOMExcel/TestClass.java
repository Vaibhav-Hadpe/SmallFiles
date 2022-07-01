package frameworkPOMExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		File myfile=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		String UserName = mysheet.getRow(1).getCell(0).getStringCellValue();
		String Password = mysheet.getRow(1).getCell(1).getStringCellValue();
	    String Pin1 = mysheet.getRow(1).getCell(2).getStringCellValue();
	    
	    KiteLogInPage LogIn=new KiteLogInPage(driver);
	    LogIn.SendUserName(UserName);
	    LogIn.SendPassword(Password);
	    LogIn.ClickOnLogInButton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    KitePinPage Pin=new KitePinPage(driver);
	    Pin.SendPin(Pin1);
	    Pin.ClickOnContinueButton();
	    
	    driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	    KiteHomePage Home=new KiteHomePage(driver);
	    Home.ValidatingUserID(UserName);
	    Home.ClickOnUserID();
	    Home.ClickOnLOgOutButton();
	    
	    //driver.quit();
		

	}

}
