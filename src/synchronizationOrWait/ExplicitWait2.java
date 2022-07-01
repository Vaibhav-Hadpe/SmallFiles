package synchronizationOrWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		
		WebDriverWait wt=new WebDriverWait(driver, Duration.ofMillis(1000));
		WebElement Title = driver.findElement(By.xpath("//h2[contains(text(),'We Offer ')]"));
        wt.until(ExpectedConditions.visibilityOf(Title));
        System.out.println(Title.getText());
        
        driver.navigate().back();
        
        WebDriverWait wt1=new WebDriverWait(driver, Duration.ofMillis(2000));
        WebElement seleP = driver.findElement(By.xpath("(//a[contains(text(),'Start Selenium ')])[1]"));
        wt1.until(ExpectedConditions.visibilityOf(seleP));
        seleP.click();
        
        Set<String> Ids = driver.getWindowHandles();
        ArrayList<String> arr=new ArrayList<>(Ids);
        String ChildPageID = arr.get(1);
        driver.switchTo().window(ChildPageID);
        
        WebDriverWait wt2=new WebDriverWait(driver, Duration.ofMillis(4000));
        WebElement Radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
        wt2.until(ExpectedConditions.visibilityOf(Radio1));
        Radio1.click();
        Thread.sleep(2000);
        //driver.close();
        driver.quit();
	}

}
