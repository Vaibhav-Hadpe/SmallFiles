package dropdown_Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownDOBFB {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@id,'u_0_2_')]")).click();
		Thread.sleep(5000);
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
        
		//2.Create an object of Select class which will accept WebElement as argument
	    Select s=new Select(day);
	    
//	    3.	By using one of the select class methods we can select values form list box like 
//	    1. selectByVisibleText: selectByVisibleText(String arg0) 
//	    2. selectByIndex: selectByIndex(int arg0) 
//	    3. selectByValue: selectByValue(String arg0)
	    Thread.sleep(2000);
	    s.selectByVisibleText("8");
	    Thread.sleep(2000);
        s.selectByIndex(11);
        Thread.sleep(2000);
        s.selectByValue("16");
        Thread.sleep(2000);
        
        WebElement month = driver.findElement(By.name("birthday_month"));
        Select s1=new Select(month);
        s1.selectByVisibleText("Feb");
        Thread.sleep(2000);
        s1.selectByIndex(3);
        Thread.sleep(2000);
        s1.selectByValue("6");
        Thread.sleep(2000);
        
        WebElement year = driver.findElement(By.id("year"));
        Select s2=new Select(year);
        s2.selectByVisibleText("1996");
        Thread.sleep(2000);
        s2.selectByIndex(4);
        Thread.sleep(2000);
        s2.selectByValue("2014");
        
        Thread.sleep(3000);
        WebElement male = driver.findElement(By.xpath("(//input[@class='_8esa'])[2]"));
        if(male.isSelected())
        {
        	System.out.println("Checkbox is already selected");
        }
        else
        {
        	System.out.println("Select Checkbox");
        	Thread.sleep(3000);
        	male.click();
        	Thread.sleep(3000);
        	if(male.isSelected())
        	{
        		System.out.println("Checkbox is selected now");
        	}
        	else
        	{
        		System.out.println("Failed to select Checkbox");
        	}
        }
        driver.findElement(By.name("websubmit")).click();
        
	
	}

}
