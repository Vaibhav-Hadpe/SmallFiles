package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenChrome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       // driver.get("https://vctcpune.com/");
       // driver.manage().window().maximize();
       // driver.manage().window().minimize();
        //driver.close();
        //driver.quit();
        driver.navigate().to("https://www.youtube.com/");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        
        
	}

}
