package scrolling_Study;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Normal {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	JavascriptExecutor j = ((JavascriptExecutor)driver);//Typecast JavascriptExecutor into driver object.
	                                                    //And store it into reference variable.
    j.executeScript("window.scrollBy(80,2000)");//call methhod write it properly.it need to write as it is.
	}

}
