package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotRandom {

	public static void main(String[] args) throws InterruptedException, IOException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://pixabay.com/images/search/nature/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//a[@data-id='736885']")).click();
	
	//1.typecast Takescreenshot into object call getscrn method write OutputType.FILE give refernce and return type 
	// of this screenshot is file.we have taken the screenshot.
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	//2.To store multiple screenshot make object of String RandomString and .make give int length.
	//this length provides diff name to screenshot and save it multiple time.
	String random=RandomString.make(2);
	
    //3.give destination to string by crating object of File class Give path in Argument
	File destination=new File("C:\\Users\\rahul\\Desktop\\VAIBHAV CLASS NOTES\\ScreenshotSelenm\\Nature"+random+".png");
    
	//4.File Handler class to copy file from source to destination.
	FileHandler.copy(src, destination);
	
	
	}

}
