package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_Path_AtrIPHONE {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\rahul\\\\Desktop\\\\VAIBHAV CLASS NOTES\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/search?q=iphone+12&sid=tyy%2C4io&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_1_na_na_na&as-pos=1&as-type=RECENT&suggestionId=iphone+12%7CMobiles&requestId=9fa06cfc-f38b-4446-a775-ad9b8364a2e3&as-searchtext=i");
	driver.manage().window().maximize();
	Thread.sleep(100);
	driver.findElement(By.xpath("//div[@class='_4rR01T']")).click();
			

	}

}
