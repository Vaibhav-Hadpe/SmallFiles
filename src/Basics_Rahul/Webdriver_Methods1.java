package Basics_Rahul;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver_Methods1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		driver.manage().window().maximize();
		Thread.sleep(300);

		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());

		driver.navigate().to("https://www.freecharge.in/");
		Thread.sleep(500);
		driver.navigate().back();
		Thread.sleep(500);
		driver.navigate().forward();
		Thread.sleep(500);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		Point t=new Point(100,10);
		driver.manage().window().setPosition(t);

		// driver.close();
		//driver.quit();

	}

}
