package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		WebElement checkbox = driver.findElement(By.id("checkBoxOption1"));
        if (checkbox.isSelected())
        {
        	System.out.println("Checkbox is already selected");
        }
        else
        {
        	System.out.println("select checkbox");
        	checkbox.click();
        	if(checkbox.isSelected())
        	{
        		System.out.println("Checkbox is selected Now");
        	}
        	else
        	{
        		System.out.println("Checkbox selection failed");
        	}
        }
	}

}
