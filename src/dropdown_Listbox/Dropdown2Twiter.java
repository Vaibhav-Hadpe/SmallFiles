package dropdown_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown2Twiter {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Sign up']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[contains(text(),'Sign up with phone')]")).click();
		Thread.sleep(3000);
		
		//1.Locate the dropbox and save it in reference variable.
		WebElement Month = driver.findElement(By.id("SELECTOR_1"));
        
		//2.Create object of select class and pass the webelement(Reference variable)as argument. 
		Select s=new Select(Month);
		
        //3.these are the three methods of select class.
		s.selectByVisibleText("February");
        Thread.sleep(1000);
        s.selectByIndex(3);
        Thread.sleep(1000);
        s.selectByValue("4");
        
        WebElement Day = driver.findElement(By.id("SELECTOR_2"));
        Select s1=new Select(Day);
        Thread.sleep(1000);
        for (int i=1;i<=15;i++)
        {
        	s1.selectByIndex(i);	
        }
        
        WebElement Year = driver.findElement(By.id("SELECTOR_3"));
        Select s2= new Select(Year);
        Thread.sleep(1000);
        for(int i=1;i<=27;i++)
        {
        s2.selectByIndex(i);
        }
        Thread.sleep(2000);
        driver.quit();
	}

}
