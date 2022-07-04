package listbox_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxeg1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","G:\\VELOCITY 5th march\\all jars & Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(500);
		WebElement day = driver.findElement(By.xpath("//select[@aria-label='Day']"));
		Thread.sleep(500);
		Select s1=new Select(day);
		
		s1.selectByValue("1");
		
		
		
	}

}
