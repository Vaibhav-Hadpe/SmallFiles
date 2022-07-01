package _Kite_LogINModule_TestClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClearMethodUse {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement UN = driver.findElement(By.id("userid"));
		WebElement Pass =  driver.findElement(By.id("password"));
		WebElement LogIn = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UN.sendKeys("ELR321");
		Pass.sendKeys("Dhana11111");
		LogIn.click();
		//UN.clear();
		Thread.sleep(2000);
		String invalidMsg = driver.findElement(By.xpath("//p[@class='error text-center']")).getText();
		System.out.println(invalidMsg);
		//Pass.clear();
//		LogIn.click();
		

	}

}
