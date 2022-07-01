package _TestNG4_AssertMethods;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNull_AssertNotNull {
  @Test
  public void CheckUN() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  
	  WebElement UN = driver.findElement(By.id("email"));
	 UN.click();
	 Thread.sleep(1000);
	 Assert.assertNull(UN, "UN Field is not Null TC is Failed.");
	 Reporter.log("UN Field is null TC is Passed.", true);
  }
  @Test
  public void CheckPass()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver =new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  WebElement Password = driver.findElement(By.id("pass"));
		 Assert.assertNotNull(Password, "Password Field is Null TC is Failed.");
		 Reporter.log("Password Field is not null TC is Passed.", true);
  }
}
