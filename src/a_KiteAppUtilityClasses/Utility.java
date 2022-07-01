package a_KiteAppUtilityClasses;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	public static String ReadDataFromExcel(int row,int cell) throws EncryptedDocumentException, IOException
	{
		File f=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx");
		Sheet mysheet = WorkbookFactory.create(f).getSheet("Sheet2");
		String myvalue = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return myvalue;
		
	}
	public static void takeScreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make(3);
		File dest=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx\\testKite"+str+".png");
		FileHandler.copy(src, dest);
	}
	public static void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

}
