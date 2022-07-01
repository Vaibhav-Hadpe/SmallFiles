package frameworkPOM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://kite.zerodha.com/");
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   
	   KiteLogInPage LogIn =new KiteLogInPage(driver);
	   LogIn.sendUserName();
	   LogIn.sendPassword();
	   LogIn.ClickOnLogInButton();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   KitePinPage Pin=new KitePinPage(driver);
	   Pin.sendPin();
	   Pin.ClickOnContinueButton();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   KiteHomePage Home =new KiteHomePage(driver);
	   Home.Compare();
	   Home.ClickOnUserId();
	   
	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	   KiteLogOutWindow LogOut =new KiteLogOutWindow(driver);
	   LogOut.ClickOnLogOutButton();
	   
	   driver.quit();
			   
			   
	   
	   
	
	
	}

}
