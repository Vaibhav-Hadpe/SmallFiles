package scrollingBaseClasses;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import scrollingUtilityClasses.UtilityScrolling;

public class LaunchSitevleocity {
   protected WebDriver driver;
   public void openBrowser() throws IOException
   {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get(UtilityScrolling.readDataFromPropertyFile("URL"));
	   UtilityScrolling.implicitwait(driver, 2000);
   }
}
