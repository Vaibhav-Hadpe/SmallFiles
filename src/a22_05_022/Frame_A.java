package a22_05_022;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_A {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
		Thread.sleep(2000);

		// Step 1-->switch to frame
		// first find the tagname "iframe".

		// Method.1-->Id
		driver.switchTo().frame("frame1"); // use String frame 'id'
		Thread.sleep(2000);
		String r1 = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(r1);
		// Method.2..>name
		// driver.switchTo().frame(0); //use String Frame 'name'

		// method.3...>index
		// driver.switchTo().frame(0); //use int args / frame Index

		// Methods.4...>WebElement
		// driver.switchTo().frame(driver.findElement(By.xpath("")));

		// Step 2 click on the selected webElement

		// driver.findElement(By.xpath("")).click();

	}
}
