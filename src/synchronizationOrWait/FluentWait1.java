package synchronizationOrWait;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait1 {

	public static void main(String[] args) {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      
      Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
      .withTimeout(Duration.ofMillis(1000))
      .pollingEvery(Duration.ofMillis(100))
      .ignoring(NoSuchElementException.class);
      driver.get("https://start.atlassian.com/");
      WebElement element = wait.until(new Function<WebDriver, WebElement>() 
      {
    	  public WebElement apply(WebDriver driver )
    	  {
    		  return driver.findElement(By.xpath("//div[text()='Jira Software']"));
          }	  
	});
      element.click();
      
	}

}
