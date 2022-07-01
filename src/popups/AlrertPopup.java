package popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlrertPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alrt = driver.switchTo().alert();
		Thread.sleep(2000);
		alrt.accept();
		Thread.sleep(2000);
		
        driver.findElement(By.id("timerAlertButton")).click();
        Thread.sleep(8000);
        Alert Timealrt = driver.switchTo().alert();
        Thread.sleep(2000);
        Timealrt.accept();
        
        
		
		

	}

}
