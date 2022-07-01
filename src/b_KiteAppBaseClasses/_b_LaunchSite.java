package b_KiteAppBaseClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import a_KiteAppUtilityClasses.Utility;
import b_KiteAppUtilityclasses.UtilitywithPropertyfile;

public class _b_LaunchSite {
protected WebDriver driver;
public void openBrowser() throws IOException
{
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
  driver=new ChromeDriver();
  driver.manage().window().maximize();
  driver.get(UtilitywithPropertyfile.readDataFromProprtyFile("URL"));
  Utility.implicitwait(driver, 1000);
}
}
