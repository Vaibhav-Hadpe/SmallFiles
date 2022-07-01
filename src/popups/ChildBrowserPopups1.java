package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopups1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Thread.sleep(2000);
		//Need to switch the focus from main to child to perform action on child Browser.
		Set<String> IDs = driver.getWindowHandles();
		ArrayList<String> arr=new ArrayList<>(IDs);
		String MainPageID = arr.get(0);//prepared id of main page.
		String ChildPage1ID = arr.get(1);//prepared id of child page.
		
		//Actions on Child Browser pop up.
		driver.switchTo().window(ChildPage1ID);//shifted focus to child.
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys("Vaibhav123@gmail.com");
		driver.findElement(By.name("btnLogin")).click();
		Thread.sleep(2000);
		WebElement Msg = driver.findElement(By.xpath("//h3[contains(text(),'This access ')]"));
		System.out.println(Msg.getText());//Text Message of Child Browser.
		Thread.sleep(2000);
		driver.close();
		
		//Actions on main page by shifting focus from child to main.
		Thread.sleep(2000);
		driver.switchTo().window(MainPageID);//Shifted focus back to main.
		driver.findElement(By.xpath("//a[text()='Agile Project']")).click();
		Thread.sleep(5000);
		driver.close();
		
	}

}
