package _TestNG4_AssertMethods;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VCTCTestNGAssertive {
	WebDriver driver;
	VCTCPOMclassAssert pomclass;
  @BeforeMethod
  public void Launch() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  pomclass=new VCTCPOMclassAssert(driver);
  }
  @Test
public void VerifyRadioButton() 
  { 
	 pomclass.RadioTrue();
  }
  @Test
  public void VerifyCountryField()
  {
	  pomclass.countries();
  }
  @Test
  public void VerifyText()
  {
	  pomclass.Text1();
  }
  @AfterMethod
  public void close()
  {
	  driver.close();
  }
}
