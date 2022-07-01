package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_PathAtrGoogle {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://play.google.com/store/apps/details?id=com.android.chrome&hl=en_IN&gl=US");
	driver.manage().window().maximize();
	Thread.sleep(100);
	driver.findElement(By.xpath("//a[@href='/store/apps/new']")).click();
	

	}

}
