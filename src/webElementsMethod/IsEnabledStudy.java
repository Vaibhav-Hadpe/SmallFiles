package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.freecharge.in/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[text()='login / register']")).click();
		Thread.sleep(4000);
		WebElement proceedbtn = driver.findElement(By.xpath("//button[@type='submit']"));
        boolean result = proceedbtn.isEnabled();
        System.out.println(result);
        Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@id='mobile']")).sendKeys("7972481656");
        boolean result1 = proceedbtn.isEnabled();
        System.out.println(result1);
	}

}
