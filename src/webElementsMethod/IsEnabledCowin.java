package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledCowin {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.cowin.gov.in/");Thread.sleep(5000);
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//a[@href='https://selfregistration.cowin.gov.in'])[2]")).click();
	Thread.sleep(20000);
	WebElement OTP = driver.findElement(By.xpath("//ion-button[text()=' GET OTP ']"));
	boolean Result = OTP.isEnabled();
	System.out.println(Result);		


	}

}
