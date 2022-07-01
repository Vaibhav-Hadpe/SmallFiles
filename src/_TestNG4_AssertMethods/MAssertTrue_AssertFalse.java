package _TestNG4_AssertMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MAssertTrue_AssertFalse {
  @Test
  public void VerifyTextField() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	 WebElement ID = driver.findElement(By.id("userid"));
	// Assert.assertTrue(ID.isEnabled(), "ID Field is disabled TC is Failed.");
	// Reporter.log("ID Field is enabled TC is Passed.", true);
	 
	 Assert.assertFalse(ID.isEnabled(), "ID Field is enabled TC is Failed.");
	 Reporter.log("ID field is disabled TC is Passed",true);

  }
}
