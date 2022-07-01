package _TestNG1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FirstTestNGClass 
{
  @Test
  public void Method1()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://vctcpune.com/selenium/practice.html");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  System.out.println("I am Method1 having only Printing Statement.");
 //Printing statement used to see message only in Console.
	  driver.quit();
	  
  }
  @Test
  public void Method2()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://twitter.com/i/flow/login");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("I am Method 2 having Reporter.log statement without boolean value.");
 //Reporter.log statement without boolean value is used to see status only in Report not in Console.
	  driver.quit();
  }
  @Test
  public void Method3()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.youtube.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  Reporter.log("I am Method 3 having Reporter.log statment with boolean value.", true);
 //Reporter.log statement with boolean value is used to see status  in BOTH Report and Console.
	  driver.quit();
  }
  
}
