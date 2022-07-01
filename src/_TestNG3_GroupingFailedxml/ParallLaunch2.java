package _TestNG3_GroupingFailedxml;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallLaunch2 {
	@Test
	  public void Paytm() 
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://paytm.com/");
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  }
}
