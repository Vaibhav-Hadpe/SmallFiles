package _TestNG4_AssertMethods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual_NotEqual {
  @Test
  public void VerifyText() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  String ActualText = driver.findElement(By.xpath("//h2[contains(text(),'Facebook helps')]")).getText();
	  String ExpectedText="Facebook helps you connect and share with the people in your life.";
	  
	  //Checking Text on facebook log in page is matching with expected text or not.
	  Assert.assertEquals(ActualText, ExpectedText, "Texts are not matching TC is failed.");
	  Reporter.log("Texts are matching TC is Passed.", true);
	  
	  String ExpectedText2="Facebook Helps You To Connect With People.";
	  Assert.assertEquals(ActualText, ExpectedText2, "Texts are not matching TC is failed.");
	  Reporter.log("Texts are matching TC is Passed.", true);
	  
  }
}
