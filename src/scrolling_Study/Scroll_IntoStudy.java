package scrolling_Study;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_IntoStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		WebElement Practice_Button = driver.findElement(By.xpath("//a[contains(text(),'Click to ')]"));
        JavascriptExecutor j = ((JavascriptExecutor)driver);
        Thread.sleep(3000);
        j.executeScript("arguments[0].scrollIntoView(true);", Practice_Button);
	}

}
