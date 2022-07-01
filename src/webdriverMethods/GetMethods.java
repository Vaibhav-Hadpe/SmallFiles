package webdriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://pixabay.com/images/search/nature/");
		Thread.sleep(2000);
		//driver.close();
		driver.quit();
		Thread.sleep(2000);
		WebDriver driver1=new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		
		//when we want to close the browser and reopen the new url then we need to make the new 
		//object of chromedriver. If we dont make the new object of chrome driver and use close
		//then it get close and cannot reopen.
		
		
		

	}

}
