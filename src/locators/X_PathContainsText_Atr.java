package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class X_PathContainsText_Atr {

	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
	driver.get("https://vctcpune.com/selenium/practice.html");
	driver.manage().window().maximize();
	Thread.sleep(100);
	driver.findElement(By.xpath("//legend[contains(text(),'Auto Suggestive ')]")).click();
	//Auto suggestive Drop Down Example is the text but by using contains with text
	//text we reduced it to the only Auto Suggestive(substring sequence).
	
	Thread.sleep(5000);//to delay the speed of automation tool.
	
	driver.findElement(By.xpath("//input[contains(@placeholder,'Your Name')]")).click();
	//here we reduced attribute value from Enter Your Name to Your Name
	//By using contains with attribute method.

	}

}
