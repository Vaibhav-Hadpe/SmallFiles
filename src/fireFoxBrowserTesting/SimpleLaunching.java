package fireFoxBrowserTesting;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleLaunching {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.close();
		//After Closing again want to open vctc then make new obj of Webdriver.
		WebDriver driver1=new FirefoxDriver();
		driver1.get("https://vctcpune.com/");
		

	}

}
