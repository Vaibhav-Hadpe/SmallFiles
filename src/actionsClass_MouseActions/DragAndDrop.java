package actionsClass_MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		WebElement src = driver.findElement(By.xpath("//a[text()=' 5000']"));
		WebElement dest = driver.findElement(By.id("amt7"));//select it properly.Where we want to release.
		Actions act=new Actions(driver);//Actions class is must with driver argument to take actions.
		act.dragAndDrop(src, dest).perform();
		
		Thread.sleep(3000);
		WebElement dest1 = driver.findElement(By.id("amt8"));
		act.dragAndDrop(src, dest1).perform();
		
		//act.clickAndHold(src).moveToElement(dest).release().build().perform();
		//Click and hold used to drag and drop by extra using release.

	}

}
