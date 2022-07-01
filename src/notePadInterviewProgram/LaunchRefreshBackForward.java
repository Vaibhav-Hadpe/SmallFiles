package notePadInterviewProgram;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchRefreshBackForward {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//		driver.navigate().refresh();
//		driver.navigate().back();
//		driver.navigate().forward();
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("IPhone13 pro");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		driver.findElement(By.xpath("(//div[@class='col col-7-12'])[3]")).click();
		WebElement ReiviewsOFIphone = driver.findElement(By.xpath("(//span[@class='_2_R_DZ']//span)[4]"));
        System.out.println(ReiviewsOFIphone.getText());
	}

}
