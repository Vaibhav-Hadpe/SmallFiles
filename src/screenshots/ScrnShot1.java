package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScrnShot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://muskaanhindi.com/beautiful-good-morning-images/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='motivating good morning images']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@class='lazyloaded']")).click();
		Thread.sleep(2000);
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         String t1=RandomString.make(3);
         File destn= new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\ScreenshotSelenm\\GoodMrng"+t1+".png");
         FileHandler.copy(src, destn);
	}

}
