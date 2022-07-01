package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		Alert alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(7000);
		Alert alt2 = driver.switchTo().alert();
		System.out.println(alt2.getText());
		alt2.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		Alert alt3 = driver.switchTo().alert();
		System.out.println(alt3.getText());
		alt3.dismiss();
		
		Thread.sleep(2000);
		WebElement alt4 = driver.findElement(By.id("promtButton"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", alt4);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		alt4.click();
		Alert Prompt = driver.switchTo().alert();
		System.out.println(Prompt.getText());
		Prompt.accept();
		
		
		Thread.sleep(2000);
		driver.close();
		

	}

}
