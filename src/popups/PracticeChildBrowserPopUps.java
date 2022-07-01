package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeChildBrowserPopUps {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("NewWindow")).click();
		
		Set<String> IDs = driver.getWindowHandles();//Returns set of String cannot get one by one
		ArrayList<String> arr=new ArrayList<>(IDs);//we need to convert it into arrayList.
		String MainID = arr.get(0);
		String ChildID = arr.get(1);
		System.out.println("ID of Main "+MainID);
		System.out.println("ID of Child "+ChildID);
		driver.switchTo().window(ChildID);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		driver.manage().window().maximize();
		
		WebElement youtube = driver.findElement(By.xpath("//a[text()='youtube.com/qavbox']"));
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("arguments[0].scrollIntoView(true);", youtube);
		Thread.sleep(3000);
		WebElement contactme = driver.findElement(By.xpath("//a[text()='Contact me']"));
		contactme.click();
		
		Thread.sleep(5000);
		driver.close();
		Thread.sleep(5000);
		driver.quit();
		
		

	}

}
