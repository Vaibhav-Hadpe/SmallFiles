package _TestNG3_GroupingFailedxml;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParllLaunch3 {
	@Test
	  public void Hotstar() 
	  
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	      WebDriver driver= new ChromeDriver();
	      driver.manage().window().maximize();
	      driver.get("https://www.hotstar.com/in");
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  }
}
