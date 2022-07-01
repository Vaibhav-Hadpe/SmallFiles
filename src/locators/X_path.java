package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_path {

	public static void main(String[] args) throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//X path by Attributes.
		driver.get("https://www.w3schools.com/");
		driver.manage().window().maximize();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[@title='Pro Subscription']")).click();
		Thread.sleep(7000);
		driver.navigate().back();
		Thread.sleep(7000);
		
		//X path by text
		driver.findElement(By.xpath("//h1[text()='Learn to Code']")).click();
		
		//X path ,contains with text
		Thread.sleep(7000);
		driver.findElement(By.xpath("//a[contains(text(),'Not Sure Where To Begin?')]")).click();
		
		//X path,contains with attributes.
		driver.navigate().back();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[contains(@id,'search2')]")).click();
		driver.close();
		

	}

}
