package b_KiteAppUtilityclasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class UtilitywithPropertyfile 
{
	public static void takescreenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String str = RandomString.make(3);
		File dest=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\TestData.xlsx\\testKite"+str+".png");
		FileHandler.copy(src, dest);
	}
	public static String readDataFromProprtyFile(String Key) throws IOException  
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\rahul\\eclipse-workspace\\5th_March_B_Selenium\\src\\TestDataFile.properties");
		prop.load(myfile);
		String value = prop.getProperty(Key);
		return value;
	}
	public static void implicitwait(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
	}

}
