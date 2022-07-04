package a22_05_022;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_B_Nested {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		// switch to frame
		driver.switchTo().frame("frame1");
		Thread.sleep(2000);
		// switch to nested frame
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']")));
		Thread.sleep(2000);
		// switch to main page
		// driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		Thread.sleep(2000);

		// click on any element on main page
		driver.findElement(By.id("item-0");

	}
}
