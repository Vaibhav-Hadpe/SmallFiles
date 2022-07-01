package _TestNG4_AssertMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrue_AssertFalse {
  @Test
  public void VerifyUNfield() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	 WebElement UN = driver.findElement(By.id("email"));
	 WebElement Password = driver.findElement(By.id("pass"));
	 
	 Assert.assertTrue(UN.isEnabled(), "UN Field is not enabled TC is Failed.");
	 Reporter.log("UN Field is enabled TC is Passed.", true);
	 
	 Assert.assertFalse(Password.isEnabled(), "Password Field is enabled TC is Failed.");
	 Reporter.log("Password Field is disabled TC is Passed.", true);
  }
}
