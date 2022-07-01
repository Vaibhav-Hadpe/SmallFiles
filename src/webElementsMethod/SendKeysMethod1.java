package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeysMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("Mix - VIJETA TITLE TRACK");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//yt-formatted-string[contains(@aria-label,'Vijeta - Title Track | Subodh Bhave')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[@class='ytp-ad-skip-button ytp-button']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//button[@title='Full screen (f)']")).click();
		Thread.sleep(120000);
		driver.close();
		
		

	}

}
