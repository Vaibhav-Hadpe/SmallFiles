package synchronizationOrWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("//a[text()='Live Scores']")).click();
		
		WebDriverWait w=new WebDriverWait(driver, Duration.ofMillis(2000));
		WebElement SeriesArc = driver.findElement(By.xpath("//a[text()='Series Archive']"));
		w.until(ExpectedConditions.visibilityOf(SeriesArc));
		SeriesArc.click();
		
		
		
		
		

	}

}
