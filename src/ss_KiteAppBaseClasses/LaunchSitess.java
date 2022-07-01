package ss_KiteAppBaseClasses;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ss_KiteAppUtilityClasses.Utilityss;

public class LaunchSitess {
	protected static WebDriver driver;
	public static void openBrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(Utilityss.ReadDataFromPropertyFile("URL"));
	}
	public void takescreenshot(String TCName) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    File dest=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\ScreenshotSelenm\\"+TCName+".png");
	    FileHandler.copy(src, dest);
	}

}
