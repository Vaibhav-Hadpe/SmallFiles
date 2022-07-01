package synchronizationOrWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplcitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);//Static wait.Required 11 seconds.
		//instead of using static wait we are going to use dynamic wait.
		//implicit wait wait till whole webpage load. Automatically webelement load.
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));//9sec.
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();

	}

}
