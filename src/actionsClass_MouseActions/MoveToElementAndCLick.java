package actionsClass_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementAndCLick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
//		driver.findElement(By.id("accept-cookie-notification-cross")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@aria-label='Close Promo Bar']")).click();
		
		Thread.sleep(3000);
		WebElement GetStart = driver.findElement(By.id("signupModalButton"));
		Actions act=new Actions(driver);
		
		//1.direct click on targeted button using click method having parameter as web element.
		act.click(GetStart).perform();//Remind to write perform.
		
		//2.first move the cursor on element using moveToElement method then simple click.
		act.moveToElement(GetStart).click().build().perform();//we combine multiple actions so 
		//need to write build.perform().
		
	

	}

}
