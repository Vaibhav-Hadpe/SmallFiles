package _TestNG4_AssertMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MAssertEqualNotEqual {
  @Test
  public void VerifyText() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  String ActualText = driver.findElement(By.xpath("//h2[text()='Login to Kite']")).getText();
      //String ExpectedText="Login to Kite";
      
      //Assert.assertEquals(ActualText, ExpectedText,"Text is not matching TC is Failed.");
      //Reporter.log("Text is matching TC is Passed.", true);
      
      String ExpectedText1="Kite";
      Assert.assertNotEquals(ActualText,ExpectedText1,"Text is Matching TC is failed");
      Reporter.log("Text is not matching TC is Passed.", true);
      
      
  }
}
