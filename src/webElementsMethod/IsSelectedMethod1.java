package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com/");
		driver.manage().window().maximize();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@id='cn']")).sendKeys("8180920543");
		Thread.sleep(8000);
		WebElement postpaid = driver.findElement(By.xpath("(//div[@class='mat-radio-outer-circle'])[2]"));
        WebElement Go=driver.findElement(By.xpath("//span[text()='Go']"));
		if(postpaid.isSelected())
        {
        	System.out.println("postpaid is selected,Click on Go");
        	Go.click();
        }
        else
        {
        	System.out.println("Select postpaid and click on Go");
        	Thread.sleep(5000);
        	postpaid.click();
        	Thread.sleep(5000);
        	Go.click();
        	System.out.println("Succesful");
        	
        }
	}

}
