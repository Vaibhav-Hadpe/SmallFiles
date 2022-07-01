package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenYoutube {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
        WebDriver yt=new ChromeDriver();
        yt.get("https://www.youtube.com/");
        yt.manage().window().maximize();
        yt.manage().window().minimize();
        yt.navigate().refresh();
        yt.navigate().to("https://www.flipkart.com/");
        yt.navigate().back();
        yt.navigate().forward();
        yt.close();// it closes only current tab opened by selenium.
        yt.quit();//It closes all tabs opened by selenium.
        
	}

}
