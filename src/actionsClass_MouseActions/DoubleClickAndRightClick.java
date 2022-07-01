package actionsClass_MouseActions;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndRightClick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		
		//To perform Right Click.
		WebElement RightClick = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions act=new Actions(driver);//To take actions create object of actions class and driver as argument.
        act.contextClick(RightClick).perform();//use contextClick method to right click element.
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        Alert edit = driver.switchTo().alert();
        Thread.sleep(2000);
        edit.accept();
        
        Thread.sleep(2000);
        //To perform Double click.
        WebElement DoubleClick = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        act.doubleClick(DoubleClick).perform();
        Thread.sleep(2000);
        Alert alt = driver.switchTo().alert();//To handle alert window.
        System.out.println(alt.getText());
        Thread.sleep(2000);
        alt.accept();
        Thread.sleep(2000);
        driver.close();
        
	}

}
