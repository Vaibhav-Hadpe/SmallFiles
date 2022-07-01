package notePadInterviewProgram;

import java.time.Duration;

import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SetPositionOFFlipcart {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
//		Point p=new Point(29,300);
//		driver.manage().window().setPosition(p);
		
		Dimension d=new Dimension(550,750);
		driver.manage().window().setSize(d);

	}

}
