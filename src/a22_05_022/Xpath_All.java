package a22_05_022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_All {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.manage().window().minimize();
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9011845406");
		Thread.sleep(1000);
		//driver.findElement(By.xpath("//span[text()='Forgot?']")).click();

		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Bablu@12345");
		//Thread.sleep(3000);
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.close();
		System.setProperty("webdriver.chrome.driver","G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		driver1.navigate().to("https://www.nobroker.in/");
		driver1.manage().window().maximize();
		Thread.sleep(2000);
		boolean result = driver1.findElement(By.xpath("(//button[@type='button'])[2]")).isEnabled();
		System.out.println(result);
		if(result==true)
		{
			System.out.println("Element is enable");
		}
		else
		{
			System.out.println("Element is disable");
		}
		
			Thread.sleep(2000);
		
		boolean r1 = driver1.findElement(By.xpath("//label[@for='SHARED']")).isSelected();
		System.out.println(r1);
		if(r1==true)
		{
			System.out.println("Element is selected");
		}
		else
		{
			System.out.println("Element is not selected");
		}
		Thread.sleep(2000);
		
		boolean r2 = driver1.findElement(By.xpath("//div[text()='My Bookings']")).isDisplayed();
		System.out.println(r2);
		if(r2==true)
		{
			System.out.println("Element is displayed");
		}
		else
		{
			System.out.println("Element is not displayed");
		}
		Thread.sleep(2000);
		String text = driver1.findElement(By.xpath("//div[contains(text(),'World')]")).getText();
		System.out.println(text);
		
		
		//driver.close();
		//driver.quit();
		

		
		
		
	}

}
