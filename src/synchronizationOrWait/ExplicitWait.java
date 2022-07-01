package synchronizationOrWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.discoveryplus.in/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		
		
		WebElement otherSignIN = driver.findElement(By.xpath("//a[text()='View other sign in options']"));
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(2000));//create
		//object of WebdriverWait and pass 2 parameter.driver obj and duration time.
		w.until(ExpectedConditions.visibilityOf(otherSignIN));//syntax pass webelement.
		otherSignIN.click();
		
		

	}

}
