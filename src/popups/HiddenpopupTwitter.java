package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenpopupTwitter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@dir='auto'])[1]")).click();//handled hidden popup.
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign up with p')]")).click();
		
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("SELECTOR_1"));
		Select s= new Select(month);
		Thread.sleep(2000);
		s.selectByVisibleText("May");
		
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("SELECTOR_2"));
		Select s1= new Select(day);
		Thread.sleep(2000);
		s1.selectByIndex(11);
		
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("SELECTOR_3"));
		Thread.sleep(2000);
		Select s2=new Select(year);
		for(int i=0;i<=25;i++)
		{
			s2.selectByIndex(i);
		}
		
	
		
		

	}

}
