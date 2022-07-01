package frameworkPOMExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassNew {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		File myfile=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet1");
		int TotalRowCount = mysheet.getLastRowNum();
		
		for(int i=1;i<=TotalRowCount;i++)
		{
			String UserName = mysheet.getRow(i).getCell(0).getStringCellValue();
			String Password = mysheet.getRow(i).getCell(1).getStringCellValue();
			String Pin1 = mysheet.getRow(i).getCell(2).getStringCellValue();
			
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
		    driver.findElement(By.xpath("//a[@class='remove text-xxsmall']")).click();
		}
			
	}

}
	
	
