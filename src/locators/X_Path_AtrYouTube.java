package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_AtrYouTube {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=VWCWwuHiB4k");
		driver.manage().window().maximize();
		Thread.sleep(100);
		driver.findElement(By.xpath("//button class[@aria-label='Play (k)']")).click();
        
	}

}
