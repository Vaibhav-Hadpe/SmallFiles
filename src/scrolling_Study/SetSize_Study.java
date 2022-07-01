package scrolling_Study;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize_Study {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://vctcpune.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
		
		
		System.out.println(driver.manage().window().getSize());//It gives width and height of page.
		Dimension d=new Dimension(1200, 700);//Put value of width and height as we want to set.
		driver.manage().window().setSize(d);//provide parameter d in setSize Method.

	}

}
