package fireFoxBrowserTesting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CrossBrowser_TestingUseOFChromeOption {
	
	
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		ChromeOptions opt=new ChromeOptions();
		//opt.addArguments("-headless");
		opt.addArguments("--disable-notifications");
		opt.addArguments("-incognito");
		//opt.addArguments("--start-minimized");
		opt.addArguments("--start-maximized");
		
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().deleteAllCookies();
		
		//driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		KiteFLogInPage LogIn;
		KiteFPinPage Pin;
		Sheet mysheet;
		LogIn=new KiteFLogInPage(driver);
		Pin=new KiteFPinPage(driver);
		File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
		mysheet=WorkbookFactory.create(f).getSheet("Sheet2");
		
	
		LogIn.sendUserName(mysheet.getRow(0).getCell(0).getStringCellValue());
		  LogIn.sendPassword(mysheet.getRow(0).getCell(1).getStringCellValue());
		  LogIn.clickOnlogInButton();
		  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		  Pin.sendPin(mysheet.getRow(0).getCell(2).getStringCellValue());
		  Pin.clickOnContinueButton();
		   
	}
}
  