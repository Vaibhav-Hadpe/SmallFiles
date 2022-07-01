package practiceIsselected;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//li[@data-cy='menu_Hotels']")).click();
		Thread.sleep(4000);
		WebElement Homestays = driver.findElement(By.xpath("(//li[contains(@class,'slctFareType__list--item checkmarkOuter  ')])[1]"));
		if(Homestays.isSelected())
		{
			System.out.println("Checkbox is already selected");
		}
		else
		{
			System.out.println("Select checkbox");
			Thread.sleep(3000);
			Homestays.click();
			if(Homestays.isSelected())
			{
				System.out.println("Checkbox is selected now");
				
			}
			else
			{
				System.out.println("Failed to select Checkbox");
			}
		}
		
	
	}

}
