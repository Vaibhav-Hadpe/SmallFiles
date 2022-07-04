package a22_05_022;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Screenshot_A {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		// driver.manage().window().minimize();
		driver.navigate().to("https://www.flipkart.com/");
		 Thread.sleep(1000);
		File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String a1 = RandomString.make(5);

		File desti = new File("G:\\VELOCITY 5th march\\all jars & Softwares\\Screenshot\\DCM" + a1 + ".png");
		FileHandler.copy(source, desti);
		
		

	}

}
