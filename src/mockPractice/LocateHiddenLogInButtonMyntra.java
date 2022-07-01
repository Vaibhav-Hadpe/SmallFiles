package mockPractice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocateHiddenLogInButtonMyntra {

	public static void main(String[] args) throws InterruptedException {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQjw8O-VBhCpARIsACMvVLMiorJgISTDa_10AQJOIvOPYyoWobpNAhLU3QuDe3mzW8zDv8IDc0kaAg9pEALw_wcB");
	  driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
	  driver.findElement(By.xpath("//span[@class='myntraweb-sprite desktop-iconUser sprites-headerUser']")).click();
	  Thread.sleep(200);
	  driver.findElement(By.xpath("//a[text()='login / Signup']")).click();
	  //logIn button goes when we move cursor so press ctrl+shift+c is necessary.
	}

}
