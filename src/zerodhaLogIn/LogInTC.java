package zerodhaLogIn;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogInTC {

	public static void main(String[] args) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://kite.zerodha.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	  
	  WebElement UN = driver.findElement(By.id("userid"));
	  WebElement Pass = driver.findElement(By.id("password"));
	  WebElement LogIn = driver.findElement(By.xpath("//button[@type='submit']"));
	  
	  UN.sendKeys("ELR321");
	  Pass.sendKeys("Dhana1111");
	  LogIn.click();
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	  WebElement Pin = driver.findElement(By.id("pin"));
	  WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
	  Pin.sendKeys("982278");
	  Continue.click();
	  
	  WebElement UserText = driver.findElement(By.xpath("//span[@class='user-id']"));
	  String actualtext = UserText.getText();
	  String expectedtext="ELR321";
	  if(actualtext.equals(expectedtext))
	  {
		  System.out.println("UserText is matching TC is Passed.");
	  }
	  else
	  {
		  System.out.println("UserText is not matching TC is Failed.");
	  }

	  UserText.click();
	  WebElement Logout = driver.findElement(By.xpath("//a[@target='_self']"));
	  
	  Logout.click();
	  Thread.sleep(2000);
	  driver.quit();
	}

}
